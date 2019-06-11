package com.clr.api.rr;

import java.io.Serializable;

public class Response implements Serializable {


    private static final long serialVersionUID = 8363969409461130436L;

    private static final String SUCCESS_CODE = "10";
    private static  final  String SUCCESS_MSG ="操作成功";

    private String data;
    private String rspCode;
    private String rspMsg;

    public Response() {
        this.data = null;
        this.rspCode = SUCCESS_CODE;
        this.rspMsg = SUCCESS_MSG;
    }

    public Response(String data, String rspCode, String rspMsg) {
        this.data = data;
        this.rspCode = rspCode;
        this.rspMsg = rspMsg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getRspMsg() {
        return rspMsg;
    }

    public void setRspMsg(String rspMsg) {
        this.rspMsg = rspMsg;
    }
}
