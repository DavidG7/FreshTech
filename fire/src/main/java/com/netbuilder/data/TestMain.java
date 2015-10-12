package com.netbuilder.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.netbuilder.entities.Payment;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositoriesimplementations.dummy.*;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		DummyData dummyData = new DummyData();
		
		List<Payment> payments = dummyData.getEntityList(new Payment());
		
		for (Payment payment : payments){
			
			System.out.println(payment.getCardNumber());
			
		}
		*/
		
		
		PaymentRepositoryOffline paymentRepo = new PaymentRepositoryOffline();
		ArrayList<Payment> payments = (ArrayList<Payment>) paymentRepo.findAll();
		
	}

}
