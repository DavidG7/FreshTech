package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class OrderTrackingController {

	 @RequestMapping("OrderTracking")
	 public String  OrderTracking(ModelAndView modelAndView) {
	        return "OrderTracking";
	  }
	
}
