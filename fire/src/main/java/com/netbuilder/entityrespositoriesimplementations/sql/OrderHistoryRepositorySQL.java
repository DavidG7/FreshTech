package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.netbuilder.MongoConfig;
import com.netbuilder.SQLConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entityrepositories.CustomerOrderRepository;

public class OrderHistoryRepositorySQL  implements CustomerOrderRepository {
	ApplicationContext ctx = new AnnotationConfigApplicationContext(SQLConfig.class);
	DataSource dataSource = (DataSource)ctx.getBean("dataSource");
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void delete(Integer arg0) {
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
	public CustomerOrder findByCustomerOrderID(Integer OrderID) {
		List<CustomerOrder> co= (List<CustomerOrder>) jdbcTemplate.query("SELECT orderid, customerorderid, orderdate, ordertotal, customerorderstatus, addressid FROM CustomerOrder WHERE orderid =" + OrderID, new RowMapper());
		
		
		return new CustomerOrder(int customerOrderID, int customerID, Date dataOfOrder,String customerOrderStatus, String deliveryAddress);
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
