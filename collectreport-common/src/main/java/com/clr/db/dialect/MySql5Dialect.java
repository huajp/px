package com.clr.db.dialect;

public class MySql5Dialect extends Dialect {

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        sql = getLineSql(sql);
        return (sql + " limit " + offset + " ," + limit);
    }

}
