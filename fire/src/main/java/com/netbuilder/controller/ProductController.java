/*package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrespositoriesimplementations.sql.EmployeeRepositorySQL;

@Controller
public class ProductController {
	
	 ProductRepository productRepository = new ProductRepositoryMongo();

	 
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	EmployeeRepositorySQL employeeRepository = new EmployeeRepositorySQL();
	
	ProductRepository productRepositoryDummy = (ProductRepository)context.getBean("ProductRepositoryDummy");

	List<Product> offerProducts = productRepositoryDummy.findByOnOffer(true);
	 
	 @RequestMapping("Product")
	 public String   Product(Model model) {
		 
		// ProductRepositoryMongo.delete(ProductRepositoryMongo.findByProductID(1).getProductId());
		 
		 
		 //Test
		 for(int i = 0; i < productRepository.findAll().size(); i++)
		 {
			 System.out.println("");
			 System.out.println("Product ID: " + productRepository.findAll().get(i).getProductId());
			 System.out.println("Product Name : " + productRepository.findAll().get(i).getProductName());
			 System.out.println("Category: " + productRepository.findAll().get(i).getCategory());
			 System.out.println("Price: " + productRepository.findAll().get(i).getPrice());
			 System.out.println("Offer Price: " + productRepository.findAll().get(i).getOfferPrice());
			 System.out.println("Product Description: " + productRepository.findAll().get(i).getProductDescription());
			 System.out.println("Rating: " + productRepository.findAll().get(i).getRating());
			 System.out.println("Stock Level: " + productRepository.findAll().get(i).getStockLevel());
			 System.out.println("Discontinued: " + productRepository.findAll().get(i).getDiscontinued());
			 System.out.println("Porousware: " + productRepository.findAll().get(i).getPorusware());
		 }
		 
		 System.out.println("");
		 System.out.println("Specific Price: " + productRepository.findByPrice(17));
		 return "Product";
	 }
		 
		 //Actual
		 
	 	@RequestMapping(value="info", method=RequestMethod.POST)
		public ModelAndView doPost (HttpServletRequest request, HttpServletResponse response) {
	 		
			System.out.println("");
		 		
			String name = null;
			String nameFromPage=null;
			 	for(int i=0; i<productRepository.findAll().size(); i++){
				 	name = productRepository.findAll().get(i).getProductName();
					
				 	if(request.getParameter(name) != null){
				 		nameFromPage = request.getParameter(name);
				 	}
				 	
					System.out.println("Product inside: "+nameFromPage);
			}		 
	
			System.out.println("Product outside: "+nameFromPage);
	
		 	Product product = productRepository.findByProductName(nameFromPage);			
		 	ModelAndView view = new ModelAndView();
			view.setViewName("Product");
			view.addObject("product", product);
			view.addObject("offerProducts", offerProducts);
			 
			return view;
					
		 	}
	   
	  }
	 
	 

*/