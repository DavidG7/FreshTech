package com.netbuilder.entities;

public class Supplier {
	
	private int supplierId;
	private String supplierName;
	private String email = "";
	private int phone = 0;
	private String preferredContactMethod = "";
	
	/**
	 * -------------------------------------------------------------------------------------------------------------------------------------
	 * Supplier:
	 * -------------------------------------------------------------------------------------------------------------------------------------
	 * Supplier can be Constructor using one of two constructors:
	 * 		Supplier(int id, String name) creates a Supplier with a non-null supplierId and supplierName
	 * 		Supplier(int id, String name, String email, int phone, String pref) creates a fully instantiated Supplier, where pref 
	 *                                                                          is the preferredContactMethod of the Supplier
	 *		
	 * 		Supplier contains no methods besides getters and setters.
	 * 
	 * 		NOTE: preferredContactMethod could potentially be better as an Enum but with such few states its even possible to use a Boolean.
	 * 			  Currently a String is being used with either the value "Phone" or "Email"
	 * -------------------------------------------------------------------------------------------------------------------------------------
	 */
	
	public Supplier (int id, String name){
		this.supplierId = id;
		this.supplierName = name;
	}
	
	public Supplier (int id, String name, String email, int phone, String pref){
		this.supplierId = id;
		this.supplierName = name;
		this.email = email;
		this.phone = phone;
		this.preferredContactMethod = pref;
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
