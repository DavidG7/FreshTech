package com.netbuilder.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;

/**
 * This class acts as a controller for the Landing page.
 * @author pnewman
 */
@Controller
public class LandingController {
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepository productRepository = mongoContext.getBean(ProductRepository.class);	
	
	List<Product> discontinuedProducts = productRepository.findByDiscontinued(true);
	List<Product> offerProducts = productRepository.findByOnOffer(true);

	 /**
	  * This method adds attributes to the Landing page view, then returns the name of the .jsp file as a String.
	  * @param model
	  * @return String
	  */
	 @RequestMapping("/")
	 String index(Model model) {
		 	model.addAttribute("discontinuedProducts", discontinuedProducts);
		 	model.addAttribute("offerProducts", offerProducts);
	        return "Landing";
	  }
}
