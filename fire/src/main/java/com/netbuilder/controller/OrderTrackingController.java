package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositories.CustomerOrderRepository;

@Controller
public class OrderTrackingController {
 
	ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
    CustomerOrderRepository customerOrderRepository = context.getBean(CustomerOrderRepository.class);
	
	CustomerOrder customerOrder = customerOrderRepository.findByCustomerID(1);
		
	 @RequestMapping(value="OrderTracking")
	 public ModelAndView  OrderTracking(ModelAndView modelAndView) {
	        		
		 System.out.println(customerOrder.getCustomerID());
		 
		 modelAndView.addObject("customerOrder", customerOrder);
		 
		 return modelAndView;
	  }
	
}
