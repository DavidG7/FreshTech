package com.netbuilder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class BasketController {

	@RequestMapping("Basket")
	 public String basket(ModelAndView modelAndView) {
	        return "Basket";
	  }
	
}