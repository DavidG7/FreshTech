package com.netbuilder.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;

@Controller
public class ViewCreditController {


	CustomerRepositoryMongo CustomerRepositoryMongo = new CustomerRepositoryMongo();
	
	
	@RequestMapping(value="ViewCreditDetails")
	public  ModelAndView getCredit(Model model,HttpServletRequest request, HttpSession session){
		 ModelAndView view = new ModelAndView();
		 view.setViewName("ViewCreditDetails");
		 String user =session.getAttribute("sessionUser")+"";
		 if(user.equalsIgnoreCase("null")){
			 view.setViewName("Register");
		 }	
		 else{
		 view.addObject("credit", CustomerRepositoryMongo.findByCustomerUsername(user).getAvailableCredit());
		 }
		 return view;
	}	
	
}
