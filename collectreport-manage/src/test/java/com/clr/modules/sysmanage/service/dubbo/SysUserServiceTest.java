package com.clr.modules.sysmanage.service.dubbo;

import com.clr.TmallApplicationTests;
import com.clr.api.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class SysUserServiceTest extends TmallApplicationTests {

    @Autowired
    private IUserService iSysUserService;

    @Test
    public void update() {
        Map<String,Object> param = new HashMap<>();
        param.put("pageNumber",1);
        param.put("pageSize",1);
        iSysUserService.listUserPage(param);
    }
}