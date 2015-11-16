package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Basket;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.BasketRepository;

public class BasketRepositoryDummy implements BasketRepository
{

	DummyData dummyData = new DummyData();
	
	
	@Override
	public long count() 
	{
		return dummyData.getEntityList(new Basket()).size();
	}

	@Override
	public void delete(Integer arg0) 
	{
		ArrayList<Basket> basket = dummyData.getEntityList(new Basket());

		for (int i = 0 ; i < basket.size(); i++)
		{
			if(basket.get(i).getCustomerID() == arg0)
			{
				basket.remove(i);
				dummyData.setEntityList(basket);
			}
		}
	}

	
	@Override
	public void deleteAll() 
	{
		ArrayList<Basket> basket = dummyData.getEntityList(new Basket());
		
		for(Basket b : basket)
		{
			basket.remove(b);
		}
		
		dummyData.setEntityList(basket);
		
	}

	@Override
	public boolean exists(Integer arg0) 
	{
		ArrayList<Basket> basket = dummyData.getEntityList(new Basket());
		
		for(int i = 0; i < basket.size(); i++)
		{
			if(basket.get(i).getCustomerID() == arg0)
			{
				return true;
			}
		}
		
		return false;
		
	}

	@Override
	public List<Basket> findByCustomerID(int customerID) 
	{
		/*ArrayList<Basket> basket = dummyData.getEntityList(new Basket());
		
		Basket foundBasket = new Basket();
		
		for (int i = 0 ; i < basket.size(); i++)
		{
			if(basket.get(i).getCustomerID() == customerID)
			{
				foundBasket = basket.get(i);
				
				return foundBasket;
			}
		}*/
		return null;
	}

	@Override
	public List<Basket> findAll() 
	{
		return dummyData.getEntityList(new Basket());
	}

	@Override
	public List<Basket> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Basket> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Basket> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Basket> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Basket> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Basket arg0) 
	{
		ArrayList<Basket> basket = dummyData.getEntityList(new Basket());
		
		for(Basket b : basket)
		{
			if(b.equals(arg0))
			{
				basket.remove(b);
			}
		}
		
		dummyData.setEntityList(basket);
	}

	@Override
	public void delete(Iterable<? extends Basket> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Basket> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Basket findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Basket> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public DummyData getDummyData() {
		return dummyData;
	}

	public void setDummyData(DummyData dummyData) {
		this.dummyData = dummyData;
	}

	@Override
	public Basket findByBasketID(int basketID) {
		// TODO Auto-generated method stub
		return null;
	}

}
