
package com.clr.modules.sysmanage.service.biz.impl;


import com.clr.modules.sysmanage.dao.UserDao;
import com.clr.modules.sysmanage.entity.po.UserPO;
import com.clr.modules.sysmanage.service.biz.AbstractCommonBizService;
import com.clr.modules.sysmanage.service.biz.IUserBizService;
import com.clr.common.utils.Page;
import com.clr.common.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class UserBizServiceImpl extends AbstractCommonBizService implements IUserBizService {
	@Autowired
	private UserDao userDao;

	@Override
	public Page<UserPO> listUserByPage(Map<String, Object> params) {
		Query form = new Query(params);
		Page<UserPO> page = new Page<>(form);
		userDao.listByPage(page,form);
		System.out.println("_________________________________调用了");
		return page;
	}
}
