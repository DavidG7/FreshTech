package com.netbuilder.controller;

import java.security.Provider.Service;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Basket;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.service.BasketService;
/**
 * 
 * @author pnewman
 *
 */
@Controller
public class BasketController {

	ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	AddressRepository addressRepository = context.getBean(AddressRepository.class);
	BasketRepository basketRepository = context.getBean(BasketRepository.class);	
	CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
	ProductRepository productRepository = context.getBean(ProductRepository.class);
	
	Basket basket; 
	BasketService service;
	
	@RequestMapping("Basket")
	public ModelAndView basket(ModelAndView modelAndView, HttpSession session) {

		service = new BasketService(session, "sessionUser");
		
		if(!service.sessionExists(modelAndView)){
			modelAndView.setViewName("Register");
		}
		else{
			service.modelBaskets(modelAndView,(String) service.getUserSession(),addressRepository, basketRepository,customerRepository);
		}
		return modelAndView;
	}

	@RequestMapping(value="removeBasket", method=RequestMethod.POST)
	public String basket(HttpServletRequest request){ 
		return service.removeBaskets(request,basketRepository);
	}
	
	@RequestMapping(value="submitOrder", method=RequestMethod.POST)
	public String submit(HttpServletRequest request){
		return "redirect:/OrderConfirmation";
	}
}
