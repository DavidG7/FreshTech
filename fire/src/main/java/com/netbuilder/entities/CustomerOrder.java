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
	private int orderid;
	//@ManyToOne
	@PrimaryKeyJoinColumn(name = "orderid")
	private int  customerid;
	private String orderdate;
	private String customerOrderStatus;
	private float ordertotal;
	private int addressid;
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
	public CustomerOrder(int OrderID, int customerID, String orderDate,
			String customerOrderStatus, int deliveryAddress) {
		this.orderid = OrderID;
		this.customerid = customerID;
		this.orderdate = orderDate;
		this.customerOrderStatus = customerOrderStatus;
		this.addressid = deliveryAddress;
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
		return  "OrderID:" +orderid + "\nCustomerID:"+customerid+"\nCustomer Order Status:"+customerOrderStatus+ "\nDelivery Address:"+addressid;
	}
	
	public String getDateOfOrder() {return orderdate;}
	public void setDateOfOrder(String string) {this.orderdate = string;}
	public int getCustomerOrderID() {return orderid;}
	public void setCustomerOrderID(int customerOrderID) {this.orderid = customerOrderID;}
	public String getCustomerOrderStatus() {return customerOrderStatus;}
	public void setCustomerOrderStatus(String customerOrderStatus) {this.customerOrderStatus = customerOrderStatus;}
	public int getDeliveryAddress() {return addressid;}
	public void setDeliveryAddress(int deliveryAddress) {this.addressid = deliveryAddress;}
	public int getCustomerID () {return customerid;}
	public void setCustomerID(int customerID) {this.customerid = customerID;}
	public float getOrderTotal() {return ordertotal;}
	public void setOrderTotal(int orderTotal) {this.ordertotal = orderTotal;}
}