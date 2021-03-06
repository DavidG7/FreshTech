package com.netbuilder.entities;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Thomas Dudley, James Thompson
 * Small class within the customer for the basket
 * Saves having a 2D ArrayList when an object can hold
 * information and then be stored within an ArrayList  
 * 
 * --Jthompson--
 * Moved into separate class
 *
 */

@Document (collection="Basket")

public class Basket {
	
	
	@Id
	private int basketID;
	
	private Product product;
	private int quantity;
	private int customerID;
	
	public Basket()
	{
		
	}
	
	public Basket(int basketID, Product prod, int quant, int custID) {
		this.basketID = basketID;
		this.product = prod;
		this.quantity = quant;
		this.customerID = custID;
	}

	public int getBasketID() {
		return basketID;
	}

	public void setBasketID(int basketID) {
		this.basketID = basketID;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getCustomerID()
	{
		return customerID;
	}
	
	public void setCustomerID(int custID)
	{
		this.customerID = custID;
	}
}