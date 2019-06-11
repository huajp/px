package com.clr.modules.sysmanage.generator;


public class Generator {

    public static void main(String[] args) throws Exception {

        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://localhost:3306/clr?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true";
        String jdbcUsername = "root";
        String jdbcPassword = "root";

        String tablePrefix = "gen_";

        String javaModule = "test";
        String webModule = "test";

        JdbcGenUtils.generatorCode(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword, tablePrefix, javaModule, webModule);

    }

}
