package com.netbuilder.entityrepositories;
import java.util.ArrayList;
import java.util.Date;

import com.netbuilder.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.repository.CrudRepository;

/**
 * CustomerOrderRepository 
 * @author Ricky Luu
 *
 */


public interface  CustomerOrderRepository extends  CrudRepository<CustomerOrder , Integer> {

	
	/**
	 * Finds Orders by Customer Order ID
	 * 
	 * @param customerOrderID
	 * @return CustomerOrder
	 */
	public CustomerOrder findByCustomerID(Integer customerID);
	/**
	 *  Finds CustomerOrder by Address
	 * @param address
	 * @return CustomerOrder
	 */
	public ArrayList<CustomerOrder> findByDeliveryAddress(String deliveryAddress);
	/**
	 * Finds CustomerOrder by Date
	 * @param dateofOrder
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByDateOfOrder(Date dateOfOrder);
	/**
	 * Find Customer Orders by Order Status
	 * @param status
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByCustomerOrderStatus(String customerOrderStatus);
	/**
	 * Finds Customers Order by total of order
	 * @param total
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByOrderTotal(float orderTotal);



}
