package com.netbuilder.entities;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author Thomas Dudley
 *
 *	Test class for the customer class. 
 *	Tests the functionality of the Customer Class.
 *
 */

public class CustomerTest 
{
	Customer testCustomer = new Customer(1, "01782566491", 10000f, "George Freshwater",
			"freshwater@gmail.com", "fresh", "water123");
	
	/**
	 * Tests the functionality of the get methods for the customer class
	 */
	@Test
	public void CustomerGetMethods()
	{
		assertEquals(1, testCustomer.getCustomerID());
		assertEquals("01782566491", testCustomer.getCustomerPhone());
		assertEquals(10000f, testCustomer.getAvailableCredit(), 0.001f);
		assertEquals("George Freshwater", testCustomer.getCustomerName());
		assertEquals("freshwater@gmail.com", testCustomer.getCustomerEmail());
		assertEquals("fresh", testCustomer.getCustomerUsername());
		assertEquals("water123", testCustomer.getCustomerPassword());
	}
	
	/**
	 * Tests the functionality of the set methods for the customer class
	 */
	@Test
	public void CustomerSetMethods()
	{	
		
		
		testCustomer.setCustomerID(10);
		assertEquals(10, testCustomer.getCustomerID());
		
		testCustomer.setCustomerPhone("07788254414");
		assertEquals("07788254414", testCustomer.getCustomerPhone());
		
		testCustomer.setAvailableCredit(5000);
		assertEquals(5000f, testCustomer.getAvailableCredit(), 0.001f);
		
		testCustomer.setCustomerName("Jerry Springer");
		assertEquals("Jerry Springer", testCustomer.getCustomerName());
		
		testCustomer.setCustomerEmail("jerry_springer@hotmail.co.uk");
		assertEquals("jerry_springer@hotmail.co.uk", testCustomer.getCustomerEmail());
		
		testCustomer.setCustomerUsername("spring");
		assertEquals("spring", testCustomer.getCustomerUsername());
		
		testCustomer.setCustomerPassword("springer123");
		assertEquals("springer123", testCustomer.getCustomerPassword());
	}
	
}