/*package com.netbuilder.entityrespositoriesimplementations.sql;

import java.util.List;

import javax.resource.cci.ResultSet;
import javax.sql.DataSource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;

public class ProductRepositorySQL implements ProductRepository{
	
	private DataSource dataSource;

	@Override
	public List<Product> findAll() {

		 Statement stmt = null;
		    String query = "select COF_NAME, SUP_ID, PRICE, " +
		                   "SALES, TOTAL " +
		                   "from mydb.COFFEES";
		    try {
		    	Connection con=dataSource.getConnection();
		        stmt = con.createStatement();
		        ResultSet rs = (ResultSet) stmt.executeQuery(query);
		        while (rs.next()) {
		            String coffeeName = rs.getString("COF_NAME");
		            int supplierID = rs.getInt("SUP_ID");
		            float price = rs.getFloat("PRICE");
		            int sales = rs.getInt("SALES");
		            int total = rs.getInt("TOTAL");
		            System.out.println(coffeeName + "\t" + supplierID +
		                               "\t" + price + "\t" + sales +
		                               "\t" + total);
		        }
		    } catch (SQLException e ) {
		        JDBCTutorialUtilities.printSQLException(e);
		    } finally {
		        if (stmt != null) { stmt.close(); }
		    }
		}
		
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
	public Page<Product> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Product> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Product> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findByProductID(int productID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByPrice(float price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByDiscontinued(boolean isDiscontinued) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByOnOffer(boolean isOnOffer) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/