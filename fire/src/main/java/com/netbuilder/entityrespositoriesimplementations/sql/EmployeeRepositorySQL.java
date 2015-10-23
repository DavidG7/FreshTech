package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



import com.netbuilder.SQLConfig;
import com.netbuilder.entities.Employee;
import com.netbuilder.entityrepositories.EmployeeRepository;

public class EmployeeRepositorySQL implements EmployeeRepository{

	ApplicationContext ctx = new AnnotationConfigApplicationContext(SQLConfig.class);
	DataSource dataSource = (DataSource)ctx.getBean("dataSource");
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	private RowMapper<Employee> mapper;

	
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
		String sql = "Select * from Employee";
		return null;
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
