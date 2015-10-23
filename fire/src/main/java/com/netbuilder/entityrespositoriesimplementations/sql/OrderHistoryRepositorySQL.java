package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;

import javax.sql.DataSource;

import org.h2.engine.Database;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.sql.*;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.mysql.jdbc.Statement;
import com.netbuilder.MongoConfig;
import com.netbuilder.SQLConfig;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositories.CustomerOrderRepository;

public class OrderHistoryRepositorySQL implements CustomerOrderRepository {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SQLConfig.class);
	DataSource dataSource = (DataSource)ctx.getBean("dataSource");
	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
  


   
	@Override
	public long count() {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT COUNT(*) FROM CustomerOrder";
		//jdbcTemplate.queryForObject(sql, null);
		long count = Long.parseLong(sql, 10);
		
		return count;
	}
	
	@Override
	public void delete(Integer customerOrderID) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "DELETE FROM customerorder WHERE orderid = " + customerOrderID;
		Object[] params = {customerOrderID};
        int rows = jdbcTemplate.update(sql, params);
        System.out.println(rows + " row(s) deleted.");
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
		jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM CustomerOrder";
		
		List<CustomerOrder> customerorders = new ArrayList<CustomerOrder>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		
		for (Map row : rows) {
			CustomerOrder customerorder = new CustomerOrder();
			customerorder.setCustomerOrderID(Integer.parseInt(String.valueOf(row.get("orderid"))));
			customerorder.setCustomerID(Integer.parseInt(String.valueOf(row.get("customerid"))));
			customerorder.setDateOfOrder((String)row.get("orderdate"));
			customerorder.setOrderTotal(Integer.parseInt(String.valueOf(row.get("ordertotal"))));
			customerorder.setCustomerOrderStatus((String)row.get("customerorderstatus"));
			customerorder.setDeliveryAddress(Integer.parseInt(String.valueOf(row.get("addressid"))));
		}
		return customerorders;
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
	public CustomerOrder findByCustomerID(Integer customerID) {
		String sql = "SELECT orderid, customerid, orderdate, ordertotal, customerorderstatus, addressid FROM customerorder WHERE customerid = ?";
		jdbcTemplate = new JdbcTemplate(dataSource);
		//List<CustomerOrder> customers = jdbcTemplate.queryForList(sql, CustomerOrder.class);
		//for(int i =0; i<customers.size(); i++){
		//	System.out.println(customers.get(i).getCustomerID());
		
		CustomerOrder customerorder = (CustomerOrder) jdbcTemplate.queryForObject(
				sql, new Object[] { customerID }, new BeanPropertyRowMapper(CustomerOrder.class));
		return customerorder;
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
	public ArrayList<CustomerOrder> findByOrderStatus(String orderStatus) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<CustomerOrder> findByOrderTotal(float orderTotal) {
		// TODO Auto-generated method stub
		return null;
	}


}
