package com.netbuilder.entities;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerOrderTest {
	static CustomerOrder test ;
	static Date d =new Date();

	
	

	@BeforeClass
	public static void testCustomerOrderintDateStringString() {
		//test = new CustomerOrder(0,12, d, "status", "adresss");

	}

	@Test
	public void testUpdateCustomerOrder() {
		
	}

	@Test
	public void testViewCustomerOrder() {
		System.out.println(test.viewCustomerOrder());
		assertEquals(test.viewCustomerOrder(),"OrderID:10001\nCustomerID:12\nCustomer Order Status:done\nDelivery Address:adddess1244");
		
	}

	@Test
	public void testGetDataOfOrder() {
		assertEquals(test.getOrderDate(),d);
		
	}

	@Test
	public void testSetDataOfOrder() {
		Calendar myCal = Calendar.getInstance();
		myCal.set(Calendar.YEAR, 2040);
		myCal.set(Calendar.MONTH, 9);
		myCal.set(Calendar.DAY_OF_MONTH, 10);
		Date theDate = myCal.getTime();
		//test.setDateOfOrder(theDate);
		assertEquals(test.getOrderDate(),theDate);
	}

	@Test
	public void testGetCustomerOrderID() {
		assertEquals(test.getCustomerID(),12);
	}

	@Test
	public void testSetCustomerOrderID() {
		test.setOrderID(10001);
		assertEquals(test.getOrderID(), 10001);
	}

	@Test
	public void testGetCustomerOrderStatus() {
		assertEquals(test.getCustomerOrderStatus(),"status");
	}

	@Test
	public void testSetCustomerOrderStatus() {
		test.setCustomerOrderStatus("done");
		assertEquals(test.getCustomerOrderStatus(),"done");
	}

	@Test
	public void testGetDeliveryAddress() {
		assertEquals(test.getDeliveryAddress(),"adresss");
	}

	@Test
	public void testSetDeliveryAddress() {
		//test.setDeliveryAddress("adddess1244");
		assertEquals(test.getDeliveryAddress(),"adddess1244");
	}

}
