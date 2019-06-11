package com.clr.modules.sysmanage.service;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCommonBizService {
    @Autowired
    protected Mapper mapper;

    protected <T, S> T convert(S s, Class<T> clz) {
        if (s == null) {
            return null;
        }
        return this.mapper.map(s, clz);
    }

    protected <T, S> List<T> convert(List<S> s, Class<T> clz) {
        if (s == null) {
            return null;
        }
        List<T> list = new ArrayList<T>();
        for (S vs : s) {
            list.add(this.mapper.map(vs, clz));
        }
        return list;
    }


}
