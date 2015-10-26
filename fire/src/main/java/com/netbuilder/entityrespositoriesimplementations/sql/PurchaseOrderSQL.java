package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.PurchaseOrder;
import com.netbuilder.entityrepositories.PurchaseOrderRepository;
import com.netbuilder.util.SQLTemplate;

public class PurchaseOrderSQL implements PurchaseOrderRepository
{
	ApplicationContext ctx = new AnnotationConfigApplicationContext(DataConfig.class);
	DataSource dataSource = (DataSource)ctx.getBean("dataSource");
    SQLTemplate sqltemplate = new SQLTemplate(dataSource);
	
	
	@Override
	public long count() 
	{
		long count = 0;
		
		try 
		{
			ResultSet rs= sqltemplate.getResultSetForQuery("purchaseorder", "SELECT COUNT(*) FROM purchaseorder");
			
			while(rs.next())
			{
				count = rs.getLong(1);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
		
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PurchaseOrder arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends PurchaseOrder> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer purchaseOrderID) 
	{
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "SELECT * FROM purchaseorder WHERE purchaseorderid =" + purchaseOrderID);
			
			while(rs.next())
			{
				return true;
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Iterable<PurchaseOrder> findAll() 
	{
		ArrayList<PurchaseOrder> purchaseOrder = new ArrayList<PurchaseOrder>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "SELECT purchaseorderid, supplierid, employeeid, purchaseorderdate, status FROM purchaseorder");
			
			int i = 0;
			
			while(rs.next()){	
				
				purchaseOrder.add(new PurchaseOrder( rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
				System.out.println(purchaseOrder.get(i).getPurchaseOrderID()+", "+ purchaseOrder.get(i).getSupplierID()+ ", " + purchaseOrder.get(i).getEmployeeID()
						+", "+purchaseOrder.get(i).getPurchaseDateOrder()+", "+purchaseOrder.get(i).getPurchaseOrderStatus());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  purchaseOrder;
		
		
		
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
	public PurchaseOrder findByPurchaseOrderID(int PurchaseOrderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseOrder> findByPurchaseOrderStatus(
			String PurchaseOrderStatus) {
		// TODO Auto-generated method stub
		return null;
	}

}
