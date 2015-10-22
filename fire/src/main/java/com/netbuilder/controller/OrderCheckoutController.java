package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class OrderCheckoutController {

	 @RequestMapping("OrderCheckout")
	 public String  PaymentAgreement(ModelAndView modelAndView) {
	        return "OrderCheckout";
	  }
	
	
}
