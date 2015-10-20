package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.PurchaseOrder;
import com.netbuilder.entityrepositories.PurchaseOrderRepository;

public class PurchaseOrderRespositoryDummy implements PurchaseOrderRepository
{

	DummyData dummyData = new DummyData();
	
	@Override
	public long count() 
	{
		return dummyData.getEntityList(new PurchaseOrder()).size();

	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PurchaseOrder arg0) 
	{
		ArrayList<PurchaseOrder> purchaseOrder = new ArrayList<PurchaseOrder>();
		
		if(dummyData.getEntityList(new PurchaseOrder()).contains(arg0))
		{
			purchaseOrder.remove(arg0);
			dummyData.setEntityList(purchaseOrder);
		}
		
	}

	@Override
	public void delete(Iterable<? extends PurchaseOrder> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		ArrayList<PurchaseOrder> purchaseOrder = new ArrayList<PurchaseOrder>();
		
		for(PurchaseOrder p : purchaseOrder)
		{
			purchaseOrder.remove(p);
		}
		
		dummyData.setEntityList(purchaseOrder);
		
	}

	@Override
	public boolean exists(Integer arg0) 
	{
		ArrayList<PurchaseOrder> es = dummyData.getEntityList(new PurchaseOrder());
		
		for(PurchaseOrder e : es) 
		{
			if(e.getPurchaseOrderID() == arg0)
			{
				return true;
			}
		}
		
	return false;

	}
	
	@Override
	public Iterable<PurchaseOrder> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<PurchaseOrder> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrder findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PurchaseOrder> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PurchaseOrder> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrder findByPurchaseOrderID(int PurchaseOrderID) 
	{
		ArrayList<PurchaseOrder> purchaseOrder = dummyData.getEntityList(new PurchaseOrder());
		
		for(PurchaseOrder p : purchaseOrder)
		{
			if(p.getPurchaseOrderID() == PurchaseOrderID)
				return p;
		}
		
		return null;
	}

	@Override
	public List<PurchaseOrder> findByPurchaseOrderStatus( String PurchaseOrderStatus) 
	{
		ArrayList<PurchaseOrder> purchaseOrder = dummyData.getEntityList(new PurchaseOrder());
		
		ArrayList<PurchaseOrder> foundPurchaseOrders = new ArrayList<PurchaseOrder>();
		
		for(PurchaseOrder p : purchaseOrder)
		{
			if(p.getPurchaseOrderStatus().equalsIgnoreCase(PurchaseOrderStatus))
				foundPurchaseOrders.add(p);
		}
		
		return foundPurchaseOrders;
	}
	

}
