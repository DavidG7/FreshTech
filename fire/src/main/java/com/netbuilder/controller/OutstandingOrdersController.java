package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;
@Controller
public class OutstandingOrdersController {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepository productRepository = context.getBean(ProductRepository.class);
	AddressRepository addressRepository = context.getBean(AddressRepository.class);
	CustomerOrderRepository customerOrderRepository = context.getBean(CustomerOrderRepository.class);
	CustomerRepository customerRepository = context.getBean(CustomerRepository.class);

	CustomerOrder customerOrders;
	Address address;
	Product products;
	List<Product> offerProducts;
	
	 @RequestMapping("OutstandingOrders")
	public  ModelAndView modelAndView(ModelAndView view, HttpSession session) {
		 	view.setViewName("OutstandingOrders");
		 	
			 String user =session.getAttribute("sessionUser")+"";
			 
			 if(user.equalsIgnoreCase("null")){
				 view.setViewName("Register");
			 }
		 	
			 else{
			
			int customerID = customerRepository.findByCustomerUsername(user).getCustomerID();
				 
			customerOrders = customerOrderRepository.findByCustomerID(customerID);
			address = addressRepository.findAll().get(0);
			products = productRepository.findAll().get(0);
			offerProducts = productRepository.findByOnOffer(true);				 
				 
				 
				 
		 	view.addObject("customerOrders", customerOrders);
		 	view.addObject("products", products);
		 	view.addObject("address", address);
		 	
			 }
		 	
	        return view;
	  }
	
}
