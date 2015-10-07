package com.netbuilder.entities;

/**
 * 
 * @author vtomlinson
 *
 */


public class PurchaseOrder {
	
		private int purchaseOrderID;
		private String purchaseOrderStatus;
		
		/**
		 * 
		 * @param purchaseOrderID
		 * @param purchaseOrderStatus
		 */
		
		public PurchaseOrder (int purchaseOrderID, String purchaseOrderStatus){
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
		
		public void updatePurchaseOrder(){
			//TODO method stub
		}
		
		public void viewPurchaseOrder(){
			//TODO method stub
		}
		
		public void purchaseOrderProcessed(){
			//TODO method stub
		}
		
		

}
