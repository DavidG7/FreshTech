package com.netbuilder.entityrepositoriesimplementations.dummy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netbuilder.data.DummyData;

@Configuration
public class PaymentRepositoryOfflineConfig {

	 @Bean 
	   public PaymentRepositoryOffline paymentRepo(){
	      return new PaymentRepositoryOffline();
	 	}
	 
	   @Bean 
	   public DummyData dummyData(){
	      return new DummyData();
	   }
	   
}
