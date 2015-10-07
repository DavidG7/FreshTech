package com.netbuilder.entitymanagers;

import java.util.ArrayList;

import com.netbuilder.entities.Payment;

public interface PaymentManager {

	/////////// CREATE ///////////
	public void persistPayment (Payment payment);
	public void persistPayments(ArrayList<Payment> payment);
	
	//////////// READ ////////////
	public Payment findByName(String paymentName);
	public ArrayList<Payment> getPayments();
	
	// UPDATE
	public void updatePayment (Payment payment);
	
	// DELETE 
	public void removePayment (Payment payment);
	
}
