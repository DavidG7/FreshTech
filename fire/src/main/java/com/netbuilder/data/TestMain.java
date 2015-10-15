/*package com.netbuilder.data;

import java.util.ArrayList;

import com.netbuilder.entities.Payment;
import com.netbuilder.entityrepositoriesimplementations.dummy.*;

public class TestMain {
	public static void main(String[] args) {
		PaymentRepositoryDummy paymentRepo = new PaymentRepositoryDummy();
		ArrayList<Payment> payments = (ArrayList<Payment>) paymentRepo.findAll();
		 TODO Auto-generated method stub
		DummyData dummyData = new DummyData();
		List<Payment> payments = dummyData.getEntityList(new Payment());
		for (Payment payment : payments){
			System.out.println(payment.getCardNumber());
		}
		
	}
}*/