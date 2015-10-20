package com.netbuilder.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;

public class TemplateController {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	ProductRepository productRepository = (ProductRepository)context.getBean("ProductRepositoryDummy");
	List<Product> discontinuedProducts = productRepository.findByDiscontinued(true);
	 
	 @RequestMapping("/")
	    public String landing(Model model) {
		 	model.addAttribute("discontinuedProducts", discontinuedProducts);
	        return "Landing";
	  }
}