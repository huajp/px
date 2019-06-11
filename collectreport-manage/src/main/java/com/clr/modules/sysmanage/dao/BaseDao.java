package com.clr.modules.sysmanage.dao;

import com.clr.common.utils.Page;
import com.clr.common.utils.Query;

import java.util.List;

/**
 *  @author: pjinhua
 *  @Date: 2019/3/31 16:08
 *  @Description:
 *  获取单个对象的方法用 get 做前缀。
 *  获取多个对象的方法用 list 做前缀。
 *  获取统计值的方法用 count 做前缀。
 *  插入的方法用 save（推荐）或 insert 做前缀。
 *  删除的方法用 remove（推荐）或 delete 做前缀。
 *  修改的方法用 update 做前缀。
 */
public interface BaseDao<T> {

    public boolean save(T t);

    public boolean batchSave(List<T> list);

    public T getObject(T t);

    int update(T t);

    int batchUpdate(List<T> list);

    public boolean remove(Object id);

    public boolean batchRemove(Object[] objs);

    List<T> listByPage(Page<T> page, Query query);

    List<T> list(Query query);

}
