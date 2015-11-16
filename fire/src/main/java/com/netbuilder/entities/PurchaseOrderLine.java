package com.netbuilder.entities;

/**
 * 
 * @author Thomas Dudley
 * 
 * 
 *
 */

public class PurchaseOrderLine 
{
	private int purchaseOrderLineID;
	private int productID;
	private int quantity;
	
	public PurchaseOrderLine()
	{
		
	}
	
	public PurchaseOrderLine(int purchaseOrderLineID, int productID, int quantity)
	{
		this.purchaseOrderLineID = purchaseOrderLineID;
		this.productID = productID;
		this.quantity = quantity;
	}

	public int getPurchaseOrderLineID() {
		return purchaseOrderLineID;
	}

	public void setPurchaseOrderLineID(int purchaseOrderLineID) {
		this.purchaseOrderLineID = purchaseOrderLineID;
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
