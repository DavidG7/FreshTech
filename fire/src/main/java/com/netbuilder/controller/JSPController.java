/*
 * This works for just loading pages, but i think each page needs its own controller once we add more functionality (eg LandingController)
 * -pete.
 */
package com.netbuilder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author rluu
 * @author pnewman
 *
 */

@Controller
public class JSPController {
 
	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
	        return "About";
	  }
	 
	 @RequestMapping("AddPaymentDetails")
	 public String addPaymentDetails(ModelAndView modelAndView) {
	        return "AddPaymentDetails";
	 }
	 
	 @RequestMapping("Basket")
	 public String basket(ModelAndView modelAndView) {
	        return "Basket";
	  }
	 
	 @RequestMapping("Login")
	 public String Login(ModelAndView modelAndView) {
	        return "Login";
	  }
	 
	 @RequestMapping("OrderConfirmation")
	 public String OrderConfirmation(ModelAndView modelAndView) {
	        return "OrderConfirmation";
	  }
	 
	 
	 @RequestMapping("OrderHistory")
	 public String  OrderHistory(ModelAndView modelAndView) {
	        return "OrderHistory";
	  }
	 
	 @RequestMapping("OrderTracking")
	 public String  OrderTracking(ModelAndView modelAndView) {
	        return "OrderTracking";
	  }
	 
	 
	 @RequestMapping("OutstandingOrders")
	 public String  OutstandingOrders(ModelAndView modelAndView) {
	        return "OutstandingOrders";
	  }
	 

	 @RequestMapping("PaymentAgreement")
	 public String  PaymentAgreement(ModelAndView modelAndView) {
	        return "PaymentAgreement";
	  }
	 
<<<<<<< HEAD
	
	 
	 @RequestMapping("ProductCatalogue")
	 public String   ProductCatalogue(ModelAndView modelAndView) {
	        return "ProductCatalogue";
	  }
	 
	 
	 
	
=======
	 @RequestMapping("Product")
	 public String   Product(ModelAndView modelAndView) {
	        return "Product";
	  }
>>>>>>> f028feaac593a51487b1c181ecb6799d0bb09255

	 @RequestMapping("UpdateAccount")
	 public String UpdateAccount (ModelAndView modelAndView) {
	        return "UpdateAccount";
	  }
<<<<<<< HEAD
	
	
=======
	 
	 @RequestMapping("ViewCreditDetails")
	 public String ViewCreditDetails (ModelAndView modelAndView) {
	        return "ViewCreditDetails";
	  }

	 

	 @RequestMapping("Landing")
	 public String landing2(ModelAndView modelAndView) {
	        return "Landing";
	  }
	 
	 @RequestMapping("Temp")
	 public String temp(ModelAndView modelAndView) {
	        return "Template";
	  }
	 
	 @RequestMapping("ChooseAddress")
	 public String ChooseAddress (ModelAndView modelAndView) {
	        return "ChooseAddress";
	  }
>>>>>>> f028feaac593a51487b1c181ecb6799d0bb09255
	
	 @RequestMapping("CustomerAccountPage")
	 public String CustomerAccountPage (ModelAndView modelAndView) {
	        return "CustomerAccountPage";
	  }
	 
	 @RequestMapping("PaymentConfirmation")
	 public String PaymentConfirmation(ModelAndView modelAndView) {
	        return "PaymentConfirmation";
	  }
	 
}