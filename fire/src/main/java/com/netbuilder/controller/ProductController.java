package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;

@Controller
public class ProductController {

	 ProductRepositoryMongo ProductRepositoryMongo = new ProductRepositoryMongo();
	
	 @RequestMapping("Product")
	 public String   Product(Model modelAndView) {
		 
		// ProductRepositoryMongo.delete(ProductRepositoryMongo.findByProductID(1).getProductId());
		 
		 for(int i = 0; i < ProductRepositoryMongo.findAll().size(); i++)
		 {
			 System.out.println("");
			 System.out.println("Product ID: " + ProductRepositoryMongo.findAll().get(i).getProductId());
			 System.out.println("Product Name : " + ProductRepositoryMongo.findAll().get(i).getProductName());
			 System.out.println("Category: " + ProductRepositoryMongo.findAll().get(i).getCategory());
			 System.out.println("Price: " + ProductRepositoryMongo.findAll().get(i).getPrice());
			 System.out.println("Offer Price: " + ProductRepositoryMongo.findAll().get(i).getOfferPrice());
			 System.out.println("Product Description: " + ProductRepositoryMongo.findAll().get(i).getProductDescription());
			 System.out.println("Rating: " + ProductRepositoryMongo.findAll().get(i).getRating());
			 System.out.println("Stock Level: " + ProductRepositoryMongo.findAll().get(i).getStockLevel());
			 System.out.println("Discontinued: " + ProductRepositoryMongo.findAll().get(i).getDiscontinued());
			 System.out.println("Porousware: " + ProductRepositoryMongo.findAll().get(i).getPorusware());
		 }
		 
		 System.out.println("");
		 System.out.println("Specific Price: " + ProductRepositoryMongo.findByPrice(17));
		 
		 
	        return "Product";
	  }
	 
	 
	 
	 
}
