package com.netbuilder.entityrepositoriesimplementations.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;

/**
 * 
 * @author Thomas Dudley
 *
 *	This interacts with the mongo database
 *	Allows for updates and deletion
 *
 *	TODO implement create methods
 *
 */

public class ProductRepositoryMongo implements ProductRepository{

	/*In case of fire: revert to me
	ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
	MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
	*/
	
	MongoOperations mongoOperation;
		
	public ProductRepositoryMongo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> findAll() {
		
		return mongoOperation.findAll(Product.class);
	}

	@Override
	public List<Product> findAll(Sort arg0) {
		Query q = new Query().with(new Sort(Sort.Direction.ASC, "_id"));
		List<Product> products = mongoOperation.find(q,  Product.class);
		return products;
	}

	@Override
	public <S extends Product> S insert(S arg0) {
		mongoOperation.insert(arg0);
		return null;
	}

	@Override
	public <S extends Product> List<S> insert(Iterable<S> arg0) {
		mongoOperation.insert(arg0);
		return null;
	}

	@Override
	public <S extends Product> List<S> save(Iterable<S> arg0) {
		mongoOperation.save(arg0);
		return null;
	}

	@Override
	public Page<Product> findAll(Pageable arg0) {
		
		return null;
	}

	@Override
	public long count() {
		return mongoOperation.count(null, Product.class);
	}

	@Override
	public void delete(Integer id) {
		mongoOperation.remove(new Query(Criteria.where("_id").is(id)), Product.class);
		
	}

	@Override
	public void delete(Product arg0) 
	{
		//mongoOperation.remove(new Query(Criteria.where("_id").is("3")), Product.class);
	}

	@Override
	public void delete(Iterable<? extends Product> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		mongoOperation.remove(Product.class);
		
	}

	@Override
	public boolean exists(Integer arg0) 
	{
		List<Product> products = mongoOperation.findAll(Product.class);
		
		for(int i = 0; i < products.size(); i++)
		{
			if(products.get(i).getProductId() == (arg0))
			{
				return true;
			}
		}	
		return false;		
	}

	@Override
	public Iterable<Product> findAll(Iterable<Integer> arg0) 
	{
		Query q = new Query().with(new Sort(Sort.Direction.ASC, "_id"));
		
		Iterable<Product> products = mongoOperation.find(q,  Product.class);
		
		return products;
	}

	@Override
	public Product findOne(Integer arg0) 
	{	
		List<Product> products = mongoOperation.findAll(Product.class);
		
		for(int i  = 0; i < products.size(); i++)
		{
			if(products.get(i).getProductId() == arg0)
			{
				return products.get(i);
			}
		}
		
		return null;
		
	}

	@Override
	public <S extends Product> S save(S arg0) {
		mongoOperation.save(arg0);
		return null;
	}

	@Override
	public Product findByProductID(int productID) 
	{
		List<Product> products = mongoOperation.findAll(Product.class);
		
		for(int i = 0; i < products.size(); i++)
		{
			if(products.get(i).getProductId() == productID)
			{
				return products.get(i);
			}
		}
		
		return null;
		
	}

	@Override
	public Product findByProductName(String productName) 
	{	
		List<Product> products = mongoOperation.findAll(Product.class);
		
		for(int i = 0; i < products.size(); i++)
		{
			if(products.get(i).getProductName().equalsIgnoreCase(productName))
			{
				return products.get(i);
			}
		}
		
		return null;
	}

	@Override
	public List<Product> findByPrice(float price) 
	{
		List<Product> products = mongoOperation.findAll(Product.class);
		List<Product> finalProducts = new ArrayList<Product>();
		
		for(int i = 0; i < products.size(); i++)
		{
			if(products.get(i).getPrice() == price)
			{
				finalProducts.add(products.get(i));
			}
		}
		
		return finalProducts;
	}

	@Override
	public List<Product> findByCategory(String category)
	{
		List<Product> products = mongoOperation.findAll(Product.class);
		List<Product> finalProducts = new ArrayList<Product>();
		
		for(int i = 0; i < products.size(); i++)
		{
			if(products.get(i).getCategory().equalsIgnoreCase(category))
			{
				finalProducts.add(products.get(i));
			}
		}
		
		return finalProducts;
	}

	@Override
	public List<Product> findByRating(int rating) 
	{
		List<Product> products = mongoOperation.findAll(Product.class);
		List<Product> finalProducts = new ArrayList<Product>();
		
		for(int i = 0; i < products.size(); i++)
		{
			if(products.get(i).getRating() == rating)
			{
				finalProducts.add(products.get(i));
			}
		}
		
		return finalProducts;
	}

	@Override
	public List<Product> findByDiscontinued(boolean isDiscontinued) 
	{
		List<Product> products = mongoOperation.findAll(Product.class);
		List<Product> finalProducts = new ArrayList<Product>();
		
		for(int i = 0; i < products.size(); i++)
		{
			if(products.get(i).getDiscontinued() == isDiscontinued)
			{
				finalProducts.add(products.get(i));
			}
		}
		
		return finalProducts;
	}

	@Override
	public List<Product> findByOnOffer(boolean isOnOffer) 
	{
		List<Product> products = mongoOperation.findAll(Product.class);
		List<Product> finalProducts = new ArrayList<Product>();
		
		for(int i = 0; i < products.size(); i++)
		{
			if(products.get(i).isOnOffer()== isOnOffer)
			{
				finalProducts.add(products.get(i));
			}
		}
		
		return finalProducts;
	}

	public MongoOperations getMongoOperation() {
		return mongoOperation;
	}

	public void setMongoOperation(MongoOperations mongoOperation) {
		this.mongoOperation = mongoOperation;
	}
}