package com.netbuilder.entityrepositories;

import java.util.ArrayList;

import com.netbuilder.entities.Employee;

import java.util.List;

/**
 * 
 * @author dgordon
 *
 */

/**/



import java.util.List;
import org.springframework.data
  .repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	public Iterable<Employee> findByEmployeeName(String name);
	
    public Iterable<Employee> findByAccessLevel(int accessLevel);
    
}