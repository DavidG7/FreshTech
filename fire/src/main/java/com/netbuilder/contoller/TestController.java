package com.netbuilder.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Payment;

@Controller
public class TestController {

	
	@Autowired
	Payment payment;
	
	 @RequestMapping(value = "paymentmethod", method = RequestMethod.GET)
	    public String display(Model model) {
	        		
		return "paymentmethod";
	  }
}
