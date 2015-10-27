package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;

/**
 * 
 * @author rluu
 *
 */

@Controller
public class RegController {

	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);	
	
	 @RequestMapping("Register")
	 public String   Register(Model model) {
	        return "Register";
	  }
	 
	 @RequestMapping(value="postLogin" ,method = RequestMethod.POST)
	 public String doLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		 String username = request.getParameter("username");
			String password = request.getParameter("password");
			List<Customer> customers= customerRepository.findAll();
			System.out.println(customers.size());
			for(int i=0; i<customers.size(); i++){
				System.out.println(customers.get(i).getCustomerID());
				System.out.println(customers.get(i).getCustomerUsername());
				System.out.println(customers.get(i).getCustomerPassword());
				if(customers.get(i).getCustomerUsername().equalsIgnoreCase(username) && customers.get(i).getCustomerPassword().equalsIgnoreCase(password)){
					session.setAttribute("sessionUser", username);
					System.out.println("yay FTW");
					return"redirect:/";
				
				}
			}
			return"redirect:/";
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
			customerRepository.insert(new Customer(customerRepository.findAll().size()+1, "0000000d00", 10000, name, email, username,  password));
			return "redirect:/";
	}
}
