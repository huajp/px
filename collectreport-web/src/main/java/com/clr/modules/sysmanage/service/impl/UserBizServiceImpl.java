
package com.clr.modules.sysmanage.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.clr.api.entity.dto.sysmanage.MenuDTO;
import com.clr.api.service.IUserService;
import com.clr.common.utils.Page;
import com.clr.modules.sysmanage.entity.bo.MenuBO;
import com.clr.modules.sysmanage.entity.bo.UserBO;
import com.clr.modules.sysmanage.service.AbstractCommonBizService;
import com.clr.modules.sysmanage.service.IUserBizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 系统用户
 */
@Service
public class UserBizServiceImpl extends AbstractCommonBizService implements IUserBizService {

	@Reference(retries = 3,timeout = 120000)
	private IUserService userService;
	@Override
	public Page<UserBO> listUserByPage(Map<String, Object> params) {
		Map<String, Object> stringObjectMap = userService.listUserPage(params);
		Page page = (Page) stringObjectMap.get("data");
		return page;
	}

	@Override
	public List<MenuBO> listMenuByCondition(Map<String, Object> params) {
		Map<String,Object> result = userService.listMenuListByCondition(params);
		List<MenuDTO> dtoList = (List<MenuDTO>) result.get("data");
		List<MenuBO> menuList = this.convert(dtoList,MenuBO.class);
		return menuList;
	}
}
