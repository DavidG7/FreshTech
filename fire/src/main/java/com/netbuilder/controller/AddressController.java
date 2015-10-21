package com.netbuilder.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entityrepositoriesimplementations.mongo.AddressRepositoryMongo;


@Controller
public class AddressController {
	AddressRepositoryMongo AddressRepositoryMongo = new AddressRepositoryMongo();
	
	
	 @RequestMapping("ChooseAddress")
	 public String getAddress (Model modelAndView) {
	        return "ChooseAddress";
	  }

	
}

