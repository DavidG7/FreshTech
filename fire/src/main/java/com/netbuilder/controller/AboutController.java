package com.netbuilder.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;

@Controller
public class AboutController {
		
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepository productRepository = mongoContext.getBean(ProductRepository.class);	

	ProductRepositoryMongo test = new ProductRepositoryMongo();
	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
		 	 test.insert(new Product(11,15,5000,"Gmone","Explosive1",false,true, 1, "Blue Gmone which is highly explosive","resources/static/ImageFolder/newgame.jpg"));
		 	 test.insert(new Product(11,15,5000,"Gmone","Explosive2",false,true, 0, "Blue Gmone which is highly explosive","resources/static/ImageFolder/newgame.jpg"));
		 	 return "About";


	 }
}
