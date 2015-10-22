package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderFormController {
	@RequestMapping("EmailOrderForm")
	 public String OrderForm(ModelAndView modelAndView) {
	        return "EmailOrderForm";
	  }
}
