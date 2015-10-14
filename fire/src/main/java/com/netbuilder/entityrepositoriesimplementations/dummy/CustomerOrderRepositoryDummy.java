package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.Date;

import javax.inject.Inject;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositories.CustomerOrderRepository;

public class CustomerOrderRepositoryDummy implements CustomerOrderRepository{
	
	@Inject
	private DummyData data = new DummyData();
	private ArrayList datalist = new ArrayList();
	
	
	@Override
	public long count() {
		datalist = data.getEntityList(new CustomerOrder());
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CustomerOrder arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends CustomerOrder> arg0) {
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
	public Iterable<CustomerOrder> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<CustomerOrder> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrder findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CustomerOrder> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends CustomerOrder> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrder findByCustomerOrderID(Integer customerOrderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerOrder> findByDeliveryAddress(String deliveryAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerOrder> findByDateOfOrder(Date dateOfOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerOrder> findByOrderStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerOrder> findByOrderTotal(float orderTotal) {
		// TODO Auto-generated method stub
		return null;
	}

}
