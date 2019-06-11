package com.clr.modules.sysmanage.controller;

import com.clr.modules.sysmanage.entity.vo.OrgVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author: pjinhua
 *  @Date: 2019/3/29 21:27
 *  @Description:
 */
@RestController
@RequestMapping("/sys/org")
public class OrgController extends AbstractController {
	/*
	 *功能描述 ztree 树形结构
	 * @author 风清扬
	 * @date 2019/3/29
	 * @param []
	 * @return java.util.List<com.clr.modules.sysmanage.entity.vo.OrgVO>
	 */
	@RequestMapping("/list")
	public List<OrgVO> select() {
		OrgVO orgVO = new OrgVO();
		orgVO.setOrgId("1");
		orgVO.setName("云州总部");
		orgVO.setUpOrgId("0");

		OrgVO orgVO1 = new OrgVO();
		orgVO1.setOrgId("2");
		orgVO1.setName("杜庄");
		orgVO1.setUpOrgId("1");
		List<OrgVO> list = new ArrayList<>();
		list.add(orgVO);
		list.add(orgVO1);
		return  list;
	}
}
