package com.netbuilder.entityrepositoriesimplementations.dummy;

import org.springframework.context.annotation.Bean;

import com.netbuilder.data.DummyData;
/**
 * 
 * @author pnewman
 */
 


public class CustomerRepositoryDummyConfig {
	
		@Bean 
	   public CustomerRepositoryDummy customerRepo(){
	      return new CustomerRepositoryDummy();
	 	}
	 
	   @Bean 
	   public DummyData dummyData(){
	      return new DummyData();
	   }

}
