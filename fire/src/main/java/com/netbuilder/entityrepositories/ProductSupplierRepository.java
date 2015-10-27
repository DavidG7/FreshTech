package com.netbuilder.entityrepositories;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.ProductSupplier;
public interface ProductSupplierRepository extends CrudRepository <ProductSupplier, Integer> {

	public ArrayList<ProductSupplier> findByProductID(Integer productID);
	/**
	 * Finds <ProductSupplier> BY ProductID
	 * @param productID
	 * @return ArrayList<ProductSupplier>
	 */

	public ArrayList<ProductSupplier> findBySupplierID(Integer supplierID);
	/**
	 * Finds <ProductSupplier> BY SupplierID
	 * @param SUPPLIERID
	 * @return ArrayList<ProductSupplier>
	 */
	public ArrayList<ProductSupplier> findByPrice(float price);
	/**
	 * Finds productsupplier by price
	 * @param price
	 * @return ArrayList<ProductSupplier>
	 */
	
}
