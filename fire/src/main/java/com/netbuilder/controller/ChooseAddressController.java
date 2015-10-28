package com.netbuilder.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;

/**
 * 
 * @author pnewman
 * @author ricky luu
 *
 */
@Controller
public class ChooseAddressController {

	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	AddressRepository addressRepository = mongoContext.getBean(AddressRepository.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);
	
	ArrayList<Address> addresses;
	Customer customer;
	int customerID;
	
	@RequestMapping("ChooseAddress")
	public ModelAndView ChooseAddress (ModelAndView view, HttpSession session) {
		
		 view.setViewName("ChooseAddress");
		 String user = session.getAttribute("sessionUser")+"";
		 if(user.equalsIgnoreCase("null")){
			view.setViewName("Register");
			System.out.println("Not logged in");
		 }
		 
		 else{
			System.out.println("Logged in");

			customer = customerRepository.findByCustomerUsername(user);
			customerID = customer.getCustomerID();
			addresses = (ArrayList<Address>) addressRepository.findByCustomerId(customerID);
			
			for(Address address : addresses){
				System.out.println(address.getAddress());
			}
			view.addObject("addresses", addresses);
		 }
			 
		return view;
	}

}
