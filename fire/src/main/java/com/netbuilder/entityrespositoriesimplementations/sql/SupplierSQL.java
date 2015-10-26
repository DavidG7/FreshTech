package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.entities.PurchaseOrder;
import com.netbuilder.entities.Supplier;
import com.netbuilder.entities.Supplier;
import com.netbuilder.entityrepositories.SupplierRepository;
import com.netbuilder.util.SQLTemplate;

public class SupplierSQL implements SupplierRepository
{
	ApplicationContext ctx = new AnnotationConfigApplicationContext(DataConfig.class);
	DataSource dataSource = (DataSource)ctx.getBean("dataSource");
    SQLTemplate sqltemplate = new SQLTemplate(dataSource);
	
    @Override
	public long count() 
    {
    	long count = 0;
		
		try 
		{
			ResultSet rs= sqltemplate.getResultSetForQuery("supplier", "SELECT COUNT(*) FROM supplier");
			
			while(rs.next())
			{
				count = rs.getLong(1);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	
    @Override
	public void delete(Integer arg0) 
    {
		// TODO Auto-generated method stub
		
	}
	
    @Override
	public void delete(Supplier arg0) 
    {
		// TODO Auto-generated method stub
		
	}
	
    @Override
	public void delete(Iterable<? extends Supplier> arg0) {
		// TODO Auto-generated method stub
		
	}
	
    @Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
    @Override
	public boolean exists(Integer arg0) 
    {
    	try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("Supplier", "SELECT * FROM Supplier WHERE Supplierid =" + SupplierID);
			
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
	public Iterable<Supplier> findAll() 
	{	
		ArrayList<Supplier> supplier = new ArrayList<Supplier>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("Supplier", "SELECT supplierid, supplierid, employeeid, Supplierdate, status FROM Supplier");
						
			while(rs.next()){	
				
				supplier.add(new Supplier( rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  supplier;
		
		
		
	}
	
    @Override
	public Iterable<Supplier> findAll(Iterable<Integer> arg0) 
	{
		ArrayList<Supplier> supplier = new ArrayList<Supplier>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT supplierid, supplieremail, supplierphone, preferredcontactmethod FROM supplier");
						
			while(rs.next()){	
				
				supplier.add(new Supplier( rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return  supplier;
	
	}
	
    @Override
	public Supplier findOne(Integer arg0) 
    {
    	Supplier supplier;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT * FROM supplier WHERE supplierid =" + arg0);
			
			while(rs.next())
			{
				return supplier = new Supplier( rs.getInt(1), rs.getString(2));
			}
						
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
    @Override
	public <S extends Supplier> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public <S extends Supplier> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
	public Supplier findBySupplierId(int supplierId) 
    {
    	Supplier supplier;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT * FROM supplier WHERE supplierid =" + supplierId);
			
			while(rs.next())
			{
				return supplier = new Supplier( rs.getInt(1), rs.getString(2));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
    @Override
	public Supplier findBySupplierName(String name) {

    	Supplier supplier;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT * FROM supplier WHERE suppliername =" + name);
			
			while(rs.next())
			{
				return supplier = new Supplier( rs.getInt(1), rs.getString(2));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;

	}
	
    @Override
	public Supplier findBySupplierEmail(String email) {

    	Supplier supplier;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT * FROM supplier WHERE supplieremail =" + email);
			
			while(rs.next())
			{
				return supplier = new Supplier( rs.getInt(1), rs.getString(2));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
    	
	}
	
    @Override
	public Supplier findBySupplierPhone(String phone) {

    	Supplier supplier;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT * FROM supplier WHERE supplierphone =" + phone);
			
			while(rs.next())
			{
				return supplier = new Supplier( rs.getInt(1), rs.getString(2));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
    	
    	
	}
}
