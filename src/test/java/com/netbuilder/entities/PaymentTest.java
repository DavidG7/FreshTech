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
	
	Payment testing;
	
	@BeforeClass
	public void PaymentTest() {	
			
		}
	
	@Test
	public void testSetPaymentID(){
		testing = new Payment(1,2,"test");
		
		assertEquals("Actual was not expected",1, testing.getPaymentID());

	}
	
	public void testSetCardNumber(){
		testing = new Payment(1,2,"test");
		
		assertEquals("Actual was not expected",2, testing.getCardNumber());
	
	}	
	
	public void testSetSortCode(){
		testing = new Payment(1,2,"test");
		
		assertEquals("Actual was not expected","test", testing.getSortCode());
	
	}	
}
