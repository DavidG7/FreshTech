package com.netbuilder.entityrepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netbuilder.entities.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address,Integer> {
	/**
	 * This method returns a single address method given by the specified address ID.
	 * @param addressid
	 * @return
	 * 
	 */

	public Address findByAddressID(int addressID);
	/**
	 * This method returns a list of all customerids with the specified customer ID.
	 * @param customerID
	 * @return
	 */
	public List<Address> findByCustomerId(int customerId);
	
	/**
	 * This method returns a single address method given by the specified address.
	 * @param address
	 * @return
	 */
	public List<Address> findByAddress(String address);
	
	/**
	 * This method returns a list of all address methods with the specified sort code.
	 * @param postcode
	 * @return
	 */
	public List<Address> findByPostcode(String postcode);	

}
