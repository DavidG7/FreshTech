package com.netbuilder.entityrespositoriesimplementations.sql;
/**
 * 
 * @author jham
 *
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.netbuilder.DataConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.Employee;
import com.netbuilder.entities.ProductSupplier;
import com.netbuilder.entityrepositories.EmployeeRepository;
import com.netbuilder.entityrepositories.ProductSupplierRepository;
import com.netbuilder.util.SQLTemplate;

public class ProductSupplierRepositorySQL implements ProductSupplierRepository {

	private SQLTemplate sqltemplate;
	
	public SQLTemplate getSqltemplate() {
		return sqltemplate;
	}

	public void setSqltemplate(SQLTemplate sqltemplate) {
		this.sqltemplate = sqltemplate;
	}

	@Override
	public <S extends ProductSupplier> S save(S entity) {
		entity = (S) new ProductSupplier();
		sqltemplate.update("INSERT INTO employee VALUES("+ entity.getProductID() +",'" + entity.getSupplierID()+"','" + entity.getPrice()+"',");
return entity;
	
	}

	@Override
	public <S extends ProductSupplier> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductSupplier findOne(Integer id) {
		ProductSupplier productsupplier = null;
		try {
			ResultSet rs = sqltemplate.getResultSetForQuery("productsupplier", "SELECT * FROM productsupplier where productid = " + id);
			while(rs.next()){
				productsupplier = new ProductSupplier( rs.getInt(1), rs.getInt(2), rs.getInt(3));	
				System.out.println(productsupplier.getProductID()+", "+productsupplier.getSupplierID()+", "+ productsupplier.getPrice());
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productsupplier;
	}

	@Override
	public boolean exists(Integer id) {
		ArrayList<ProductSupplier> productsupplier = new ArrayList<ProductSupplier>();
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("productsupplier", "SELECT * FROM productsupplier where productid = " + id);
			
			while(rs.next())
			{
				return true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return false;
	}
		
	
	@Override
	public Iterable<ProductSupplier> findAll() {
		ArrayList<ProductSupplier> productsupplier = new ArrayList<ProductSupplier>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("productsupplier", "SELECT * FROM productsupplier");
			int i=0;
			while(rs.next()){	
				
				productsupplier.add(new ProductSupplier( rs.getInt(1), rs.getInt(2), rs.getInt(3)));	
				System.out.println(productsupplier.get(i).getProductID()+","+productsupplier.get(i).getSupplierID()+","+productsupplier.get(i).getPrice());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  productsupplier;
	}

	@Override
	public Iterable<ProductSupplier> findAll(Iterable<Integer> ids) {
		ArrayList<ProductSupplier> productsupplier = new ArrayList<ProductSupplier>();
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("productsupplier", "SELECT * FROM productsupplier");
			int i=0;
			while(rs.next()){	
				
				productsupplier.add(new ProductSupplier( rs.getInt(1), rs.getInt(2), rs.getInt(3)));	
				System.out.println(productsupplier.get(i).getProductID()+","+productsupplier.get(i).getSupplierID()+","+productsupplier.get(i).getPrice());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  productsupplier;
	}

	@Override
	public long count() {
		long count = 0;
		try {
			ResultSet rs= sqltemplate.getResultSetForQuery("productsupplier", "SELECT COUNT(*) FROM productsupplier");
			while(rs.next())
			{
				count =rs.getLong(1);
			}
		
		System.out.println(count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	

	@Override
	public void delete(Integer id) {
		sqltemplate.update("DELETE FROM productsupplier WHERE productid = "  + id);
		
	}

	@Override
	public void delete(ProductSupplier arg0) {
		int productID = arg0.getProductID();
		sqltemplate.update("DELETE FROM productsupplier WHERE productid = "  + productID);
		
	}

	@Override
	public void delete(Iterable<? extends ProductSupplier> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		sqltemplate.update("DELETE FROM productsupplier");
		
	}

	@Override
	public ArrayList<ProductSupplier> findByProductID(Integer productID) {
		ArrayList<ProductSupplier> productsupplier =  new ArrayList<ProductSupplier>();
		try {
			ResultSet rs =sqltemplate.getResultSetForQuery("productsupplier", "SELECT * FROM productsupplier where productid = " + productID);
			while(rs.next()){	
				int i=0;
				productsupplier.add(new ProductSupplier( rs.getInt(1), rs.getInt(2), rs.getInt(3)));	
				System.out.println(productsupplier.get(i).getProductID()+","+productsupplier.get(i).getSupplierID()+","+productsupplier.get(i).getPrice());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  productsupplier;
	}



	@Override
	public ArrayList<ProductSupplier> findBySupplierID(Integer supplierID) {
		ArrayList<ProductSupplier> productsupplier =  new ArrayList<ProductSupplier>();
		try {
			ResultSet rs =sqltemplate.getResultSetForQuery("productsupplier", "SELECT * FROM productsupplier where Supplier_supplierid = " + supplierID);
			while(rs.next()){	
				int i=0;
				productsupplier.add(new ProductSupplier( rs.getInt(1), rs.getInt(2), rs.getInt(3)));	
				System.out.println(productsupplier.get(i).getProductID()+","+productsupplier.get(i).getSupplierID()+","+productsupplier.get(i).getPrice());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  productsupplier;
	}

	@Override
	public ArrayList<ProductSupplier> findByPrice(float price) {
		ArrayList<ProductSupplier> productsupplier =  new ArrayList<ProductSupplier>();
		try {
			ResultSet rs =sqltemplate.getResultSetForQuery("productsupplier", "SELECT * FROM productsupplier where price = " + price);
			while(rs.next()){	
				int i=0;
				productsupplier.add(new ProductSupplier( rs.getInt(1), rs.getInt(2), rs.getInt(3)));	
				System.out.println(productsupplier.get(i).getProductID()+","+productsupplier.get(i).getSupplierID()+","+productsupplier.get(i).getPrice());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  productsupplier;
	}


		
	
	
}

	
