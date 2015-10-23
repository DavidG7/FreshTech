package com.netbuilder.entityrepositoriesimplementations.dummy;

/**
 * 
 * @author ???, Thomas Dudley
 * 
 * This class it to implement the functionality of the Customer Order Repository
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositories.CustomerOrderRepository;

public class CustomerOrderRepositoryDummy implements CustomerOrderRepository{
	
	@Inject
	private DummyData dummyData = new DummyData();	
	
	@Override
	public List<CustomerOrder> findAll() 
	{
		return dummyData.getEntityList(new CustomerOrder());
	}
	
	@Override
	public long count() {
		return dummyData.getEntityList(new CustomerOrder()).size();
		
	}

	@Override
	public void delete(Integer customerOrderID) 
	{
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		for(int i = 0; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerID() == customerOrderID)
			{
				customer.remove(i);
			}
		}
		
		dummyData.setEntityList(customer);
		
	}

	@Override
	public void delete(CustomerOrder arg0) 
	{
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		for(CustomerOrder c : customer)
		{
			if(c.equals(arg0))
			{
				customer.remove(c);
			}
		}
		
		dummyData.setEntityList(customer);
		
	}

	@Override
	public void delete(Iterable<? extends CustomerOrder> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() 
	{
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		for(CustomerOrder c : customer)
		{
			customer.remove(c);
		}
		
		dummyData.setEntityList(customer);
		
	}

	@Override
	public boolean exists(Integer customerOrderID) 
	{
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		for(int i = 0; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerID() == customerOrderID)
			{
				return true;
			}
		}
		
		return false;
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

/*	@Override
	public CustomerOrder findByCustomerOrderID(Integer customerOrderID) 
	{
		
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		CustomerOrder foundCustomerOrder = new CustomerOrder();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerID() == customerOrderID)
			{
				foundCustomerOrder = customer.get(i);
				
				return foundCustomerOrder;
			}
		}
		return null;

	}

*/

	/*@Override
	public ArrayList<CustomerOrder> findByDeliveryAddress(String deliveryAddress) 
	{
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		ArrayList<CustomerOrder> foundCustomerOrder = new ArrayList<CustomerOrder>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getDeliveryAddress().equalsIgnoreCase(deliveryAddress))
			{
				foundCustomerOrder.add(customer.get(i));
				
			}
		}
		
		return foundCustomerOrder;
		
	}
*/
	@Override
	public ArrayList<CustomerOrder> findByDateOfOrder(Date dateOfOrder) 
	{
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		ArrayList<CustomerOrder> foundCustomerOrder = new ArrayList<CustomerOrder>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getDateOfOrder().equals(dateOfOrder))
			{
				foundCustomerOrder.add(customer.get(i));
				
			}
		}
		
		return foundCustomerOrder;
	}

	@Override
	public ArrayList<CustomerOrder> findByCustomerOrderStatus(String status) 
	{
		
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		ArrayList<CustomerOrder> foundCustomerOrder = new ArrayList<CustomerOrder>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerOrderStatus().equalsIgnoreCase(status))
			{
				foundCustomerOrder.add(customer.get(i));
				
			}
		}
		
		return foundCustomerOrder;
		
	}

	@Override
	public ArrayList<CustomerOrder> findByOrderTotal(float orderTotal) 
	{	
		ArrayList<CustomerOrder> customer = dummyData.getEntityList(new CustomerOrder());
		
		ArrayList<CustomerOrder> foundCustomer = new ArrayList<CustomerOrder>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getOrderTotal() == orderTotal);
			{
				foundCustomer.add(customer.get(i));
			}
		}
		
		return foundCustomer;
	}

	@Override
	public CustomerOrder findByCustomerID(Integer customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerOrder> findByDeliveryAddress(String deliveryAddress) {
		// TODO Auto-generated method stub
		return null;
	}

}
