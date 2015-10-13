package com.netbuilder.entities;

import java.io.Serializable;

import javax.persistence.Id;

/**
 * 
 * @author sraspin
 *
 */
public class Product implements Serializable  {
	private static final long serialVersionUID = -7337349035516644812L;
	private boolean discontinued = false;
	private boolean porusware = false;
	@Id
	private int productID = 0;
	private int stockLevel = 0;
	private int rating = 0;
	private float price = 0F;
	private String category = null;
	private String productDescription = null;
	private String image = null;
	private String productName = null;
	
	/**
	 * The Product class contains 2 constructors.
	 * Product(productId, stockLevel, price, category, productName) only requires the essential attributes to be a product.
	 * Product(discontinued, porusware, productId, stockLevel, rating, price, category, productDescription, image, productName) requires all attributes associated with a product.
	 * 
	 * There are 2 methods in this class (excluding getters and setters). One which prints out the list of all products
	 * and the other which sends out an alert when the stock level of a product increases.
	 *
	 */
	public Product() { }
	
	public Product(int productID, int stock_level, float the_price, String product_category, String product_name){
		this.productName = product_name;
		this.productID = productID;
		this.stockLevel = stock_level;
		this.category = product_category;
		this.price = the_price;
	}
	
	public Product(int productID, int stock_level, float the_price, String product_category, String product_name, boolean discontinue, boolean porousware, int product_rating, String product_description, String picture){
		this.discontinued = discontinue;
		this.porusware = porousware;
		this.productID = productID;
		this.stockLevel = stock_level;
		this.rating = product_rating;
		this.price = the_price;
		this.category = product_category;
		this.productDescription = product_description;
		this.image = picture;
		this.productName = product_name;
	}
	
	public void setDiscontinued(boolean value){
		this.discontinued = value;
	}
	public boolean getDiscontinued(){
		return this.discontinued;
	}

	public void setPorusware(boolean value){
		this.porusware = value;
	}
	public boolean getPorusware(){
		return this.porusware;
	}
	
	public void setProductId(int value){
		this.productID = value;
	}
	public int getProductId(){
		return this.productID;
	}
	
	public void setStockLevel(int value){
		this.stockLevel = value;
	}
	public int getStockLevel(){
		return this.stockLevel;
	}
	
	public void setRating(int value){
		this.rating = value;
	}
	public int getRating(){
		return this.rating;
	}
	
	public void setPrice(float value){
		this.price = value;
	}
	public float getPrice(){
		return this.price;
	}
	
	public void setCategory(String value){
		this.category = value;
	}
	public String getCategory(){
		return this.category;
	}
	
	public void setProductDescription(String value){
		this.productDescription = value;
	}
	public String getProductDescription(){
		return this.productDescription;
	}
	
	public void setImage(String value){
		this.image = value;
	}
	public String getImage(){
		return this.image;
	}
	
	public void setProductName(String value){
		this.productName = value;
	}
	public String getProductName(){
		return this.productName;
	}
	
	/**
	 * 
	 */
	@Deprecated
	public void viewProductList(){
		// TODO
		/*connect to database
		 * String[] prodList = new String[#products]
		 * 
		 * while(ResultSet.next()){
		 * 		for(int i = 0; i < #products; i++){
		 * 			prodList[i] = ResultSet.nextLine();
		 * 		}
		 * }
		 * System.out.println(prodList);
		 */ 
	}
	
	@Deprecated
	public void alertStockIncrease(){
		// TODO
		/*connect to database
		 *setStockLevel(stockLevel + newDeliveryLevel)
		 * System.out.println(Product + " stock level is: " + stockLevel);
		 */
	}
}