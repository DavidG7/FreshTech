package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.CustomerRepository;

@Controller
public class OrderTrackingController {
 
	ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
    CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
	CustomerOrderRepository customerOrderRepository = context.getBean(CustomerOrderRepository.class);
	
	//CustomerOrder customerOrder = customerOrderRepository.findByCustomerID(1);
	
    CustomerOrder customerOrder; 
    
	//CustomerOrder customerOrder = new CustomerOrder(8, 57, "today", 5, "Order Confirmed", 9);
			
	 @RequestMapping(value="OrderTracking")
	 public ModelAndView  OrderTracking(ModelAndView modelAndView, HttpSession session) {
	     
		 String user = (String) session.getAttribute("sessionUser");
		 
		 Customer customer = customerRepository.findByCustomerUsername(user);
		 
		 customerOrder = customerOrderRepository.findByCustomerID(customer.getCustomerID());
		 
		 modelAndView.addObject("customerOrder", customerOrder);
		return modelAndView;
	  }	
}
