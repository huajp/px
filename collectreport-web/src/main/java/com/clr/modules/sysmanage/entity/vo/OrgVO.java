package com.clr.modules.sysmanage.entity.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class OrgVO implements Serializable {
    private static final long serialVersionUID = -1169488610092603362L;

    private String orgId;

    private String orgCode;

    private String upOrgId;

    private String name;
}
