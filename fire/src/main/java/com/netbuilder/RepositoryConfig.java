package com.netbuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoOperations;

import com.netbuilder.data.DummyData;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerOrderLineRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.EmployeeRepository;
import com.netbuilder.entityrepositories.PaymentRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositories.ProductSupplierRepository;
import com.netbuilder.entityrepositories.PurchaseOrderLineRepository;
import com.netbuilder.entityrepositories.PurchaseOrderRepository;
import com.netbuilder.entityrepositories.SupplierRepository;
import com.netbuilder.entityrepositoriesimplementations.dummy.AddressRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.BasketRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.CustomerRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.EmployeeRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.PaymentRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.ProductRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.dummy.PurchaseOrderRepositoryDummy;
import com.netbuilder.entityrepositoriesimplementations.mongo.AddressRepositoryMongo;
import com.netbuilder.entityrepositoriesimplementations.mongo.BasketRepositoryMongo;
import com.netbuilder.entityrepositoriesimplementations.mongo.CustomerRepositoryMongo;
import com.netbuilder.entityrepositoriesimplementations.mongo.PaymentRepositoryMongo;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrespositoriesimplementations.sql.CustomerOrderLineSQL;
import com.netbuilder.entityrespositoriesimplementations.sql.CustomerOrderSQL;
import com.netbuilder.entityrespositoriesimplementations.sql.EmployeeRepositorySQL;
import com.netbuilder.entityrespositoriesimplementations.sql.OrderHistoryRepositorySQL;
import com.netbuilder.entityrespositoriesimplementations.sql.ProductSupplierRepositorySQL;
import com.netbuilder.entityrespositoriesimplementations.sql.PurchaseOrderLineSQL;
import com.netbuilder.entityrespositoriesimplementations.sql.PurchaseOrderSQL;
import com.netbuilder.entityrespositoriesimplementations.sql.SupplierSQL;
import com.netbuilder.util.SQLTemplate;

/**
 * This class implements the entity repositories with the relevant data.
 * Dummy data alternatives are included.
 * @author pnewman
 */

@Configuration
public class RepositoryConfig {
	
	@Autowired
	DummyData dummyData;
	
	@Autowired
	MongoOperations mongoOperation;
	
	@Autowired
	SQLTemplate sqlTemplate;
	
	//ADDRESS REPOSITORY
	/**
	 * This method implements the AddressRepository interface by injecting MONGO data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return AddressRepository
	 */	
	@Primary
	@Bean
	public AddressRepository addressRepositoryMongo(){
		AddressRepositoryMongo addressRepository = new AddressRepositoryMongo();
		addressRepository.setMongoOperation(mongoOperation);
		return addressRepository;
	}
	

	
	/**
	 * This method implements the AddressRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return AddressRepository
	 */	
	//@Primary
	@Bean
	public AddressRepository addressRepositoryDummy(){
		AddressRepositoryDummy addressRepository = new AddressRepositoryDummy();
		addressRepository.setDummyData(dummyData);
		return addressRepository;
	}

	//BASKET REPOSITORY
	/**
	 * This method implements the BasketRepository interface by injecting MONGO data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return BasketRepository
	 */	
	@Primary
	@Bean
	public BasketRepository basketRepositoryMongo(){
		BasketRepositoryMongo basketRepository = new BasketRepositoryMongo();
		basketRepository.setMongoOperation(mongoOperation);
		return basketRepository;
	}
	/**
	 * This method implements the BasketRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return BasketRepository
	 */	
	//@Primary
	@Bean
	public BasketRepository basketRepositoryDummy(){
		BasketRepositoryDummy basketRepository = new BasketRepositoryDummy();
		basketRepository.setDummyData(dummyData);
		return basketRepository;
	}
	
	//CUSTOMER REPOSITORY
	/**
	 * This method implements the CustomerRepository interface by injecting MONGO data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return CustomerRepository
	 */	
	@Primary
	@Bean
	public CustomerRepository customerRepositoryMongo(){
		CustomerRepositoryMongo customerRepository = new CustomerRepositoryMongo();
		customerRepository.setMongoOperation(mongoOperation);
		return customerRepository;
	}
	/**
	 * This method implements the CustomerRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return CustomerRepository
	 */	
	//@Primary
	@Bean
	public CustomerRepository customerRepositoryDummy(){
		CustomerRepositoryDummy customerRepository = new CustomerRepositoryDummy();
		customerRepository.setDummyData(dummyData);
		return customerRepository;
	}
	
	//CUSTOMER ORDER REPOSITORY
	/**
	 * This method implements the CustomerOrderRepository interface by injecting SQL data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return CustomerOrderRepository
	 */	
	@Primary
	@Bean
	public CustomerOrderRepository customerOrderRepositorySQL(){
		CustomerOrderSQL customerOrderRepository = new CustomerOrderSQL();
		customerOrderRepository.setSqltemplate(sqlTemplate);
		return customerOrderRepository;
	}
	
	@Primary
	@Bean
	public CustomerOrderLineRepository customerOrderLineRepositorySQL(){
		CustomerOrderLineSQL customerOrderLineRepository = new CustomerOrderLineSQL();
		customerOrderLineRepository.setSqltemplate(sqlTemplate);
		return customerOrderLineRepository;
	}
	
	//Primary
	@Bean
	public CustomerOrderRepository OrderHistoryRepositorySQL(){
		OrderHistoryRepositorySQL customerOrderRepository = new OrderHistoryRepositorySQL();
		customerOrderRepository.setSqltemplate(sqlTemplate);
		return customerOrderRepository;
	}


	//@Primary
	/*TODO Not implemented.
	@Bean
	public CustomerOrderRepository customerOrderRepositoryDummy(){
		CustomerOrderRepositoryDummy customerOrderRepository = new CustomerOrderRepositoryDummy();
		customerOrderRepository.setDummyData(dummyData);
		return customerOrderRepository;
	}
	*/
	
