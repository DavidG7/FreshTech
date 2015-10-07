package com.netbuilder.entities;

public class CustomerOrder {
	private int customerOrderID ;
	private int dataOfOrder;
	private int customerOrderStatus;
	private String deliveryAddress;
//	Customer customer;
//  Product product;
//	Address address;
	
	
	public void updateCustomerOrder(){}
	
	public void  viewCustomerOrder(){}

	public int getDataOfOrder() {
		return dataOfOrder;
	}

	public void setDataOfOrder(int dataOfOrder) {
		this.dataOfOrder = dataOfOrder;
	}

	public int getCustomerOrderID() {
		return customerOrderID;
	}

	public void setCustomerOrderID(int customerOrderID) {
		this.customerOrderID = customerOrderID;
	}

	public int getCustomerOrderStatus() {
		return customerOrderStatus;
	}

	public void setCustomerOrderStatus(int customerOrderStatus) {
		this.customerOrderStatus = customerOrderStatus;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
}
