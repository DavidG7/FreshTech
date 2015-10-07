package com.netbuilder.entities;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class PurchaseOrderTest {
	
	static PurchaseOrder tester;
	
	@BeforeClass
	public static void PurchaseOrderTest() {
				
	}
	
	
	
	@Test
	public void testGetPurchaseOrderID() {
		tester = new PurchaseOrder (1, "Confirmed");
		assertEquals (1, tester.getPurchaseOrderID());
	
	
	}
	
	@Test
	public void testGetPurchaseOrderStatus() {		
		tester = new PurchaseOrder (1, "Confirmed");
		assertEquals ("Confirmed", tester.getPurchaseOrderStatus());
	
	}
	
	@Test
	public void testSetPurchaseOrderID() {
		tester = new PurchaseOrder (1, "Confirmed");
		tester.setPurchaseOrderID(11);
		assertEquals (11, tester.getPurchaseOrderID());
	
	
	}
	
	@Test
	public void testSetPurchaseOrderStatus() {
		tester = new PurchaseOrder (1, "Confirmed");
		tester.setPurchaseOrderStatus("Unconfirmed");
		assertEquals ("Unconfirmed", tester.getPurchaseOrderStatus());
	
	}
	
	@Test
	public void testUpdatePurchaseOrder() {
		tester = new PurchaseOrder (1, "Confirmed");
		tester.updatePurchaseOrder(5, "Unconfirmed");
		assertEquals ("Unconfirmed", tester.getPurchaseOrderStatus());
		assertEquals (5, tester.getPurchaseOrderID());
	}
	
	

}
