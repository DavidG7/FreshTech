package com.netbuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;

@Configuration
@EnableMongoRepositories
public class BeansConfig {
	
	
	@Bean
	public CustomerRepositoryMongo customerRepositoryMongo(){
		return new  CustomerRepositoryMongo();
	}

}
