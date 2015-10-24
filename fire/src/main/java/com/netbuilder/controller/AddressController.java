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
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.AddressRepositoryMongo;
import com.netbuilder.jmssend.MessageSender;


@Controller
public class AddressController {
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	AddressRepository addressRepository = mongoContext.getBean(AddressRepository.class);	
	
	//ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
	//MessageSender sender = (MessageSender)appContext.getBean("messageSender"); 

	 @RequestMapping("Address")
	 public String PrintAddresses(Model model) {
		addressRepository.delete(addressRepository.findByAddressID(1).getAddressid());
		addressRepository.save(new Address(5,"Ricky Road 125", "KMNB", 1));
		addressRepository.save(new Address(2,"Serpent Road", "LL09", 1));
		addressRepository.save(new Address(4,"Ice Road", "GGG6", 2));
	
		 for(int i =0;i < addressRepository.findAll().size();i++){
			 System.out.println("");
			 System.out.println("Address ID: " + addressRepository.findAll().get(i).getAddressid());
			 System.out.println("Address: " + addressRepository.findAll().get(i).getAddress());
			 System.out.println("PostCode: " + addressRepository.findAll().get(i).getPostcode());
			 System.out.println("Customer ID: " + addressRepository.findAll().get(i).getCustomerId());
		 }
		 
			 System.out.println("");
			 System.out.println("Specific Postcode: " + addressRepository.findByAddressID(3).getAddress());
			 System.out.println("Specific Postcode: " + addressRepository.findByCustomerId(2).get(0).getAddress());
			// System.out.println("Specific Postcode: " + AddressRepositoryMongo.findByCustomerId(2).get(1).getAddress());
			 
			 System.out.println("Number of Adresses: " + addressRepository.count());
			 
			 
			// AddressRepositoryMongo.delete(AddressRepositoryMongo.findByAddressID(4));
			
			 Map map = new HashMap();
			 map.put("Name", "David");
			// sender.send(map);
			 
			
			 
			 //AddressRepositoryMongo.insert(new Address(5, "Big Street, Big Town, Birmingham, United Kingdom", "BA445", 1));
			 
	 
	        return "Address";
	 }

	 

	
}
