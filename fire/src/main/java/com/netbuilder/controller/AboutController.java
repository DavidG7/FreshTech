package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Employee;
import com.netbuilder.entityrespositoriesimplementations.sql.EmployeeRepositorySQL;
@Controller
public class AboutController {
		

	EmployeeRepositorySQL test = new EmployeeRepositorySQL();
	
	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
		test.findAll();
	        return "About";
	  }
	 
	
}
