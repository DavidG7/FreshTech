
package com.netbuilder.entities;
/**
 * this class is used in customer orders so they can assign an address to each order giving them a choice.
 * @author jham
 *
 */

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4033621458726921518L;
	/**
	 * attributes used in the address class
	 * **/
	 @Id
	private int addressid;
	private String address;
	private String postcode;
	private int customerid;
	
   /**class constructors**/
	public Address (int addressid, String address, String postcode, int customerid){
		this.addressid = addressid;
		this.address = address;
		this.postcode = postcode;
		this.customerid = customerid;
}
/**
 * @author Tom
 */
	public Address()
	{
		
	}

	/**
	 * method for updating address
	 */
	public void updateAddress(){
		
	}
	
	/**
	 * method for viewing address
	 */
	public void viewAddress(){
		
	}
	
	/**
	 * @return the addressid
	 */
	public int getAddressid() {
		return addressid;
	}
	/**
	 * @param addressid the addressid to set
	 */
	public void setAddressid(int addressid) {
		this.addressid = addressid;
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
	public int getCustomerid() {
		return customerid;
	}
	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
}
