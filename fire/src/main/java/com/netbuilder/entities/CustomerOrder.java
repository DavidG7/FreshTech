package com.netbuilder.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author Ricky Luu Holds customers Orders details
 */
@Entity
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerOrderID;
	//@ManyToOne
	@PrimaryKeyJoinColumn(name = "customerOrderID")
	private int  customerID;
	private String dateOfOrder;
	private String orderStatus;
	private float orderTotal;
	private int deliveryAddress;
	//private DummyData data = new DummyData();

	public CustomerOrder() { }

	/**
	 * Create a new CustomerOrder
	 * 
	 * @param customerOrderID
	 * @param customerID
	 * @param dataOfOrder
	 * @param customerOrderStatus
	 * @param deliveryAddress
	 */
	public CustomerOrder(int customerOrderID, int customerID, String dataOfOrder,
			String customerOrderStatus, int deliveryAddress) {
		this.customerOrderID = customerOrderID;
		this.customerID = customerID;
		this.dateOfOrder = dataOfOrder;
		this.orderStatus = customerOrderStatus;
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * Updates Customer Orders
	 */
	@Deprecated
	public void updateCustomerOrder() {
		// TODO	
	}
	/**
	 * Displays Orders
	 */
	public String  viewCustomerOrder() {
		return  "OrderID:" +customerOrderID + "\nCustomerID:"+customerID+"\nCustomer Order Status:"+orderStatus+ "\nDelivery Address:"+deliveryAddress;
	}
	
	public String getDateOfOrder() {return dateOfOrder;}
	public void setDateOfOrder(String string) {this.dateOfOrder = string;}
	public int getCustomerOrderID() {return customerOrderID;}
	public void setCustomerOrderID(int customerOrderID) {this.customerOrderID = customerOrderID;}
	public String getCustomerOrderStatus() {return orderStatus;}
	public void setCustomerOrderStatus(String customerOrderStatus) {this.orderStatus = customerOrderStatus;}
	public int getDeliveryAddress() {return deliveryAddress;}
	public void setDeliveryAddress(int deliveryAddress) {this.deliveryAddress = deliveryAddress;}
	public int getCustomerID () {return customerID;}
	public void setCustomerID(int customerID) {this.customerID = customerID;}
	public float getOrderTotal() {return orderTotal;}
	public void setOrderTotal(int orderTotal) {this.orderTotal = orderTotal;}
}