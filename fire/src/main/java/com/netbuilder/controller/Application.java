package com.netbuilder.controller;
 
import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application  {
	public static void main(String args[]) throws ServletException, LifecycleException {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
	}	
}