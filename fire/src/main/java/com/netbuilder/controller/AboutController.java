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
	ProductRepository test = mongoContext.getBean(ProductRepository.class);
	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
		 	/*test.insert(new Product(1,15,5200,"Gnome","Explosive",false,true, 1, "Blue Gnome which is highly explosive","resources/static/ImageFolder/newgame.jpg"));
		 	test.insert(new Product(2,1,6000,"Gnome","Spring",false,true, 2, "Spring Gnome which is very fresh","resources/static/ImageFolder/newgame.jpg"));
		 	test.insert(new Product(3,17,5020,"Gnome","Fish",false,true, 2, "Fish Gnome, not so fresh","resources/static/ImageFolder/newgame.jpg"));
		 	test.insert(new Product(4,17,5200,"Gnome","TNT",false,true, 5, "Much minecraft","resources/static/ImageFolder/newgame.jpg"));*/
			return "About";
	 }
}
