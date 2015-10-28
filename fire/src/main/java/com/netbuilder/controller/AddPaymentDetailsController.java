package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * @author rluu
 *
 */


@Controller
public class AddPaymentDetailsController {

	 @RequestMapping("AddPaymentDetails")
	 public String addPaymentDetails(ModelAndView modelAndView) {
	        return "AddPaymentDetails";
	 }
	
}
