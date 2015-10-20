import java.awt.BorderLayout;
//<<<<<<< HEAD
import java.awt.Color;
import java.awt.Dimension;
//=======
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CustomUI.*;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
//<<<<<<< HEAD
//=======
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c
import javax.swing.border.EmptyBorder;

import CustomUI.CustomButton;
import CustomUI.CustomLabel;

/**
 * 
 * @author dgordon
 *
 */

public class AddDiscontinue extends JPanel{
	
	private static final long serialVersionUID = 1L;
	Box leftPanel,rightPanel;
	JLabel heading,optionOne,optionTwo,porousware;
	JComboBox<String> categoryCombo;
	JRadioButton porouswareButtonY,porouswareButtonN;
	CustomJTable productTable;
	
	String newline = System.getProperty("line.separator");

	public AddDiscontinue(){
		this.setLayout(new BorderLayout());
		
		rightPanel = Box.createVerticalBox();
		leftPanel =  Box.createVerticalBox();
		categoryCombo = new JComboBox<String>();

		optionTwo = new CustomLabel("(2) Add a new product", false);
	
		rightPanel.add(optionTwo);
		
		CustomTextArea name = new CustomTextArea("Name");
		CustomTextArea desc = new CustomTextArea("Description");
		CustomTextArea price = new CustomTextArea("Price");		
		
		name.setMaximumSize(new Dimension(300,20));
		desc.setMaximumSize(new Dimension(300,20));
		price.setMaximumSize(new Dimension(300,20));
		
		rightPanel.add(name);
		rightPanel.add(desc);
		categoryCombo.setMaximumSize(new Dimension(300,20));
		categoryCombo.addItem("Gnome");
		categoryCombo.addItem("Garden Accessory");
		categoryCombo.addItem("Miscellaneous");
		rightPanel.add(categoryCombo);
		
		rightPanel.add(price);
		
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
		
		CustomButton addNewStock = new CustomButton("Add new stock item");
		addNewStock.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	JOptionPane.showMessageDialog(getParent(),
	            	        "New product is added to inventory" );
	                    }
	                    
	     });
		
		rightPanel.add(addNewStock);
		
		
		
		heading = new CustomLabel("Add/Discontinue Stock Item", true);
		
		optionOne = new CustomLabel("(1) Select an existing product to discontinue", false);
	
		productTable = new CustomJTable();
	
		
		 CustomButton discontinueStock = new CustomButton("Discontinue selected product"); 
		 discontinueStock.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	JOptionPane.showMessageDialog(getParent(),
	            	        "Product is no longer available");
	                   }
	                    
	     });
		
		
		Box HeadingandImage = Box.createHorizontalBox();

		HeadingandImage.add(new CustomImage());
		HeadingandImage.add(heading);

		leftPanel.add(HeadingandImage);

		leftPanel.add(optionOne);
	
		CustomScrollPane scrollPane = new CustomScrollPane(productTable);
	
		leftPanel.add(scrollPane);
		leftPanel.add(discontinueStock);
		
      
     
		leftPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		
		
		this.setBackground(new Color(255,255,255));
		
		 Box top = Box.createHorizontalBox();
		    top.add(leftPanel);
		    top.add(rightPanel);
		
		this.add(top);
		
		
	}
}
