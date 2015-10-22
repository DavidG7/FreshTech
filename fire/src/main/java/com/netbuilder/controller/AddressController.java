package com.netbuilder.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entities.Address;
import com.netbuilder.entityrepositoriesimplementations.mongo.AddressRepositoryMongo;


@Controller
public class AddressController {
	AddressRepositoryMongo AddressRepositoryMongo = new AddressRepositoryMongo();
	
	

	 @RequestMapping("Address")
	 public String PrintAddresses(Model model) {
		 AddressRepositoryMongo.delete(AddressRepositoryMongo.findByAddressID(1).getAddressid());
		 for(int i =0;i < AddressRepositoryMongo.findAll().size();i++){
			 System.out.println("");
			 System.out.println("Address ID: " + AddressRepositoryMongo.findAll().get(i).getAddressid());
			 System.out.println("Address: " + AddressRepositoryMongo.findAll().get(i).getAddress());
			 System.out.println("PostCode: " + AddressRepositoryMongo.findAll().get(i).getPostcode());
			 System.out.println("Customer ID: " + AddressRepositoryMongo.findAll().get(i).getCustomerId());
		 }
		 
			 System.out.println("");
			 System.out.println("Specific Postcode: " + AddressRepositoryMongo.findByAddressID(3).getAddress());
			 System.out.println("Specific Postcode: " + AddressRepositoryMongo.findByCustomerId(2).get(0).getAddress());
			 System.out.println("Specific Postcode: " + AddressRepositoryMongo.findByCustomerId(2).get(1).getAddress());
			 
			 System.out.println("Number of Adresses: " + AddressRepositoryMongo.count());
			 
			 
			 AddressRepositoryMongo.delete(AddressRepositoryMongo.findByAddressID(4));
			 
			 //AddressRepositoryMongo.insert(new Address(5, "Big Street, Big Town, Birmingham, United Kingdom", "BA445", 1));
			 
	 
	        return "Address";
	 }

	 @RequestMapping("ChooseAddress")
	 public String getAddress (Model modelAndView) {
	        return "ChooseAddress";

	  }

	
}

