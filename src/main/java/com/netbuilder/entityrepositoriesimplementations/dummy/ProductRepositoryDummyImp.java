package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;

public class ProductRepositoryDummyImp implements ProductRepository{
	
	@Inject
	private DummyData initialData;

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Product> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
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
		ArrayList<Product> ps = initialData.getEntityList(new Product());
		for(Product p : ps) {
			if(p.getProductId() == productID) {
				return p;
			}
		}
		return null;
	}

	@Override
	public Product findByProductName(String productName) {
		ArrayList<Product> ps = initialData.getEntityList(new Product());
		for(Product p : ps) {
			if(p.getProductName().equals(productName))
				return p;
		}
		return null;
	}

	@Override
	public List<Product> findByPrice(float price) {
		ArrayList<Product> ps = initialData.getEntityList(new Product());
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
		ArrayList<Product> ps = initialData.getEntityList(new Product());
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
		ArrayList<Product> ps = initialData.getEntityList(new Product());
		for(int i = 0; i < ps.size(); i--) {
			if(ps.get(i).getRating()!=rating) {
				ps.remove(i);
				i--;
			}
		}
		return ps;
	}
}
