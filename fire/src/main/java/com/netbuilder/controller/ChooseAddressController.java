package com.netbuilder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ChooseAddressController {

	 @RequestMapping("ChooseAddress")
	 public String ChooseAddress (ModelAndView modelAndView) {
	        return "ChooseAddress";
	  }
	
}
