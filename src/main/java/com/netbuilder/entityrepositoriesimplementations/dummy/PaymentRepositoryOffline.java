package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.netbuilder.entities.Payment;
import com.netbuilder.entityrepositories.PaymentRepository; //TODO move and give proper address.
import com.netbuilder.data.DummyData;

@Alternative
public class PaymentRepositoryOffline implements PaymentRepository {
	
	@Inject
	private DummyData dummyData;

	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Payment> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String arg0) {
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
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Payment> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment findOne(String arg0) {
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
		ArrayList<Payment> payments = dummyData.getEntityList(new Payment());
		for (Payment payment : payments){
			if(payment.getPaymentID() == paymentID){
				return payment;
			}
		}
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
