package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;

@Controller
public class LandingController {

	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	ProductRepository productRepository = (ProductRepository)context.getBean("ProductRepositoryDummy");
	
	List<Product> discontinuedProducts = productRepository.findByDiscontinued(true);
	List<Product> offerProducts = productRepository.findByOnOffer(true);
	 
	 @RequestMapping("/")
	 String index(Model model, HttpSession session) {
		    //session.setAttribute("mySessionAttribute", "someValue");
		    
		 	model.addAttribute("discontinuedProducts", discontinuedProducts);
		 	model.addAttribute("offerProducts", offerProducts);
		 	
	        return "Landing";
	  }
}
