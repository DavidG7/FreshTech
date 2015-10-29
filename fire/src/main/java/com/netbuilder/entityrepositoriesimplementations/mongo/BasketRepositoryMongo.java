package com.netbuilder.entityrepositoriesimplementations.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.netbuilder.DataConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Basket;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.BasketRepository;

@Repository
public class BasketRepositoryMongo implements BasketRepository{

	MongoOperations mongoOperation;

	@Override
	public <S extends Basket> List<S> save(Iterable<S> entites) {
		mongoOperation.save(entites);
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
		mongoOperation.insert(entity);
		return null;
	}

	@Override
	public <S extends Basket> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		mongoOperation.insert(entities);
		return null;
	}

	@Deprecated
	@Override
	public Page<Basket> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Basket> S save(S entity) {
		mongoOperation.save(entity);
		
		return entity;
	}

	@Deprecated
	@Override
	public Basket findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Deprecated
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Deprecated
	public Iterable<Basket> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		return mongoOperation.count(null, Basket.class);
	}


	

	@Override
	public void delete(Integer id) 
	{
		Query query = new Query();
		query.addCriteria(Criteria.where("basketID").is(id));
		mongoOperation.remove(query, "Basket");
		
	}

	@Deprecated
	public void delete(Iterable<? extends Basket> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() 
	{
		mongoOperation.remove(Basket.class);
		
	}
	
	
	@Override
	public List<Basket> findByCustomerID(int customerID) {
		
		List<Basket> baskets = mongoOperation.findAll(Basket.class);
		List<Basket> finalBaskets = new ArrayList<Basket>();
		
		
		for(int i = 0; i < baskets.size(); i++)
		{
			if(baskets.get(i).getCustomerID() == customerID)
			{
				finalBaskets.add(baskets.get(i));
				System.out.println("Basket added");
			}
		}
	
		return finalBaskets;
	}

	public MongoOperations getMongoOperation() {
		return mongoOperation;
	}

	public void setMongoOperation(MongoOperations mongoOperation) {
		this.mongoOperation = mongoOperation;
	}

	@Override
	public Basket findByBasketID(int basketID) {
		List<Basket> baskets = mongoOperation.findAll(Basket.class);
		
		for(int i = 0; i < baskets.size(); i++)
		{
			if(baskets.get(i).getBasketID() == basketID)
			{
				System.out.println("Added: "+baskets.get(i).getBasketID());
				return baskets.get(i);
			}
		}
		
		System.out.println("Didn't work");
		
		return null;
	}

	@Override
	public void delete(Basket entity) {
		// TODO Auto-generated method stub
		
	}

}
