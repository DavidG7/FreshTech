/*package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Basket;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.BasketRespositoryMongo;

@Controller
public class BasketController {

	BasketRepository basketRepository = new BasketRespositoryMongo();

	//TODO Need to pull customer from site - needs session login
	Basket basket = basketRepository.findByCustomerID(0);
	
	@RequestMapping("Basket")
	 public String basket(Model model) {
			
	        return "Basket";
	  }
	
}
*/