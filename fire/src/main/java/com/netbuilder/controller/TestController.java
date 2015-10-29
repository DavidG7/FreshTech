package com.netbuilder.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.Supplier;
import com.netbuilder.entities.ProductSupplier;
import com.netbuilder.entityrepositories.ProductSupplierRepository;
import com.netbuilder.entityrepositories.SupplierRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.OrderHistoryRepositorySQL;
import com.netbuilder.entityrespositoriesimplementations.sql.PurchaseOrderSQL;
import com.netbuilder.entityrepositories.CustomerOrderRepository;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**	ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
		SupplierRepository SupplierRepository = context.getBean(SupplierRepository.class);	
				
		System.out.println(SupplierRepository.toString());
		
		System.out.println(SupplierRepository.findAll().iterator().next().getName());
		System.out.println(SupplierRepository.count());
		System.out.println(SupplierRepository.exists(1));
		System.out.println(SupplierRepository.findBySupplierId(2));
		System.out.println(SupplierRepository.findBySupplierEmail("gnomebros@hotmail.com"));
		System.out.println(SupplierRepository.findBySupplierName("Garden Stuff"));
		System.out.println(SupplierRepository.findBySupplierPhone("77665539987"));
		System.out.println(SupplierRepository.findOne(1));
		
		Supplier test = new Supplier(6,"Tom and Joshs big mad shop", "ballz", "012145644", "email");
		System.out.println(test.);
		SupplierRepository.save(test);
		
		System.out.println(SupplierRepository.findBySupplierPhone("77665539987"));
		
		ApplicationContext context1 = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
		ProductSupplierRepository ProductSupplierRepository = context1.getBean(ProductSupplierRepository.class);	
		
		System.out.println(ProductSupplierRepository.findByProductID(2));
		System.out.println(ProductSupplierRepository.findByPrice(2));
		System.out.println(ProductSupplierRepository.exists(10));
		System.out.println(ProductSupplierRepository.findOne(5));
		System.out.println(ProductSupplierRepository.findBySupplierID(2));
		ProductSupplierRepository.delete(15);
	
		ApplicationContext context2 = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
		CustomerOrderRepository OrderRepository = context2.getBean(CustomerOrderRepository.class);	
	
		System.out.println(OrderRepository.count());
		System.out.println(OrderRepository.exists(2));
		System.out.println(OrderRepository.findAll());
		System.out.println(OrderRepository.findByOrderID(10));
		System.out.println(OrderRepository.findByCustomerID(3));
		System.out.println(OrderRepository.findByDeliveryAddress(2));
		
		
		ApplicationContext context3 = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
		OrderHistoryRepositorySQL OrderHistoryRepository = context3.getBean(OrderHistoryRepositorySQL.class);
		
		System.out.println("Count: "+OrderHistoryRepository.count());
		System.out.println("Exists 1: "+OrderHistoryRepository.exists(1));
		System.out.println("Find all: "+OrderHistoryRepository.findAll());
		System.out.println("Find by order 10: "+OrderHistoryRepository.findByOrderID(10));
		System.out.println("Find by customer 3: "+OrderHistoryRepository.findByCustomerID(3));
		System.out.println("Find by delivery 4: "+OrderHistoryRepository.findByDeliveryAddress(4).iterator().next());
		System.out.println("Find by Order Status: "+OrderHistoryRepository.findByCustomerOrderStatus("Dispatched"));
		System.out.println("Find by Order Date: "+ OrderHistoryRepository.findByOrderDate("2015-10-10"));
		 
		CustomerOrder test = new CustomerOrder(25,9, "2015-10-10", 0, "Ordered",1);
		System.out.println(test);
		OrderHistoryRepository.save(test);
		**/
		ApplicationContext context4 = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
		PurchaseOrderSQL purchaseorder = context4.getBean(PurchaseOrderSQL.class);
		
		System.out.println(purchaseorder.findAll());
		
	}
}
