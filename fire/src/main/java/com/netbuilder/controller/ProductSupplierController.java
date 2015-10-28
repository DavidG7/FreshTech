package com.netbuilder.controller;

/**
 *  * @author jham
 */
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositories.ProductSupplierRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.ProductSupplierRepositorySQL;


@Controller
public class ProductSupplierController {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductSupplierRepository productSupplierRepository = context.getBean(ProductSupplierRepository.class);	
	

	//ProductSupplierRepository productSupplierRepository = new ProductSupplierRepositorySQL();

	
}


