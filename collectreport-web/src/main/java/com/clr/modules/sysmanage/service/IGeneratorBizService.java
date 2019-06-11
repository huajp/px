package com.clr.modules.sysmanage.service;

import com.clr.common.utils.Page;
import com.clr.modules.sysmanage.entity.bo.UserBO;
import com.clr.modules.sysmanage.generator.GeneratorParamEntity;
import com.clr.modules.sysmanage.generator.TablePO;
import java.util.Map;
public interface IGeneratorBizService {

    Page<TablePO> listTableByPage(Map<String, Object> params);

    byte[] generator(GeneratorParamEntity generatorParamEntity);

}
