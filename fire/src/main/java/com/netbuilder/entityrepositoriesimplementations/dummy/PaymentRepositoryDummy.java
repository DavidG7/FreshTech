package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Alternative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.netbuilder.entities.*;
import com.netbuilder.entityrepositories.PaymentRepository;
import com.netbuilder.data.DummyData;

/**
 * 
 * @author ???, Thomas Dudley
 * 
 * This class it to implement the of the Address Repository
 * 
 * 
 */

@Alternative
public class PaymentRepositoryDummy implements PaymentRepository {
	
	@Autowired
	private DummyData dummyData = new DummyData();
	
	//DummyData dummyData = new DummyData();
	
	/**
	 * This method returns all payment methods in an ArrayList.
	 */
	
	@Override
	public List<Payment> findAll() {
		
		return dummyData.getEntityList(new Payment());
	}

	/**
	 * This method returns all payment methods with the given ID.
	 */
	@Override
	public List<Payment> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This method returns null.
	 * Prefer using CrudRepository.save(Object) instead to avoid the usage of store-specific API (from MongoRepository docs)
	 */
	@Override
	public <S extends Payment> S insert(S arg0) {
		return null;
	}

	/**
	 * This method returns null.
	 * Prefer using CrudRepository.save(Object) instead to avoid the usage of store-specific API (from MongoRepository docs)
	 */
	@Override
	public <S extends Payment> List<S> insert(Iterable<S> arg0) {
		return null;
	}

	@Override
	public <S extends Payment> List<S> save(Iterable<S> newPayments) {
		ArrayList<Payment> payments = dummyData.getEntityList(new Payment());		
		for(Payment newPayment : newPayments){	
			payments.add(newPayment);				
		}
		ArrayList<S> listS = null;
		for(S newS :  newPayments){
			listS.add(newS);
		}
		dummyData.setEntityList(payments);
		return listS;
	}

	@Override
	@Deprecated
	public Page<Payment> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Deprecated
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Payment arg0) 
	{
		ArrayList<Payment> payment = dummyData.getEntityList(new Payment());
		
		for(Payment c : payment)
		{
			if(c.equals(arg0))
			{
				dummyData.getEntityList(new Payment()).remove(c);
			}
		}

	}

	@Override
	@Deprecated
	public void delete(Iterable<? extends Payment> arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll() {
		
		ArrayList<Payment> payment = dummyData.getEntityList(new Payment());
		
		for(Payment c : payment)
		{
			dummyData.getEntityList(new Payment()).remove(c);
		}
	}

	@Override
	@Deprecated
	public <S extends Payment> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment findByPaymentID(int paymentID) {	
		ArrayList<Payment> payments = dummyData.getEntityList(new Payment());
		for (Payment payment : payments){	
			if(payment.getPaymentID() == paymentID){		
				return payment;	
			}
		}
		return null;
	}

	@Override
	public ArrayList<Payment> findByCustomerID(int paymentID) 
	{
		ArrayList<Payment> payment = dummyData.getEntityList(new Payment());
		
		ArrayList<Payment> foundPayment = new ArrayList<Payment>();
		
		for ( int i = 0 ; i < payment.size(); i++)
		{
			if(payment.get(i).getPaymentID() == paymentID)
			{
				foundPayment.add(payment.get(i));
			}
			
		}
		return foundPayment;
	}

	@Override
	public Payment findByCardNumber(int cardNumber) 
	{	
		ArrayList<Payment> payment = dummyData.getEntityList(new Payment());
		
		Payment foundPayment = new Payment();
		
		for ( int i = 0 ; i < payment.size(); i++)
		{
			if(payment.get(i).getPaymentID() == cardNumber)
			{
				foundPayment = payment.get(i);
			}
			
		}
		return foundPayment;
	}

	@Override

	public List<Payment> findBySortCode(String sortCode) 
	{
		
		ArrayList<Payment> payment = dummyData.getEntityList(new Payment());
		
		ArrayList<Payment> foundPayment = new ArrayList<Payment>();
		
		for ( int i = 0 ; i < payment.size(); i++)
		{
			if(payment.get(i).getSortCode().equals(sortCode))
			{
				foundPayment.add(payment.get(i));
			}
			
		}
		return foundPayment;
	}

	@Override
	public void delete(Integer arg0) {
		
		ArrayList<Payment> payment = dummyData.getEntityList(new Payment());
		
		for(int i = 0; i < payment.size(); i++)
		{
			if(payment.get(i).getPaymentID() == arg0)
			{
				payment.remove(i);
			}
		}
		
		dummyData.setEntityList(payment);	
		
	}

	@Override
	public boolean exists(Integer arg0) 
	{
		ArrayList<Payment> payment = dummyData.getEntityList(new Payment());
		
		for(int i = 0; i < payment.size(); i++)
		{
			if(payment.get(i).getPaymentID() == arg0)
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Payment findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Payment> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
