package com.netbuilder.controller;

/**
 *  @author jham
 *  @author rluu
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.CustomerOrderLine;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrepositories.CustomerOrderLineRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.OrderHistoryRepositorySQL;

@Controller
public class OrderHistoryController {

	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(
			DataConfig.class, RepositoryConfig.class);
	CustomerRepository customerRepository = mongoContext
			.getBean(CustomerRepository.class);
	CustomerOrderRepository customerOrderRepository = mongoContext
			.getBean(CustomerOrderRepository.class);
	CustomerOrderLineRepository customerOrderLineRepository = mongoContext
			.getBean(CustomerOrderLineRepository.class);
	ProductRepository productRepository = mongoContext
			.getBean(ProductRepository.class);

	/*
	 * @RequestMapping("OrderHistory") public String OrderHistory (){
	 * orderHistoryRepository.findAll(); return "OrderHistory";
	 * 
	 * }/*
	 * 
	 * @RequestMapping("OrderHistory") public String OrderHistory (){
	 * orderHistoryRepository.count(); return "OrderHistory";
	 * 
	 * }
	 * 
	 * @RequestMapping("OrderHistory") public String OrderHistory (){
	 * orderHistoryRepository.findByOrderID(5); return "OrderHistory";
	 * 
	 * }
	 * 
	 * @RequestMapping("OrderHistory") public String OrderHistory (){
	 * orderHistoryRepository.findByCustomerID(5); return "OrderHistory";
	 * 
	 * }
	 * 
	 * @RequestMapping("OrderHistory") public String OrderHistory (){
	 * orderHistoryRepository.findByDeliveryAddress(5); return "OrderHistory"; }
	 * 
	 * 
	 * 
	 * @RequestMapping("OrderHistory") public String OrderHistory (){
	 * orderHistoryRepository.findByCustomerOrderStatus("Processing"); return
	 * "OrderHistory"; }
	 * 
	 * @RequestMapping("OrderHistory") public String OrderHistory (){
	 * orderHistoryRepository.findByDateOfOrder("2015-10-10"); return
	 * "OrderHistory"; }
	 * 
	 * @RequestMapping("OrderHistory") public String OrderHistory (){
	 * orderHistoryRepository.findByOrderTotal(0); return "OrderHistory"; }
	 */

	@RequestMapping("OrderHistory")
	public ModelAndView OrderHistory(ModelAndView view, HttpSession session) {
		String user = session.getAttribute("sessionUser") + "";
		if (user.equalsIgnoreCase("null")) {
			view.setViewName("Register");
		} else {
			Customer customer = customerRepository.findByCustomerUsername(user);
			List<CustomerOrder> orders = customerOrderRepository
					.findByCustomerID(customer.getCustomerID());
			List<CustomerOrderLine> orderLines = (List<CustomerOrderLine>) customerOrderLineRepository
					.findAll();
			List<Product> allProducts = productRepository.findAll();
			ArrayList<ProductData> customerProducts = new ArrayList<ProductData>();
			for (int i =0; i<orders.size(); i++) {
				int orderID = orders.get(i).getOrderID();
				System.out.println("Order ids "+orderID);
				for (CustomerOrderLine line : orderLines) {
					if (line.getCustomerOrderLineID() == orderID) {
						System.out.println("true order id");
						for (int j=0;  j<allProducts.size(); j++) {
							if (allProducts.get(j).getProductId() == line.getProductID()) {
								System.out.println("true product");
								customerProducts.add(new ProductData(orderID,allProducts.get(i)));
							}	
						}
					}
				}
			}
			view.setViewName("OrderHistory");
			view.addObject("products", customerProducts);
			view.addObject("customerOrders", orders);
		}
		return view;

	}
}
class ProductData {
		private int id;
		private Product product= null;
		public ProductData(int id, Product product){
			this.setId(id);
			this.setProduct(product);
		}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
}
