package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.entities.CustomerOrderLine;
import com.netbuilder.entities.PurchaseOrder;
import com.netbuilder.entities.PurchaseOrderLine;
import com.netbuilder.entityrepositories.PurchaseOrderLineRepository;
import com.netbuilder.util.SQLTemplate;

/**
 * 
 * @author tdudley
 *
 */

public class PurchaseOrderLineSQL implements PurchaseOrderLineRepository
{

	private SQLTemplate sqltemplate;
	
	public SQLTemplate getSqltemplate() {
		return sqltemplate;
	}

	public void setSqltemplate(SQLTemplate sqltemplate) {
		this.sqltemplate = sqltemplate;
	}
	
	@Override
	public long count() 
	{		
		long count = 0;
		
		try 
		{
			ResultSet rs= sqltemplate.getResultSetForQuery("purchaseorderline", "SELECT COUNT(*) FROM purchaseorderline");
			
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
	public void delete(Integer arg0) 
	{
		sqltemplate.update("DELETE FROM purchaseorderline WHERE orderid = "  + arg0);
		
	}

	@Override
	public void delete(PurchaseOrderLine arg0) 
	{
		int purchaseOrderLineID = arg0.getPurchaseOrderLineID();
		
		sqltemplate.update("DELETE FROM purchaseorderline WHERE orderid = "  + purchaseOrderLineID);
		
	}

	@Override
	public void delete(Iterable<? extends PurchaseOrderLine> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		sqltemplate.update("DELETE FROM purchaseorderline");
		
	}

	@Override
	public boolean exists(Integer arg0) 
	{	
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorderline", "SELECT * FROM purchaseorderline WHERE PurchaseOrder_purchaseorderlineid =" + arg0);
			
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
	public Iterable<PurchaseOrderLine> findAll() 
	{
		ArrayList<PurchaseOrderLine> purchaseOrderLine = new ArrayList<PurchaseOrderLine>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorderline", "SELECT PurchaseOrder_purchaseorderlineid, productid, quantity FROM purchaseorderline");
			
			int i = 0;
			
			while(rs.next()){	
				
				purchaseOrderLine.add(new PurchaseOrderLine( rs.getInt(1), rs.getInt(2), rs.getInt(3)));
				System.out.println(purchaseOrderLine.get(i).getPurchaseOrderLineID()+", "+ purchaseOrderLine.get(i).getProductID()+ ", " + purchaseOrderLine.get(i).getQuantity());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  purchaseOrderLine;
	}

	@Override
	public Iterable<PurchaseOrderLine> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrderLine findOne(Integer arg0) 
	{
		PurchaseOrderLine purchaseOrderLine;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorderline", "SELECT * FROM purchaseorderline WHERE PurchaseOrder_purchaseorderlineid =" + arg0);
			
			while(rs.next())
			{
				return purchaseOrderLine = new PurchaseOrderLine( rs.getInt(1), rs.getInt(2), rs.getInt(3));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public <S extends PurchaseOrderLine> S save(S arg0) {
		
		arg0 = (S) new PurchaseOrderLine();
		
		sqltemplate.update("INSERT INTO purchaseorderline VALUES(" + arg0.getPurchaseOrderLineID() + "','" + arg0.getProductID() + "','" + arg0.getQuantity());

		return arg0;
		
	}

	@Override
	public <S extends PurchaseOrderLine> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrderLine findByPurchaseOrderLineID(int purchaseOrderLineID) 
	{
		PurchaseOrderLine purchaseOrderLine;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorderline", "SELECT * FROM purchaseorderline WHERE PurchaseOrder_purchaseorderlineid =" + purchaseOrderLineID);
			
			while(rs.next())
			{
				return purchaseOrderLine = new PurchaseOrderLine( rs.getInt(1), rs.getInt(2), rs.getInt(3));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<PurchaseOrderLine> findByProductID(int productID) 
	{
		ArrayList<PurchaseOrderLine> purchaseOrderLine =  new ArrayList<PurchaseOrderLine>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorderline", "SELECT * FROM purchaseorderline WHERE productid =" + productID);
			
			while(rs.next())
			{
				purchaseOrderLine.add(new PurchaseOrderLine( rs.getInt(1), rs.getInt(2), rs.getInt(3)));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return purchaseOrderLine;
	}

}
