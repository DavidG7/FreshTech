package com.netbuilder.entityrepositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netbuilder.entities.Product;

/**
 * @author ??
 *
 */
public interface ProductRepository extends MongoRepository<Product,Integer>{

	
	/**This method returns the product corresponding to the specified product ID.
	 * @param productID
	 * @return
	 */
	public Product findByProductID(int productID);
	
	
	/**This method returns the product with the specified product name.
	 * @param productName
	 * @return
	 */
	public Product findByProductName(String productName);
	
	
	/**This method returns a list of all products within the specified price range.
	 * @param price
	 * @return
	 */
	public List<Product> findByPrice(float price);
	
	
	/**This method returns a list of all products within the specified category.
	 * @param category
	 * @return
	 */
	public List<Product> findByCategory(String category);
	
	
	/**This method returns a list of all products ordered by their rating.
	 * @param rating
	 * @return
	 */
	public List<Product> findByRating(int rating);
	
	/**
	 * This method returns a list of all products that are discontinued or of all products that are not.
	 * @author pnewman
	 * @param isDiscontinued
	 * @return
	 */
	public List<Product> findByDiscontinued(boolean isDiscontinued);
	
	/**
	 * This method returns a list of all products that are on offer or of all products that are not.
	 * @author pnewman
	 * @param isDiscontinued
	 * @return
	 */
	public List<Product> findByOnOffer(boolean isOnOffer);

}
