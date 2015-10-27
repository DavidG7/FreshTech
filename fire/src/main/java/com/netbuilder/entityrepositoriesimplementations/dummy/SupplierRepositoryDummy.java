package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Supplier;
import com.netbuilder.entityrepositories.SupplierRepository;

/**
 * 
 * @author ???, Thomas Dudley
 * 
 * This class it to implement the functionality of the Supplier Repository
 * 
 * 
 */

public class SupplierRepositoryDummy implements SupplierRepository
{

	private DummyData dummyData;
	
	public DummyData getDummyData() {
		return dummyData;
	}

	public void setDummyData(DummyData dummyData) {
		this.dummyData = dummyData;
	}

	@Override
	public long count() {

		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		return supplier.size();
	}

	@Override
	public void delete(Integer arg0) 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		for(int i = 0; i < supplier.size(); i++)
		{
			if(supplier.get(i).getId() == arg0)
			{
				supplier.remove(i);
			}
		}
		
		dummyData.setEntityList(supplier);
		
	}

	@Override
	public void delete(Supplier arg0) 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		for(int i = 0; i < supplier.size(); i++)
		{
			if(supplier.get(i) == arg0)
			{
				supplier.remove(i);
			}
		}
		
		dummyData.setEntityList(supplier);
		
	}

	@Override
	public void delete(Iterable<? extends Supplier> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		for(Supplier s : supplier)
		{
			dummyData.getEntityList(new Supplier()).remove(s);
		}
		
	}

	@Override
	public boolean exists(Integer arg0) 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		for(int i = 0; i < supplier.size(); i++)
		{
			if(supplier.get(i).getId() == arg0)
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Iterable<Supplier> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Supplier> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier findOne(Integer arg0) 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		for(int i = 0; i < supplier.size(); i++)
		{
			if(supplier.get(i).getId() == arg0)
			{
				return supplier.get(i);
			}
		}
		
		return null;
	}

	@Override
	public <S extends Supplier> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Supplier> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier findBySupplierId(int supplierId) 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		Supplier foundSupplier = new Supplier();
		
		for (int i = 0 ; i < supplier.size(); i++)
		{
			if(supplier.get(i).getId() == supplierId);
			{
				foundSupplier = supplier.get(i);			
			}
		}
		
		return foundSupplier;
	}

	@Override
	public Supplier findBySupplierName(String name) 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		Supplier foundSupplier = new Supplier();
		
		for (int i = 0 ; i < supplier.size(); i++)
		{
			if(supplier.get(i).getName().equalsIgnoreCase(name));
			{
				foundSupplier = supplier.get(i);			
			}
		}
		
		return foundSupplier;
	}

	@Override
	public Supplier findBySupplierEmail(String email) 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		Supplier foundSupplier = new Supplier();
		
		for (int i = 0 ; i < supplier.size(); i++)
		{
			if(supplier.get(i).getEmail().equalsIgnoreCase(email));
			{
				foundSupplier = supplier.get(i);			
			}
		}
		
		return foundSupplier;
	}

	@Override
	public Supplier findBySupplierPhone(String phone) 
	{
		ArrayList<Supplier> supplier = dummyData.getEntityList(new Supplier());
		
		Supplier foundSupplier = new Supplier();
		
		for (int i = 0 ; i < supplier.size(); i++)
		{
			if(supplier.get(i).getPhone().equalsIgnoreCase(phone));
			{
				foundSupplier = supplier.get(i);			
			}
		}
		
		return foundSupplier;
	}

}
