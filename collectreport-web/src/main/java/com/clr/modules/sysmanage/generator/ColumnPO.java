package com.clr.modules.sysmanage.generator;

import lombok.Data;

import java.io.Serializable;

@Data
public class ColumnPO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 列名
	 */
	private String columnName;
	
	/**
	 * 数据类型
	 */
	private String dataType;
	
	/**
	 * 列注释
	 */
	private String columnComment;
	
	/**
	 * 属性名，作为类属性名（userId）
	 */
	private String fieldName;
	
	/**
	 * 属性名，作为类方法名（UserId）
	 */
	private String methodName;
	
	/**
	 * 列数据类型对应java数据类型
	 */
	private String fieldType;
	
	/**
	 * 键类型标识
	 */
	private String columnKey;
	
	/**
	 * 自增标识 auto_increment
	 */
	private String extra;

	public ColumnPO() {
		super();
	}

	@Override
	public String toString() {
		return "ColumnEntity{" +
				"columnName='" + columnName + '\'' +
				", dataType='" + dataType + '\'' +
				", columnComment='" + columnComment + '\'' +
				", fieldName='" + fieldName + '\'' +
				", methodName='" + methodName + '\'' +
				", fieldType='" + fieldType + '\'' +
				", columnKey='" + columnKey + '\'' +
				", extra='" + extra + '\'' +
				'}';
	}

}
