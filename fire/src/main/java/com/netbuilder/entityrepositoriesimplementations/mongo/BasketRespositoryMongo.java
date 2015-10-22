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
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Basket;
import com.netbuilder.entityrepositories.BasketRepository;

public class BasketRespositoryMongo implements BasketRepository{


	ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
	MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");

	@Override
	public <S extends Basket> List<S> save(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Basket> findAll() {
		// TODO Auto-generated method stub
		return mongoOperation.findAll(Basket.class);
	}

	@Override
	public List<Basket> findAll(Sort sort) {
		// TODO Auto-generated method stub
		Query q = new Query().with(new Sort(Sort.Direction.ASC, "_id"));
		List<Basket> baskets = mongoOperation.find(q, Basket.class);
		return baskets;
	}

	@Override
	public <S extends Basket> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Basket> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Basket> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Basket> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Basket findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Basket> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Basket entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Basket> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public Basket findByCustomerID(int customerID) {
		// TODO Auto-generated method stub
		return null;
	}


}
