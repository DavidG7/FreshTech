
package com.netbuilder;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Payment;
import com.netbuilder.entityrepositories.PaymentRepository;
import com.netbuilder.entityrepositoriesimplementations.dummy.PaymentRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.PaymentRepositoryDummyConfig;

public class MainPayment {
   public static void main(String[] args) {
	   
	   ApplicationContext ctx = new AnnotationConfigApplicationContext(PaymentRepositoryDummyConfig.class);
	   
	   PaymentRepository paymentRepo = ctx.getBean(PaymentRepositoryDummy.class);
	   
      List<Payment> payments =  paymentRepo.findAll();
		
		for (Payment payment : payments){
			
			System.out.println(payment.getCardNumber());
			
		}

   }
}
