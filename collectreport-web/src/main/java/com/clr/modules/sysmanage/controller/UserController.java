

package com.clr.modules.sysmanage.controller;


import com.clr.common.util.CommonUtils;
import com.clr.common.utils.Page;
import com.clr.common.utils.R;
import com.clr.modules.sysmanage.entity.vo.UserVO;
import com.clr.modules.sysmanage.service.IUserBizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *  @author: pjinhua
 *  @Date: 2019/3/31 21:09
 *  @Description: 模拟连通性
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {
	@Autowired
	private IUserBizService sysUserBizService;
	/**
	 * 所有用户列表
	 */
	@RequestMapping("/list")
	public Page list(@RequestBody Map<String, Object> params){
//		Map<String,Object> param = new HashMap<>();
//		param.put("pageNumber",1);
//		param.put("pageSize",1);
		Page page = sysUserBizService.listUserByPage(params);
		return page;
	}

	/**
	 * 获取登录的用户信息
	 */
	@RequestMapping("/info")
	public R info(){
		UserVO userVO = new UserVO();
		userVO.setUserId(1l);
		userVO.setUserName("admin");
		userVO.setOrgName("总部");
		userVO.setOrgId(1L);
		List<Long> list = new ArrayList<>();
		list.add(2L);
		userVO.setRoleIdList(list);
		return R.ok().put("user", userVO);
	}

	@RequestMapping("/save")
	public R save(@RequestBody UserVO user) {
		return CommonUtils.msg(1);
	}

	@RequestMapping("/infoUser")
	public R getById(@RequestBody Long userId) {
		UserVO userVO = new UserVO();
		userVO.setUserId(1l);
		userVO.setUserName("admin");
		userVO.setOrgName("总部");
		userVO.setOrgId(1L);
		List<Long> list = new ArrayList<>();
		list.add(2L);
		userVO.setRoleIdList(list);
		CommonUtils.msg(userVO);
		return CommonUtils.msg(userVO);
	}

	@RequestMapping("/update")
	public R update(@RequestBody UserVO user) {
		return CommonUtils.msg(1);
	}

	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return CommonUtils.msg(1);
	}

	@RequestMapping("/reset")
	public R updatePswd(@RequestBody UserVO user) {
		return CommonUtils.msg(1);
	}

	@RequestMapping("/updatePswd")
	public R updatePswd1(@RequestBody UserVO user) {
		return CommonUtils.msg(1);
	}

	@RequestMapping("/enable")
	public R updateUserEnable(@RequestBody Long[] id) {
		return CommonUtils.msg(1);
	}

	@RequestMapping("/disable")
	public R updateUserDisable(@RequestBody Long[] id) {
		return CommonUtils.msg(1);
	}

}
