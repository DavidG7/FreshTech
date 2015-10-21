package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AddressController {

	 @RequestMapping("ChooseAddress")
	 public String getAddress (Model modelAndView) {
	        return "ChooseAddress";
	  }
}
	 
	 
	

