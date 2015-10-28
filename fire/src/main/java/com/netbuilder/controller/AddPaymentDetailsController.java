package com.netbuilder.controller;

import java.util.List;

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
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.Payment;
import com.netbuilder.entityrepositories.CustomerRepository;
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
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);	
	
	
	 @RequestMapping("AddPaymentDetails")
	 public String addPaymentDetails(ModelAndView modelAndView) {
	        return "AddPaymentDetails";
	 }
	 
	 @RequestMapping(value="postCard" ,method = RequestMethod.POST)
	 public ModelAndView doPost(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		 ModelAndView view = new ModelAndView();
		 	view.setViewName("UpdateAccount");
		 	String user =session.getAttribute("sessionUser")+"";
			 if(user.equalsIgnoreCase("null")){
				 view.setViewName("Register");
			 }
			 else{
				 String cardName = request.getParameter("firstname");
				 int cardNubmer =Integer.parseInt(request.getParameter("cardnumber"));
				 Customer customer =customerRepository.findByCustomerUsername(user);
				 System.out.println(customer.getCustomerID()+","+customer.getCustomerUsername());
				 List<Payment>payments=paymentRepository.findAll();
				 int size =payments.size();
				 paymentRepository.insert(new Payment(size+1,cardNubmer,"45-50-80",customer.getCustomerID()));
				 view.setViewName("AddPaymentDetails");
			 }
			return view;
	 }
	
}
