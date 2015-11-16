package com.netbuilder.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author pnewman
 *
 */
@Document (collection="Payment")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id 
	private int paymentID;
	private int customerID;
	private int cardNumber=0;
	private String sortCode="\nNo payment selected";
	
	/*
	 * TODO Are both constructors needed?
	 */
	public Payment() { }
	
	/**
	 * Instantiates Payment object.
	 * @param paymentID
	 * @param cardNumber
	 * @param sortCode
	 */
	public Payment(int paymentID, int cardNumber, String sortCode, int customerID) {
		this.paymentID = paymentID;
		this.cardNumber = cardNumber;
		this.sortCode = sortCode;
		this.customerID=customerID;
	}
	
	/*
	 * TODO Do we need all getters/setters.
	 */
	public Integer getPaymentID() {
		return paymentID;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber2) {
		this.cardNumber = cardNumber2;
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
	 * 
	 * Depreciated in favour of overridden toString method.
	 */
	@Deprecated
	public void viewPaymentMethod() {
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
	
	@Override
	public String toString() {
		return "Card Number: "+cardNumber+" Sort Code: "+sortCode;
	}
}