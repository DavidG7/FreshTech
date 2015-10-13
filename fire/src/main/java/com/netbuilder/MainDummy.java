package com.netbuilder;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Payment;
import com.netbuilder.entityrepositoriesimplementations.dummy.PaymentRepositoryOffline;

public class MainDummy {
   public static void main(String[] args) {
	   
	   ApplicationContext ctx = new AnnotationConfigApplicationContext(PaymentRepositoryOfflineConfig.class);
	   
	   PaymentRepositoryOffline paymentRepo = ctx.getBean(PaymentRepositoryOffline.class);
	   
	   /*
      ApplicationContext ctx = 
      new AnnotationConfigApplicationContext(DummyConfig.class);
   
      DummyData dummyData = ctx.getBean(DummyData.class);
      */
      List<Payment> payments =  paymentRepo.findAll();
		
		for (Payment payment : payments){
			
			System.out.println(payment.getCardNumber());
			
		}

   }
}
