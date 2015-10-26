package com.netbuilder.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;
@Controller
public class ChooseAddressController {

	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	AddressRepository addressRepository = mongoContext.getBean(AddressRepository.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);
	
	ArrayList<Address> addresses;
	Customer customer;
	int customerID;
	
	@RequestMapping("ChooseAddress")
	public String ChooseAddress (ModelAndView modelAndView, HttpSession session) {
		
		 ModelAndView view = new ModelAndView();
		 view.setViewName("ViewCreditDetails");
		 String user = session.getAttribute("sessionUser")+"";
		 
		 if(user.equalsIgnoreCase("null")){
			view.setViewName("Register");
		 }
		 
		 else{
			
			customer = customerRepository.findByCustomerUsername(user);
			customerID = customer.getCustomerID();
			addresses = (ArrayList<Address>) addressRepository.findByCustomerId(customerID);
			view.addObject("addresses", addresses);
			
		 }
			 
		return "ChooseAddress";
	}
	
}
