package com.netbuilder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class LoginController {

	@RequestMapping("Login")
	 public String Login(ModelAndView modelAndView) {
	        return "Login";
	  }
	
}
