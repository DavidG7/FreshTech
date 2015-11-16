package com.netbuilder.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	Employee employee = new Employee(1,"Jim","JimDavies27","CatFish",1);
	
	@Test
	public void EmployeeGetters() {
		
		assertEquals("Jim", employee.getEmployeeName());
		assertEquals("JimDavies27", employee.getEmployeeUsername());
		assertEquals("CatFish", employee.getEmployeePassword());
		assertEquals(1, employee.getAccessLevel());
	}
	
	@Test
	public void EmployeeSetters() {
		employee.setEmployeeName("Harry");
		assertEquals("Harry", employee.getEmployeeName());
		employee.setEmployeeUserName("HarryHormineLovesJennyWeasel");
		assertEquals("HarryHormineLovesJennyWeasel", employee.getEmployeeUsername());
		employee.setEmployeePassword("Poop");
		assertEquals("Poop", employee.getEmployeePassword());
		employee.setAccessLevel(2);
		assertEquals(2, employee.getAccessLevel());
	}

}
