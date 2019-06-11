
package com.clr.modules.sysmanage.controller;


import com.clr.common.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  @author: pjinhua
 *  @Date: 2019/3/31 21:10
 *  @Description: 
 */ 
@Controller
public class LoginController extends AbstractController{

	@RequestMapping("captcha.jpg")
	public void captcha(HttpServletResponse response)throws IOException {

	}
	
	/**
	 * 登录
	 */
	@ResponseBody
	@RequestMapping(value = "/sys/login", method = RequestMethod.POST)
	public R login(String username, String password, String captcha) {
		return R.ok();
	}
	

	/**
	 * 跳转后台控制台
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return html("/index");
	}

	@RequestMapping(value = "/sys/logout", method = RequestMethod.GET)
	public String logout() {
		return html("/login");
	}

}
