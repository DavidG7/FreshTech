package com.netbuilder.entities;

/**
 * 
 * @author pnewman
 *
 */

public class Payment {
	
	private int paymentID;
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

	/*
	 * TODO Discuss method return types.
	 */

	public void viewPaymentMethod(){
		//TODO method stub
	}
	
	public void updatePaymentMethod(){
		//TODO method stub
	}
	
	
}
