package com.netbuilder.controller;

import java.util.List;

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
import com.netbuilder.entityrepositoriesimplementations.mongo.AddressRepositoryMongo;

@Controller
public class AddressController {

	
	AddressRepositoryMongo AddressRepositoryMongo = new AddressRepositoryMongo();
	
	
	 @RequestMapping("Address")
	 public String HelloWorld(Model model) {
		 System.out.println("PostCode" + AddressRepositoryMongo.findAll().get(1).getPostcode());
	        return "HelloWorld";
	  }
	 

}
