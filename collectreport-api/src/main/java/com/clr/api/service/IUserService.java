package com.clr.api.service;

import java.util.Map;

public interface IUserService {

    Map<String,Object> listUserPage(Map<String,Object> params);

    Map<String,Object> listMenuListByCondition(Map<String,Object> params);

}
