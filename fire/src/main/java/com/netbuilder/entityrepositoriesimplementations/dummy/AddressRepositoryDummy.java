package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import com.netbuilder.entities.Address;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.data.DummyData;

/**
 * 
 * @author ???, Thomas Dudley
 * 
 * This class it to implement the funcationality of the Address Repository
 * 
 * 
 */

public class AddressRepositoryDummy implements AddressRepository {
	
	@Inject 
	private DummyData dummyData;

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		
		ArrayList<Address> address = dummyData.getEntityList(new Address());
		
		return address;
	}

	@Override
	public List<Address> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Address> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Address> java.util.List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Address> java.util.List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Address> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer addressID) 
	{
		ArrayList<Address> address = dummyData.getEntityList(new Address());
		
		for(int i = 0; i < address.size(); i++)
		{
			if(address.get(i).getAddressid() == addressID)
			{
				address.remove(i);
			}
		}
		
		dummyData.setEntityList(address);		
		
	}

	@Override
	public void delete(Address arg0) 
	{
		ArrayList<Address> address = dummyData.getEntityList(new Address());
		
		for(Address c : address)
		{
			if(c.equals(arg0))
			{
				dummyData.getEntityList(new Address()).remove(c);
			}
		}
		
	}

	@Override
	public void delete(Iterable<? extends Address> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() 
	{
		ArrayList<Address> address = dummyData.getEntityList(new Address());
		
		for(Address c : address)
		{
			dummyData.getEntityList(new Address()).remove(c);
		}
	
	}

	@Override
	public boolean exists(Integer addressID) {
		
		ArrayList<Address> address = dummyData.getEntityList(new Address());
		
		for(int i = 0; i < address.size(); i++)
		{
			if(address.get(i).getAddressid() == addressID)
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Iterable<Address> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findOne(Integer addressID) {
		
		ArrayList<Address> address = dummyData.getEntityList(new Address());
		
		for(int i = 0; i < address.size(); i++)
		{
			if(address.get(i).getAddressid() == addressID)
			{
				return address.get(i);
			}
		}
		
		return null;
	}

	@Override
	public <S extends Address> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Address findByAddressID(int addressid) {
		
		ArrayList<Address> address = dummyData.getEntityList(new Address());
		
		Address foundaddress = new Address();
		
		for ( int i = 0 ; i < address.size(); i++)
		{
			if(address.get(i).getAddressid() == addressid)
			{
				foundaddress = address.get(i);
			}
			
		}
		return foundaddress;
	}
	
	

	@Override
	public List<Address> findByCustomerID(int customerID) 
	{
		ArrayList<Address> address = dummyData.getEntityList(new Address());
		
		ArrayList<Address> foundaddress = new ArrayList<Address>();
		
		for ( int i = 0 ; i < address.size(); i++)
		{
			if(address.get(i).getCustomerid() == customerID)
			{
				foundaddress.add(address.get(i));
			}
		}
		return foundaddress;
	}

	
	@Override
	public List<Address> findByAddress(String address) 
	{
		ArrayList<Address> addressArray = dummyData.getEntityList(new Address());
		
		ArrayList<Address> foundAddress = new ArrayList<Address>();
		
		for ( int i = 0 ; i < addressArray.size(); i++)
		{
			if(addressArray.get(i).getAddress() == address)
			{
				foundAddress.add(addressArray.get(i));
			}
		}
		return foundAddress;
	}

	@Override
	public List<Address> findByPostcode(String postcode) 
	{
		ArrayList<Address> addressArray = dummyData.getEntityList(new Address());
		
		ArrayList<Address> foundAddress = new ArrayList<Address>();
		
		for ( int i = 0 ; i < addressArray.size(); i++)
		{
			if(addressArray.get(i).getPostcode() == postcode)
			{
				foundAddress.add(addressArray.get(i));
			}
		}
		return foundAddress;
	}
	
}
