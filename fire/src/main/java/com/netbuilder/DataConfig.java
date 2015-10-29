package com.netbuilder;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.netbuilder.data.DummyData;
import com.netbuilder.util.SQLTemplate;

/**
 * This class creates spring beans for implementing Data connections.
 * Includes MySQL, MongoDB and a Dummy class.
 * @author rluu
 * @author pnewman
 */
@Configuration
@EnableMongoRepositories
public class DataConfig {
	
	/**
	 * This method configures the Mongo Factory.
	 * @return MongoDbFactory
	 * @throws Exception
	 */
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		return new SimpleMongoDbFactory(new MongoClient("10.50.15.9"), "FreshTech");
	}

	/**
	 * This method creates a new Mongo Template based on the given MongoDbFactory.
	 * @return MongoTemplate
	 * @throws Exception
	 */
	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		return mongoTemplate;
	}
	
	/**
	 * This method casts a Mongo template to a Mongo operations.
	 * @return MongoOperations
	 * @throws Exception
	 */
	@Bean
	public MongoOperations mongoOperation() throws Exception{
		return (MongoOperations) mongoTemplate();
	}

	/**
	 * This method configures an SQL data source.
	 * @return DataSource
	 */
	@Bean
    public DataSource dataSource(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("mydb");
        dataSource.setUser("root");
        dataSource.setPassword("password");
        dataSource.setServerName("10.50.15.33");
        return dataSource;
    }
	
	/**
	 * This method creates a new SQL Template based on the given data source.
	 * @return SQLTemplate
	 */
	@Bean
	public SQLTemplate sqlTemplate(){
		return new SQLTemplate(dataSource());
	}
	
	/**
	 * This method instantiates the Dummy data class.
	 * @return DummyData
	 */
	@Bean
	public DummyData dummyData(){
		return new DummyData();
	}

}