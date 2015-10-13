package com.netbuilder.entities;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import com.netbuilder.util.ContactMethod;

public class SupplierTest {
	static Supplier tester;
	
	/**
	 *  By using @BeforeClass - we can make sure that our test object is instantiated
	 *  
	 *  The remaining test methods use @Test and assertEquals() to validate test data
	 *  
	 */
	@BeforeClass
	public static void testConstructor(){
		tester = new Supplier(321, "Test", "3@2.1", "12321", ContactMethod.PHONE);
	}
	
	@Test
	public void testGetId(){
		int result = tester.getId();
		assertEquals(result, 321);
	}
	
	@Test
	public void testSetId(){
		int num = 123;
		tester.setId(num);
		assertEquals(tester.getId(), num);
	}
	
	@Test
	public void testGetName(){
		String result = tester.getName();
		assertEquals(result, "Test");
	}
	
	@Test
	public void testSetName(){
		String result = "Result";
		tester.setName(result);
		assertEquals(tester.getName(), result);
	}
	
	public void testGetEmail(){
		String result = tester.getEmail();
		assertEquals(result, "3@2.1");
	}
	
	@Test
	public void testSetEmail(){
		String result = "1@2.3";
		tester.setEmail(result);
		assertEquals(tester.getEmail(), result);
	}
	
	@Test
	public void testGetPhone(){
		String result = tester.getPhone();
		assertEquals(result, "12321");
	}
	
	@Test
	public void testSetPhone(){
		String num = "54345";
		tester.setPhone(num);
		assertEquals(tester.getPhone(), num);
	}
	
	@Test
	public void testGetPreferredContactMethod(){
		String result = tester.getPreferredContactMethod().toString();
		assertEquals(result, "PHONE");
	}
	
	@Test
	public void testSetPreferredContactMethod(){
		ContactMethod result = ContactMethod.EMAIL;
		tester.setPreferredContactMethod(ContactMethod.EMAIL);
		assertEquals(tester.getPreferredContactMethod(), result);
	}
}