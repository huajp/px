
package com.clr.modules.sysmanage.entity.po;

import lombok.Data;

import java.io.Serializable;

/**
 *  @author: pjinhua
 *  @Date: 2019/3/31 16:18
 *  @Description: 菜单
 */
@Data
public class MenuPO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 菜单ID
	 */
	private Long menuId;

	/**
	 * 父菜单ID，一级菜单为0
	 */
	private Long parentId;
	
	/**
	 * 菜单名称
	 */
	private String name;

	/**
	 * 菜单URL
	 */
	private String url;

	/**
	 * 类型  0：目录   1：菜单
	 */
	private Integer type;

	/**
	 * 菜单图标
	 */
	private String icon;

	/**
	 * 排序
	 */
	private Integer orderNum;

}
