package com.netbuilder.entityrespositoriesimplementations.sql;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.netbuilder.SQLConfig;
import com.netbuilder.entities.Employee;
import com.netbuilder.entityrepositories.EmployeeRepository;

public class EmployeeRepositorySQL implements EmployeeRepository{

	ApplicationContext ctx = new AnnotationConfigApplicationContext(SQLConfig.class);
	DataSource dataSource = (DataSource)ctx.getBean("dataSource");
    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	
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

			System.out.println("Hello");
			return null;
	}

	@Override
	public Iterable<Employee> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		return jdbcTemplate.queryForLong("SELECT COUNT(employeepassword) FROM Employee;");
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
