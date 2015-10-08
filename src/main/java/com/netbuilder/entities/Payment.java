package com.netbuilder.entities;

import org.springframework.data.annotation.Id;

/**
 * 
 * @author pnewman
 *
 */

public class Payment {
	
	@Id private int paymentID;
	private int customerID;
	private int cardNumber;
	private String sortCode;
	
	/*
	 * TODO Are both constructors needed?
	 */
	
	public Payment(){
		
	}
	
	/**
	 * Instantiates Payment object.
	 * @param paymentID
	 * @param cardNumber
	 * @param sortCode
	 */
	
	public Payment(int paymentID, int cardNumber, String sortCode){
		this.paymentID = paymentID;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
	}
	
	/*
	 * TODO Do we need all getters/setters.
	 */
	
	public int getPaymentID() {
		return paymentID;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	/*
	 * TODO Discuss method return types.
	 */

	
	/**
	 * This method prints the attributes contained in the class.
	 */
	public void viewPaymentMethod(){
		
		System.out.println("Card Number: "+cardNumber+" Sort Code: "+sortCode);
		
	}
	
	/**
	 * This method sets the card number and sort code of a payment method.
	 * @param cardNumber
	 * @param sortCode
	 */
	public void updatePaymentMethod(int cardNumber, String sortCode){

		setCardNumber(cardNumber);
		
		setSortCode(sortCode);
		
	}
	
	
}
