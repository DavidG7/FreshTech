package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.util.SQLTemplate;

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
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "DELETE FROM customerorder WHERE customerorderid =" + arg0);
			
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
			ResultSet rs = sqltemplate.getResultSetForQuery("customereorder", "DELETE * FROM customerorder WHERE customerorderid =" + customerOrderID);
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
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterable<CustomerOrder> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<CustomerOrder> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CustomerOrder findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends CustomerOrder> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends CustomerOrder> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CustomerOrder findByOrderID(Integer OrderID) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CustomerOrder findByCustomerID(Integer customerID) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<CustomerOrder> findByDeliveryAddress(
			Integer deliveryAddress) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<CustomerOrder> findByDateOfOrder(String orderDate) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<CustomerOrder> findByCustomerOrderStatus(
			String customerOrderStatus) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<CustomerOrder> findByOrderTotal(float orderTotal) {
		// TODO Auto-generated method stub
		return null;
	}
}
