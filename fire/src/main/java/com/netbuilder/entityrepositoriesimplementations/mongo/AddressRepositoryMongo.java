package com.netbuilder.entityrepositoriesimplementations.mongo;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.query.Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.netbuilder.DataConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.AddressRepository;


public class AddressRepositoryMongo implements AddressRepository{

	MongoOperations mongoOperation;
	
	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return mongoOperation.findAll(Address.class);
	}
	
	
	@Override
	public List<Address> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		Query q = new Query().with(new Sort(Sort.Direction.ASC, "_id"));
		List<Address> addresses = mongoOperation.find(q, Address.class);
		return addresses;
	}
	
	
	@Override
	public <S extends Address> S insert(S arg0) {
		// TODO Auto-generated method stub
		mongoOperation.insert(arg0);
		return null;
	}
	
	
	@Override
	public <S extends Address> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		mongoOperation.insert(arg0);
		return null;
	}
	
	
	
	@Override
	public <S extends Address> S save(S arg0) {
		// TODO Auto-generated method stub
		mongoOperation.save(arg0);
		return null;
	}
	
	
	@Override
	public <S extends Address> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		mongoOperation.save(arg0);
		return null;
	}
	
	
	@Override
	public Page<Address> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public long count() {
		return mongoOperation.count(null, Address.class);
		// TODO Auto-generated method stub
	
	}
	
	
	@Override
	public void delete(Integer id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("addressID").is(id));
		mongoOperation.remove(query, "Address");
	}
	
	
	@Override
	public void delete(Address arg0) {
		// TODO Auto-generated method stub
		mongoOperation.remove(arg0);
	}
	
	
	@Override
	public void delete(Iterable<? extends Address> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		mongoOperation.remove(Address.class);
		
	}
	
	
	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		List<Address> addresses = mongoOperation.findAll(Address.class);
		Address temp = new Address();
		for(int i = 0; i < addresses.size();i++){
			if(addresses.get(i).getAddressid() == (arg0)){
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public Iterable<Address> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Address findOne(Integer arg0) {
		// TODO Auto-generated method stub
		List<Address> addresses = mongoOperation.findAll(Address.class);
		Address temp = new Address();
		for(int i = 0; i < addresses.size();i++){
			if(addresses.get(i).getAddressid() == (arg0)){
				return addresses.get(i);
			}
		}
		return null;
	}
	
	
	@Override
	public Address findByAddressID(int addressID) {
		// TODO Auto-generated method stub
		List<Address> addresses = mongoOperation.findAll(Address.class);
		Address temp = new Address();
		for(int i = 0; i < addresses.size();i++){
			if(addresses.get(i).getAddressid() == (addressID)){
				return addresses.get(i);
			}
		}
		return null;
	}
	
	
	@Override
	public List<Address> findByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		List<Address> addresses = mongoOperation.findAll(Address.class);
		List<Address> temp = new ArrayList<Address>();
		for(int i = 0; i < addresses.size();i++){
			if(addresses.get(i).getCustomerId() == (customerId)){
				temp.add(addresses.get(i));
			}
		}
		return temp;
	}
	
	
	@Override
	public List<Address> findByAddress(String address) {
		// TODO Auto-generated method stub
		List<Address> addresses = mongoOperation.findAll(Address.class);
		List<Address> temp = new ArrayList<Address>();
		for(int i = 0; i < addresses.size();i++){
			if(addresses.get(i).getAddress().equals(address)){
				temp.add(addresses.get(i));
			}
		}
		return temp;
	}
	
	
	@Override
	public List<Address> findByPostcode(String postcode) {
		// TODO Auto-generated method stub
		List<Address> addresses = mongoOperation.findAll(Address.class);
		List<Address> temp = new ArrayList<Address>();
		for(int i = 0; i < addresses.size();i++){
			if(addresses.get(i).getPostcode().equals(postcode)){
				temp.add(addresses.get(i));
			}
		}
		return temp;
	}


	public MongoOperations getMongoOperation() {
		return mongoOperation;
	}


	public void setMongoOperation(MongoOperations mongoOperation) {
		this.mongoOperation = mongoOperation;
	}


		
}