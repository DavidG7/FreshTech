package com.netbuilder.entities;

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

public class Basket {
	private Product product;
	private int quantity;
	
	public Basket(Product prod, int quant) {
		this.product = prod;
		this.quantity = quant;
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
}