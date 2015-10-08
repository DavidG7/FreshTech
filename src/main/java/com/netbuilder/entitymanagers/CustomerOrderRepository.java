package com.netbuilder.entitymanagers;
import java.util.ArrayList;
import java.util.Date;

import com.netbuilder.entities.*;

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
	public CustomerOrder findByCustomerOrderID(Integer customerOrderID);
	/**
	 *  Finds CustomerOrder by Address
	 * @param address
	 * @return CustomerOrder
	 */
	public ArrayList<CustomerOrder> findByAddress(String address);
	/**
	 * Finds CustomerOrder by Date
	 * @param dateofOrder
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByDate(Date dateofOrder);
	/**
	 * Find Customer Orders by Order Status
	 * @param status
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByOrderStatus(String status);
	/**
	 * Finds Customers Order by total of order
	 * @param total
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByTotal(float total);
	
	


}
