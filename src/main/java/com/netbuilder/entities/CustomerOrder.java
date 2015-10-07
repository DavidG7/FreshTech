package com.netbuilder.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class CustomerOrder {
	/**
	 * @author Ricky Luu
	 * Holds customers Orders details 
	 */
	
	@Id
	@GeneratedValue (
			strategy = GenerationType.IDENTITY
	)
	private int customerOrderID;
	@OneToMany
	@PrimaryKeyJoinColumn (
			name="customerID"
			
	)
	private Customer customer;
	private Address address;
	private Date dataOfOrder;
	private String customerOrderStatus;
	private String deliveryAddress;
	// Product address;
	
	
	public CustomerOrder(){}
	
	/**
	 * Create a new CustomerOrder 
	 * @param customerOrderID
	 * @param customerID
	 * @param dataOfOrder
	 * @param customerOrderStatus
	 * @param deliveryAddress
	 */
	
	public CustomerOrder(int customerOrderID,Date dataOfOrder, String customerOrderStatus, String deliveryAddress ){
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
