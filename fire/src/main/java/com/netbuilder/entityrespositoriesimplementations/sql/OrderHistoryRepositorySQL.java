package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;









import com.netbuilder.DataConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.Employee;
import com.netbuilder.entities.ProductSupplier;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.EmployeeRepository;
import com.netbuilder.util.SQLTemplate;
/**
 * 
 * @author jham
 *
 */
public class OrderHistoryRepositorySQL implements CustomerOrderRepository {
	private SQLTemplate sqltemplate;
	
	public SQLTemplate getSqltemplate() {
		return sqltemplate;
	}

	public void setSqltemplate(SQLTemplate sqltemplate) {
		this.sqltemplate = sqltemplate;
	}
	
    @Override
	public long count() {
    	long count = 0;
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT COUNT(*) FROM customerorder");
			while(rs.next()){
				count =rs.getLong(1);
			}
		
		System.out.println(count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
    
	@Override
	public void delete(Integer OrderID) {
		sqltemplate.update("DELETE FROM customerorder WHERE orderid = "  + OrderID);
	}
	
	@Override
	public void delete(CustomerOrder arg0) {
		int OrderID = arg0.getOrderID();
		sqltemplate.update("DELETE FROM customerorder WHERE orderid = "  + OrderID);
	}
	@Override
	public void delete(Iterable<? extends CustomerOrder> arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	
	public void deleteAll() {
		sqltemplate.update("DELETE FROM customerorder");
		
	}
	
	@Override
	public boolean exists(Integer id) {
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder where orderid = " + id);
			
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
	public Iterable<CustomerOrder> findAll() {
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder");
			int i=0;
			while(rs.next()){	
				
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.get(i).getOrderID()+","+customerorder.get(i).getCustomerID()+","+customerorder.get(i).getOrderDate()+","+customerorder.get(i).getOrderTotal()+","+customerorder.get(i).getCustomerOrderStatus()+","+customerorder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}
	
	@Override
	public Iterable<CustomerOrder> findAll(Iterable<Integer> id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public CustomerOrder findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends CustomerOrder> S save(S entity) {
		entity = (S) new CustomerOrder();
		sqltemplate.update("INSERT INTO customerorder VALUES("+ entity.getOrderID() +",'" + entity.getCustomerID()+"','" + entity.getOrderDate() + "','" +entity.getOrderTotal() +"','" + entity.getCustomerOrderStatus()+"'"+ entity.getDeliveryAddress()+"'");
return entity;
	}
	
	@Override
	public <S extends CustomerOrder> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<CustomerOrder> findByOrderID(Integer OrderID) {
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE orderid = " + OrderID );
			
			while(rs.next()){	
				int i=0;
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.get(i).getOrderID()+","+customerorder.get(i).getCustomerID()+","+customerorder.get(i).getOrderDate()+","+customerorder.get(i).getOrderTotal()+","+customerorder.get(i).getCustomerOrderStatus()+","+customerorder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}
	
	@Override
	public ArrayList<CustomerOrder> findByCustomerID(Integer customerID) 
	{
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE customerid = " + customerID );
			
			while(rs.next()){	
				int i=0;
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.get(i).getOrderID()+","+customerorder.get(i).getCustomerID()+","+customerorder.get(i).getOrderDate()+","+customerorder.get(i).getOrderTotal()+","+customerorder.get(i).getCustomerOrderStatus()+","+customerorder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}

	@Override
	public ArrayList<CustomerOrder> findByDeliveryAddress(Integer deliveryAddress) {
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE addressid = " + deliveryAddress);
			
			while(rs.next()){	
				int i=0;
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.get(i).getOrderID()+","+customerorder.get(i).getCustomerID()+","+customerorder.get(i).getOrderDate()+","+customerorder.get(i).getOrderTotal()+","+customerorder.get(i).getCustomerOrderStatus()+","+customerorder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}
	
	@Override
	public ArrayList<CustomerOrder> findByOrderDate(String orderDate) {
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE orderdate = '" + orderDate +"'");
			int i=0;
			while(rs.next()){	
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.get(i).getOrderID()+","+customerorder.get(i).getCustomerID()+","+customerorder.get(i).getOrderDate()+","+customerorder.get(i).getOrderTotal()+","+customerorder.get(i).getCustomerOrderStatus()+","+customerorder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}
	
	@Override
	public ArrayList<CustomerOrder> findByCustomerOrderStatus(String customerOrderStatus) {
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE customerorderstatus = '" + customerOrderStatus +"'");
			int i=0;
			while(rs.next()){	
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.get(i).getOrderID()+","+customerorder.get(i).getCustomerID()+","+customerorder.get(i).getOrderDate()+","+customerorder.get(i).getOrderTotal()+","+customerorder.get(i).getCustomerOrderStatus()+","+customerorder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}
	
	@Override
	public ArrayList<CustomerOrder> findByOrderTotal(float orderTotal) {
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE ordertotal = " + orderTotal);
			
			while(rs.next()){	
				int i=0;
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.get(i).getOrderID()+","+customerorder.get(i).getCustomerID()+","+customerorder.get(i).getOrderDate()+","+customerorder.get(i).getOrderTotal()+","+customerorder.get(i).getCustomerOrderStatus()+","+customerorder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}
	




}

