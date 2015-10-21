package com.netbuilder.entityrepositoriesimplementations.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.netbuilder.MongoConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;
@Repository
public class CustomerRepositoryMongo implements CustomerRepository {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
	MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
	
	@Override
	public long count() {
		return mongoOperation.findAll(Customer.class).size();
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return mongoOperation.findAll(Customer.class);
	}

	@Override
	public List<Customer> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S insert(S arg0) {
		mongoOperation.insert(arg0);
		return null;
	}

	@Override
	public <S extends Customer> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Customer> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Customer> arg0) {
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
	public Iterable<Customer> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByCustomerID(int customerID) {
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		Customer customer = null;
		for(int i=0; i<customers.size(); i++){
			if(customers.get(i).getCustomerID()==customerID){
				customer = customers.get(i);
			}
		}
		return customer;
	}

	@Override
	public List<Customer> findByCustomerPhone(String customerPhone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByCustomerAvailableCredit(
			float customerAvailableCredit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByCustomerEmail(String customerEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByCustomerUsername(String customerUsername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findByAddressArray(Address addressArray) {
		// TODO Auto-generated method stub
		return null;
	}

}
