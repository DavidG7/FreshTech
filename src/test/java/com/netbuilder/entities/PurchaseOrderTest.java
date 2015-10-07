package com.netbuilder.entities;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class PurchaseOrderTest {
	
	static PurchaseOrder tester;
	
	@BeforeClass
	public static void PurchaseOrderTest() {
		tester = new PurchaseOrder (1, "Confirmed");
		
	}
	
	
	
	@Test
	public void testGetPurchaseOrderID() {
		
		assertEquals (1, tester.getPurchaseOrderID());
	
	
	}
	
	public void testGetPurchaseOrderStatus() {		
		
		assertEquals ("Confirmed", tester.getPurchaseOrderStatus());
	
	}
	
	public void testSetPurchaseOrderID() {
		
		tester.setPurchaseOrderID(11);
		assertEquals (11, tester.getPurchaseOrderID());
	
	
	}
	
	public void testSetPurchaseOrderStatus() {
		
		tester.setPurchaseOrderStatus("Unconfirmed");
		assertEquals ("Unconfirmed", tester.getPurchaseOrderStatus());
	
	}
	
	

}
