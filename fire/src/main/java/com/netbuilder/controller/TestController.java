package com.netbuilder.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Supplier;
import com.netbuilder.entities.ProductSupplier;
import com.netbuilder.entityrepositories.ProductSupplierRepository;
import com.netbuilder.entityrepositories.SupplierRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.OrderHistoryRepositorySQL;
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
	**/
		ApplicationContext context2 = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
		CustomerOrderRepository OrderHistoryRepository = context2.getBean(CustomerOrderRepository.class);	
	
		System.out.println(OrderHistoryRepository.count());
		System.out.println(OrderHistoryRepository.exists(2));
	
	}
}
