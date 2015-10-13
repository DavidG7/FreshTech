package com.netbuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netbuilder.data.DummyData;

@Configuration
public class DummyConfig {

   @Bean 
   public DummyData dummyData(){
      return new DummyData();
   }
   
}