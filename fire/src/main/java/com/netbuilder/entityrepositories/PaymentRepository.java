package com.netbuilder.entityrepositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netbuilder.entities.Payment;

/**
 * 
 * @author pnewman
 *
 * This class provides a template for persisting Payment information.
 * Has both live and @Alternative offline implementation. 
 */
public interface PaymentRepository extends MongoRepository<Payment,String>{

	/**
	 * This method returns a single payment method given by the specified payment ID.
	 * @param paymentID
	 * @return
	 */
	public Payment findByPaymentID(int paymentID);
	
	/**
	 * This method returns a list of all payment methods with the specified customer ID.
	 * @param customerID
	 * @return
	 */
	public List<Payment> findByCustomerID(int customerID);
	
	/**
	 * This method returns a single payment method given by the specified card number.
	 * @param cardNumber
	 * @return
	 */
	public Payment findByCardNumber(int cardNumber);
	
	/**
	 * This method returns a list of all payment methods with the specified sort code.
	 * @param sortCode
	 * @return
	 */
	public List<Payment> findBySortCode(String sortCode);	
}