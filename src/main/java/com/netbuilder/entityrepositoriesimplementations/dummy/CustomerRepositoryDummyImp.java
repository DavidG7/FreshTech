package com.netbuilder.entityrepositoriesimplementations.dummy;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;

/**
 * 
 * @author Thomas Dudley
 *
 * This class is to implement the functionality of the repository.
 */

public class CustomerRepositoryDummyImp implements CustomerRepository
{
	
	@Inject 
	private DummyData initialData;

	@Override
	public List<Customer> findAll() {
		ArrayList<Customer> customer = initialData.getEntityList(new Customer());
		return null;
	}

	@Override
	public List<Customer> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S insert(S arg0) {
		// TODO Auto-generated method stub
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
	public long count() {
		// TODO Auto-generated method stub
		return 0;
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
	public boolean exists(Integer customerID) {
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
	public Customer findByCustomerID(int customerID) 
	{
		ArrayList<Customer> customer = initialData.getEntityList(new Customer());
		
		Customer foundCustomer = new Customer();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerID() == customerID)
			{
				foundCustomer = customer.get(i);
				
				return foundCustomer;
			}
		}
		return null;
	}

	@Override
	public List<Customer> findByCustomerPhone(String customerPhone) 
	{
		
		ArrayList<Customer> customer = initialData.getEntityList(new Customer());
		
		ArrayList<Customer> foundCustomer = new ArrayList<Customer>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerPhone().equalsIgnoreCase(customerPhone));
			{
				foundCustomer.add(customer.get(i));
			}
		}
		
		return foundCustomer;
	}

	@Override
	public List<Customer> findByCustomerAvailableCredit(float availableCredit) 
	{
		ArrayList<Customer> customer = initialData.getEntityList(new Customer());
		
		ArrayList<Customer> foundCustomer = new ArrayList<Customer>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getAvailableCredit() == availableCredit);
			{
				foundCustomer.add(customer.get(i));
			}
		}
		
		return foundCustomer;
	}

	@Override
	public List<Customer> findByName(String name) 
	{
		
		ArrayList<Customer> customer = initialData.getEntityList(new Customer());
		
		ArrayList<Customer> foundCustomer = new ArrayList<Customer>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerName().equalsIgnoreCase(name));
			{
				foundCustomer.add(customer.get(i));
			}
		}
		
		return foundCustomer;
	}

	@Override
	public Customer findByCustomerEmailAddress(String customerEmail) 
	{
		ArrayList<Customer> customer = initialData.getEntityList(new Customer());
		
		Customer foundCustomer = new Customer();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerEmail().equalsIgnoreCase(customerEmail));
			{
				foundCustomer = customer.get(i);			
			}
		}
		
		return foundCustomer;
		
	}

	@Override
	public Customer findByCustomerUsername(String customerUsername) 
	{
		ArrayList<Customer> customer = initialData.getEntityList(new Customer());
		
		Customer foundCustomer = new Customer();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerUsername().equalsIgnoreCase(customerUsername));
			{
				foundCustomer = customer.get(i);			
			}
		}
		
		return foundCustomer;
		
	}

	@Override
	public List<Customer> findByCustomerAddress(ArrayList<Address> addressArray) 
	{
		ArrayList<Customer> customer = initialData.getEntityList(new Customer());
		
		ArrayList<Customer> foundCustomer = new ArrayList<Customer>();
		
		
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			/*if(customer.get(i).getCustomerUsername().equalsIgnoreCase(customerAddress));
			{
				Address tempAddress = new Address();
				
				foundCustomer.add(customer.get(i));			
			}*/
		}
		
		return foundCustomer;
	}

}
