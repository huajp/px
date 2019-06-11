package com.clr.modules.sysmanage.dao;

import com.clr.modules.sysmanage.entity.po.MenuPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface MenuDao extends BaseDao<MenuPO>{

    public List<MenuPO> listMenuByCondition(Map<String,Object> params);

}
