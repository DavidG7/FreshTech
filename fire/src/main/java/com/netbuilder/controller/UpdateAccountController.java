package com.netbuilder.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;


 /**
  * 
  * @author rluu
  *
  */
@Controller
public class UpdateAccountController {
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);	

	 @RequestMapping("UpdateAccount")
	 public ModelAndView UpdateAccount (ModelAndView modelAndView, HttpSession session) {
		 	ModelAndView view = new ModelAndView();
		 	view.setViewName("UpdateAccount");
		 	 String user =session.getAttribute("sessionUser")+"";
			 if(user.equalsIgnoreCase("null")){
				 view.setViewName("Register");
			 }	
			 else{
				 Customer customer = customerRepository.findByCustomerUsername(user);
				 view.addObject("customerAddress", customer.getCustomerAddressAt(0));	
				 view.addObject("customer", customer);		
			 } 
	        return view;
	  }
	

	 
	 
}
