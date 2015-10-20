package com.netbuilder.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;

public class RegController {

	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	CustomerRepository CustomerRepositoryDummy = (CustomerRepository)context.getBean("CustomerRepositoryDummy");
	List<Customer> custoemrs  = CustomerRepositoryDummy.findAll();
	 
	 @RequestMapping("Register")
	    	public String landing(Model model) {
		 		//model.addAttribute("discontinuedProducts", discontinuedProducts);
	        	return "Register";
	 	}
}
