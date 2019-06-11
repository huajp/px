
package com.clr.modules.sysmanage.service.biz;

import com.clr.modules.sysmanage.entity.po.UserPO;
import com.clr.common.utils.Page;

import java.util.Map;


public interface IUserBizService {

	/**
	 * 分页查询用户列表
	 * @param params
	 * @return
	 */
	Page<UserPO> listUserByPage(Map<String, Object> params);
}
