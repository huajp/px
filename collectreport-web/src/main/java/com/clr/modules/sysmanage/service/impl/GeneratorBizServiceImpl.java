package com.clr.modules.sysmanage.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.clr.api.service.IGeneratorService;
import com.clr.api.service.IUserService;
import com.clr.common.utils.Page;
import com.clr.modules.sysmanage.entity.bo.UserBO;
import com.clr.modules.sysmanage.generator.ColumnPO;
import com.clr.modules.sysmanage.generator.GenUtils;
import com.clr.modules.sysmanage.generator.GeneratorParamEntity;
import com.clr.modules.sysmanage.generator.TablePO;
import com.clr.modules.sysmanage.service.IGeneratorBizService;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

@Service
public class GeneratorBizServiceImpl implements IGeneratorBizService {

    @Reference(retries = 3,timeout = 120000)
    private IGeneratorService generatorService;

    @Override
    public Page<TablePO> listTableByPage(Map<String, Object> params) {
        Map<String, Object> stringObjectMap = generatorService.listTablePage(params);
        Page page = (Page) stringObjectMap.get("data");
        return page;
    }

    @Override
    public byte[] generator(GeneratorParamEntity generatorParamEntity) {
        //
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(out);

        for (String table: generatorParamEntity.getTables()) {
            Map<String, Object> t = generatorService.getTableByName(table);
            TablePO tablePO = (TablePO) t.get("data");
            Map<String, Object> cs = generatorService.listColumn(table);
            List<ColumnPO> list = (List<ColumnPO>) cs.get("data");
            GenUtils.generatorCode(tablePO,list,generatorParamEntity,zip);
        }

        IOUtils.closeQuietly(zip);
        return out.toByteArray();
    }
}
