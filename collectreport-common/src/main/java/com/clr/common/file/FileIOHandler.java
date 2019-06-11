package com.clr.common.file;

public interface FileIOHandler {

    public  void before();

    public byte[] process(byte[] buffer) throws Exception;

    public void after();



}
