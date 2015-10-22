package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PaymentAgreementController {

	 @RequestMapping("PaymentAgreement")
	 public String  PaymentAgreement(ModelAndView modelAndView) {
	        return "PaymentAgreement";
	  }
	
	
}
