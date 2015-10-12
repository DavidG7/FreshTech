package com.netbuilder.entities;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author pnewman
 *
 */

public class PaymentTest {
	
	static Payment testing;
	
	@BeforeClass
	public static void testPayment() {	
			
		testing = new Payment(1,2,"test");
		
	}
	
	@Test
	public void testSetPaymentID(){
		
		assertEquals("Actual was not expected",1, testing.getPaymentID());

	}
	
	public void testSetCardNumber(){
		
		assertEquals("Actual was not expected",2, testing.getCardNumber());
	
	}	
	
	public void testSetSortCode(){
		
		assertEquals("Actual was not expected","test", testing.getSortCode());
	
	}	
}
