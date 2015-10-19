package com.jsp.web;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
			ApplicationContext ctx = SpringApplication.run(App.class, args);
			String[] beanNames = ctx.getBeanDefinitionNames();
		    Arrays.sort(beanNames);
		    for (String beanName : beanNames) {
		        System.out.println(beanName);
		    }
		
	}
	


}
