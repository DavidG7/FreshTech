package com.netbuilder.entityrepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netbuilder.entities.Basket;

public interface BasketRepository extends MongoRepository<Basket, Integer> 
{
	/**
	 * This method returns a single Customer given by the specified Customer ID
	 * @param customerID
	 * @return Customer
	 */
	public Basket findByCustomerID(int customerID);
}
