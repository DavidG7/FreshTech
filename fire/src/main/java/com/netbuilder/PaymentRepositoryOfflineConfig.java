package com.netbuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netbuilder.data.DummyData;
import com.netbuilder.entityrepositoriesimplementations.dummy.PaymentRepositoryOffline;

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
