package com.clr.modules.sysmanage.dao;

import com.clr.modules.sysmanage.entity.po.ColumnPO;
import com.clr.modules.sysmanage.entity.po.MenuPO;
import com.clr.modules.sysmanage.entity.po.TablePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GeneratorDao {

    public List<TablePO> listTableByCondition(Map<String, Object> params);

    public TablePO getTableByTableName(String tableName);

    public List<ColumnPO> listColumnByCondition(Map<String,Object> params);

}
