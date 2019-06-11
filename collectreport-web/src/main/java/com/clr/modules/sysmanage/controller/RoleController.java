package com.clr.modules.sysmanage.controller;

import com.clr.modules.sysmanage.entity.vo.RoleVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sys/role")
public class RoleController extends AbstractController {

	@RequestMapping("/select")
	public List<RoleVO> listRole() {
		RoleVO roleVO = new RoleVO();
		roleVO.setRoleId("1");
		roleVO.setRoleName("2");

		RoleVO roleVO1 = new RoleVO();
		roleVO1.setRoleId("2");
		roleVO1.setRoleName("2");

		List list = new ArrayList();
		list.add(roleVO);
		list.add(roleVO1);

		return list;
	}
	

}
