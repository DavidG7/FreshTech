package com.netbuilder.entityrepositoriesimplementations.mongo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.netbuilder.entities.Payment;
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

	MongoOperations mongoOperation;
	
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
		mongoOperation.save(arg0);
		return arg0;
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
	public void delete(Integer arg0) 
	{
		mongoOperation.remove(new Query(Criteria.where("_id").is(arg0)), Payment.class);

	}

	@Override
	public void delete(Payment arg0) {
		mongoOperation.remove(arg0);		
	}

	@Override
	public void delete(Iterable<? extends Payment> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {

		mongoOperation.remove(new Query(), Payment.class);
		
	}

	@Override
	public boolean exists(Integer arg0) 
	{
		List<Payment> payments = mongoOperation.findAll(Payment.class);
		
		for(int i = 0; i < payments.size(); i++)
		{
			if(payments.get(i).getPaymentID() == (arg0))
			{
				return true;
			}
		}	
		return false;
	}

	@Override
	public Iterable<Payment> findAll(Iterable<Integer> arg0) {
		
		Query q = new Query().with(new Sort(Sort.Direction.ASC, "_id"));
		
		Iterable<Payment> payments = mongoOperation.find(q,  Payment.class);
		
		return payments;
	}

	@Override
	public Payment findOne(Integer arg0) 
	{
		List<Payment> payments = mongoOperation.findAll(Payment.class);
		
		for(int i  = 0; i < payments.size(); i++)
		{
			if(payments.get(i).getPaymentID() == arg0)
			{
				return payments.get(i);
			}
		}
		
		return null;
	}

	@Override
	public <S extends Payment> S save(S arg0) {
		mongoOperation.save(arg0);
		return null;
	}

	@Override
	public Payment findByPaymentID(int paymentID) {
		
		List<Payment> payments = mongoOperation.findAll(Payment.class);
		
		for(int i = 0; i < payments.size(); i++)
		{
			if(payments.get(i).getPaymentID() == paymentID)
			{
				return payments.get(i);
			}
		}
		
		return null;
	}

	@Override
	public List<Payment> findByCustomerID(int customerID) 
	{	
		List<Payment> payments = mongoOperation.findAll(Payment.class);
		
		for(int i = 0; i < payments.size(); i++)
		{
			if(payments.get(i).getCustomerID() == customerID)
			{
				return payments;
			}
		}
		
		return null;
	}

	@Override
	public Payment findByCardNumber(int cardNumber) 
	{
		List<Payment> payments = mongoOperation.findAll(Payment.class);
		
		for(int i = 0; i < payments.size(); i++)
		{
			if(payments.get(i).getCardNumber() == cardNumber)
			{
				return payments.get(i);
			}
		}
		
		return null;
	}

	@Override
	public List<Payment> findBySortCode(String sortCode) 
	{
		List<Payment> payments = mongoOperation.findAll(Payment.class);
		
		for(int i = 0; i < payments.size(); i++)
		{
			if(payments.get(i).getSortCode() == sortCode)
			{
				payments.add(payments.get(i));
			}
		}
		
		return payments;
	}

	public MongoOperations getMongoOperation() {
		return mongoOperation;
	}

	public void setMongoOperation(MongoOperations mongoOperation) {
		this.mongoOperation = mongoOperation;
	}
}
