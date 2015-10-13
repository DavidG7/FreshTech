package com.netbuilder;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
		
		PaymentRepositoryOffline paymentRepo = new PaymentRepositoryOffline();
		ArrayList<Payment> payments = (ArrayList<Payment>) paymentRepo.findAll();
		for(Payment payment : payments){
			System.out.println(payment.getCardNumber());
			
		}
	}
	
	
}