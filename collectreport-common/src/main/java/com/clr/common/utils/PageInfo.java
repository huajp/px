package com.clr.common.utils;

import java.io.Serializable;

public class PageInfo implements Serializable {
    private static final long serialVersionUID = 7543386002603332824L;
    private int totalPageCount;
    private int totalRowCount;
    private int currentPageNum=1;
    private int rowsOfPage = 10;
    private boolean autoCount = true;
    private boolean countOfEverytime;

    public PageInfo(){};



}
