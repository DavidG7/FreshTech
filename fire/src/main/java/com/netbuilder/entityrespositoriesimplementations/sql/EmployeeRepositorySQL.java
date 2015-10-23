package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.netbuilder.SQLConfig;
import com.netbuilder.entities.Employee;
import com.netbuilder.entityrepositories.EmployeeRepository;
import com.netbuilder.util.SQLTemplate;

public class EmployeeRepositorySQL implements EmployeeRepository{

	ApplicationContext ctx = new AnnotationConfigApplicationContext(SQLConfig.class);
	DataSource dataSource = (DataSource)ctx.getBean("dataSource");
    SQLTemplate sqltemplate = new SQLTemplate(dataSource);
	
	
	@Override
	public <S extends Employee> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Employee> findAll() {
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("employeee", "Select * from Employee");
			ArrayList employee = new ArrayList();
			while(rs.next()){	
				employeee.add(new Employee(rs.getInt(1), rs.getString(2),)))
				 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	
		return  employee;
	}

	@Override
	public Iterable<Employee> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		//return jdbcTemplate.queryForLong("SELECT COUNT(*) FROM Employee;");
		return 0;
	
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Employee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Employee> findByEmployeeName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Employee> findByAccessLevel(int accessLevel) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
