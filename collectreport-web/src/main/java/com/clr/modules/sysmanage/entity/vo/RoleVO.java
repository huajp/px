package com.clr.modules.sysmanage.entity.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class RoleVO implements Serializable {
    private static final long serialVersionUID = -5196245324032803691L;

    private String roleId;

    private String roleName;
}
