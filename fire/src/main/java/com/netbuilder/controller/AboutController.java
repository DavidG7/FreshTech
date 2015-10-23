package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Employee;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrespositoriesimplementations.sql.EmployeeRepositorySQL;
@Controller
public class AboutController {
		

<<<<<<< HEAD
	ProductRepositoryMongo test = new ProductRepositoryMongo();
	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
		 	test.insert(new Product(1,15,5000,"Gmone","redGnome",false,true, 5, " Red Gmone which is highly explosive","resources/static/ImageFolder/redgnome.png"));
		 	 test.insert(new Product(2,15,5000,"Gmone","BlueGnome",false,true, 5, "Blue Gmone which is highly explosive","resources/static/ImageFolder/DinoGnome.png"));
		 	 test.insert(new Product(3,15,5000,"Gmone","BlueGnome",false,true, 5, "Blue Gmone which is highly explosive","resources/static/ImageFolder/newgame.jpg"));
=======
	EmployeeRepositorySQL test = new EmployeeRepositorySQL();
	
	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
		test.findAll();
>>>>>>> 79c5524ea8c752508abb95833a910f034b33d132
	        return "About";
	       
	  }
	 
	
}
