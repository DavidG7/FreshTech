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
import java.util.List;
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
import com.netbuilder.entityrepositories.ProductRepository;
import com.netbuilder.entityrepositoriesimplementations.mongo.ProductRepositoryMongo;

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
	
	int rowSelected = 0;
	int colSelected = 0;
	
	Product product;
	
	DefaultTableModel productModel;
	
	String newline = System.getProperty("line.separator");
	
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepositoryMongo productRepository = (ProductRepositoryMongo) mongoContext.getBean(ProductRepository.class);	

	int x = 40; //table height
	
	public AddDiscontinue(){
		
		this.setLayout(new BorderLayout());
		this.setBackground(new Color(255,255,255));
		
		 Box top = Box.createHorizontalBox();
		    top.add(createLeftPanel());
		    top.add(createRightPanel());
		
		this.add(top);
		
		productModel = new DefaultTableModel();
		
		populateProductColumnNames();
		populateProductTableData();
		
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
		
		addNewStock.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	JOptionPane.showMessageDialog(getParent(),
	            	        "New product is added to inventory" );
	            			int newId = productRepository.findAll().size()+1;
	            			System.out.println("NEW ID:" + newId);
	            			//productRepository.insert(new Product(newId,6,Float.parseFloat(price.getText().substring(1)),String.valueOf(categoryCombo.getSelectedItem()),name.getText(),false,true, 0, String.valueOf(desc.getText()),"placeholder.png"));
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
		
		final CustomTextArea name = new CustomTextArea("Name");
		name.setMaximumSize(new Dimension(450,20));	
		
		CustomTextArea desc = new CustomTextArea("Description");
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
		
		final CustomTextArea price = new CustomTextArea("Price");
		price.setMaximumSize(new Dimension(450,20));
		
		JComboBox<String> categoryCombo = new JComboBox<String>();
		
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
			}
	                    
	    });
		
		discontinueStock.setMaximumSize(new Dimension(550,20));
		rightPanel.add(discontinueStock);
		rightPanel.add(Box.createRigidArea(new Dimension(0,10)));
				
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		return rightPanel;
		
	}
	
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
				
				int productID = (int) productTable.getModel().getValueAt(rowSelected, 0);
				
				Product temp = productRepository.findByProductID(productID);
				
				productRepository.delete(temp);
				productRepository.insert(temp);
				
				resetTable(productModel);
				
				populateProductTableData();
				
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
