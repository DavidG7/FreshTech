package com.netbuilder.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.Payment;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.PaymentRepository;


 /**
  * 
  * @author rluu
  *
  */
@Controller
public class UpdateAccountController {
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);	
	AddressRepository addressRepository = mongoContext.getBean(AddressRepository.class);
	PaymentRepository paymentRepository = mongoContext.getBean(PaymentRepository.class);
	
	
	 @RequestMapping("UpdateAccount")
	 public ModelAndView UpdateAccount (ModelAndView modelAndView, HttpSession session) {
		 	ModelAndView view = new ModelAndView();
		 	view.setViewName("UpdateAccount");
		 	String user =session.getAttribute("sessionUser")+"";
			 if(user.equalsIgnoreCase("null")){
				 view.setViewName("Register");
			 }	
			 
			 else{
				 Customer customer = customerRepository.findByCustomerUsername(user);
				 System.out.println(customer.getCustomerID());
				 List<Address>  address = addressRepository.findByCustomerId(customer.getCustomerID());
				 List<Payment> payment = paymentRepository.findByCustomerID(customer.getCustomerID());
				 for(int i=0; i<payment.size(); i++){
					 System.out.println(payment.get(i).getCardNumber());
				 }
				 
				 view.addObject("customer", customer);
				 view.addObject("address",address.get(0).getAddress());
				 view.addObject("addresses",address);
				 view.addObject("cardnumber",payment.get(0).getCardNumber());
				 view.addObject("sortcode",payment.get(0).getSortCode());
				 view.addObject("payment",payment);
				 
				 
			 } 
			 
	        return view;
	  }
	

	 
	 
}
