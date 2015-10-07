package com.netbuilder.entitymanagers;

import java.util.ArrayList;

import com.netbuilder.entities.Employee;

public interface EmployeeManager
{
	/////////// CREATE ///////////
	public void persistEmployee (Employee employee);
	public void persistEmployees(ArrayList<Employee> employees);
	
	//////////// READ ////////////
	public Employee findByName(String employeeName);
	public ArrayList<Employee> getEmployees();
 
	/////////// UPDATE ///////////
	public void updateEmployee (Employee employee);
 
	/////////// DELETE ///////////
	public void removeEmployee (Employee employee);
}
