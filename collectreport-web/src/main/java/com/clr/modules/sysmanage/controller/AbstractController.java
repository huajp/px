package com.clr.modules.sysmanage.controller;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractController {

	/**
	 * 日志
	 */
	protected Logger LOGGER = LoggerFactory.getLogger(getClass());


	/**
	 * 重定向
	 * @param page
	 * @return 重定向全路径
	 */
	protected String redirect(String page) {
		return "redirect:".concat(page);
	}

	/**
	 * beetl视图
	 * @param page
	 * @return html全路径
	 */
	protected String html(String page) {
		return page.concat(".html");
	}

	@Autowired
	protected Mapper mapper;

	protected <T, S> T convert(S s, Class<T> clz) {
		if (s == null) {
			return null;
		}
		return this.mapper.map(s, clz);
	}

	protected <T, S> List<T> convert(List<S> s, Class<T> clz) {
		if (s == null) {
			return null;
		}
		List<T> list = new ArrayList<T>();
		for (S vs : s) {
			list.add(this.mapper.map(vs, clz));
		}
		return list;
	}
	
}
