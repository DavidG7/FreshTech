package com.netbuilder.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author vtomlinson
 *
 */
/**/
@Entity
public class PurchaseOrder {
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private int purchaseOrderID;
		private int supplierID;
		private int employeeID;
		private String purchaseDateOrder;
		private String purchaseOrderStatus;
		
		public PurchaseOrder()
		{
			
		}
		
		/**
		 * 
		 * @param purchaseOrderID
		 * @param purchaseOrderStatus
		 */
		public PurchaseOrder (int purchaseOrderID, int supplierID, int employeeID,
				String purchaseDateOrder, String purchaseOrderStatus) 
		{
			this.purchaseOrderID = purchaseOrderID;
			this.supplierID = supplierID;
			this.employeeID = employeeID;
			this.purchaseDateOrder = purchaseDateOrder;
			this.purchaseOrderStatus = purchaseOrderStatus;
		}
		
		public int getSupplierID() {
			return supplierID;
		}

		public void setSupplierID(int supplierID) {
			this.supplierID = supplierID;
		}

		public int getEmployeeID() {
			return employeeID;
		}

		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}

		public String getPurchaseDateOrder() {
			return purchaseDateOrder;
		}

		public void setPurchaseDateOrder(String purchaseDateOrder) {
			this.purchaseDateOrder = purchaseDateOrder;
		}

		public int getPurchaseOrderID() {
		return purchaseOrderID;
		}

		public void setPurchaseOrderID(int purchaseOrderID) {
			this.purchaseOrderID = purchaseOrderID;
		}

		public String getPurchaseOrderStatus() {
			return purchaseOrderStatus;
		}

		public void setPurchaseOrderStatus(String purchaseOrderStatus) {
			this.purchaseOrderStatus = purchaseOrderStatus;
		}
		
		public void updatePurchaseOrder(int purchaseOrderID, String purchaseOrderStatus){
			setPurchaseOrderID(purchaseOrderID);
			setPurchaseOrderStatus(purchaseOrderStatus);
		}
		
		/**
		 * Depreciated in favour of overridden toString method
		 */
		@Deprecated
		public void viewPurchaseOrder(){
			System.out.println("Purchase Order ID: "+purchaseOrderID+" Purchase Order Status: "+purchaseOrderStatus+"");					
		}
		
		@Deprecated
		public void purchaseOrderProcessed(){
			//TODO method stub
		}
		
		@Override
		public String toString() {
			return "Purchase Order ID: "+purchaseOrderID+" Purchase Order Status: "+purchaseOrderStatus+"";
		}
}