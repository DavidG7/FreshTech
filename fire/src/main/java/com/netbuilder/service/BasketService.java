package com.netbuilder.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Basket;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerRepository;

public class BasketService extends GenericService{

	public BasketService(HttpSession session, String sessionName) {
		super(session, sessionName);
	}

	public void modelBaskets(ModelAndView modelAndView, String sessionName, BasketRepository basketRepository, CustomerRepository customerRepository){
		System.out.println(sessionName);
		int userID = customerRepository.findByCustomerUsername(sessionName).getCustomerID();	
		System.out.println("ID: "+userID);
		List<Basket> baskets = basketRepository.findByCustomerID(userID);
		System.out.println(baskets);
		modelAndView.addObject("basket", baskets);
		modelAndView.setViewName("Basket");
	}
	
	public String removeBaskets(HttpServletRequest request, BasketRepository basketRepository){
		String basketID = request.getParameter("basket");
		Basket basket = basketRepository.findByBasketID(Integer.parseInt(basketID));
		System.out.println(basket);
		basketRepository.delete(basket.getBasketID());
		return "redirect:/Basket";
	}
}