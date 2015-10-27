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
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.ProductRepository;
@Controller
public class OutstandingOrdersController {
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepository productRepository = mongoContext.getBean(ProductRepository.class);
	AddressRepository addressRepository = mongoContext.getBean(AddressRepository.class);
	CustomerOrderRepository customerOrderRepository = mongoContext.getBean(CustomerOrderRepository.class);
	
	List<CustomerOrder> customerOrders = customerOrderRepository.findByOrderID(0);
	
	List<Product> products = productRepository.findAll();
	List<Product> offerProducts = productRepository.findByOnOffer(true);

	 @RequestMapping("OutstandingOrders")
	public  ModelAndView modelAndView(ModelAndView view, HttpSession session) {
		 	view.setViewName("OutstandingOrders");
		 	
		 	view.addObject("customerOrders", customerOrders);
		 	
	        return view;
	  }
	
}
