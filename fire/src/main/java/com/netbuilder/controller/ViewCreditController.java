package com.netbuilder.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;

@Controller
public class ViewCreditController {

	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);	
	
	
	@RequestMapping(value="ViewCreditDetails")
	public  ModelAndView getCredit(ModelAndView view,HttpServletRequest request, HttpSession session){
		 view.setViewName("ViewCreditDetails");
		 String user =session.getAttribute("sessionUser")+"";
		 if(user.equalsIgnoreCase("null")){
			 view.setViewName("Register");
		 }	
		 else{
		 view.addObject("credit", customerRepository.findByCustomerUsername(user).getAvailableCredit());
		 }
		 return view;
	}	
	
}
