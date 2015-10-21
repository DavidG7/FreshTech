package com.netbuilder.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entities.Address;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.ProductRepository;

@Controller
public class AddressController {

	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	
    AddressRepository addressRepository = (AddressRepository)context.getBean("AddressRepositoryMongo");
	List<Address> addresses = addressRepository.findAll();
	 
	 @RequestMapping("/address")
	    public String landing(Model model) {
    	 System.out.println(addresses.get(0).getAddress());
		 model.addAttribute("addresses", addresses);
	        return "HelloWorld";
	  }
}