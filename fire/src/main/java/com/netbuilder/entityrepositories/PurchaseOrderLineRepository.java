package com.netbuilder.entityrepositories;

import org.springframework.data.repository.CrudRepository;
import com.netbuilder.entities.PurchaseOrderLine;
import java.util.List;

public interface PurchaseOrderLineRepository extends CrudRepository<PurchaseOrderLine, Integer>
{
	public PurchaseOrderLine findByPurchaseOrderLineID(int purchaseOrderLineID);
	
	public List<PurchaseOrderLine> findByProductID(int productID);

}
