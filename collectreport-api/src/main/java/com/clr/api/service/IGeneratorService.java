package com.clr.api.service;

import java.util.Map;

public interface IGeneratorService {

    Map<String,Object> listTablePage(Map<String,Object> params);

    Map<String,Object> getTableByName(String tableName);

    Map<String,Object> listColumn(String tableName);

}
