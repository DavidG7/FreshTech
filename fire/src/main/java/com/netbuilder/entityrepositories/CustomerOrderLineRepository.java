package com.netbuilder.entityrepositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.netbuilder.entities.CustomerOrderLine;

public interface CustomerOrderLineRepository extends CrudRepository<CustomerOrderLine, Integer>
{
	public CustomerOrderLine findByCustomerOrderLineID(Integer customerOrderLineID);
	
	public List<CustomerOrderLine> findByProductID(Integer productID);

}
