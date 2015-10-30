package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Address;
import com.netbuilder.entities.Basket;
import com.netbuilder.service.BasketService;
/**
 * 
 * @author pnewman
 *
 */
@Controller
public class BasketController {

	BasketService service;
	
	@RequestMapping("Basket")
	public ModelAndView basket(ModelAndView modelAndView, HttpSession session) {
		service = new BasketService(session, "sessionUser");
		return service.modelBaskets(modelAndView);
	}

	@RequestMapping(value="removeBasket", method=RequestMethod.POST)
	public String remove(HttpServletRequest request){ 
		return service.removeBaskets(request);
	}
	
	@RequestMapping(value="saveBasket", method=RequestMethod.POST)
	public String save(HttpServletRequest request){ 
		return service.saveBaskets(request);
	}
	
	@RequestMapping(value="submitOrder", method=RequestMethod.POST)
	public String submit(HttpServletRequest request){

		return "redirect:/OrderConfirmation";
	}
}
