package com.netbuilder.entities;

import static org.junit.Assert.*;
import org.junit.runners.MethodSorters;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ProductTest {
	static Product product;
	
	@BeforeClass
	public static void testConstructor(){
		product = new Product(1, 11, 2.55F, "gnome", "naming");
	}
	
	@Test
	public void testGetProdID(){
		int result = product.getProductId();
		
		assertEquals(1, result);
	}
	
	@Test
	public void testSetProdID(){
		int num = 234;
		product.setProductId(num);
		int value = product.getProductId();
		assertEquals(num, value);
	}
	@Test
	public void testSetStockLevel(){
		int num = 234;
		product.setStockLevel(num);
		int value = product.getStockLevel();
		assertEquals(num, value);
	}
	
	
}
