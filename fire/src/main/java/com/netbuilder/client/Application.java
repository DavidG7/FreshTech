package com.netbuilder.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.netbuilder.entities.Address;
import com.netbuilder.entityrepositories.AddressRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private AddressRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//repository.deleteAll();

		// save a couple of customers
		//repository.save(new Customer("Alice", "Smith"));
		//repository.save(new Customer("Bob", "Smith"));
		
		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Address address : repository.findAll()) {
			System.out.println(address);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Address found with customer Id('1'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByCustomerID(1));

	}

}