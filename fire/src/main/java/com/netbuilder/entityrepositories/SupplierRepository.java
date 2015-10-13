package com.netbuilder.entityrepositories;

import org.springframework.data.repository.CrudRepository;

import com.netbuilder.entities.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Integer>{

	/**
	 * This method returns a single Supplier given by the specified Supplier ID.
	 * @param supplierId
	 * @return
	 */
	public Supplier findBySupplierId(int supplierId);
	
	/**
	 * This method returns a single Supplier with the specified Supplier Name.
	 * @param name
	 * @return
	 */
	public Supplier findBySupplierName(String name);
	/**
	 * This method returns a single Supplier the specified Email address.
	 * @param email
	 * @return
	 */
	public Supplier findBySupplierEmail(String email);
	/**
	 * This method returns a single Supplier with the specified Supplier Phone Number (String).
	 * @param phone
	 * @return
	 */
	public Supplier findBySupplierPhone(String phone);
	
}