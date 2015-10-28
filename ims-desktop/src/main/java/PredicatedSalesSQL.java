import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
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
	public PredicatedSalesSQL()
	{
		
	}
	
	public int quarterlySalesForProduct(Product product)
	{
		ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
    	ProductRepositoryMongo productRepository = (ProductRepositoryMongo) mongoContext.getBean(ProductRepository.class);	
        
    	/*List<CustomerOrder> listOfCustomerOrders = CustomerOrderRepository.findAll();
    	List<>
    	
    	
    	for(int i = 0; i < listOfProducts.size(); i++)
    	{
    		
    	}
    	*/
    	return 0;
	}
}
