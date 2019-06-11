package com.clr.common.utils;

public class MsgUtil {

    public static Boolean isBank(String str){
        if(null == str || "".equals(str)){
            return  Boolean.valueOf(true);
        }
        return  Boolean.valueOf(false);
    }
}
