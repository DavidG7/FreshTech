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
	 
	 @RequestMapping("Basket")
	 public String Basket(ModelAndView modelAndView) {
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
	 
	 @RequestMapping("Product")
	 public String   Product(ModelAndView modelAndView) {
	        return "Product";
	  }
	 
	 @RequestMapping("ProductCatalogue")
	 public String   ProductCatalogue(ModelAndView modelAndView) {
	        return "ProductCatalogue";
	  }
	 
	 
	 
	 @RequestMapping("Register")
	 public String   Register(ModelAndView modelAndView) {
	        return "Register";
	  }
	 

	 @RequestMapping("UpdateAccount")
	 public String UpdateAccount (ModelAndView modelAndView) {
	        return "UpdateAccount";
	  }
	 
	 @RequestMapping("ViewCreditDetails")
	 public String ViewCreditDetails (ModelAndView modelAndView) {
	        return "ViewCreditDetails";
	  }
	 
	 
}