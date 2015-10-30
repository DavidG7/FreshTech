package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Basket;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrespositoriesimplementations.sql.EmployeeRepositorySQL;
import com.netbuilder.service.BasketService;
import com.netbuilder.service.GenericService;

@Controller
public class ProductController {
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	BasketRepository basketRepository = mongoContext.getBean(BasketRepository.class);	
	ProductRepository productRepository = mongoContext.getBean(ProductRepository.class);	
		
	List<Product> offerProducts = productRepository.findByOnOffer(true);
	Product product;
	 
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
		int id = 0;
			int idFromPage = 0;
			String idString = null;
			
			for (int i=0; i<productRepository.findAll().size(); i++){
				id = productRepository.findAll().get(i).getProductId();
				
				idString = id+"";
				
				if(request.getParameter(idString) != null){
					idFromPage = id;
				}
				
				System.out.println("Product inside (ID): "+idFromPage);
				
			}
						
			System.out.println("Product outside (ID): "+idFromPage);

		 	product = productRepository.findByProductID(idFromPage);			
		 	ModelAndView view = new ModelAndView();
			view.setViewName("Product");
			view.addObject("product", product);
			view.addObject("offerProducts", offerProducts);
			
			return view;
					
		 }
		
		@RequestMapping(value="updateBasket", method=RequestMethod.POST)
		public String updateBasket(ModelAndView modelAndView, HttpSession session, HttpServletRequest request){
			
			GenericService service = new GenericService(session, "sessionUser");			
			
			System.out.println("Session: "+service.getUserSession());
			
			if(!service.isSession()){
				System.out.println("No session");
				return "redirect:/Register";
			}
			else{
			int customerID = service.getSessionID();
			
			int basketID = (int)basketRepository.count();
			
			int quantity = Integer.parseInt(request.getParameter("quantity"));
			
			Basket basket = new Basket(basketID, product, quantity, customerID);
			
			basketRepository.insert(basket);

			}
			
			return "redirect:/ProductCatalogue";
		}
	   
	  }
	 
	 

