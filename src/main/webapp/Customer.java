package main.webapp;


public class Customer {
	private int customerOrderID ;
	private int dataOfOrder;
	private int customerOrderStatus;
	private String deliveryAddress;
	
	public void updateCustomerOrder(){}
	
	public void  viewCustomerOrder(){}

	public int getDataOfOrder() {
		return dataOfOrder;
	}

	public void setDataOfOrder(int dataOfOrder) {
		this.dataOfOrder = dataOfOrder;
	}

	public int getCustomerOrderID() {
		return customerOrderID;
	}

	public void setCustomerOrderID(int customerOrderID) {
		this.customerOrderID = customerOrderID;
	}

	public int getCustomerOrderStatus() {
		return customerOrderStatus;
	}

	public void setCustomerOrderStatus(int customerOrderStatus) {
		this.customerOrderStatus = customerOrderStatus;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
}
