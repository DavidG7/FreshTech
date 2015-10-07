package com.netbuilder.entities;

import java.util.Date;



public class CustomerOrder {
	/**
	 * @author Ricky Luu
	 * 
	 * 
	 */
	
	
	private int customerOrderID ;
	private Date dataOfOrder;
	private String customerOrderStatus;
	private String deliveryAddress;
//	Customer customer;
//  Product product;
//	Address address;
	
	
	public CustomerOrder(){}
	
	/**
	 * Create a new Order 
	 * @param customerOrderID
	 * @param dataOfOrder
	 * @param customerOrderStatus
	 * @param deliveryAddress
	 */
	
	public CustomerOrder(int customerOrderID, Date dataOfOrder, String customerOrderStatus, String deliveryAddress ){
		this.customerOrderID=customerOrderID;
		this.dataOfOrder=dataOfOrder;
		this.customerOrderStatus=customerOrderStatus;
		this.deliveryAddress=deliveryAddress;
	}
	
	/**
	 * Updates Customer Orders 
	 */
	public void updateCustomerOrder(){}
	
	/**
	 * Displays Orders 
	 */
	
	public void  viewCustomerOrder(){}

	public Date getDataOfOrder() {return dataOfOrder;}
	public void setDataOfOrder(Date dataOfOrder) {this.dataOfOrder = dataOfOrder;}
	public int getCustomerOrderID() {return customerOrderID;}
	public void setCustomerOrderID(int customerOrderID) {this.customerOrderID = customerOrderID;}
	public String getCustomerOrderStatus() {return customerOrderStatus;}
	public void setCustomerOrderStatus(String customerOrderStatus) {this.customerOrderStatus = customerOrderStatus;}
	public String getDeliveryAddress() {return deliveryAddress;}
	public void setDeliveryAddress(String deliveryAddress) {this.deliveryAddress = deliveryAddress;}
}
