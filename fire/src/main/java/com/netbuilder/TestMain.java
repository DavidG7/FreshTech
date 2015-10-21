package com.netbuilder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.netbuilder.entities.Employee;
import com.netbuilder.entityrepositories.EmployeeRepository;

public class TestMain {

	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	EmployeeRepository employeeRepository = (EmployeeRepository)context.getBean("EmployeeRepositorySQL");
	
	Iterable<Employee> employeeTest = employeeRepository.findAll();
}
