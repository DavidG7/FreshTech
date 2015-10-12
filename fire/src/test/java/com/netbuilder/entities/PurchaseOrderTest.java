package com.netbuilder.entities;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PurchaseOrderTest {
	
	static PurchaseOrder tester;
	
	@BeforeClass
	public static void testPurchaseOrder() {
		tester = new PurchaseOrder (1, "Confirmed");		
	}
	
	
	
	@Test
	public void testGetPurchaseOrderID() {
		assertEquals (1, tester.getPurchaseOrderID());
	}
	
	@Test
	public void testGetPurchaseOrderStatus() {		
		assertEquals ("Confirmed", tester.getPurchaseOrderStatus());
	}
	
	@Test
	public void testSetPurchaseOrderID() {
		tester.setPurchaseOrderID(11);
		assertEquals (11, tester.getPurchaseOrderID());
	}
	
	@Test
	public void testSetPurchaseOrderStatus() {
		tester.setPurchaseOrderStatus("Unconfirmed");
		assertEquals ("Unconfirmed", tester.getPurchaseOrderStatus());
	
	}
	
	@Test
	public void testUpdatePurchaseOrder() {
		tester.updatePurchaseOrder(5, "Unconfirmed");
		assertEquals ("Unconfirmed", tester.getPurchaseOrderStatus());
		assertEquals (5, tester.getPurchaseOrderID());
	}
	
	

}
