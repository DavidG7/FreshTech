package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entityrepositoriesimplementations.mongo.PaymentRepositoryMongo;

@Controller
public class PaymentAgreementController {

	PaymentRepositoryMongo PaymentRepositoryMongo = new PaymentRepositoryMongo();
		
	 @RequestMapping("PaymentAgreement")
	 public String  PaymentAgreement(ModelAndView modelAndView) 
	 {
		 for(int i = 0; i < PaymentRepositoryMongo.findAll().size(); i++)
		 {
			 System.out.println("");
			 System.out.println("Payment ID: " + PaymentRepositoryMongo.findAll().get(i).getPaymentID());
			 System.out.println("Customer ID: " + PaymentRepositoryMongo.findAll().get(i).getCustomerID());
			 System.out.println("Card Number: " + PaymentRepositoryMongo.findAll().get(i).getCardNumber());
			 System.out.println("Sort Code: " + PaymentRepositoryMongo.findAll().get(i).getSortCode());

		 }
		 
		 PaymentRepositoryMongo.delete(2);
		 
		 for(int i = 0; i < PaymentRepositoryMongo.findAll().size(); i++)
		 {
			 System.out.println("");
			 System.out.println("Payment ID: " + PaymentRepositoryMongo.findAll().get(i).getPaymentID());
			 System.out.println("Customer ID: " + PaymentRepositoryMongo.findAll().get(i).getCustomerID());
			 System.out.println("Card Number: " + PaymentRepositoryMongo.findAll().get(i).getCardNumber());
			 System.out.println("Sort Code: " + PaymentRepositoryMongo.findAll().get(i).getSortCode());

		 }
		 
		 return "PaymentAgreement";
	 }
	
	
}
