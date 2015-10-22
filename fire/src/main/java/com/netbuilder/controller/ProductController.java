package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	
	
	 @RequestMapping("Product")
	 public String   Product(Model modelAndView) {
	        return "Product";
	  }
	 
	 
	 
	 
}
