import java.awt.BorderLayout;
//<<<<<<< HEAD
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
//=======
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import CustomUI.*;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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
import com.netbuilder.entityrepositories.SupplierRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;
import com.netbuilder.entityrespositoriesimplementations.sql.PurchaseOrderLineSQL;
import com.netbuilder.entityrespositoriesimplementations.sql.PurchaseOrderSQL;
import com.netbuilder.entityrespositoriesimplementations.sql.SupplierSQL;

import CustomUI.CustomButton;
import CustomUI.CustomLabel;

/**
 * 
 * @author dgordon, Thomas Dudley
 *
 */


public class AddDiscontinue extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	JLabel heading,optionOne;
	
	final CustomTextArea name = new CustomTextArea("Name");
	CustomTextArea desc = new CustomTextArea("Description");
	final CustomTextArea price = new CustomTextArea("Price");
	
	JComboBox<String> categoryCombo = new JComboBox<String>();
	
	int rowSelected = 0;
	int colSelected = 0;
	
	Product product;
	
	DefaultTableModel productModel;
	
	String user = "";
	
	String newline = System.getProperty("line.separator");
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ApplicationContext sqlContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	
	ProductRepositoryMongo productRepository = (ProductRepositoryMongo) mongoContext.getBean(ProductRepository.class);	
	
	PurchaseOrderSQL poRepository = (PurchaseOrderSQL) sqlContext.getBean(PurchaseOrderRepository.class);
	PurchaseOrderLineSQL polRepository = (PurchaseOrderLineSQL) sqlContext.getBean(PurchaseOrderLineRepository.class);
	SupplierSQL supplierRepository = (SupplierSQL) sqlContext.getBean(SupplierRepository.class);
	int x = 40; //table height
	
	public AddDiscontinue(String username){
		
		productModel = new DefaultTableModel();
		
		populateProductColumnNames();
		populateProductTableData();
		
		this.setLayout(new BorderLayout());
		this.setBackground(new Color(255,255,255));
		
		 Box top = Box.createHorizontalBox();
		    top.add(createLeftPanel());
		    top.add(createRightPanel());
		
		this.add(top);
		
		this.user = username;
		
		
	}
	
	public void setRowSelected(int row)
	{
		rowSelected = row;
	}
	
	public void setColumnSelected(int col)
	{
		colSelected = col;
	}
	
	public void setProduct(Product product)
	{
		this.product = product;
	}
	
	
	public JComponent createAddNewStock()
	{
		CustomButton addNewStock = new CustomButton("Add new stock item");
		addNewStock.setMaximumSize(new Dimension(550,20));
		
		addNewStock.addActionListener(new ActionListener() 
		{

			@Override
	        public void actionPerformed(ActionEvent e) 
			{
	         		            			
	         	try
	         	{
	         		Random rand = new Random();
	         		
	         		int randomNum = rand.nextInt(((int)10 - 0) + 1) + 0;
	         		
	         		JOptionPane.showMessageDialog(getParent(), "New product is added to inventory" );
	         		
	         		int newID = productRepository.findAll().size() + 1;
	         		
	         		int stockLevel =  randomNum;
	         		
	         		productRepository.insert(new Product(newID,0,Float.parseFloat(price.getText().substring(1)),String.valueOf(categoryCombo.getSelectedItem()),name.getText(),false,true, 0, String.valueOf(desc.getText()),"placeholder.png"));
	         		
	         		if(stockLevel == 0)
	         		{
	         			int poID = (int) (poRepository.count() + 1);
		         		
		         		PurchaseOrderLine poLine =  new PurchaseOrderLine(poID, newID, 10);    		
		         		
		         		randomNum = rand.nextInt(((int)supplierRepository.count()) + 1);
		         		
		         		PurchaseOrder purchaseOrder = new PurchaseOrder(poID, randomNum, 1, "2015-10-30", "confirmed");
		         		
		         		polRepository.save(poLine);
		         		poRepository.save(purchaseOrder);
	         		}
	         		
	         		
	         	}
	         	catch(NullPointerException e1)
	         	{
	         		JOptionPane.showMessageDialog(getParent(),
	        	            "All fields must be filled" );
	         	}
	         	catch(InputMismatchException e1)
	         	{
	         		JOptionPane.showMessageDialog(getParent(),
	        	            "Field filled with incorrect data" );
	         	}	          
	            
	            resetTable(productModel);
				
				populateProductTableData();
	        }   
	     });
		
		return addNewStock;
		
	}
	
	public JComponent createPorousWareArea()
	{
		Box panel = Box.createVerticalBox();
		
		JRadioButton porouswareButtonY = new JRadioButton("Y");
		JRadioButton porouswareButtonN = new JRadioButton("N");
		
		porouswareButtonY.setBackground(Color.WHITE);
		porouswareButtonN.setBackground(Color.WHITE);
		
		panel.add(porouswareButtonY);
		panel.add(porouswareButtonN);
		
		return panel;
	}
	
	public JComponent createInfoArea()
	{
		Box panel = Box.createVerticalBox();
		
		JLabel optionTwo = new CustomLabel("(2) Add a new product", false);
		
		panel.add(optionTwo);
		
		
		name.setMaximumSize(new Dimension(450,20));	
		
		
		desc.setMaximumSize(new Dimension(450,20));
		
		
		panel.add(name);
		panel.add(Box.createRigidArea(new Dimension(0,35)));
		
		panel.add(desc);
		panel.add(Box.createRigidArea(new Dimension(0,35)));
		
		return panel;
	}
	
	public JComponent createProductInformationPanel()
	{
		Box panel = Box.createVerticalBox();
		
		
		price.setMaximumSize(new Dimension(450,20));
		
		
		
		categoryCombo.setMaximumSize(new Dimension(450,20));
		categoryCombo.addItem("Gnome");
		categoryCombo.addItem("Garden Accessory");
		categoryCombo.addItem("Miscellaneous");
		
		panel.add(categoryCombo);
		panel.add(Box.createRigidArea(new Dimension(0,35)));		
		panel.add(price);
		panel.add(Box.createRigidArea(new Dimension(0,35)));
		
		JLabel porousware = new CustomLabel("Porousware", false);
		
		panel.add(porousware);
		
		return panel;
	}
	
	public void populateProductColumnNames()
	{
		productModel.addColumn("Product ID");
		productModel.addColumn("Product Name");
		productModel.addColumn("Discontinued?");
	}
	
	public void populateProductTableData()
	{
    	List<Product> a = productRepository.findAll();

		for(int j = 0; j < a.size(); j++)
		{
			Vector<String> vec = new Vector<String>();
			
			vec.add(Integer.toString(a.get(j).getProductId()));
			vec.add(a.get(j).getProductName());
			vec.add(String.valueOf(a.get(j).getDiscontinued()));
			
			productModel.addRow(vec);
		}
	}
	
	public void resetTable(DefaultTableModel dataModel)
	{
		dataModel.setRowCount(0);
	}
	
	public void updateProductAvailablity(Product product)
	{
		product.setDiscontinued(!product.getDiscontinued());
		
		System.out.println(product.getDiscontinued());
		
		productRepository.save(product);
	}
	
	public JComponent createRightPanel()
	{
		Box rightPanel = Box.createVerticalBox();
		
		rightPanel.add(createInfoArea());
		
		rightPanel.add(createProductInformationPanel());
		rightPanel.add(createPorousWareArea());
		rightPanel.add(Box.createRigidArea(new Dimension(0,35)));
		
		
		rightPanel.add(createAddNewStock());
		rightPanel.add(Box.createRigidArea(new Dimension(0,30)));
		CustomButton discontinueStock = new CustomButton("Discontinue selected product"); 
		 
		discontinueStock.addActionListener(new ActionListener() 
		{
			 
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				updateProductAvailablity(product);
	            	
				JOptionPane.showMessageDialog(getParent(), "Product is no longer available");
				
				productRepository.delete(product.getProductId());
				
				productRepository.insert(product);
				
				resetTable(productModel);
				
				populateProductTableData();
			}
	                    
	    });
		
		discontinueStock.setMaximumSize(new Dimension(550,20));
		rightPanel.add(discontinueStock);
		rightPanel.add(Box.createRigidArea(new Dimension(0,10)));
				
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		return rightPanel;
		
	}
	
    /*public Class<?> getColumnClass(int column) {
        if (column == 1) {
            return Integer.class;
        }
        return super.getColumnClass(column);
    }*/
	
	public JComponent createListOfProductsPanel()
	{
		Box panel = Box.createVerticalBox();
		
    	final JTable productTable = new JTable(productModel);
    	

    	
		productTable.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent e) 
			{
									
			}

			@Override
			public void mousePressed(MouseEvent e) 
			{
				rowSelected = productTable.getSelectedRow();
				colSelected = productTable.getSelectedColumn();
				
				int productID = Integer.parseInt((String) productTable.getModel().getValueAt(rowSelected, 0));
				
				Product temp = productRepository.findByProductID(productID);
				
				setProduct(temp);
				

				
			}

			@Override
			public void mouseReleased(MouseEvent e) 
			{
			
					
			}

			@Override
			public void mouseEntered(MouseEvent e) 
			{
			
					
			}

			@Override
			public void mouseExited(MouseEvent e) 
			{
			
					
			}
				
		}
		);
		
		JTableHeader header = productTable.getTableHeader();
	    header.setBackground(new Color(0,122,0));
	    header.setForeground(Color.WHITE);
		
	    panel.add(header);
	   	    
	    CustomScrollPane scrollPane = new CustomScrollPane(productTable);
	    	   
	    panel.add(scrollPane);
	    
	    return panel;
	}
	
	public JComponent createLeftPanel()
	{
		Box leftPanel = Box.createVerticalBox();
		
		optionOne = new CustomLabel("(1) Select an existing product to discontinue", false);
		
	    heading = new CustomLabel("Add/Discontinue Stock Item", true);
	      
		Box HeadingandImage = Box.createHorizontalBox();

		HeadingandImage.add(new CustomImage());
		HeadingandImage.add(heading);

		leftPanel.add(HeadingandImage);

		leftPanel.add(optionOne);
	
		leftPanel.add(createListOfProductsPanel());
		leftPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		
		return leftPanel;
	}
	
}
