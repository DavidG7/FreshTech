package com.netbuilder.entityrepositoriesimplementations.dummy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netbuilder.data.DummyData;

@Configuration
public class PaymentRepositoryDummyConfig {

	@Bean 
   public PaymentRepositoryDummy paymentRepo(){
      return new PaymentRepositoryDummy();
 	}
 
   @Bean 
   public DummyData dummyData(){
      return new DummyData();
   }
	   
}
