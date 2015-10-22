package com.netbuilder.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;


 /**
  * 
  * @author rluu
  *
  */
@Controller
public class UpdateAccountController {
	
	CustomerRepositoryMongo CustomerRepositoryMongo = new CustomerRepositoryMongo();

	 @RequestMapping("UpdateAccount")
	 public ModelAndView UpdateAccount (ModelAndView modelAndView, HttpSession session) {
		 	ModelAndView view = new ModelAndView();
		 	view.setViewName("UpdateAccount");
		 	 String user =session.getAttribute("sessionUser")+"";
			 if(user.equalsIgnoreCase("null")){
				 view.setViewName("Register");
			 }	
			 else{
				 Customer customer = CustomerRepositoryMongo.findByCustomerUsername(user);
				 view.addObject("customerAddress", customer.getCustomerAddressAt(0));	
				 view.addObject("customer", customer);		
			 } 
	        return view;
	  }
	

	 
	 
}
