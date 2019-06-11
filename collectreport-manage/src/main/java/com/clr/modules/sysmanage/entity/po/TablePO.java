package com.clr.modules.sysmanage.entity.po;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
@Data
public class TablePO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 表名
	 */
	private String tableName;
	
	/**
	 * 表格备注
	 */
	private String tableComment;
	
	/**
	 * 主键
	 */
	private ColumnPO pk;

	/**
	 * 表格列
	 */
	private List<ColumnPO> columns;

	/**
	 * 类名，作为实例对象使用（sysUser）
	 */
	private String objName;

	/**
	 * 类名，作为类型使用（SysUser）
	 */
	private String className;

	/**
	 * 创建时间
	 */
	private Timestamp createTime;

	/**
	 * 是否含有decimal类型数据
	 */
	private Boolean hasDecimal;

	public TablePO() {
		super();
	}

	public void addColumn(ColumnPO columnPO) {
		if (this.columns == null) {
			columns = new ArrayList<>();
		}
		columns.add(columnPO);
	}

	public TablePO buildHasDecimal() {
		for (ColumnPO columnPO : columns) {
			if ("decimal".equals(columnPO.getDataType().toLowerCase())) {
				this.hasDecimal = true;
				return this;
			}
		}
		return this;
	}

	@Override
	public String toString() {
		return "TableEntity{" +
				"tableName='" + tableName + '\'' +
				", tableComment='" + tableComment + '\'' +
				", pk=" + pk +
				", columns=" + columns +
				", objName='" + objName + '\'' +
				", className='" + className + '\'' +
				", createTime=" + createTime +
				'}';
	}

}
