package com.netbuilder.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entityrepositories.PaymentRepository;
/**
 * 
 * @author rluu
 *
 */


@Controller
public class AddPaymentDetailsController {
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	PaymentRepository paymentRepository = mongoContext.getBean(PaymentRepository.class);
	
	
	 @RequestMapping("AddPaymentDetails")
	 public String addPaymentDetails(ModelAndView modelAndView) {
	        return "AddPaymentDetails";
	 }
	 
	 @RequestMapping(value="postCard" ,method = RequestMethod.POST)
	 public void doPost(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		 ModelAndView view = new ModelAndView();
		 	view.setViewName("UpdateAccount");
		 	String user =session.getAttribute("sessionUser")+"";
			 if(user.equalsIgnoreCase("null")){
				 view.setViewName("Register");
			 }
			 else{
				 
			 }
	 }
	
}
