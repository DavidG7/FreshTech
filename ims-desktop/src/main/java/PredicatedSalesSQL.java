import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrespositoriesimplementations.sql.CustomerOrderSQL;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
/**
 * 
 * @author tdudley
 *
 * TODO Class needs to be implemented so that it can connect to the 
 * TODO SQL database and get the relevant information from the database. 
 * 
 * 
 */

public class PredicatedSalesSQL 
{
	
	private static final long serialVersionUID = 1L;
	
	ApplicationContext sqlContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	CustomerOrderSQL customerOrderRepository = (CustomerOrderSQL) sqlContext.getBean(CustomerOrderRepository.class);
	
	public PredicatedSalesSQL()
	{
		
	}
	
	public int quarterlySalesForProduct(Product product)
	{		
    	ArrayList<CustomerOrder> listOfCustomerOrder = (ArrayList<CustomerOrder>) customerOrderRepository.findAll(); 
    	
    	
    	
    	String date = "";
    	
    	//TODO get product id.
    	// get list of orders for said product
    	// sort the dates into 4 groups (quarter 1, 2 ,3 and 4
    	// translate this to the pie chart somehow... 
    	
    	
    	for(int i = 0; i < listOfCustomerOrder.size(); i++)
    	{
    		date = listOfCustomerOrder.get(i).getOrderDate();
    	}
    		String delims = "[-]";
    		
    		String[] tokens = date.split(delims);
    		
    		System.out.println(tokens.length);
    		
    		for(int j = 0; j < tokens.length; j++)
    		{
    			System.out.println(tokens[j]);
    		}
    		
    		String month = tokens[1];
    		System.out.println(tokens[1]);
    		
    		int m = Integer.parseInt(month);
    		
    		/*if(1 >= month <= 3)
    		{
    			
    		}*/
    	
    	return 0;
	}
}
