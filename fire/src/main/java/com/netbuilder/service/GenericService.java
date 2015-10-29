package com.netbuilder.service;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;

public class GenericService {

	private int sessionID;
	private Object userSession;
	
	private HttpSession session;
	private ApplicationContext context;
	private AddressRepository addressRepository;
	private BasketRepository basketRepository;
	private CustomerRepository customerRepository; 
	private ProductRepository productRepository;
	
	public GenericService(HttpSession session, String sessionName){
		this.session=session;
		
		context = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
		addressRepository = context.getBean(AddressRepository.class);
		basketRepository = context.getBean(BasketRepository.class);	
		customerRepository = context.getBean(CustomerRepository.class);
		productRepository = context.getBean(ProductRepository.class);
		
		System.out.println(context);
		System.out.println(basketRepository);
		System.out.println(userSession);
		
		userSession = session.getAttribute(sessionName);
		
		System.out.println(userSession);
		
		if(isSession()){
		sessionID = customerRepository.findByCustomerUsername(userSession+"").getCustomerID();			
		}
		
		System.out.println(sessionID);
	}
	
	public boolean isSession(){
		if(userSession==null){
			return false;
		}
		else{
			return true;
		}
	}

	public Object getUserSession() {
		return userSession;
	}

	public void setUserSession(Object userSession) {
		this.userSession = userSession;
	}

	public int getSessionID() {
		return sessionID;
	}

	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}

	public AddressRepository getAddressRepository() {
		return addressRepository;
	}

	public void setAddressRepository(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	public BasketRepository getBasketRepository() {
		return basketRepository;
	}

	public void setBasketRepository(BasketRepository basketRepository) {
		this.basketRepository = basketRepository;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}
}
