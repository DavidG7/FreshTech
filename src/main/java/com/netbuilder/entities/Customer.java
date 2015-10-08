package com.netbuilder.entities;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;

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

public class Customer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -469127124351435736L;
	
	@Id
	private int customerID;
	private String customerPhone;
	
	private float availableCredit; 
	
	private String customerName;
	private String customerEmail;
	private String customerUsername;
	private String customerPassword;
	
	private enum ContactMethod {EMAIL, PHONE, MAIL};
	
	private ContactMethod preferredCustomerContactMethod;
	
	/**
	 * @author Thomas Dudley
	 * Small class within the customer for the basket
	 * Saves having a 2D ArrayList when an object can hold
	 * information and then be stored within an ArrayList  
	 *
	 */
	private class Basket
	{
		private Product product;
		private int quantity;
		
		public Basket(Product prod, int quant)
		{
			this.product = prod;
			this.quantity = quant;
		}
		
		public void setProduct(Product product) 
		{
			this.product = product;
		}

		public Product getProduct()
		{
			return this.product;
		}
		
		public int getQuantity()
		{
			return this.quantity;
		}
		
		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
		}
	}
	
	private ArrayList<Product> wishList;
	private ArrayList<Payment> paymentArray;
	private ArrayList<Address> addressArray;
	private ArrayList<Basket> basketArray;
		
	/**
	 * 
	 * @param custID
	 * @param custPhone
	 * @param availableCred
	 * @param custName
	 * @param custEmail
	 * @param custUsername
	 * @param custPassword
	 */
	public Customer(int custID, String custPhone, float availableCred, String custName, 
			String custEmail, String custUsername, String custPassword)
	{
		this.customerID = custID;
		this.customerPhone = custPhone;
		this.availableCredit = availableCred;
		this.customerName = custName;
		this.customerEmail = custEmail;
		this.customerUsername = custUsername;
		this.customerPassword = custPassword;
		
	}
	
	public Customer(int custID, String custPhone, float availableCred, String custName, 
			String custEmail, String custUsername, String custPassword, String preferedContactMethod)
	{
		this.customerID = custID;
		this.customerPhone = custPhone;
		this.availableCredit = availableCred;
		this.customerName = custName;
		this.customerEmail = custEmail;
		this.customerUsername = custUsername;
		this.customerPassword = custPassword;
		
		setCustomerContactMethod(preferedContactMethod);
			
	}
	
	public int getCustomerID() 
	{
		return customerID;
	}

	public void setCustomerID(int customerID) 
	{
		this.customerID = customerID;
	}

	public String getCustomerPhone() 
	{
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) 
	{
		this.customerPhone = customerPhone;
	}

	public float getAvailableCredit() 
	{
		return availableCredit;
	}

	public void setAvailableCredit(float availableCredit) 
	{
		this.availableCredit = availableCredit;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public String getCustomerEmail() 
	{
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) 
	{
		this.customerEmail = customerEmail;
	}

	public String getCustomerUsername() 
	{
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) 
	{
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() 
	{
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) 
	{
		this.customerPassword = customerPassword;
	}
	
	public void setCustomerContactMethod(String contactMethod)
	{
		if(ContactMethod.EMAIL.toString().equalsIgnoreCase(contactMethod))
		{
			this.preferredCustomerContactMethod = ContactMethod.EMAIL;
		}
		else if(ContactMethod.PHONE.toString().equalsIgnoreCase(contactMethod))
		{
			this.preferredCustomerContactMethod = ContactMethod.PHONE;
		}
		else if(ContactMethod.MAIL.toString().equalsIgnoreCase(contactMethod))
		{
			this.preferredCustomerContactMethod = ContactMethod.MAIL;
		}
		else
		{
			/*
			 * Need to system.out.println this error when there is a UI.
			 */
		}
			
	}
	
	public String getCustomerContactMethod()
	{
		return this.preferredCustomerContactMethod.toString();
	}
	
	/**
	 * Method that allows the customer to log in to the website.
	 */
	public void verifyLogIn()
	{
		
	}
	
	/**
	 * Add or remove products to the customer's basket
	 */
	public void updateBasket()
	{
		
	}
	
	/**
	 * Show the contents of the customer's basket
	 */
	public void viewBasket()
	{
		
	}
	
	/**
	 * Creates a wishlist for the customer
	 */
	public void createWishList()
	{
		
	}
	
	/**
	 * Add or remove products to the customer's wishlist
	 */
	public void updateWishList()
	{
		
	}
	
	/**
	 * Shows the contents of the customer's wishlist
	 */
	public void viewWishList()
	{
		
	}
	
	/**
	 * Removes the customer's wishlist
	 */
	public void deleteWishList()
	{
		
	}
	
	/**
	 * View the remaining amount of this custoemr's credit  
	 */
	public void viewCredit()
	{
		
	}
	
	/**
	 * Creates a customer order from the selected products contained within the basket
	 * Does not have to be all of the items from the basket though
	 */
	public void createCustomerOrder()
	{
		
	}
	
	/**
	 * Allows the customer to add a payment method such as a debit/credit card
	 */
	public void createPaymentMethod()
	{
		
	}
	
	/**
	 * Allows the customer to add an address
	 */
	public void createAddress()
	{
		
	}
	
	/**
	 * Remove an order from the customer
	 */
	public void removeOrder()
	{
		
	}
	
	/**
	 * Removes an address from the customer
	 */
	public void removeAddress()
	{
		
	}
	
	/**
	 * Removes a payment method from the customer
	 */
	public void removePaymentMethod()
	{
		
	}
}