package com.netbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoOperations;

import com.netbuilder.data.DummyData;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.dummy.ProductRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.util.SQLTemplate;

/**
 * This class implements the entity repositories with the relevant data.
 * Dummy data alternatives are included.
 * @author pnewman
 */

@Configuration
public class RepositoryConfig {
	
	@Autowired
	DummyData dummyData;
	
	@Autowired
	MongoOperations mongoOperation;
	
	@Autowired
	SQLTemplate sqlTemplate;
	
	//PRODUCT REPOSITORY
	/**
	 * This method implements the ProductRepository interface by injecting MONGO data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return ProductRepository
	 */	
	//@Primary
	@Bean
	public ProductRepository productRepositoryMongo(){
		ProductRepositoryMongo productRepository = new ProductRepositoryMongo();
		productRepository.setMongoOperation(mongoOperation);
		return productRepository;
	}
	/**
	 * This method implements the ProductRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return ProductRepository
	 */	
	@Primary
	@Bean
	public ProductRepository productRepositoryDummy(){
		ProductRepositoryDummy productRepository = new ProductRepositoryDummy();
		productRepository.setDummyData(dummyData);
		return productRepository;
	}
}
