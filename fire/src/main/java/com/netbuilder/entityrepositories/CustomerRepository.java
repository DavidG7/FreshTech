package com.netbuilder.entityrepositories;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Thomas Dudley
 *
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>
{
	
	
	
	/**
	 * This method returns a single Customer given by the specified Customer ID
	 * @param customerID
	 * @return
	 */
	public Customer findByCustomerID(int customerID);
	/**
	 * This method returns a list of all customers given by the specified phone number
	 * @param customerPhone;
	 * @return  
	 */
	public List<Customer> findByCustomerPhone(String customerPhone);
	
	/**
	 * This method returns a list of all customers given by the specified availableCredit
	 * @param availableCredit
	 * @return
	 */
	public List<Customer> findByCustomerAvailableCredit(float customerAvailableCredit);
	
	/**
	 * This method returns a list of all customers given by the specified name
	 * @param customerName
	 * @return
	 */
	public List<Customer> findByCustomerName(String customerName);
	
	/**
	 * This method returns a list of all customers given by the specified email address
	 * @param customerEmail
	 * @return   
	 */
	public Customer findByCustomerEmail(String customerEmail);
	
	/**
	 * This method returns a single customer given by the specified username
	 * @param customerUsername
	 * @return
	 */
	public Customer findByCustomerUsername(String customerUsername);
	
	/**
	 * This method returns a list of customers given by the specified address
	 * @param addressArray
	 * @return
	 */
	
	public List<Customer> findByAddressArray(Address addressArray);

}
