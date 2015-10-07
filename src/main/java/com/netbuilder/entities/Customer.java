package com.netbuilder.entities;

/**
 * TODO discuss return types and argument variables for methods.
 * @author Thomas Dudley
 * 
 * Customer class will allows the creation of the customer
 * Allows the customer to update/view their basket/wishlist
 * and update/view their orders, addresses and payment methods. 
 *
 */

public class Customer 
{
	private int customerID;
	private int customerPhone;
	
	private float availableCredit; 
	
	private String customerName;
	private String customerEmail;
	

	private String customerUsername;
	private String customerPassword;
	
	public enum preferedCustomerContactMethod {EMAIL, PHONE};
	
	public Customer(int custID, int custPhone, float availableCred, String custName, 
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
	
	public int getCustomerID() 
	{
		return customerID;
	}

	public void setCustomerID(int customerID) 
	{
		this.customerID = customerID;
	}

	public int getCustomerPhone() 
	{
		return customerPhone;
	}

	public void setCustomerPhone(int customerPhone) 
	{
		this.customerPhone = customerPhone;
	}

	public float getAvialableCredit() 
	{
		return availableCredit;
	}

	public void setAvialableCredit(float avialableCredit) 
	{
		this.availableCredit = avialableCredit;
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