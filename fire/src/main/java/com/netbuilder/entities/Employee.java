package com.netbuilder.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author dgordon
 *
 */
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeID;
	
	private String employeeName;
	private String employeeUsername;
	private String employeePassword;
	private int accessLevel;
	
	public Employee() {}
	
	/**
	 * 
	 * @param employeeName
	 * @param employeeUsername
	 * @param employeePassword
	 * @param accessLevel
	 */
	public Employee(String employeeName, String employeeUsername, String employeePassword, int accessLevel) {
		this.employeeName = employeeName;
		this.employeeUsername = employeeUsername;
		this.employeePassword = employeePassword;
		this.accessLevel = accessLevel;
	}	

	public int getEmployeeID(){
		return employeeID;
	}

	public String getEmployeeName(){
		return employeeName;
	}
		
	public void setEmployeeName(String employeeName){
		this.employeeName = employeeName;
	}
		
	public String getEmployeeUsername(){
		return employeeUsername;
	}
		
	public void setEmployeeUserName(String employeeUsername){
		this.employeeUsername = employeeUsername;
	}
		
	public String getEmployeePassword(){
		return employeePassword;
	}
		
	public void setEmployeePassword(String employeePassword){
		this.employeePassword = employeePassword;
	}
		
	public int getAccessLevel(){
		return accessLevel;
	}
		
	public void setAccessLevel(int accessLevel){
		this.accessLevel = accessLevel;
	}
}