package com.netbuilder.entityrepositoriesimplementations.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.netbuilder.entities.Address;
import com.netbuilder.entityrepositories.AddressRepository;

public class AddressRepositoryMongo implements AddressRepository{
	

	MongoTemplate mongoTemplate;  

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public MongoTemplate getMongoOps() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public List<Address> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(Address.class); 
	}

	@Override
	public <S extends Address> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Address> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Address> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Address> findAll(Pageable arg0) {
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
	public void delete(Address arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Address> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Iterable<Address> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Address> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByAddressID(int addressID) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Address> findByCustomerID(int customerID) {
		// TODO Auto-generated method stub
		return mongoTemplate.find(Query.query(Criteria.where("customerId").is(1)), Address.class);
		//return null;
		
	}

	@Override
	public List<Address> findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> findByPostcode(String postcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
