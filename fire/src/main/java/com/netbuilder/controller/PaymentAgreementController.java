package com.netbuilder.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Payment;
import com.netbuilder.entityrepositories.PaymentRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.PaymentRepositoryMongo;

@Controller
public class PaymentAgreementController {
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	PaymentRepository paymentRepository = mongoContext.getBean(PaymentRepository.class);	
		
	PaymentRepositoryMongo test = new PaymentRepositoryMongo();
	
	 @RequestMapping("PaymentAgreement")
	 public String  PaymentAgreement(ModelAndView modelAndView) 
	 {
		 
		 paymentRepository.insert(new Payment(1, 10001, "1001"));
		 
		 
		 for(int i = 0; i < paymentRepository.findAll().size(); i++)
		 {
			 System.out.println("");
			 System.out.println("Payment ID: " + paymentRepository.findAll().get(i).getPaymentID());
			 System.out.println("Customer ID: " + paymentRepository.findAll().get(i).getCustomerID());
			 System.out.println("Card Number: " + paymentRepository.findAll().get(i).getCardNumber());
			 System.out.println("Sort Code: " + paymentRepository.findAll().get(i).getSortCode());

		 }
		 
		 
		 /*
		 for(int i = 0; i < paymentRepository.findAll().size(); i++)
		 {
			 System.out.println("");
			 System.out.println("Payment ID: " + paymentRepository.findAll().get(i).getPaymentID());
			 System.out.println("Customer ID: " + paymentRepository.findAll().get(i).getCustomerID());
			 System.out.println("Card Number: " + paymentRepository.findAll().get(i).getCardNumber());
			 System.out.println("Sort Code: " + paymentRepository.findAll().get(i).getSortCode());

		 }*/
		 
		 return "PaymentAgreement";
	 }
	
	
}
