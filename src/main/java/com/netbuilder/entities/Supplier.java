package com.netbuilder.entities;

public class Supplier {
	
	private int supplierId;
	private String supplierName;
	private String email;
	private int phone;
	private String preferredContactMethod;
	
	public Supplier (int id, String name){
		this.supplierId = id;
		this.supplierName = name;
	}
	
	public void setId(int x){	supplierId = x;	}
	public int getId(){	return supplierId;	}
	
	public void setName(String x){	supplierName = x;	}
	public String getName(){	return supplierName;	}
	
	public void setEmail(String x){	email = x;	}
	public String getEmail(){	return email;	}
	
	public void setPhone(int x){	phone = x;	}
	public int getPhone(){	return phone;	}
	
	public void setPreferredContactMethod(String x){	preferredContactMethod = x;	}
	public String getPreferredContactMethod(){	return preferredContactMethod;	}
	
}
