package com.netbuilder.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entityrepositoriesimplementations.mongo.AddressRepositoryMongo;


@Controller
public class AddressController {
	AddressRepositoryMongo AddressRepositoryMongo = new AddressRepositoryMongo();
	
	

	 @RequestMapping("Address")
	 public String PrintAddresses(Model model) {
		 for(int i =0;i < AddressRepositoryMongo.findAll().size();i++){
			 System.out.println("Address ID: " + AddressRepositoryMongo.findAll().get(i).getAddressid());
			 System.out.println("Address: " + AddressRepositoryMongo.findAll().get(i).getAddress());
			 System.out.println("PostCode: " + AddressRepositoryMongo.findAll().get(i).getPostcode());
			 System.out.println("Customer ID: " + AddressRepositoryMongo.findAll().get(i).getCustomerId());
			 System.out.println("");
		 }
	        return "Address";
	 }

	 @RequestMapping("ChooseAddress")
	 public String getAddress (Model modelAndView) {
	        return "ChooseAddress";

	  }

	
}

