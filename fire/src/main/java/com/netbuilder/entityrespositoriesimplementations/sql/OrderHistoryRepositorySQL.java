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
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.EmployeeRepository;
import com.netbuilder.util.SQLTemplate;

public class OrderHistoryRepositorySQL implements CustomerOrderRepository {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(DataConfig.class);
	DataSource dataSource = (DataSource)ctx.getBean("dataSource");
    SQLTemplate sqltemplate = new SQLTemplate(dataSource);
	
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(CustomerOrder arg0) {
		// TODO Auto-generated method stub
		
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
		ArrayList<CustomerOrder> customerorder = new ArrayList<CustomerOrder>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder");
			
			while(rs.next()){	
				int i=0;
				customerorder.add(new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.get(i).getCustomerOrderID()+","+customerorder.get(i).getCustomerID()+","+customerorder.get(i).getDateOfOrder()+","+customerorder.get(i).getOrderTotal()+","+customerorder.get(i).getCustomerOrderStatus()+","+customerorder.get(i).getDeliveryAddress());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
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
		CustomerOrder customerorder = null;
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE orderid = " + OrderID );
			
			while(rs.next()){	
				
				customerorder = (new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.getCustomerOrderID()+","+customerorder.getCustomerID()+","+customerorder.getDateOfOrder()+","+customerorder.getOrderTotal()+","+customerorder.getCustomerOrderStatus()+","+customerorder.getDeliveryAddress());

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}
	
	@Override
	public CustomerOrder findByCustomerID(Integer customerID) {
		CustomerOrder customerorder = null;
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("customerorder", "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE customerid = " + customerID );
			
			while(rs.next()){	
				
				customerorder = (new CustomerOrder( rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6)));	
				System.out.println(customerorder.getCustomerOrderID()+","+customerorder.getCustomerID()+","+customerorder.getDateOfOrder()+","+customerorder.getOrderTotal()+","+customerorder.getCustomerOrderStatus()+","+customerorder.getDeliveryAddress());

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  customerorder;
	}

	@Override
	public ArrayList<CustomerOrder> findByDeliveryAddress(String deliveryAddress) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<CustomerOrder> findByDateOfOrder(Date dateOfOrder) {
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

