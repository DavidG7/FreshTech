package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.util.SQLTemplate;

/**
 * 
 * @author Thomas Dudley
 *
 */

public class CustomerOrderSQL implements CustomerOrderRepository 
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
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT COUNT(*) FROM customerorder");
			
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
		try 
		{
			sqltemplate.getResultSetForQuery("customerorder", "DELETE FROM customerorder WHERE customerorderid =" + arg0);
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delete(CustomerOrder arg0) 
	{

		int customerOrderID = arg0.getCustomerOrderID();
		
		try 
		{
			sqltemplate.getResultSetForQuery("customereorder", "DELETE * FROM customerorder WHERE customerorderid =" + customerOrderID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delete(Iterable<? extends CustomerOrder> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deleteAll() 
	{
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "DELETE FROM customerorder");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Override
	public boolean exists(Integer arg0) 
	{
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "SELECT * FROM customerorderr WHERE customerorderid =" + arg0);
			
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
	public Iterable<CustomerOrder> findAll() 
	{
		ArrayList<CustomerOrder> customerOrder = new ArrayList<CustomerOrder>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder");
			
			int i = 0;
			
			while(rs.next()){	
				
				customerOrder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
				System.out.println(customerOrder.get(i).getCustomerOrderID()+", "+ customerOrder.get(i).getCustomerID()+ ", " + customerOrder.get(i).getDateOfOrder()
						+", "+customerOrder.get(i).getCustomerOrderStatus()+", "+customerOrder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerOrder;
	}
	
	@Override
	public Iterable<CustomerOrder> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public CustomerOrder findOne(Integer arg0) 
	{
		CustomerOrder customerOrder;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "SELECT * FROM customerorder WHERE orderid =" + arg0);
			
			while(rs.next())
			{
				return customerOrder = new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public <S extends CustomerOrder> S save(S arg0) 
	{
		arg0 = (S) new CustomerOrder(); 
		
		sqltemplate.update("INSERT INTO customerorder VALUES(" + arg0.getCustomerOrderID() + "','" + arg0.getCustomerID() + "','" + arg0.getDateOfOrder() 
				+ "','" + arg0.getOrderTotal() + "','" + arg0.getCustomerOrderStatus() + "','" + arg0.getDeliveryAddress());
		
		return arg0;
	}
	
	@Override
	public <S extends CustomerOrder> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public CustomerOrder findByCustomerID(Integer customerID) 
	{

		CustomerOrder customerOrder;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "SELECT * FROM customerorder WHERE customerid =" + customerID);
			
			while(rs.next())
			{
				return customerOrder = new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	@Override
	public ArrayList<CustomerOrder> findByDeliveryAddress( Integer deliveryAddress) 
	{
		ArrayList<CustomerOrder> customerOrder = new ArrayList<CustomerOrder>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "SELECT * FROM customerorder WHERE addressid =" + deliveryAddress);
			
			while(rs.next())
			{
				customerOrder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return customerOrder;
	
	}
	
	@Override
	public ArrayList<CustomerOrder> findByDateOfOrder(String orderDate) 
	{
		ArrayList<CustomerOrder> customerOrder = new ArrayList<CustomerOrder>();
			
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "SELECT * FROM customerorder WHERE orderdate =" + orderDate);
				
			while(rs.next())
			{
				customerOrder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
			
		return customerOrder;
		
	}
	
	@Override
	public ArrayList<CustomerOrder> findByCustomerOrderStatus(String customerOrderStatus) 
	{
		ArrayList<CustomerOrder> customerOrder = new ArrayList<CustomerOrder>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "SELECT * FROM customerorder WHERE customerorderstatus =" + customerOrderStatus);
				
			while(rs.next())
			{
				customerOrder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
			
		return customerOrder;

	}
	
	@Override
	public ArrayList<CustomerOrder> findByOrderTotal(float orderTotal) 
	{
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		
		try 
		{
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE ordertotal = " + orderTotal);
			
			while(rs.next())
			{	
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return customerorder;
	}
}
