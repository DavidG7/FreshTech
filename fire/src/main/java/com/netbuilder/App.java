package com.netbuilder;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import com.netbuilder.entities.Payment;
import com.netbuilder.entityrepositoriesimplementations.dummy.PaymentRepositoryOffline;

@SpringBootApplication
public class App  implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("hello world");
		
		ApplicationContext ctx = 
			      new AnnotationConfigApplicationContext(PaymentRepositoryOffline.class);
		
		PaymentRepositoryOffline paymentRepo = ctx.getBean(PaymentRepositoryOffline.class);
		ArrayList<Payment> payments = (ArrayList<Payment>) paymentRepo.findAll();
		for(Payment payment : payments){
			System.out.println(payment.getCardNumber());
			
		}
	}
	
	
}