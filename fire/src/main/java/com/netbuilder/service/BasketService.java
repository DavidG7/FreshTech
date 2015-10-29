package com.netbuilder.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Address;
import com.netbuilder.entities.Basket;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerOrderLineRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.CustomerRepository;

public class BasketService extends GenericService{

	public BasketService(HttpSession session, String sessionName) {
		super(session, sessionName);
		// TODO Auto-generated constructor stub
	}

	public ModelAndView modelBaskets(ModelAndView modelAndView){
		if(!isSession()){
			modelAndView.setViewName("Register");
		}
		else{
			List<Basket> baskets = this.getBasketRepository().findByCustomerID(this.getSessionID());
			List<Address> addresses = this.getAddressRepository().findByCustomerId(this.getSessionID());
			System.out.println(addresses);
			modelAndView.addObject("addresses", addresses);
			modelAndView.addObject("basket", baskets);
			modelAndView.setViewName("Basket");
		}
		return modelAndView;
	}
	
	public String removeBaskets(HttpServletRequest request){
		String basketID = request.getParameter("remove");
		Basket basket = this.getBasketRepository().findByBasketID(Integer.parseInt(basketID));
		System.out.println(basket);
		this.getBasketRepository().delete(basket.getBasketID());
		return "redirect:/Basket";
	}
	
	public String saveBaskets(HttpServletRequest request){
		String basketID = request.getParameter("save");
		Basket basket = this.getBasketRepository().findByBasketID(Integer.parseInt(basketID));
		System.out.println(basket);
		System.out.println(basket.getQuantity());
		basket.setQuantity(99);
		System.out.println(basket.getQuantity());
		this.getBasketRepository().save(basket);
		return "redirect:/Basket";
	}
	
}