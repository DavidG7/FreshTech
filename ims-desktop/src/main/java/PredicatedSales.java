import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.JTableHeader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.CustomerOrder;
import com.netbuilder.entities.CustomerOrderLine;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.CustomerOrderLineRepository;
import com.netbuilder.entityrepositories.CustomerOrderRepository;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;



import com.netbuilder.entityrespositoriesimplementations.sql.CustomerOrderLineSQL;
import com.netbuilder.entityrespositoriesimplementations.sql.CustomerOrderSQL;

import CustomUI.CustomFont;
import CustomUI.CustomLabel;
import CustomUI.CustomPieChart;
import CustomUI.CustomScrollPane;
/**
 * 
 * @author Ricky Luu
 *
 */
public class PredicatedSales extends JPanel
{

	private static final long serialVersionUID = 1L;
	JLabel heading, option, salesPrediction;
	JPanel topBar = new JPanel();
	Box main;
	JTable table;
	JPanel leftPanel,rightPanel, headingLeft;
	String productName = "PRODUCTNAME";
	int salesNum = 000;

	int x = 35;
	
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ApplicationContext sqlContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepositoryMongo productRepository = (ProductRepositoryMongo) mongoContext.getBean(ProductRepository.class);	
	CustomerOrderSQL coRepository = (CustomerOrderSQL) sqlContext.getBean(CustomerOrderRepository.class);
	CustomerOrderLineSQL colRepository = (CustomerOrderLineSQL) sqlContext.getBean(CustomerOrderLineRepository.class);
	
	List<Product> products = productRepository.findAll();
	
	public PredicatedSales()
	{
		this.setLayout(new BorderLayout());
		leftPanel = new JPanel();
		rightPanel = new JPanel();
		headingLeft = new JPanel(new GridLayout(1,2));
		heading = new CustomLabel("Predicted Sales",true);
		headingLeft.setBackground(Color.WHITE);
		CustomImage icon = new CustomImage();
		heading.setPreferredSize(new Dimension(1000,100));
		headingLeft.add(heading);	
		headingLeft.add(icon);
		
		
		
	    final List<CustomerOrderLine> customerOrderLines = (List<CustomerOrderLine>) colRepository.findAll();
	    final List<CustomerOrder> customerOrders = (List<CustomerOrder>) coRepository.findAll();
	    
	    final String[] datesToCustomerOrderLines = new String[customerOrderLines.size()];
	    
	    
	    for(int i = 0; i < customerOrders.size();i++){
	    	for(int j =0;j<customerOrderLines.size();j++){
	    		if(customerOrders.get(i).getOrderID() == customerOrderLines.get(j).getCustomerOrderLineID()){
	    			datesToCustomerOrderLines[j] = customerOrders.get(i).getOrderDate();
	    			
	    		}
	    	}
	    }


		
		headingLeft.setBorder(new EmptyBorder(30, 200, 30, 200));
		
		add(headingLeft, BorderLayout.NORTH);
		
		
		
		final int[][] quantities = new int[products.size()][4];
		
		   for (int i =0; i < customerOrderLines.size(); i++) {
			     
		    	 CustomerOrderLine pol = customerOrderLines.get(i);
		    	 
		    	 quantities[pol.getProductID()-1][DateSorter.getSeason(datesToCustomerOrderLines[i])] += pol.getQuantity();
		     }
		
		   
		String [] colNames = {"ProductID","Product Name","Quantity","Sales"};
		Object[][] data = new Object [products.size()][4];
		for(int i = 0; i<products.size();i++){
				data[i][0] = products.get(i).getProductId();
				data[i][1] = products.get(i).getProductName();
				data[i][2] = products.get(i).getStockLevel();
				data[i][3] = quantities[i][0]+quantities[i][1]+quantities[i][2]+quantities[i][3];		
		}
		table = new JTable(data ,colNames);
		
		JTableHeader header = table.getTableHeader();
	      header.setBackground(new Color(0,122,0));
	      header.setForeground(Color.WHITE);	      
	      
	    
	     
	  
	     

	      
		CustomScrollPane scrollPane = new CustomScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(500,500));
		leftPanel.add(scrollPane);		
		
		final CustomPieChart pie = new CustomPieChart("Sales","Sales",quantities[0]);
		rightPanel.add(pie);
		pie.setBackground(Color.WHITE);
		pie.setBorder(new EmptyBorder(70,0,0,0));
		salesPrediction = new JLabel(Integer.toString(salesNum));
		rightPanel.add(salesPrediction);
		new CustomFont();
		salesPrediction.setFont(CustomFont.getFont("BOLD", 12));
		
		main = Box.createHorizontalBox();
		this.add(main,BorderLayout.CENTER);
		main.setBackground(Color.WHITE);
		main.add(leftPanel);
		main.add(rightPanel);
		leftPanel.setBackground(Color.WHITE);
		rightPanel.setBackground(Color.WHITE);
		
		setVisible(true);
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		ListSelectionModel selectionModel = table.getSelectionModel();

		selectionModel.addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		    	 pie.refreshChart(quantities[table.getSelectedRow()]);
		    	 
		    	 int month = Calendar.getInstance().get(Calendar.MONTH);
		    	 
		    	 salesNum = quantities[table.getSelectedRow()][DateSorter.getSeason(month)];
		    	salesPrediction.setText(Integer.toString(salesNum));
		    	 
			    
			   for(int i = 0; i <datesToCustomerOrderLines.length;i++){
			    	System.out.println("Dates of Each COL: " + datesToCustomerOrderLines[i]);
			    	
			    }
			    System.out.println("BLAHBALAHJASHCDB");

				  
				    	
		    	
	
		    	
		    }
			  
		     
		});

	}	
	
	public int calculateYearlySales()
	{
		PredicatedSalesSQL test = new PredicatedSalesSQL();
		
		Product product = new Product();
		
		test.quarterlySalesForProduct(product);
		return 0; 
	}
}
