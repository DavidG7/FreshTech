package com.netbuilder.contoller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositoriesimplementations.dummy.CustomerRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.CustomerRepositoryDummyConfig;

@Controller
public class UpdateAccountController {

	private ApplicationContext ctx;

	@RequestMapping(value = "updateaccount", method = RequestMethod.GET)
    public void viewCustomerCredit(ModelAndView modelAndView) {

		ctx = new AnnotationConfigApplicationContext(CustomerRepositoryDummyConfig.class);
		   
		CustomerRepository customerRepo = ctx.getBean(CustomerRepositoryDummy.class);
		   
	    Customer customer =  customerRepo.findByCustomerID(1);
	    
	    customer.getAvailableCredit();
	    
	
  }
}
