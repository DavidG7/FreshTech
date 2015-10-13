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
		private String purchaseOrderStatus;
		
		/**
		 * 
		 * @param purchaseOrderID
		 * @param purchaseOrderStatus
		 */
		public PurchaseOrder (int purchaseOrderID, String purchaseOrderStatus) {
			this.purchaseOrderID = purchaseOrderID;
			this.purchaseOrderStatus = purchaseOrderStatus;
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