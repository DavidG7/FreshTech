package com.netbuilder.entityrepositories;

import java.util.ArrayList;

import com.netbuilder.entities.Product;

public interface ProductManager {
	/////////// CREATE ///////////
	public void persistProduct (Product product);
	public void persistProduct(ArrayList<Product> products);
	
	//////////// READ ////////////
	public Product findByName(String productName);
	public ArrayList<Product> getProducts();
	
	// UPDATE
	public void updateProduct (Product product);
	
	// DELETE 
	public void removeProduct (Product product);
}
