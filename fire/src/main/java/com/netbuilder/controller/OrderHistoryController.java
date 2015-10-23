/*package com.netbuilder.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.OrderHistoryRepositorySQL;

@Controller
public class OrderHistoryController {
	
	 CustomerOrderRepository orderHistoryRepository = new OrderHistoryRepositorySQL();
	 


	@RequestMapping("OrderHistory")
	 public String  OrderHistory(ModelAndView modelAndView) {
		 CustomerOrder test = orderHistoryRepository.findByCustomerID(5);
		 System.out.println("");

	        return "OrderHistory";
	  }
	
}
*/