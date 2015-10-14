package com.netbuilder.entityrepositories;

import org.springframework.data.repository.CrudRepository;
import com.netbuilder.entities.PurchaseOrder;
import java.util.List;

public interface PurchaseOrderRepository  extends CrudRepository<PurchaseOrder, Integer>{
	
	/**
	 * This method will return a single method given by a specific Purchase Order ID
	 * @param PurchaseOrderID 
	 * @return
	 * 
	 */
	
	public PurchaseOrder findByPurchaseOrderID(int PurchaseOrderID);
	
	
	/**
	 * This method will return a list of statuses for the Purchase Order
	 * @param PurchaseOrderStatus
	 * @return
	 */
	
	public List<PurchaseOrder> findByPurchaseOrderStatus(String PurchaseOrderStatus);
}
