package com.netbuilder.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entityrepositories.SupplierRepository;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
		SupplierRepository SupplierRepository = context.getBean(SupplierRepository.class);	
				
		System.out.println(SupplierRepository.toString());
		
		System.out.println(SupplierRepository.findAll().iterator().next().getName());
		System.out.println(SupplierRepository.count());
		System.out.println(SupplierRepository.exists(1));
		System.out.println(SupplierRepository.findBySupplierId(2));
		System.out.println(SupplierRepository.findBySupplierEmail("gnomebros@hotmail.com"));
		System.out.println(SupplierRepository.findBySupplierName("Garden Stuff"));
		System.out.println(SupplierRepository.findBySupplierPhone("77665539987"));
		
	}

}
