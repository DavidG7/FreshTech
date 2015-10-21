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
<<<<<<< HEAD
		return new SimpleMongoDbFactory(new MongoClient("localhost"), "test");
=======
		return new SimpleMongoDbFactory(new MongoClient(), "FreshTech");
>>>>>>> 68cc7509d0b6ea2159701946d80662490fe874aa
	}

	 @Bean
	public MongoTemplate mongoTemplate() throws Exception {
	MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	return mongoTemplate;
	
	}


	
	


}
