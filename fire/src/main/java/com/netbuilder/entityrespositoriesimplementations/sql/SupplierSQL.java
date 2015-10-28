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
import com.netbuilder.entityrepositories.SupplierRepository;
import com.netbuilder.util.SQLTemplate;

public class SupplierSQL implements SupplierRepository
{
	private SQLTemplate sqltemplate;
	
	public SQLTemplate getSqltemplate() {
		return sqltemplate;
	}

	public void setSqltemplate(SQLTemplate sqltemplate) {
		this.sqltemplate = sqltemplate;
	}
	
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
		try 
		{
			sqltemplate.getResultSetForQuery("supplier", "DELETE FROM supplier WHERE supplierid =" + arg0);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
	}
	
    @Override
	public void delete(Supplier arg0) 
    {
		int supplierID = arg0.getId();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "DELETE FROM supplier WHERE supplierid =" + supplierID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    @Override
	public void delete(Iterable<? extends Supplier> arg0) {
		// TODO Auto-generated method stub
		
	}
	
    @Override
	public void deleteAll() 
    {
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "DELETE FROM supplier");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
    @Override
	public boolean exists(Integer arg0) 
    {
    	try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("Supplier", "SELECT supplierid, suppliername, email, phone, preferedcontactmethod FROM Supplier WHERE Supplierid =" + arg0);
			
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
			ResultSet rs = sqltemplate.getResultSetForQuery("Supplier", "SELECT supplierid, suppliername, email, phone, preferedcontactmethod FROM Supplier");
						
			while(rs.next()){	
				
				supplier.add(new Supplier( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
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
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT supplierid, suppliername, email, phone, preferedcontactmethod FROM supplier");
						
			while(rs.next()){	
											
				supplier.add(new Supplier( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				
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
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT supplierid, suppliername, email, phone, preferedcontactmethod FROM supplier WHERE supplierid =" + arg0);
			
			while(rs.next())
			{
				supplier = new Supplier( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				System.out.println(supplier.getId()+", "+ supplier.getName()+ ", " + supplier.getEmail()
						+", "+supplier.getPhone()+", "+ supplier.getPreferredContactMethod());
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
				return supplier;
				
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
			}
						
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
    @Override
	public <S extends Supplier> S save(S arg0) 
    {
		arg0 = (S) new Supplier();
		
		sqltemplate.update("INSERT INTO supplier VALUES(" + arg0.getId() + "','" + arg0.getEmail() + "','" + arg0.getPhone()
				+ "','" + arg0.getPreferredContactMethod());
		
		return arg0;
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
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT supplierid, suppliername, email, phone, preferedcontactmethod FROM supplier WHERE supplierid =" + supplierId);
			
			while(rs.next())
			{
				supplier = new Supplier( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				System.out.println(supplier.getId()+", "+ supplier.getName()+ ", " + supplier.getEmail()
						+", "+supplier.getPhone()+", "+ supplier.getPreferredContactMethod());
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
				return supplier;
				
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
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
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT supplierid, suppliername, email, phone, preferedcontactmethod FROM supplier WHERE suppliername =" + name);
			
			while(rs.next())
			{
				supplier = new Supplier( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				System.out.println(supplier.getId()+", "+ supplier.getName()+ ", " + supplier.getEmail()
						+", "+supplier.getPhone()+", "+ supplier.getPreferredContactMethod());
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
				return supplier;
				
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
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
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT supplierid, suppliername, email, phone, preferedcontactmethod FROM supplier WHERE email = " + email);
			
			while(rs.next())
			{
				supplier = new Supplier( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				System.out.println(supplier.getId()+", "+ supplier.getName()+ ", " + supplier.getEmail()
						+", "+supplier.getPhone()+", "+ supplier.getPreferredContactMethod());
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
				return supplier;
				
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
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
			ResultSet rs = sqltemplate.getResultSetForQuery("supplier", "SELECT supplierid, suppliername, email, phone, preferedcontactmethod FROM supplier WHERE supplierphone =" + phone);
			
			while(rs.next())
			{
				supplier = new Supplier( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				System.out.println(supplier.getId()+", "+ supplier.getName()+ ", " + supplier.getEmail()
						+", "+supplier.getPhone()+", "+ supplier.getPreferredContactMethod());
				//return supplier = new Supplier( rs.getInt(1), rs.getString(2));
				return supplier;
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
    	
    	
	}
}
