package com.clr.modules.sysmanage.service.dubbo;


import com.alibaba.dubbo.config.annotation.Service;
import com.clr.api.entity.dto.sysmanage.MenuDTO;
import com.clr.api.service.IUserService;
import com.clr.modules.sysmanage.entity.bo.MenuBO;
import com.clr.modules.sysmanage.service.biz.IMenuBizService;
import com.clr.modules.sysmanage.service.biz.IUserBizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  @author: pjinhua
 *  @Date: 2019/3/31 16:24
 *  @Description: todo 关于dubbo的接口，是否需要封装统一请求参数和返回参数包装现有的
 */
@Service(interfaceClass = IUserService.class)
@Component
public class UserService extends AbstractCommonService implements IUserService {
    @Autowired
    private IUserBizService sysUserBizService;
    @Autowired
    private IMenuBizService sysMenuBizService;

    @Override
    public Map<String, Object> listUserPage(Map<String, Object> params) {
        Map<String,Object> res = new HashMap<String,Object>();
        res.put("data",sysUserBizService.listUserByPage(params));
        return res;
    }

    @Override
    public Map<String, Object> listMenuListByCondition(Map<String, Object> params) {
        Map<String,Object> res = new HashMap<String,Object>();
        List<MenuBO> boList = sysMenuBizService.listMenuByCondition(params);
        List<MenuDTO> dtoList = this.convert(boList,MenuDTO.class);
        res.put("data",dtoList);
        return res;
    }
}
