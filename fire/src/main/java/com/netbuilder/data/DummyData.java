package com.netbuilder.data;

import java.util.ArrayList;
import java.util.Date;

import javax.ejb.Singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netbuilder.entities.*;
import com.netbuilder.util.ContactMethod;

/**
 * @author dgordon
 * @author pnewman
 */

@Singleton
public class DummyData {
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private ArrayList<Payment> payments = new ArrayList<Payment>();
	private ArrayList<Address> addresses = new ArrayList<Address>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<CustomerOrder> customerOrders = new ArrayList<CustomerOrder>();
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
	private ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
	
	/**
	 * This constructor instantiates dummy data for all entities.
	 */
	public DummyData() {
		employees.add(new Employee(1,"Ben Back", "BennyBack7","spikelife7", 1));
		employees.add(new Employee(2,"Ray Smithy", "ArrogantManNum1", "sellsomeshit", 1));
		
		payments.add(new Payment(1,12341234,"10-00-01"));
		payments.add(new Payment(2,43214321,"20-00-02"));
		
		addresses.add(new Address(1, "Address", "A10",1));
		addresses.add(new Address(2, "Address2", "B10",1));
		
		customers.add(new Customer(1, "phoneTest1", (float)11.11, "name1", "email1", "user1", "pass1"));
		customers.add(new Customer(2, "phoneTest2", (float)22.22, "name2", "email2", "user2", "pass2"));
		customers.add(new Customer(3, "phoneTest3", (float)33.33, "name3", "email3", "user3", "pass3","contact1"));
		customers.add(new Customer(4, "phoneTest4", (float)44.44, "name4", "email4", "user4", "pass4", "contact2"));
		
		customerOrders.add(new CustomerOrder(1,1, "22/1", "status1", 1));
		customerOrders.add(new CustomerOrder(2,1, "11/5", "status2", 2));
		
		products.add(new Product(1,1,(float)33.33, "gnome", "badGnome", false, false, 3, "description3", "placeholder.png",true,(float)22.22));
		products.add(new Product(2,2,(float)44.44, "gnome", "littleFriend", true, true, 4, "description4", "placeholder.png",true, (float)11.11));
		products.add(new Product(3,3,(float)33.33, "gnome", "other", true, false, 3, "description3", "placeholder.jpg"));
		products.add(new Product(4,4,(float)44.44, "gnome", "savage", true, true, 4, "description4", "placeholder.jpg"));
		
		purchaseOrders.add(new PurchaseOrder(1,"status1"));
		purchaseOrders.add(new PurchaseOrder(2,"status2"));
		
		suppliers.add(new Supplier(1,"name1"));
		suppliers.add(new Supplier(2,"name2"));
		suppliers.add(new Supplier(3,"name3", "email3", "phone3", ContactMethod.NONE));
		suppliers.add(new Supplier(4,"name4", "email4", "phone4", ContactMethod.NONE));
	}

	/**
	 * * * * * * * * Usage: READ * * * * * * * *
	 * This is a generic get method. 
	 * If an array of the passed in entity exists it will return it.
	 * If no array of the passed in entity exists it will return an empty array.
	 * As we add entities we will need to add if statements for each one.
	 * 
	 * Example usage:
	 * 
	 * ArrayList<Employee> employeeList = getEntityList(new Employee())		//call current employee list
	 * for(Employee employee : employeeList){								//iterate through the list
	 * 		System.out.println(product.getEmployeeName());						//and print all the employee names
	 * }
	 * 
	 * Console:
	 * >Ben Back
	 * >Ray Smithy
	 * 
	 * @param entityType
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <E> ArrayList<E> getEntityList(E entityType) {
		if (entityType.getClass() == employees.get(0).getClass()){
			return (ArrayList<E>) employees;
		}
		if (entityType.getClass() == payments.get(0).getClass()){	
			return (ArrayList<E>) payments;
		}
		if (entityType.getClass() == addresses.get(0).getClass()){	
			return (ArrayList<E>) addresses;
		}
		if (entityType.getClass() == customers.get(0).getClass()){
			return (ArrayList<E>) customers;	
		}
		if (entityType.getClass() == customerOrders.get(0).getClass()){
			return (ArrayList<E>) customerOrders;
		}
		if (entityType.getClass() == products.get(0).getClass()){	
			return (ArrayList<E>) products;
		}
		if (entityType.getClass() == purchaseOrders.get(0).getClass()){	
			return (ArrayList<E>) purchaseOrders;
		}
		if (entityType.getClass() == suppliers.get(0).getClass()){	
			return (ArrayList<E>) suppliers;
		}
		return new ArrayList<E>();
	}

	/**
	 * * * * * * * * Usage: CREATE, UPDATE, DELETE * * * * * * * *
	 * This is a generic set method. 
	 * If an array of the same type as the passed in array exists it will replace the stored array.
	 * If no array of the same type exists then nothing will happen.
	 * As we add entities we will need to add if statements for each one.
	 * 
	 * Example usage (UPDATE):
	 * 
	 * ArrayList employeeList = getEntityList(new Employee());      //call current employee list
	 * employeeList.add(Employee("John Mann", "JonhhyM", "john23", 3));   //add a new entry for John Mann
	 * setEntityList(employeeList);                                 //set the new list to be the employee list
	 * 
	 * @param entities
	 */
	@SuppressWarnings("unchecked")
	public <E> void setEntityList(ArrayList<E> entities) {
		if(entities.get(0).getClass() == employees.get(0).getClass()){
			employees = (ArrayList<Employee>) entities;
		}
		if(entities.get(0).getClass() == payments.get(0).getClass()){
			payments = (ArrayList<Payment>) entities;
		}
		if(entities.get(0).getClass() == addresses.get(0).getClass()){
			addresses = (ArrayList<Address>) entities;
		}
		if(entities.get(0).getClass() == customers.get(0).getClass()){
			customers = (ArrayList<Customer>) entities;
		}
		if(entities.get(0).getClass() == customerOrders.get(0).getClass()){
			customerOrders = (ArrayList<CustomerOrder>) entities;
		}
		if(entities.get(0).getClass() == products.get(0).getClass()){
			products = (ArrayList<Product>) entities;
		}
		if(entities.get(0).getClass() == purchaseOrders.get(0).getClass()){
			purchaseOrders = (ArrayList<PurchaseOrder>) entities;
		}
		if(entities.get(0).getClass() == suppliers.get(0).getClass()){
			suppliers = (ArrayList<Supplier>) entities;
		}
	}
	
	/*
	@SuppressWarnings("unchecked")
	public <T>ArrayList<T> getEntitiyList(String entityName){
		if(entityName.equalsIgnoreCase("employees")){
			return (ArrayList<T>) employees;
		}
		if(entityName.equalsIgnoreCase("payment")){
			return (ArrayList<T>) payments;
		}
		if(entityName.equalsIgnoreCase("address")){
			return (ArrayList<T>) addresses;
		}
		if(entityName.equalsIgnoreCase("customer")){
			return (ArrayList<T>) customers;
		}
		if(entityName.equalsIgnoreCase("customerOrder")){
			return (ArrayList<T>) customerOrders;
		}
		if(entityName.equalsIgnoreCase("product")){
			return (ArrayList<T>) products;
		}
		if(entityName.equalsIgnoreCase("purchaseOrder")){
			return (ArrayList<T>) purchaseOrders;
		}
		if(entityName.equalsIgnoreCase("supplier")){
			return (ArrayList<T>) suppliers;
		}
		return  new ArrayList<T>();
	}
	*/
}