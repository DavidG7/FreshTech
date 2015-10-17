package com.netbuilder.manager;

import java.util.ArrayList;
import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Product;

public class LandingManager {
	
	public ArrayList<Product> discontinuedProducts = new ArrayList<Product>();
	
	DummyData dummyData = new DummyData();
	
	public LandingManager(){
		
		for (Product product : dummyData.getEntityList(new Product())){
			
			if (product.getDiscontinued() == true){
				discontinuedProducts.add(product);
			}
			
		}
	
	}
	
}
