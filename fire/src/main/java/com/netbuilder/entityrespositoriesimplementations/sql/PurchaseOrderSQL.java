package com.netbuilder.entityrespositoriesimplementations.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.PurchaseOrder;
import com.netbuilder.entityrepositories.PurchaseOrderRepository;
import com.netbuilder.util.SQLTemplate;

/**
 * 
 * @author Thomas Dudley
 *
 */

public class PurchaseOrderSQL implements PurchaseOrderRepository
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
			ResultSet rs= sqltemplate.getResultSetForQuery("purchaseorder", "SELECT COUNT(*) FROM purchaseorder");
			
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
	public void delete(Integer purchaseOrderID) 
	{
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "DELETE FROM purchaseorder WHERE purchaseorderid =" + purchaseOrderID);
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(PurchaseOrder arg0) {

		int purchaseOrderID = arg0.getPurchaseOrderID();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "DELETE * FROM purchaseorder WHERE purchaseorderid =" + purchaseOrderID);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	@Override
	public void delete(Iterable<? extends PurchaseOrder> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() 
	{
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "DELETE FROM purchaseorder");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean exists(Integer purchaseOrderID) 
	{
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "SELECT * FROM purchaseorder WHERE purchaseorderid =" + purchaseOrderID);
			
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
	public Iterable<PurchaseOrder> findAll() 
	{
		ArrayList<PurchaseOrder> purchaseOrder = new ArrayList<PurchaseOrder>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "SELECT purchaseorderid, supplierid, employeeid, purchaseorderdate, status FROM purchaseorder");
			
			int i = 0;
			
			while(rs.next()){	
				
				purchaseOrder.add(new PurchaseOrder( rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
				System.out.println(purchaseOrder.get(i).getPurchaseOrderID()+", "+ purchaseOrder.get(i).getSupplierID()+ ", " + purchaseOrder.get(i).getEmployeeID()
						+", "+purchaseOrder.get(i).getPurchaseDateOrder()+", "+purchaseOrder.get(i).getPurchaseOrderStatus());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  purchaseOrder;
		
		
		
	}

	@Override
	public Iterable<PurchaseOrder> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrder findOne(Integer purchaseOrderID) 
	{
		PurchaseOrder purchaseOrder;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "SELECT * FROM purchaseorder WHERE purchaseorderid =" + purchaseOrderID);
			
			while(rs.next())
			{
				return purchaseOrder = new PurchaseOrder( rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public <S extends PurchaseOrder> S save(S arg0) 
	{
		/*PurchaseOrder purchaseOrder;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "UPDATE purchaseOrder"
					+ "SET purchaseorderid = arg0.getPurchaseOrderID() AND supplierid = arg0.getSupplierID() AND "
					+ "employeeid = arg0.getEmployeeID(), "
					+ " WHERE purchaseorderid =" + arg0.getPurchaseOrderID());
			
			while(rs.next())
			{
				return purchaseOrder = new PurchaseOrder( rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}*/
		
		return null;
	}

	@Override
	public <S extends PurchaseOrder> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrder findByPurchaseOrderID(int purchaseOrderID) 
	{
		PurchaseOrder purchaseOrder;
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "SELECT * FROM purchaseorder WHERE purchaseorderid =" + purchaseOrderID);
			
			while(rs.next())
			{
				return purchaseOrder = new PurchaseOrder( rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5));
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<PurchaseOrder> findByPurchaseOrderStatus(
			String PurchaseOrderStatus) 		
	{
		ArrayList<PurchaseOrder> purchaseOrder = new ArrayList<PurchaseOrder>();
		
		try 
		{
			ResultSet rs = sqltemplate.getResultSetForQuery("purchaseorder", "SELECT purchaseorderid, supplierid, employeeid, purchaseorderdate, status FROM purchaseorder");
			
			int i = 0;
			
			while(rs.next()){	
				
				purchaseOrder.add(new PurchaseOrder( rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
				System.out.println(purchaseOrder.get(i).getPurchaseOrderID()+", "+ purchaseOrder.get(i).getSupplierID()+ ", " + purchaseOrder.get(i).getEmployeeID()
						+", "+purchaseOrder.get(i).getPurchaseDateOrder()+", "+purchaseOrder.get(i).getPurchaseOrderStatus());
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  purchaseOrder;
		
	}

}
