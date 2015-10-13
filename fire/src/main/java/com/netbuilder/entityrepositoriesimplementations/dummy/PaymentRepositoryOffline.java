package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Alternative;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.netbuilder.entities.*;
import com.netbuilder.entityrepositories.PaymentRepository;
import com.netbuilder.data.DummyData;

@Alternative
public class PaymentRepositoryOffline implements PaymentRepository {
	
	/*
	@Inject
	private DummyData dummyData;
	*/
	
	DummyData dummyData = new DummyData();
	
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
	@Deprecated
	public void delete(String arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	@Deprecated
	public void delete(Payment arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	@Deprecated
	public void delete(Iterable<? extends Payment> arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	@Deprecated
	public void deleteAll() {
		// TODO Auto-generated method stub
	}

	@Override
	@Deprecated
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Deprecated
	public Iterable<Payment> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Deprecated
	public Payment findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
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
	@Deprecated
	public List<Payment> findByCustomerID(int customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Deprecated
	public Payment findByCardNumber(int cardNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Deprecated
	public List<Payment> findBySortCode(String sortCode) {
		// TODO Auto-generated method stub
		return null;
	}
}