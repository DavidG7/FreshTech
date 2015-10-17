package com.netbuilder.contoller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Payment;
import com.netbuilder.entities.Product;
import com.netbuilder.manager.LandingManager;

@Controller
public class LandingController {

	LandingManager landingManager = new LandingManager();
	
	ArrayList<Product> discontinuedProducts = landingManager.discontinuedProducts;
	
	 @RequestMapping("/")
	    public String landing(Model model) {
		 
		 	model.addAttribute("discontinuedProducts", discontinuedProducts);
		 
		 	for (Product product : discontinuedProducts){
		 		System.out.println(product.getProductName());
		 	}
		 	
	        return "Landing";
	  }
	 
}
