package com.netbuilder.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * this class is used in customer orders so they can assign an address to each order giving them a choice.
 * @author jham
 *
 */
@Document (collection="Address")
public class Address implements Serializable {
	private static final long serialVersionUID = -4033621458726921518L;
	/**
	 * attributes used in the address class
	 */
	@Id
	private int addressID;
	private String address;
	private String postcode;
	private int customerId;

	
   /**
    * class constructors
    */
	public Address (int addressid, String address, String postcode, int customerId){
		this.addressID = addressid;
		this.address = address;
		this.postcode = postcode;
		this.customerId = customerId;
	}
	
	/**
	 * @author Tom
	 */
	public Address() { }

	/**
	 * method for updating address
	 */
	@Deprecated
	public void updateAddress(){ 
		//TODO
	}
	
	/**
	 * method for viewing address
	 */
	@Deprecated
	public void viewAddress(){
		//TODO
	}
	
	/**
	 * @return the addressid
	 */
	public int getAddressid() {
		return addressID;
	}
	
	/**
	 * @param addressid the addressid to set
	 */
	public void setAddressid(int addressid) {
		this.addressID = addressid;
	}
	
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}
	
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the customerid
	 */
	public int getCustomerId() {
		return customerId;
	}
	
	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(int customerId) {
		this.customerId = customerId;
	}
}