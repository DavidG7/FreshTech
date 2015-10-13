/*package com.netbuilder.entityrepositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netbuilder.entities.Address;
import com.netbuilder.entities.Payment;


public interface AddressRepository extends MongoRepository<Address,Integer> {
	*//**
	 * This method returns a single address method given by the specified address ID.
	 * @param addressid
	 * @return
	 *//*
	public Address findByAddressid(int addressid);
	*//**
	 * This method returns a list of all customerids with the specified customer ID.
	 * @param customerID
	 * @return
	 *//*
	public List<Address> findByCustomerID(int customerID);
	
	*//**
	 * This method returns a single address method given by the specified address.
	 * @param address
	 * @return
	 *//*
	public List<Address> findbyAddress(String address);
	
	*//**
	 * This method returns a list of all address methods with the specified sort code.
	 * @param postcode
	 * @return
	 *//*
	public List<Address> findBypostcode(String postcode);	
	
	
	
}
*/