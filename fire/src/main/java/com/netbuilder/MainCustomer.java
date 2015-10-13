/*
package com.netbuilder;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositoriesimplementations.dummy.CustomerRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.CustomerRepositoryDummyConfig;

/**
 * 
 * @author pnewman
 *
 */
/*
public class MainCustomer {
   public static void main(String[] args) {
	   
	   ApplicationContext ctx = new AnnotationConfigApplicationContext(CustomerRepositoryDummyConfig.class);
	   
	   CustomerRepository customerRepo = ctx.getBean(CustomerRepositoryDummy.class);
	   
      List<Customer> customers =  customerRepo.findAll();
		
		for (Customer customer : customers){
			
			System.out.println(customer.getAvailableCredit());
			
		}

   }
}
*/