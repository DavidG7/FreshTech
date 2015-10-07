package com.netbuilder.entitymanagers;

import java.util.ArrayList;

import com.netbuilder.entities.Employee;

import java.util.List;

/**/
public interface EmployeeManager {
	/**
	 * This method will return a single Employee entity based on the employeeID passed in
	 * 
	 * @param employeeID
	 * @return
	 */
	public Employee findByID(long employeeID);
	
	/**
	 * This method returns a list of all employees with the provided accessLevel.
	 * 
	 * @param accessLevel
	 * @return
	 */
	public List<Employee> findByAccessLevel(int accessLevel);
}