package com.netbuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;

@Configuration
@EnableMongoRepositories
public class MongoConfig {
	
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
	return new SimpleMongoDbFactory(new MongoClient("localhost"), "FreshTech");
	}

	 @Bean
	public MongoTemplate mongoTemplate() throws Exception {
	MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	return mongoTemplate;
	
	}


	
	


}
