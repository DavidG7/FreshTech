package com.netbuilder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class OrderConfirmationController {

	@RequestMapping("OrderConfirmation")
	 public String OrderConfirmation(ModelAndView modelAndView) {
	        return "OrderConfirmation";
	  }
	
}
