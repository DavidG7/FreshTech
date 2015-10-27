package com.netbuilder.entities;

/**
 * 
 * @author tdudley
 *
 */

public class CustomerOrderLine 
{
	private int customerOrderLineID;
	private int productID; 
	private int quantity;
	
	public CustomerOrderLine()
	{
		
	}
	
	public CustomerOrderLine(int customerOrderLineID, int productID, int quantity)
	{
		this.customerOrderLineID = customerOrderLineID;
		this.productID = productID;
		this.quantity = quantity;
	}

	public int getCustomerOrderLineID() {
		return customerOrderLineID;
	}

	public void setCustomerOrderLineID(int customerOrderLineID) {
		this.customerOrderLineID = customerOrderLineID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
