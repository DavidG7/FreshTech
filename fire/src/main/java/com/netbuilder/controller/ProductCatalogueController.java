package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;

@Controller
public class ProductCatalogueController {

	/*DummyData
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	ProductRepository productRepository = (ProductRepository)context.getBean("ProductRepositoryDummy");

	List<Product> products = productRepository.findAll();
	
	*/
	
	ProductRepository productRepository = new ProductRepositoryMongo();
	
	List<Product> products = productRepository.findAll();
	
	 
	 @RequestMapping("ProductCatalogue")
	public  ModelAndView ModelAndView (Model model, HttpSession session) {
		    ModelAndView view = new ModelAndView ();
		 	view.setViewName("ProductCatalogue");
		 	view.addObject("products", products);
	        return view;
	  }
}
