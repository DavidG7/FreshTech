package com.netbuilder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class CustomerAccountController {

	 @RequestMapping("CustomerAccountPage")
	 public String CustomerAccountPage (ModelAndView modelAndView) {
	        return "CustomerAccountPage";
	  }
	 
	
}
