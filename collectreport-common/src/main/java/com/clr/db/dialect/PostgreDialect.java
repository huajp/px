package com.clr.db.dialect;

public class PostgreDialect extends Dialect {

    @Override
    public String getLimitString(String sql, int offset, int limit) {
        sql = getLineSql(sql);
        return (sql + " LIMIT " + limit + " OFFSET " + offset);
    }

}
