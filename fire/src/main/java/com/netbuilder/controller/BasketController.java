package com.netbuilder.controller;

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
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;

/**
 * 
 * @author pnewman
 *
 */
@Controller
public class BasketController {

	ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	BasketRepository basketRepository = context.getBean(BasketRepository.class);	
	CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
	ProductRepository productRepository = context.getBean(ProductRepository.class);
	
	Basket basket; 
	
	@RequestMapping("Basket")
	public ModelAndView basket(ModelAndView view, HttpSession session) {
		
		String user =session.getAttribute("sessionUser")+"";
		if(user.equalsIgnoreCase("null")){
			view.setViewName("Register");
		}	
		else{
			int userID = customerRepository.findByCustomerUsername(user).getCustomerID();	
			System.out.println(userID);
			List<Basket> baskets = basketRepository.findByCustomerID(userID);
			System.out.println(baskets);
			view.addObject("basket", baskets);
			view.setViewName("Basket");
		}
		
		return view;
	}

	@RequestMapping(value="postUpdate", method = RequestMethod.POST)
	public String basket(HttpServletRequest request){
		String basketID = request.getParameter("basket");
		System.out.println(basketID);

		Basket basket = basketRepository.findByBasketID(Integer.parseInt(basketID));
		
		System.out.println(basket);

		basketRepository.delete(basket);
		
		return "redirect:/Basket";
	}
	
}
