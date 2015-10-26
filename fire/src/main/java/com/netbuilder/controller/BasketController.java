package com.netbuilder.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Basket;
import com.netbuilder.entityrepositories.BasketRepository;

@Controller
public class BasketController {

	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	BasketRepository basketRepository = mongoContext.getBean(BasketRepository.class);	
	
	//TODO Need to pull customer from site - needs session login
	Basket basket = basketRepository.findByCustomerID(0);
	
	@RequestMapping("Basket")
	 public String basket(Model model) {
			
	        return "Basket";
	  }
	
}
