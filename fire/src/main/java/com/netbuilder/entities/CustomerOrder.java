package com.netbuilder.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	@PrimaryKeyJoinColumn(name = "customerOrderID"

	)
	private int  customerID;
	private Date dateOfOrder;
	private String customerOrderStatus;
	private float orderTotal;
	private String deliveryAddress;
	//private DummyData data = new DummyData();
	
	

	public CustomerOrder() {
	}

	/**
	 * Create a new CustomerOrder
	 * 
	 * @param customerOrderID
	 * @param customerID
	 * @param dataOfOrder
	 * @param customerOrderStatus
	 * @param deliveryAddress
	 */

	public CustomerOrder(int customerOrderID, int customerID, Date dataOfOrder,
			String customerOrderStatus, String deliveryAddress) {
		this.customerOrderID = customerOrderID;
		this.customerID = customerID;
		this.dateOfOrder = dataOfOrder;
		this.customerOrderStatus = customerOrderStatus;
		this.deliveryAddress = deliveryAddress;
		
		
		
	}

	/**
	 * Updates Customer Orders
	 */
	public void updateCustomerOrder() {
		
		
	}
	/**
	 * Displays Orders
	 */
	public String  viewCustomerOrder() {
		return  "OrderID:" +customerOrderID + "\nCustomerID:"+customerID+"\nCustomer Order Status:"+customerOrderStatus+ "\nDelivery Address:"+deliveryAddress;
		}
	
	public Date getDateOfOrder() {return dateOfOrder;}
	public void setDateOfOrder(Date dateOfOrder) {this.dateOfOrder = dateOfOrder;}
	public int getCustomerOrderID() {return customerOrderID;}
	public void setCustomerOrderID(int customerOrderID) {this.customerOrderID = customerOrderID;}
	public String getCustomerOrderStatus() {return customerOrderStatus;}
	public void setCustomerOrderStatus(String customerOrderStatus) {this.customerOrderStatus = customerOrderStatus;}
	public String getDeliveryAddress() {return deliveryAddress;}
	public void setDeliveryAddress(String deliveryAddress) {this.deliveryAddress = deliveryAddress;}
	public int getCustomerID () {return customerID;}
	public void setCustomerID(int customerID) {this.customerID = customerID;}
	public float getOrderTotal() {return orderTotal;}
	public void setOrderTotal(int orderTotal) {this.orderTotal = orderTotal;}
	
	
}
