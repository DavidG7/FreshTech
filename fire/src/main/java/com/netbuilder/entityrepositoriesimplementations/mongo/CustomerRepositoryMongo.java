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
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;
@Repository
public class CustomerRepositoryMongo implements CustomerRepository {
	
	MongoOperations mongoOperation;
	
	@Override
	public long count() {
		return mongoOperation.count(null, Customer.class);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return mongoOperation.findAll(Customer.class);
	}

	@Override
	public List<Customer> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		Query q = new Query().with(new Sort(Sort.Direction.ASC, "_id"));
		List<Customer> customers = mongoOperation.find(q, Customer.class);
		return customers;
	}

	@Override
	public <S extends Customer> S insert(S arg0) {
		mongoOperation.insert(arg0);
		return null;
	}

	@Override
	public <S extends Customer> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		mongoOperation.insert(arg0);
		return null;
	}

	@Override
	public <S extends Customer> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		mongoOperation.save(arg0);
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
		mongoOperation.remove(new Query(Criteria.where("_id").is(arg0)),"Address");  
	}

	@Override
	public void delete(Customer arg0) {
		// TODO Auto-generated method stub
		mongoOperation.remove(arg0);
	}

	@Override
	public void delete(Iterable<? extends Customer> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		mongoOperation.remove(Customer.class);
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		Address temp = new Address();
		for(int i = 0; i < customers.size();i++){
			if(customers.get(i).getCustomerID() == (arg0)){
				return true;
			}
		}
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
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		Customer temp = new Customer();
		for(int i = 0; i < customers.size();i++){
			if(customers.get(i).getCustomerID() == (arg0)){
				return customers.get(i);
			}
		}
		return null;
	}

	@Override
	public <S extends Customer> S save(S arg0) {
		// TODO Auto-generated method stub
		mongoOperation.save(arg0);
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
	public Customer findByCustomerPhone(String customerPhone) {
		// TODO Auto-generated method stub
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		Customer customer = null;
		for(int i=0; i<customers.size(); i++){
			if(customers.get(i).getCustomerPhone().equals(customerPhone)){
				customer = customers.get(i);
			}
		}
		return customer;
	
	}

	@Override
	public List<Customer> findByCustomerAvailableCredit(
			float customerAvailableCredit) {
		// TODO Auto-generated method stub
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		List<Customer> temp = new ArrayList<Customer>();
		for(int i=0; i<customers.size(); i++){
			if(customers.get(i).getAvailableCredit()==customerAvailableCredit){
				 temp.add(customers.get(i));
			}
		}
		return temp;
	}

	@Override
	public List<Customer> findByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		List<Customer> temp = new ArrayList<Customer>();
		for(int i=0; i<customers.size(); i++){
			if(customers.get(i).getCustomerName().equals(customerName)){
				 temp.add(customers.get(i));
			}
		}
		return temp;
	}

	@Override
	public Customer findByCustomerEmail(String customerEmail) {
		// TODO Auto-generated method stub
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		Customer customer = null;
		for(int i=0; i<customers.size(); i++){
			if(customers.get(i).getCustomerEmail().equals(customerEmail)){
				customer = customers.get(i);
			}
		}
		return customer;
	}

	@Override
	public Customer findByCustomerUsername(String customerUsername) {
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		Customer customer = null;
		for(int i=0; i<customers.size(); i++){
			if(customers.get(i).getCustomerUsername().equalsIgnoreCase(customerUsername)){
				customer = customers.get(i);
			}
		}

		return customer;
	}

	@Override
	public List<Customer> findByAddressArray(Address addressArray) {
		// TODO Auto-generated method stub
		List<Customer> customers = mongoOperation.findAll(Customer.class);
		List<Customer> temp = new ArrayList<Customer>();
		for(int i=0; i<customers.size(); i++){
			for(int j = 0; j < customers.get(i).getCustomerAddressArray().size();j++){
			if(customers.get(i).getCustomerAddressArray().get(j)==addressArray){
				 temp.add(customers.get(i));
			}
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
