package com.netbuilder.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;

import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;




@Controller
public class AddressController {
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);	
	
	//ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	//MessageSender sender = (MessageSender)appContext.getBean("messageSender"); 

	 @RequestMapping("Address")
	 public String PrintAddresses(Model model) {
		customerRepository.delete(customerRepository.findByCustomerID(2));
		customerRepository.save(new Customer(1,"0872456678",9790,"Jenny Smith the second", "jennysmith@gmail.com", "JenkinJennySmith", "ILoveGnomes" ));
		customerRepository.save(new Customer(2,"0865546739",9960,"Ben Locamotive the second", "benlococoko@gmail.com", "HotLikeATrain", "ILoveGnomesToo" ));
		
	
		 for(int i =0;i < customerRepository.findAll().size();i++){
			 System.out.println("");
			 System.out.println("Customer ID: " + customerRepository.findAll().get(i).getCustomerID());
			 System.out.println("Customer Phone: " + customerRepository.findAll().get(i).getCustomerPhone());
			 System.out.println("Available Credit:" + customerRepository.findAll().get(i).getAvailableCredit());
			 System.out.println("Customer Name: " + customerRepository.findAll().get(i).getCustomerName());
		 }
		 
			 System.out.println("");

			 System.out.println("Customer Name: (1)" + customerRepository.findByCustomerID(1).getCustomerName());
			 System.out.println("Customer Name (2): " + customerRepository.findByCustomerID(2).getCustomerName());
			// System.out.println("Specific Postcode: " + customerRepositoryMongo.findByCustomerId(2).get(1).getAddress());
			 
			 System.out.println("Number of Customers: " + customerRepository.count());
			 
			// customerRepositoryMongo.delete(customerRepositoryMongo.findByAddressID(4));
			
			
			 
			
			 
			 //customerRepositoryMongo.insert(new Address(5, "Big Street, Big Town, Birmingham, United Kingdom", "BA445", 1));
			 
	 
	        return "Address";
	 }

	 

	
}
