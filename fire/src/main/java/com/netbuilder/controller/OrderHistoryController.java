package com.netbuilder.controller;
/**
 *  * @author jham
 */
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.OrderHistoryRepositorySQL;

@Controller
public class OrderHistoryController {
	
	 CustomerOrderRepository orderHistoryRepository = new OrderHistoryRepositorySQL();
	
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
	 public String OrderHistory (){
			orderHistoryRepository.delete(25);
			return "OrderHistory";
	 }
}
