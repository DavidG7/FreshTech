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
import com.netbuilder.entities.Payment;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.PaymentRepository;

/**
 * 
 * @author Thomas Dudley
 *
 *	This interacts with the mongo database
 *	Allows for updates and deletion
 *
 *	TODO implement create methods
 *
 */

public class PaymentRepositoryMongo implements PaymentRepository{

	ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
	MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
	
	public PaymentRepositoryMongo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Payment> findAll() {
		
		return mongoOperation.findAll(Payment.class);
		
	}

	@Override
	public List<Payment> findAll(Sort arg0) 
	{	
		Query q = new Query().with(new Sort(Sort.Direction.ASC, "_id"));
		List<Payment> payments = mongoOperation.find(q,  Payment.class);
		return payments;
	}

	@Override
	public <S extends Payment> S insert(S arg0) 
	{
		mongoOperation.insert(arg0);
		return null;
	}

	@Override
	public <S extends Payment> List<S> insert(Iterable<S> arg0) 
	{
		mongoOperation.insert(arg0);
		return null;
	}

	@Override
	public <S extends Payment> List<S> save(Iterable<S> arg0) 
	{
		mongoOperation.save(arg0);
		return null;
	}

	@Override
	public Page<Payment> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		return mongoOperation.count(null, Payment.class);
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Payment arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Payment> arg0) {
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
	public Iterable<Payment> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment findByPaymentID(int paymentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findByCustomerID(int customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment findByCardNumber(int cardNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findBySortCode(String sortCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
