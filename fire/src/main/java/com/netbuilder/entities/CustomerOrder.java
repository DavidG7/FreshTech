package com.netbuilder.entities;

import java.util.ArrayList;
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
	private int orderID;
	//@ManyToOne
	@PrimaryKeyJoinColumn(name = "orderid")
	private int  customerID;
	private String orderDate;
	private String customerOrderStatus;
	private int orderTotal;
	private int deliveryAddress;
	private ArrayList<Basket> baskets;
	//private DummyData data = new DummyData();

	public CustomerOrder() { }

	/**
	 * Create a new CustomerOrder
	 * 
	 * @param OrderID
	 * @param customerID
	 * @param dataOfOrder
	 * @param customerOrderStatus
	 * @param deliveryAddress
	 */
	public CustomerOrder(int OrderID, int customerID, String orderDate, int orderTotal,
			String customerOrderStatus, int deliveryAddress, ArrayList<Basket> baskets) {
		this.orderID = OrderID;
		this.customerID = customerID;
		this.orderDate = orderDate;
		this.customerOrderStatus = customerOrderStatus;
		this.deliveryAddress = deliveryAddress;
		this.orderTotal = orderTotal;
		this.baskets = baskets;
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
		return  "OrderID:" +orderID + "\nCustomerID:"+customerID+"\nCustomer Order Status:"+customerOrderStatus+ "\nDelivery Address:"+deliveryAddress;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerOrderStatus() {
		return customerOrderStatus;
	}

	public void setCustomerOrderStatus(String customerOrderStatus) {
		this.customerOrderStatus = customerOrderStatus;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public int getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(int deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public ArrayList<Basket> getBaskets() {
		return baskets;
	}

	public void setBaskets(ArrayList<Basket> baskets) {
		this.baskets = baskets;
	}
}