package com.clr.api.rr;

import java.io.Serializable;

public class Request implements Serializable{

	private static final long serialVersionUID = -5530385933770262423L;

	private String data ;

	private String condition;

	public Request(String data, String condition) {
		this.data = data;
		this.condition = condition;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
