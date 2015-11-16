package com.netbuilder.entities;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.netbuilder.util.ContactMethod;

/**
 * TODO discuss return types and argument variables for methods.
 * TODO Need Error checking for the input of preferredCustomerContactMethod
 * @author Thomas Dudley
 * 
 * Customer class will allows the creation of the customer
 * Allows the customer to update/view their basket/wishlist
 * and update/view their orders, addresses and payment methods. 
 *
 */
@Document (collection="Customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = -469127124351435736L;
	
	@Id
	private int customerID;
	private String customerPhone;
	
	private float customerAvailableCredit; 
	
	private String customerName;
	private String customerEmail;
	private String customerUsername;
	private String customerPassword;
	
	private ContactMethod preferredCustomerContactMethod;
	
	private ArrayList<Product> wishList;
	private ArrayList<Payment> paymentArray;
	private ArrayList<Address> addressArray = new ArrayList<Address>() ;
	private ArrayList<Basket> basketArray;
		
	/**
	 * 
	 * @param custID
	 * @param custPhone
	 * @param customerAvailableCred
	 * @param custName
	 * @param custEmail
	 * @param custUsername
	 * @param custPassword
	 */
	public Customer(int custID, String custPhone, float customerAvailableCred, String custName, 
			String custEmail, String custUsername, String custPassword) {
		this.customerID = custID;
		this.customerPhone = custPhone;
		this.customerAvailableCredit = customerAvailableCred;
		this.customerName = custName;
		this.customerEmail = custEmail;
		this.customerUsername = custUsername;
		this.customerPassword = custPassword;
	}
	
	public Customer(int custID, String custPhone, float availableCred, String custName, 
			String custEmail, String custUsername, String custPassword, String preferedContactMethod) {
		this.customerID = custID;
		this.customerPhone = custPhone;
		this.customerAvailableCredit = availableCred;
		this.customerName = custName;
		this.customerEmail = custEmail;
		this.customerUsername = custUsername;
		this.customerPassword = custPassword;
		
		setCustomerContactMethod(preferedContactMethod);	
	}
	
	
	public Customer() { }
	
	public void addAddress(Address address){
		addressArray.add(new Address());
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public float getAvailableCredit() {
		return customerAvailableCredit;
	}

	public void setAvailableCredit(float availableCredit) {
		this.customerAvailableCredit = availableCredit;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	public void setCustomerContactMethod(String contactMethod) {
		if(ContactMethod.EMAIL.toString().equalsIgnoreCase(contactMethod)) {
			this.preferredCustomerContactMethod = ContactMethod.EMAIL;
		}
		else if(ContactMethod.PHONE.toString().equalsIgnoreCase(contactMethod)) {
			this.preferredCustomerContactMethod = ContactMethod.PHONE;
		}
		else if(ContactMethod.MAIL.toString().equalsIgnoreCase(contactMethod)) {
			this.preferredCustomerContactMethod = ContactMethod.MAIL;
		}
		else {
			
			 //TODO Need to system.out.println this error when there is a UI.
			 
		}
			
	}
	
	public String getCustomerContactMethod() {
		return this.preferredCustomerContactMethod.toString();
	}
	

	public ArrayList<Address> getCustomerAddressArray() {
		return addressArray;
	}
	
	public Address getCustomerAddressAt(int i) {
		return addressArray.get(i);
	}
	
	public ArrayList<Basket> getCustomerBasketArray() {
		return basketArray;
	}
	
	public Basket getCustomerBasketAt(int i){
		return basketArray.get(i);
	}
	
	public ArrayList<Payment> getCustomerPaymentArray() {
		return paymentArray;
	}
	
	public Payment getCustomerPaymentAt(int i){
		return paymentArray.get(i);
	}
	
	public ArrayList<Product> getCustomerWishListArray() {
		return wishList;
	}
	
	public Product getCustomerWishListAt(int i){
		return wishList.get(i);
	}
	
	
	/**
	 * Method that allows the customer to log in to the website.
	 */
	@Deprecated
	public void verifyLogIn() {
		// TODO
	}
	
	/**
	 * Add or remove products to the customer's basket
	 */
	@Deprecated
	public void updateBasket() {
		// TODO
	}
	
	/**
	 * Show the contents of the customer's basket
	 */
	@Deprecated
	public void viewBasket() {
		// TODO
	}
	
	/**
	 * Creates a wishlist for the customer
	 */
	@Deprecated
	public void createWishList() {
		// TODO
	}
	
	/**
	 * Add or remove products to the customer's wishlist
	 */
	@Deprecated
	public void updateWishList() {
		// TODO
	}
	
	/**
	 * Shows the contents of the customer's wishlist
	 */
	@Deprecated
	public void viewWishList() {
		// TODO
	}
	
	/**
	 * Removes the customer's wishlist
	 */
	@Deprecated
	public void deleteWishList() {
		// TODO
	}
	
	/**
	 * View the remaining amount of this custoemr's credit  
	 */
	@Deprecated
	public void viewCredit() {
		// TODO
	}
	
	/**
	 * Creates a customer order from the selected products contained within the basket
	 * Does not have to be all of the items from the basket though
	 */
	@Deprecated
	public void createCustomerOrder() {
		// TODO
	}
	
	/**
	 * Allows the customer to add a payment method such as a debit/credit card
	 */
	@Deprecated
	public void createPaymentMethod() {
		// TODO
	}
	
	/**
	 * Allows the customer to add an address
	 */
	@Deprecated
	public void createAddress() {
		// TODO
	}
	
	/**
	 * Remove an order from the customer
	 */
	@Deprecated
	public void removeOrder() {
		// TODO
	}
	
	/**
	 * Removes an address from the customer
	 */
	@Deprecated
	public void removeAddress() {
		// TODO
	}
	
	/**
	 * Removes a payment method from the customer
	 */
	@Deprecated
	public void removePaymentMethod() {
		// TODO
	}
}