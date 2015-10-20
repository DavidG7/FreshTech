package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;

@Controller
public class RegController {

	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	CustomerRepository CustomerRepositoryDummy = (CustomerRepository)context.getBean("CustomerRepositoryDummy");
	List<Customer> customers = CustomerRepositoryDummy.findAll();
	
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
			customers.add(new Customer(1,"0000000000000",50, name,email,username,password,email));
			return "redirect:/";	
	}
}