	//EMPLOYEE REPOSITORY
		/**
		 * This method implements the EmployeeRepository interface by injecting SQL data.
		 * Comment/Uncomment the @Primary annotation to choose implementation.
		 * @return EmployeeRepository
		 */	
		@Primary
		@Bean
		public EmployeeRepository employeeRepositoryMongo(){
			EmployeeRepositorySQL employeeRepository = new EmployeeRepositorySQL();
			employeeRepository.setSqltemplate(sqlTemplate);
			return employeeRepository;
		}
		/**
		 * This method implements the EmployeeRepository interface by injecting DUMMY data.
		 * Comment/Uncomment the @Primary annotation to choose implementation.
		 * @return EmployeeRepository
		 */	
		//@Primary
		@Bean
		public EmployeeRepository employeeRepositoryDummy(){
			EmployeeRepositoryDummy employeeRepository = new EmployeeRepositoryDummy();
			employeeRepository.setDummyData(dummyData);
			return employeeRepository;
		}

	//PAYMENT REPOSITORY
	/**
	 * This method implements the PaymentRepository interface by injecting MONGO data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return PaymentRepository
	 */	
	@Primary
	@Bean
	public PaymentRepository paymentRepositoryMongo(){
		PaymentRepositoryMongo paymentRepository = new PaymentRepositoryMongo();
		paymentRepository.setMongoOperation(mongoOperation);
		return paymentRepository;
	}
	/**
	 * This method implements the PaymentRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return PaymentRepository
	 */	
	//@Primary
	@Bean
	public PaymentRepository paymentRepositoryDummy(){
		PaymentRepositoryDummy paymentRepository = new PaymentRepositoryDummy();
		paymentRepository.setDummyData(dummyData);
		return paymentRepository;
	}

	//PRODUCT REPOSITORY
	/**
	 * This method implements the ProductRepository interface by injecting MONGO data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return ProductRepository
	 */	
	@Primary
	@Bean
	public ProductRepository productRepositoryMongo(){
		ProductRepositoryMongo productRepository = new ProductRepositoryMongo();
		productRepository.setMongoOperation(mongoOperation);
		return productRepository;
	}
	/**
	 * This method implements the ProductRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return ProductRepository
	 */	
	//@Primary
	@Bean
	public ProductRepository productRepositoryDummy(){
		ProductRepositoryDummy productRepository = new ProductRepositoryDummy();
		productRepository.setDummyData(dummyData);
		return productRepository;
	}
	
	//PURCHASE ORDER LINE REPOSITORY
	/**
	 * This method implements the PurchaseOrderLineRepository interface by injecting SQL data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return PurchaseOrderLineRepository
	 */	
	@Primary
	@Bean
	public PurchaseOrderLineRepository purchaseOrderLineSQL(){
		PurchaseOrderLineSQL purchaseOrderLineRepository = new PurchaseOrderLineSQL();
		purchaseOrderLineRepository.setSqltemplate(sqlTemplate);
		return purchaseOrderLineRepository;
	}
	/**
	 * This method implements the PurchaseOrderLineRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return PurchaseOrderLineRepository
	 */	
	//@Primary
	/*TODO Not implemented.
	@Bean
	public PurchaseOrderLineRepository purchaseOrderLineRepositoryDummy(){
		PurchaseOrderLineRepositoryDummy purchaseOrderLineRepository = new PurchaseOrderLineRepositoryDummy();
		purchaseOrderLineRepository.setDummyData(dummyData);
		return purchaseOrderLineRepository;
	}
	*/
	
	//PURCHASE ORDER REPOSITORY
	/**
	 * This method implements the PurchaseOrderRepository interface by injecting SQL data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return PurchaseOrderRepository
	 */	
	@Primary
	@Bean
	public PurchaseOrderRepository purchaseOrderSQL(){
		PurchaseOrderSQL purchaseOrderRepository = new PurchaseOrderSQL();
		purchaseOrderRepository.setSqltemplate(sqlTemplate);
		return purchaseOrderRepository;
	}
	/**
	 * This method implements the PurchaseOrderRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return PurchaseOrderRepository
	 */	
	//@Primary
	@Bean
	public PurchaseOrderRepository purchaseOrderRepositoryDummy(){
		PurchaseOrderRepositoryDummy purchaseOrderRepository = new PurchaseOrderRepositoryDummy();
		purchaseOrderRepository.setDummyData(dummyData);
		return purchaseOrderRepository;
	}
	
	//SUPPLIER REPOSITORY
	/**
	 * This method implements the SupplierRepository interface by injecting SQL data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return SupplierRepository
	 */	
	@Primary
	@Bean
	public SupplierRepository supplierSQL(){
		SupplierSQL supplierRepository = new SupplierSQL();
		supplierRepository.setSqltemplate(sqlTemplate);
		return supplierRepository;
	}
	/**
	 * This method implements the SupplierRepository interface by injecting DUMMY data.
	 * Comment/Uncomment the @Primary annotation to choose implementation.
	 * @return SupplierRepository
	 */	
	//@Primary
	/**@Bean
	public SupplierRepository purchaseOrderLineRepositoryDummy(){
		SupplierRepositoryDummy supplierRepository = new SupplierRepositoryDummy();
		supplierRepository.setDummyData(dummyData);
		return supplierRepository;
	}
	**/
	@Primary
	@Bean
	public ProductSupplierRepository productsupplierSQL(){
		ProductSupplierRepositorySQL supplierRepository = new ProductSupplierRepositorySQL();
		supplierRepository.setSqltemplate(sqlTemplate);
		return supplierRepository;
	}
	
	
	
}
