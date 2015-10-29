import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Product;
import com.netbuilder.entities.PurchaseOrder;
import com.netbuilder.entities.PurchaseOrderLine;
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositories.PurchaseOrderLineRepository;
import com.netbuilder.entityrepositories.PurchaseOrderRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrespositoriesimplementations.sql.PurchaseOrderLineSQL;
import com.netbuilder.entityrespositoriesimplementations.sql.PurchaseOrderSQL;

import CustomUI.CustomScrollPane;
import CustomUI.CustomTextArea;

/**
 * 
 * @author ricky luu
 *
 */

public class DailyStockReport extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTable  reportTable;
	private JLabel label = new JLabel("Daily Stock Report");
	private JPanel panel;
	private JPanel topBar = new JPanel();
	private JPanel bottomBar = new JPanel();
	private JLabel date  = new JLabel(new Date().toString());
	private JButton rturn = new JButton("return");
	private CustomTextArea searchText;
	
	//TEMPORARY - WILL BE EQUAL TO NUMBER OF PRODUCTS IN STOCK REPORT
	int x = 25;
	//---------------------------------------------------------------

	public DailyStockReport(){
		
		setBackground(Color.WHITE);
		String [] colNames = {"ProductID","Product Name","Quantity","Status"};
		Object[][] data = new Object [x][4];// <--- Here is where X is used
		
	      
	      
      //  DBCollection coll = GUIMain.mdb.db.getCollection("Product");
			
    	@SuppressWarnings("resource")
		ApplicationContext sqlContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
    	ProductRepositoryMongo productRepository = (ProductRepositoryMongo) sqlContext.getBean(ProductRepository.class);	
    	PurchaseOrderLineSQL purchaseOrderLineRepository = (PurchaseOrderLineSQL) sqlContext.getBean(PurchaseOrderLineRepository.class);
    	PurchaseOrderSQL purchaseOrderRepository = (PurchaseOrderSQL) sqlContext.getBean(PurchaseOrderRepository.class);
    	
    	List<Product> a = productRepository.findAll();
    	List<PurchaseOrderLine> x  = purchaseOrderLineRepository.listAll();
    	List<PurchaseOrder> y = purchaseOrderRepository.listAll();
    	
    	for(int i = 0; i <= a.size()-1; i++){
    		int temp =  a.get(i).getProductId();
    		data[i][0] = "Product ID: "+ temp;
    		data[i][1] = a.get(i).getProductName();
    		data[i][2] = a.get(i).getStockLevel();
    		//= purchaseOrderLineRepository.findByProductID(temp);
    		System.out.println("ALERT");
    		System.out.println("POL ID: " + x.get(i).getPurchaseOrderLineID() + " ,Product ID: " + x.get(i).getProductID());
    		for(int j =0; j <= x.size()-1; j++){
	    		if(x.get(j).getProductID() == temp){
	    			for(int k = 0; k<=y.size()-1; k++){
	    				if(y.get(k).getPurchaseOrderID() == x.get(j).getPurchaseOrderLineID()){
	    					data[i][3] = y.get(k).getPurchaseOrderStatus();
	    				}
	    			}
	    		}
    		}
    	}
    	
		reportTable = new JTable(data,colNames);
		JTableHeader header = reportTable.getTableHeader();
	      header.setBackground(new Color(0,122,0));
	      header.setForeground(Color.WHITE);
	      
	      
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		topBar.setBackground(Color.WHITE);
		topBar.add(label);
		searchText = new CustomTextArea("Search");
		searchText.setPreferredSize(new Dimension(500,25));
		topBar.setPreferredSize(new Dimension(800,80));
		topBar.add(searchText);
		panel.add(topBar, BorderLayout.NORTH);
		panel.add(new CustomScrollPane(reportTable),BorderLayout.CENTER);
		bottomBar.setBackground(Color.white);
		bottomBar.add(date);
		bottomBar.add(rturn);
		panel.add(bottomBar,BorderLayout.SOUTH);
		add(panel);
		setSize(400,250);
		setVisible(true);
		
	}

}