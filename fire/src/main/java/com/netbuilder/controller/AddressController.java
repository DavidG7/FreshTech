package com.netbuilder.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;




@Controller
public class AddressController {
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepository productRepository = mongoContext.getBean(ProductRepository.class);	
	
	//ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	//MessageSender sender = (MessageSender)appContext.getBean("messageSender"); 

	 @RequestMapping("Address")
	 public String PrintAddresses(Model model) {
		//productRepository.delete(productRepository.findByCustomerID(2));
		
		productRepository.save(new Product(3, 22399, 17, "GNOME", "Green Gnome"));
		productRepository.save(new Product(4, 27009, 22, "GNOME", "Zombie Gnome"));
		productRepository.save(new Product(5, 15667, 22, "GNOME", "Wizard Gnome"));
		productRepository.save(new Product(6, 11338, 25, "GNOME", "Drunk Gnome"));
		productRepository.save(new Product(7, 9980, 25, "GNOME", "Rude Gnome"));
		productRepository.save(new Product(8, 12342, 16, "GNOME", "Football Gnome"));
		productRepository.save(new Product(9, 6700, 16, "GNOME", "Hungry Gnome"));
		productRepository.save(new Product(10, 23764, 16, "GNOME", "Basketball Gnome"));

		
		
	
		 for(int i =0;i < productRepository.findAll().size();i++){
			 System.out.println("");
			 System.out.println("Product ID: " + productRepository.findAll().get(i).getProductId());
			 System.out.println("Product Name: " + productRepository.findAll().get(i).getProductName());
			 System.out.println("Product Description:" + productRepository.findAll().get(i).getProductDescription());
			 System.out.println("Product Stock Level: " + productRepository.findAll().get(i).getStockLevel());
		 }
		 
			 System.out.println("");

			 //System.out.println("Customer Name: (1)" + productRepository.findByCustomerID(1).getCustomerName());
			 //System.out.println("Customer Name (2): " + productRepository.findByCustomerID(2).getCustomerName());
			// System.out.println("Specific Postcode: " + productRepositoryMongo.findByCustomerId(2).get(1).getAddress());
			 
			 System.out.println("Number of Products: " + productRepository.count());
			 
			// productRepositoryMongo.delete(productRepositoryMongo.findByAddressID(4));
			
			
			 
			
			 
			 //productRepositoryMongo.insert(new Address(5, "Big Street, Big Town, Birmingham, United Kingdom", "BA445", 1));
			 
	 
	        return "Address";
	 }

	 

	
}
