package com.netbuilder.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.entities.Address;
import com.netbuilder.entities.Basket;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.CustomerOrderLine;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerOrderLineRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.CustomerOrderLineSQL;

public class BasketService extends GenericService{

	public BasketService(HttpSession session, String sessionName) {
		super(session, sessionName);
		// TODO Auto-generated constructor stub
	}

	public ModelAndView modelBaskets(ModelAndView modelAndView){
		if(!isSession()){
			modelAndView.setViewName("Register");
		}
		else{
			List<Basket> baskets = this.getBasketRepository().findByCustomerID(this.getSessionID());
			List<Address> addresses = this.getAddressRepository().findByCustomerId(this.getSessionID());
			System.out.println(addresses);
			modelAndView.addObject("addresses", addresses);
			modelAndView.addObject("basket", baskets);
			modelAndView.setViewName("Basket");
		}
		return modelAndView;
	}
	
	public String removeBaskets(HttpServletRequest request){
		String basketID = request.getParameter("remove");
		Basket basket = this.getBasketRepository().findByBasketID(Integer.parseInt(basketID));
		System.out.println(basket);
		this.getBasketRepository().delete(basket.getBasketID());
		return "redirect:/Basket";
	}
	
	public String saveBaskets(HttpServletRequest request){
		String basketID = request.getParameter("save");
		Basket basket = this.getBasketRepository().findByBasketID(Integer.parseInt(basketID));

		basket.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		
		this.getBasketRepository().delete(basket.getBasketID());
		this.getBasketRepository().insert(basket);
		
		return "redirect:/Basket";
	}
	
	public void submitOrder(HttpServletRequest request){	
		List<Basket> baskets = this.getBasketRepository().findByCustomerID(this.getSessionID());
		List<Address> addresses = this.getAddressRepository().findByCustomerId(this.getSessionID());
		List<CustomerOrderLine> customerOrderLines = new ArrayList<CustomerOrderLine>();
		String address=null;
		
		System.out.println(request.getParameter("53 Key Crescent"));
		
		for(int i=0; i<addresses.size(); i++){
			System.out.println("Search: "+addresses.get(i).getAddress());
				address = request.getParameter(addresses.get(i).getAddress()+"");
				System.out.println("Loop address: "+address);
		}
		System.out.println("Over here!: "+address);
		
		//int addressID = this.getAddressRepository().findByAddress(address).get(0).getAddressid();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar calendar = Calendar.getInstance();
		String date = dateFormat.format(calendar.getTime());
		
		System.out.println(date);
		
		int totalCost=0;
		for(Basket basket:baskets){
			CustomerOrderLine customerOrderLine = new CustomerOrderLine((int)getCustomerOrderRepository().count(),basket.getProduct().getProductId(), basket.getQuantity());
			
			if(basket.getProduct().isOnOffer()==false){
				totalCost += basket.getQuantity()*basket.getProduct().getPrice();
			}
			else{
				totalCost += basket.getQuantity()*basket.getProduct().getOfferPrice();
			}
			
			System.out.println(customerOrderLine.getProductID()+" and "+customerOrderLine.getQuantity());
			
			customerOrderLines.add(customerOrderLine);
			
			System.out.println("List: "+customerOrderLines);
		}
		

		CustomerOrder customerOrder = new CustomerOrder((int)getCustomerOrderRepository().count(),this.getSessionID(), date, totalCost, "Processing", 1);
		System.out.println(customerOrder);
		
		System.out.println(getCustomerOrderRepository().save(customerOrder));
		
		for(CustomerOrderLine customerOrderLine:customerOrderLines){
			System.out.println(customerOrderLine.getCustomerOrderLineID()+" "+customerOrderLine.getProductID()+" "+customerOrderLine.getQuantity());
			System.out.println(getCustomerOrderLineRepository().save(customerOrderLine));
		}
	}
	
}