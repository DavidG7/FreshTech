package com.netbuilder.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.BeansConfig;
import com.netbuilder.MongoConfig;
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;

@Controller
public class RegController {

	
	CustomerRepositoryMongo CustomerRepositoryMongo = new CustomerRepositoryMongo();
	
	
	 @RequestMapping("Register")
	 public String   Register(Model model) {
	        return "Register";
	  }
	 
	@RequestMapping(value="postReg" ,method = RequestMethod.POST)
	public String doPost (HttpServletRequest request, HttpServletResponse response) {
			String name = request.getParameter("firstnamesignup");
			String lname = request.getParameter("lastnamesignup");
			String email =  request.getParameter("emailsignup");
			String username = request.getParameter("usernamesignup");
			String password = request.getParameter("passwordsignup");
			String password2 = request.getParameter("passwordsignup_confirm");
			String month = request.getParameter("month");
			String day = request.getParameter("day");
			String year = request.getParameter("year");
			System.out.println(name);
			System.out.println(lname);
			System.out.println(username);
			System.out.println(password);
			System.out.println(password2);
			System.out.println(month);
			System.out.println(day);
			System.out.println(year);
			CustomerRepositoryMongo.insert(new Customer(3, "000000000", 50, name, email, username,  password));
			CustomerRepositoryMongo.count();
			return "redirect:/";
	}
}
