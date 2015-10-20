package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;

/**
 * @author ??
 * @author pnewman (modifications to allow for spring bean configuration)
 */

public class ProductRepositoryDummy implements ProductRepository{
	
	private DummyData dummyData;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null; 
	}

	@Override
	public List<Product> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		
		return dummyData.getEntityList(new Product()).size();
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product arg0) 
	{	
		ArrayList<Product> product = new ArrayList<Product>();
		
		if(dummyData.getEntityList(new Product()).contains(arg0))
		{
			product.remove(arg0);
			dummyData.setEntityList(product);
		}
	}

	@Override
	public void delete(Iterable<? extends Product> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() 
	{
		dummyData.getEntityList(new Product()).clear();		
	}

	@Override
	public boolean exists(Integer arg0) 
	{
		if(dummyData.getEntityList(new Product()).contains(arg0))
		{
			return true;
		}
		else
			return false;
	}

	@Override
	public Iterable<Product> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByProductID(int productID) {
		ArrayList<Product> ps = dummyData.getEntityList(new Product());
		for(Product p : ps) {
			if(p.getProductId() == productID) {
				return p;
			}
		}
		return null;
	}

	@Override
	public Product findByProductName(String productName) {
		ArrayList<Product> ps = dummyData.getEntityList(new Product());
		for(Product p : ps) {
			if(p.getProductName().equals(productName))
				return p;
		}
		return null;
	}

	@Override
	public List<Product> findByPrice(float price) {
		ArrayList<Product> ps = dummyData.getEntityList(new Product());
		for(int i = 0; i < ps.size(); i--) {
			if(ps.get(i).getRating()!=price) {
				ps.remove(i);
				i--;
			}
		}
		return ps;
	}

	@Override
	public List<Product> findByCategory(String category) {
		ArrayList<Product> ps = dummyData.getEntityList(new Product());
		for(int i = 0; i < ps.size(); i--) {
			if(!ps.get(i).getCategory().equals(category)) {
				ps.remove(i);
				i--;
			}
		}
		return ps;
	}

	@Override
	public List<Product> findByRating(int rating) {
		ArrayList<Product> ps = dummyData.getEntityList(new Product());
		for(int i = 0; i < ps.size(); i--) {
			if(ps.get(i).getRating()!=rating) {
				ps.remove(i);
				i--;
			}
		}
		return ps;
	}

	/**
	 * @author pnewman
	 */
	@Override
	public List<Product> findByDiscontinued(boolean isDiscontinued) {
		ArrayList<Product> products = dummyData.getEntityList(new Product());
		ArrayList<Product> discontinuedProducts = new ArrayList<Product>();
		for(Product product : products){
			if(product.getDiscontinued() == isDiscontinued){
				discontinuedProducts.add(product);
			}
		}
		return discontinuedProducts;
	}

	public DummyData getDummyData() {
		return dummyData;
	}

	public void setDummyData(DummyData dummyData) {
		this.dummyData = dummyData;
	}
}
