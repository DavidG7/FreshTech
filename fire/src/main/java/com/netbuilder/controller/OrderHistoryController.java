package com.netbuilder.controller;
/**
 *  @author jham
 *  @author rluu
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.CustomerOrderLine;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrepositories.CustomerOrderLineRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.OrderHistoryRepositorySQL;

@Controller
public class OrderHistoryController {
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);	
	CustomerOrderRepository customerOrderRepository = mongoContext.getBean(CustomerOrderRepository.class);	
	CustomerOrderLineRepository customerOrderLineRepository = mongoContext.getBean(CustomerOrderLineRepository.class);	
	ProductRepository productRepository  = mongoContext.getBean(ProductRepository.class);	
	
	
	 /*@RequestMapping("OrderHistory")
	public String OrderHistory (){
		orderHistoryRepository.findAll();
		return "OrderHistory";
		
	}/*
	 @RequestMapping("OrderHistory")
	 public String OrderHistory (){
			orderHistoryRepository.count();
			return "OrderHistory";
			
		} 
	 
	 @RequestMapping("OrderHistory")
	 public String OrderHistory (){
			orderHistoryRepository.findByOrderID(5);
			return "OrderHistory";
			
		}
		
	 @RequestMapping("OrderHistory")
	 public String OrderHistory (){
			orderHistoryRepository.findByCustomerID(5);
			return "OrderHistory";
			
		}
		
	 @RequestMapping("OrderHistory")
	 public String OrderHistory (){
			orderHistoryRepository.findByDeliveryAddress(5);
			return "OrderHistory";
	 }
	 
	

	 @RequestMapping("OrderHistory")
	 public String OrderHistory (){
			orderHistoryRepository.findByCustomerOrderStatus("Processing");
			return "OrderHistory";
	 }
	 
	 	 @RequestMapping("OrderHistory")
	 public String OrderHistory (){
			orderHistoryRepository.findByDateOfOrder("2015-10-10");
			return "OrderHistory";
	}
	 @RequestMapping("OrderHistory")
	 public String OrderHistory (){
			orderHistoryRepository.findByOrderTotal(0);
			return "OrderHistory";
	 }
*/
	 @RequestMapping("OrderHistory")
	 public ModelAndView OrderHistory (ModelAndView view, HttpSession session){
		 String user =  session.getAttribute("sessionUser")+"";
				if(user.equalsIgnoreCase("null")){
					view.setViewName("Register");
				}
				else{
				 	Customer customer = customerRepository.findByCustomerUsername(user);
				 	List<CustomerOrder> orders = customerOrderRepository.findByCustomerID(customer.getCustomerID());
				 	ArrayList<CustomerOrderLine>  customerOrderLine = new ArrayList<CustomerOrderLine>();
				 	ArrayList<Product>  products = new ArrayList<Product>();
				 	for(int i=0; i<orders.size(); i++){
				 		CustomerOrderLine orderlines = customerOrderLineRepository.findByCustomerOrderLineID(orders.get(i).getOrderID());
				 		System.out.println(orders.get(i).getOrderID());
				 		customerOrderLine.add(orderlines);
				 	}
				 	for(int i=0; i<customerOrderLine.size(); i++){
				 		products.add(productRepository.findByProductID(customerOrderLine.get(i).getProductID()));
				 		System.out.println(products.get(i).getProductName());
				 	}
				 
				 	view.setViewName("OrderHistory");
				 	view.addObject("customerOrders", orders);
				 	view.addObject("products", products);
				 	return view;
				}
		return view;
			 
	 }
}
