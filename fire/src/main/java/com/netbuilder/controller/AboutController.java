package com.netbuilder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class AboutController {

	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
	        return "About";
	  }
	 
	
}
