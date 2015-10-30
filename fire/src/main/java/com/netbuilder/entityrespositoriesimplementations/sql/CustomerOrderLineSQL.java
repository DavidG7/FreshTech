package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.netbuilder.entities.CustomerOrderLine;
import com.netbuilder.entities.PurchaseOrderLine;
import com.netbuilder.entityrepositories.CustomerOrderLineRepository;
import com.netbuilder.util.SQLTemplate;

/**
 * 
 * @author tdudley
 *
 */

public class CustomerOrderLineSQL implements CustomerOrderLineRepository
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
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorderline", "SELECT COUNT(*) FROM customerorderline");
			
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
		sqltemplate.update("DELETE FROM customerorderline WHERE CustomerOrder_orderid = "  + arg0);
	}

	@Override
	public void delete(CustomerOrderLine arg0) 
	{
		int customerOrderLineID = arg0.getCustomerOrderLineID();
		
		sqltemplate.update("DELETE FROM customerorderline WHERE CustomerOrder_orderid = "  + customerOrderLineID);		
	}

	@Override
	public void delete(Iterable<? extends CustomerOrderLine> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		sqltemplate.update("DELETE FROM customerorderline");
		
	}

	@Override
	public boolean exists(Integer arg0) {

		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorderline", "SELECT * FROM customerorderline WHERE CustomerOrder_orderid =" + arg0);
			
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
	public Iterable<CustomerOrderLine> findAll() {
		
		ArrayList<CustomerOrderLine> customerOrderLine = new ArrayList<CustomerOrderLine>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorderline", "SELECT CustomerOrder_orderid, productid, quantity FROM customerorderline");
			
			int i = 0;
			
			while(rs.next()){	
				
				customerOrderLine.add(new CustomerOrderLine( rs.getInt(1), rs.getInt(2), rs.getInt(3)));
				System.out.println(customerOrderLine.get(i).getCustomerOrderLineID()+", "+ customerOrderLine.get(i).getProductID()+ ", " + customerOrderLine.get(i).getQuantity());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerOrderLine;
		
	}

	@Override
	public Iterable<CustomerOrderLine> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerOrderLine findOne(Integer arg0) 
	{

		CustomerOrderLine customerOrderLine = new CustomerOrderLine();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorderline", "SELECT * FROM customerorderline WHERE CustomerOrderorderid =" + arg0);
			
			while(rs.next())
			{
				return customerOrderLine = new CustomerOrderLine( rs.getInt(1), rs.getInt(2), rs.getInt(3));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public <S extends CustomerOrderLine> S save(S arg0) 
	{
		arg0 = (S) new CustomerOrderLine();
		
		sqltemplate.update("INSERT INTO customerorderline VALUES('" + arg0.getCustomerOrderLineID() + "', '" + arg0.getProductID() + "', '" + arg0.getQuantity()+"');");

		return arg0;
		
	}

	@Override
	public <S extends CustomerOrderLine> Iterable<S> save(Iterable<S> arg0) 
	{
		return null;
	}

	@Override
	public List<CustomerOrderLine> findByCustomerOrderLineID(Integer customerOrderLineID) 
	{
		ArrayList<CustomerOrderLine> customerOrderLines = new ArrayList<CustomerOrderLine>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorderline", "SELECT * FROM customerorderline WHERE CustomerOrder_orderid = " + customerOrderLineID);
			
			while(rs.next())
			{
				customerOrderLines.add(new CustomerOrderLine( rs.getInt(1), rs.getInt(2), rs.getInt(3)));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return customerOrderLines;
	}

	@Override
	public List<CustomerOrderLine> findByProductID(Integer productID) 
	{
		ArrayList<CustomerOrderLine> customerOrderLine = new ArrayList<CustomerOrderLine>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorderline", "SELECT * FROM customerorderline WHERE productid = " + productID);
			
			while(rs.next())
			{
				customerOrderLine.add(new CustomerOrderLine( rs.getInt(1), rs.getInt(2), rs.getInt(3)));
			}
		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return customerOrderLine;
	}


	
	
	
}
