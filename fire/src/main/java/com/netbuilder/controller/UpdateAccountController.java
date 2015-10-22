package com.netbuilder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class UpdateAccountController {

	 @RequestMapping("UpdateAccount")
	 public String UpdateAccount (ModelAndView modelAndView) {
	        return "UpdateAccount";
	  }
	
}
