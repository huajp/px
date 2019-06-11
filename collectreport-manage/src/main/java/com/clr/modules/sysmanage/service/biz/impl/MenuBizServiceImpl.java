
package com.clr.modules.sysmanage.service.biz.impl;


import com.clr.modules.sysmanage.dao.MenuDao;
import com.clr.modules.sysmanage.entity.bo.MenuBO;
import com.clr.modules.sysmanage.entity.po.MenuPO;
import com.clr.modules.sysmanage.service.biz.AbstractCommonBizService;
import com.clr.modules.sysmanage.service.biz.IMenuBizService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MenuBizServiceImpl extends AbstractCommonBizService implements IMenuBizService {
	@Autowired
	private MenuDao menuDao;

	@Override
	public List<MenuBO> listMenuByCondition(Map<String, Object> params) {
//		List<MenuBO> boList = new ArrayList<MenuBO>();
//		List<MenuPO> list = menuDao.listMenuByCondition(params);
//		for(MenuPO po:list){
//			MenuBO bo = new MenuBO();
//			BeanUtils.copyProperties(po,bo);
//			boList.add(bo);
//		}
//		return boList;

		List<MenuPO> list = menuDao.listMenuByCondition(params);
		List<MenuBO> boList = this.convert(list,MenuBO.class);
		return boList;
	}
}
