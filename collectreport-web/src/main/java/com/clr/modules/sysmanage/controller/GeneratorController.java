package com.clr.modules.sysmanage.controller;

import com.clr.common.utils.Page;
import com.clr.modules.sysmanage.generator.GeneratorParamEntity;
import com.clr.modules.sysmanage.service.IGeneratorBizService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
@Controller
@RequestMapping("sys/gen")
public class GeneratorController {
    @Autowired
    private IGeneratorBizService iGeneratorBizService;

    @RequestMapping("/list")
    public Page list(@RequestBody Map<String, Object> params){
//		Map<String,Object> param = new HashMap<>();
//		param.put("pageNumber",1);
//		param.put("pageSize",1);
        Page page = iGeneratorBizService.listTableByPage(params);
        return page;
    }

    public void generator(GeneratorParamEntity params, HttpServletResponse response, HttpServletRequest request) throws IOException {
        byte[] code = iGeneratorBizService.generator(params);
        String attachment = "attachment; filename=" + params.getTables()[0] + ".zip";
        response.reset();
        response.setHeader("Content-Disposition", attachment);
        response.addHeader("Content-Length", "" + code.length);
        response.setContentType("application/octet-stream; charset=UTF-8");
        IOUtils.write(code, response.getOutputStream());
    }




}
