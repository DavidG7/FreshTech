package com.netbuilder.contoller;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Payment;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositoriesimplementations.dummy.PaymentRepositoryDummy;

@Configuration
public class TestControllerConfig {

   @Bean 
   public TestController testController(){
      return new TestController();
   }
   
   @Bean
   public Payment payment(){
	   return new Payment();
   }
   
   @Bean 
   public DummyData dummyData(){
      return new DummyData();
   }
  
   @Bean
   public ArrayList<Product> orderItems(){
   		//DummyData dummyData = new DummyData();
   		ArrayList<Product> orderitems = new ArrayList<Product>();
   		orderitems.add(new Product(1,1,(float)11.11, "cat1", "name1"));   		
   		return orderitems;
   }
}