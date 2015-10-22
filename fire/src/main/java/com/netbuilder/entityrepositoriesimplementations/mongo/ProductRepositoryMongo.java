package com.netbuilder.entityrepositoriesimplementations.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;

import org.springframework.data.mongodb.core.query.Query;

import com.netbuilder.MongoConfig;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;

public class ProductRepositoryMongo implements ProductRepository{

	ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
	MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
	
	
	public ProductRepositoryMongo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> findAll() {
		
		return mongoOperation.findAll(Product.class);
	}

	@Override
	public List<Product> findAll(Sort arg0) {
		Query q = new Query().with(new Sort(Sort.Direction.ASC, "_id"));
		List<Product> products = mongoOperation.find(q,  Product.class);
		return products;
	}

	@Override
	public <S extends Product> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Product> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Product> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByProductID(int productID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByPrice(float price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByDiscontinued(boolean isDiscontinued) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByOnOffer(boolean isOnOffer) {
		// TODO Auto-generated method stub
		return null;
	}

}
