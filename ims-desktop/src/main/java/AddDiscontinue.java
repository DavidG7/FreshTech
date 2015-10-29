import java.awt.BorderLayout;
//<<<<<<< HEAD
import java.awt.Color;
import java.awt.Dimension;
//=======
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import CustomUI.*;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;

//<<<<<<< HEAD
//=======
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c
import javax.swing.border.EmptyBorder;
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
 * @author dgordon
 *
 */


public class AddDiscontinue extends JPanel{
	
	private static final long serialVersionUID = 1L;
	Box leftPanel;
	JLabel heading,optionOne,optionTwo,porousware;
	JComboBox<String> categoryCombo;
	JRadioButton porouswareButtonY,porouswareButtonN;
	JTable productTable;
	
	String newline = System.getProperty("line.separator");
	

	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepositoryMongo productRepository = (ProductRepositoryMongo) mongoContext.getBean(ProductRepository.class);	

	int x = 40; //table height
	public AddDiscontinue(){
		this.setLayout(new BorderLayout());
		
		leftPanel =  Box.createVerticalBox();
		categoryCombo = new JComboBox<String>();

		
		
		
		optionOne = new CustomLabel("(1) Select an existing product to discontinue", false);
		String [] colNames = {"ProductID","Product Name"};
		Object[][] data = new Object [x][5];
		
		
        
    	List<Product> a = productRepository.findAll();

    	for(int i = 0; i <= a.size()-1; i++){
    		data[i][0] = a.get(i).getProductId();
    		data[i][1] = a.get(i).getProductName();
    	}
		
		productTable = new JTable(data, colNames);
		JTableHeader header = productTable.getTableHeader();
	      header.setBackground(new Color(0,122,0));
	      header.setForeground(Color.WHITE);
		
	    heading = new CustomLabel("Add/Discontinue Stock Item", true);
	      
		Box HeadingandImage = Box.createHorizontalBox();

		HeadingandImage.add(new CustomImage());
		HeadingandImage.add(heading);

		leftPanel.add(HeadingandImage);

		leftPanel.add(optionOne);
	
		CustomScrollPane scrollPane = new CustomScrollPane(productTable);
	
		leftPanel.add(scrollPane);
		leftPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		
		
		this.setBackground(new Color(255,255,255));
		
		 Box top = Box.createHorizontalBox();
		    top.add(leftPanel);
		    top.add(createRightPanel());
		
		this.add(top);
		
		
	}
	
	public JComponent createRightPanel()
	{
		Box rightPanel = Box.createVerticalBox();
		
		optionTwo = new CustomLabel("(2) Add a new product", false);
		
		rightPanel.add(optionTwo);
		
		final CustomTextArea name = new CustomTextArea("Name");
		CustomTextArea desc = new CustomTextArea("Description");
		final CustomTextArea price = new CustomTextArea("Price");		
		
		name.setMaximumSize(new Dimension(450,20));
		desc.setMaximumSize(new Dimension(450,20));
		price.setMaximumSize(new Dimension(450,20));
		
		rightPanel.add(name);
		rightPanel.add(Box.createRigidArea(new Dimension(0,35)));
		rightPanel.add(desc);
		rightPanel.add(Box.createRigidArea(new Dimension(0,35)));
		categoryCombo.setMaximumSize(new Dimension(450,20));
		categoryCombo.addItem("Gnome");
		categoryCombo.addItem("Garden Accessory");
		categoryCombo.addItem("Miscellaneous");
		rightPanel.add(categoryCombo);
		rightPanel.add(Box.createRigidArea(new Dimension(0,35)));		
		rightPanel.add(price);
		rightPanel.add(Box.createRigidArea(new Dimension(0,35)));
		
		porousware = new CustomLabel("Porousware", false);
	
		rightPanel.add(porousware);
		
		porouswareButtonY = new JRadioButton("Y");
		porouswareButtonY.setBackground(Color.WHITE);
		porouswareButtonN = new JRadioButton("N");
		porouswareButtonN.setBackground(Color.WHITE);
		
		ButtonGroup porouswareGrouping = new ButtonGroup();
		porouswareGrouping.add(porouswareButtonY);
		porouswareGrouping.add(porouswareButtonN);
		rightPanel.add(porouswareButtonY);
		rightPanel.add(porouswareButtonN);
		rightPanel.add(Box.createRigidArea(new Dimension(0,35)));
		
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
		
		rightPanel.add(addNewStock);
		rightPanel.add(Box.createRigidArea(new Dimension(0,30)));
		CustomButton discontinueStock = new CustomButton("Discontinue selected product"); 
		 discontinueStock.addActionListener(new ActionListener() {
			 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	JOptionPane.showMessageDialog(getParent(),
	            	        "Product is no longer available");
	                   }
	                    
	     });
		discontinueStock.setMaximumSize(new Dimension(550,20));
		rightPanel.add(discontinueStock);
		rightPanel.add(Box.createRigidArea(new Dimension(0,10)));
		
		
		
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		return rightPanel;
		
	}
	
	/*public JComponent addLeftPanel()
	{
		
	}*/
	
}
