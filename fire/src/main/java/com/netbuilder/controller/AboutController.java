package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AboutController {

	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
	        return "About";
	  }
	 
	
}
