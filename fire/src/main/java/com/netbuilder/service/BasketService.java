package com.netbuilder.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Address;
import com.netbuilder.entities.Basket;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerRepository;

public class BasketService extends GenericService{

	public BasketService(HttpSession session, String sessionName) {
		super(session, sessionName);
	}

	public void modelBaskets(ModelAndView modelAndView, String sessionName, AddressRepository addressRepository, BasketRepository basketRepository, CustomerRepository customerRepository){
		int userID = customerRepository.findByCustomerUsername(sessionName).getCustomerID();	
		List<Basket> baskets = basketRepository.findByCustomerID(userID);
		List<Address> addresses = addressRepository.findByCustomerId(userID);
		System.out.println(addresses);
		modelAndView.addObject("addresses", addresses);
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