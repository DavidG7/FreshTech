package com.netbuilder.entityrespositoriesimplementations.sql;
/**
 * 
 *  * @author jham
 */
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







import com.netbuilder.DataConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.Employee;
import com.netbuilder.entityrepositories.EmployeeRepository;
import com.netbuilder.util.SQLTemplate;

public class EmployeeRepositorySQL implements EmployeeRepository{
	
		private SQLTemplate sqltemplate;
		
		public SQLTemplate getSqltemplate() {
			return sqltemplate;
		}

		public void setSqltemplate(SQLTemplate sqltemplate) {
			this.sqltemplate = sqltemplate;
		}
	
	
	@Override
	public <S extends Employee> S save(S entity) {
		entity = (S) new Employee();
				sqltemplate.update("INSERT INTO employee VALUES("+ entity.getEmployeeID() +",'" + entity.getEmployeeName()+"','" + entity.getEmployeeUsername()+"','" +entity.getEmployeePassword() +"','" + entity.getAccessLevel()+"'");
		return entity;
	}

	@Override
	public <S extends Employee> Iterable<S> save(Iterable<S> entities) {
		return null;
	}

	
	@Override
	public Employee findOne(Integer id) {
		Employee employee=null;
		try {
			ResultSet rs = sqltemplate.getResultSetForQuery("Employee", "Select  * from Employee Where employeeid="+id);
			while(rs.next()){
					 employee = new Employee(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
	}

	
	@Override
	public boolean exists(Integer id) {
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("Employee", "Select  employeeid from Employee WHERE employeeid = " + id);
			
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
	public Iterable<Employee> findAll() {
		ArrayList employee = new ArrayList();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("employeee", "Select * from Employee");
			while(rs.next()){	
				employee.add(new Employee(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  employee;
	}

	@Override
	public Iterable<Employee> findAll(Iterable<Integer> ids) {
		ArrayList<Employee> employee = new ArrayList<Employee>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("employee", "SELECT * from employee where employee id = " + ids);
			int i=0;
			while(rs.next()){	
				
				employee.add(new Employee( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));	
				System.out.println(employee.get(i).getEmployeeID()+","+employee.get(i).getEmployeeName()+","+employee.get(i).getEmployeeUsername()+","+employee.get(i).getEmployeePassword()+","+employee.get(i).getAccessLevel());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  employee;
	}

	@Override
	public long count() {
		long count = 0;
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("employee", "SELECT COUNT(*) FROM employee");
			while(rs.next()){
				count = rs.getLong(1);
			}
			System.out.println(count);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return count;
		}

	@Override
	public void delete(Integer id) {
		sqltemplate.delete("Delete from emplyee where emplyoeeid="+id);
	}

	@Override
	public void delete(Employee entity) {
		int OrderID = entity.getEmployeeID();
		sqltemplate.update("DELETE FROM customerorder WHERE orderid = "  + OrderID);
	}

	@Override
	public void delete(Iterable<? extends Employee> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		sqltemplate.update("DELETE FROM Employee");
		
	}

	@Override
	public Iterable<Employee> findByEmployeeName(String name) {
		ArrayList employee = new ArrayList();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("employeee", "Select * from Employee where emplyoeename="+name);
			while(rs.next()){	
				employee.add(new Employee(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  employee;
	}

	@Override
	public Iterable<Employee> findByAccessLevel(int accessLevel) {
		ArrayList employee = new ArrayList();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("employeee", "Select * from Employee where emplyoeeaccesslevel="+accessLevel);
			while(rs.next()){	
				employee.add(new Employee(rs.getInt(1) ,rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  employee;
	}
	
	
	
}
