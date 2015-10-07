package com.netbuilder.entities;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerOrderTest {
	static CustomerOrder test ;

	
	

	@BeforeClass
	public static void testCustomerOrderintDateStringString() {
		test = new CustomerOrder (12, new Date(), "status", "adresss");

	}

	@Test
	public void testUpdateCustomerOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewCustomerOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDataOfOrder() {
			System.out.println(test.getDataOfOrder());
		
	}

	@Test
	public void testSetDataOfOrder() {
		Calendar myCal = Calendar.getInstance();
		myCal.set(Calendar.YEAR, 2040);
		myCal.set(Calendar.MONTH, 9);
		myCal.set(Calendar.DAY_OF_MONTH, 10);
		Date theDate = myCal.getTime();
		test.setDataOfOrder(theDate);
		System.out.println(test.getDataOfOrder());
	}

	@Test
	public void testGetCustomerOrderID() {
		 System.out.println(test.getCustomerOrderID());
	}

	@Test
	public void testSetCustomerOrderID() {
		test.setCustomerOrderID(10001);
		System.out.println(test.getCustomerOrderID());
	}

	@Test
	public void testGetCustomerOrderStatus() {
		System.out.println(test.getCustomerOrderStatus());
	}

	@Test
	public void testSetCustomerOrderStatus() {
		test.setCustomerOrderStatus("done");
		System.out.println(test.getCustomerOrderStatus());
	}

	@Test
	public void testGetDeliveryAddress() {
		System.out.println(test.getDeliveryAddress());
	}

	@Test
	public void testSetDeliveryAddress() {
		test.setDeliveryAddress("adddess1244");
		System.out.println(test.getDeliveryAddress());
	}

}
