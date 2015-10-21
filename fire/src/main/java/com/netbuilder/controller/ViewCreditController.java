package com.netbuilder.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;

@Controller
public class ViewCreditController {


	CustomerRepositoryMongo CustomerRepositoryMongo = new CustomerRepositoryMongo();
	
	
	@RequestMapping("ViewCreditDetails")
	public void getCredit(Model model,HttpServletRequest request){
		model.addAttribute("credit", CustomerRepositoryMongo.findByCustomerID(1));
	}
	
}
