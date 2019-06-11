
package com.clr.modules.sysmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统页面视图
 *
 */
@Controller
public class SysPageController {

	/**
	 * 页面跳转
	 * @param module
	 * @param function
	 * @param url
	 * @return
	 */
	@RequestMapping("/{module}/{function}/{url}.html")
	public String page(@PathVariable("module") String module, @PathVariable("function") String function,
					   @PathVariable("url") String url) {
		return "/" + module + "/" + function + "/" + url + ".html";
	}

	@RequestMapping(value = {"/", "index.html"})
	public String index(){
		return "index";
	}

	@RequestMapping("index1.html")
	public String index1(){
		return "index1";
	}

	@RequestMapping("login.html")
	public String login(){
		return "login";
	}


	@RequestMapping("404.html")
	public String notFound(){
		return "404";
	}

	/**
	 * 系统首页
	 * @return
	 */
	@RequestMapping("/dashboard")
	public String main() {
		return "/system/dashboard.html";
	}

}
