package com.clr.common.utils;

import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *  @author: pjinhua
 *  @Date: 2019/4/1 15:15
 *  @Description: 对象copy，如果对性能有特别高的要求，手动setget，会造成代码臃肿
 */
public class BeanCopyUtils {

    public static <T> T copySingle(Object obj,Class<T> c){
        BeanCopier copier = BeanCopier.create(obj.getClass(),c,false);
        T obj_new = null;
        try{
            obj_new = c.newInstance();
            copier.copy(obj,obj_new,null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  obj_new;
    }

    public static <T> List<T> copyList(Collection<?> objs, Class<T> c){
        if(null == objs){
            return null;
        }
        List<T> r = new ArrayList<>();
        BeanCopier copier = null;
        try {
            for (Iterator<?> iterable= objs.iterator();((Iterator) iterable).hasNext();){
                Object obj_ori = ((Iterator) iterable).next();
                if(copier == null){
                    copier = BeanCopier.create(obj_ori.getClass(),c,false);
                }
                T obj_new = c.newInstance();
                copier.copy(obj_ori,obj_new,null);
                r.add(obj_new);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;

    }

}
