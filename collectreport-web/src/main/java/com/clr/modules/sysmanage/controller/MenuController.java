
package com.clr.modules.sysmanage.controller;

import com.clr.common.utils.R;
import com.clr.modules.sysmanage.entity.bo.MenuBO;
import com.clr.modules.sysmanage.entity.vo.MenuVO;
import com.clr.modules.sysmanage.service.IUserBizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 系统菜单
 */
@RestController
@RequestMapping("/sys/menu")
public class MenuController extends AbstractController{
	@Autowired
	private IUserBizService userBizService;
	/**
	 * 导航菜单
	 */
	@RequestMapping("/nav")
	public R nav(){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("userID",1);
		List<MenuBO> boList = userBizService.listMenuByCondition(params);
		List<MenuVO> voList = this.convert(boList,MenuVO.class);
		List<MenuVO> ulist = new ArrayList<>();
		List<MenuVO> list = new ArrayList<>();
		for (MenuVO vo:voList) {
			if(vo.getParentId() == 1){
				list.add(vo);
			}
			if(vo.getMenuId() == 1){
				ulist.add(vo);
			}
		}

		for (MenuVO v:ulist) {
			v.setList(list);
		}

		return R.ok().put("menuList",ulist);
	}

}
