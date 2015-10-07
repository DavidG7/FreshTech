package com.netbuilder.entities;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * test class for the address
 * @author jham
 * 
 *@BeforeClass
 */ 

	public class AddressTest {
		     Address address = new Address(123,"netbuilder way","mc123g",1);


		     @Test
		     public void 	AddressGetters(){
		    	 assertEquals(123, address.getAddressid());
		 		assertEquals("netbuilder way", address.getAddress());
		 		assertEquals("mc123g", address.getPostcode());
		 		assertEquals(1, address.getCustomerid());
		     }
		     
		     @Test
		 	public void AddressSetters() {
		 		address.setAddressid(123);
		 		assertEquals(123, address.getAddressid());
		 		address.setAddress("netbuilder way");
		 		assertEquals("netbuilder way", address.getAddress());
		 		address.setPostcode("mc123g");
		 		assertEquals("mc123g", address.getPostcode());
		 		address.setCustomerid(1);
		 		assertEquals(1, address.getCustomerid());
		 	}
		}




