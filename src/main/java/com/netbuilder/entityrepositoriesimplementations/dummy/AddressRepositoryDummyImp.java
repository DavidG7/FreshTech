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

public class AddressRepositoryDummyImp implements AddressRepository {
	
	@Inject 
	private DummyData initialData;

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return null;
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
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Address arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Address> arg0) {
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
	public Iterable<Address> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Address> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Address findByAddressid(int addressid) {
		
		ArrayList<Address> address = initialData.getEntityList(new Address());
		
		Address foundaddress = new Address();
		
		for ( int i = 0 ; i < address.size(); i++)
		{
			if(address.get(i).getAddressid() == addressid)
			{
				foundaddress = address.get(i);
			}
			return foundaddress;
		}
		return null;
	}
	
	

	@Override
	public List<Address> findByCustomerID(int customerid) {
		
		ArrayList<Address> address = initialData.getEntityList(new Address());
		
		ArrayList<Address> foundaddress = new ArrayList<Address>();
		
		for ( int i = 0 ; i < address.size(); i++)
		{
			if(address.get(i).getCustomerid() == customerid)
			{
				foundaddress.add(address.get(i));
			}
		}
		return address;
	}

	
	@Override
	public List<Address> findbyAddress(String address) {
ArrayList<Address> addressarray = initialData.getEntityList(new Address());
		
		ArrayList<Address> foundaddress = new ArrayList<Address>();
		
		for ( int i = 0 ; i < addressarray.size(); i++)
		{
			if(addressarray.get(i).getAddress() == address)
			{
				foundaddress.add(addressarray.get(i));
			}
		}
		return null;
	}

	@Override
	public List<Address> findBypostcode(String postcode) {
		
		return null;
	}
	
}
