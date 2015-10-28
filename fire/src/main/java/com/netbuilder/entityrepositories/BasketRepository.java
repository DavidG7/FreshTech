package com.netbuilder.entityrepositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netbuilder.entities.Basket;
import com.netbuilder.entities.Product;

public interface BasketRepository extends MongoRepository<Basket, Integer> 
{
	/**
	 * This method returns a single Customer given by the specified Customer ID
	 * @param customerID
	 * @return Customer
	 */
	public List<Basket> findByCustomerID(int customerID);
	
	public Basket findByBasketID(int basketID);
}
