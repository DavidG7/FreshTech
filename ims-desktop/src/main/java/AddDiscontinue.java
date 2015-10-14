import java.awt.BorderLayout;
//<<<<<<< HEAD
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.ScrollPane;
//=======
import java.awt.GridLayout;
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c



import CustomUI.*;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
//<<<<<<< HEAD
import javax.swing.UIManager;
import javax.swing.border.Border;
//=======
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.table.JTableHeader;

import CustomUI.CustomButton;
import CustomUI.CustomFont;
import CustomUI.CustomImage;
import CustomUI.CustomLabel;
import CustomUI.CustomPieChart;

/**
 * 
 * @author dgordon
 *
 */

public class AddDiscontinue extends JPanel{
	
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
		
		/*optionTwo = new JLabel("(2) Add a new product");
		optionTwo.setForeground(new Color(0,122,0));
		optionTwo.setFont(CustomFont.getFont("ITALIC", 14));*/
		optionTwo = new CustomLabel("(2) Add a new product", false);
	
		rightPanel.add(optionTwo);
		
		rightPanel.add(new CustomTextArea("Name"));

		rightPanel.add(new CustomTextArea("Description"));
	
		categoryCombo.addItem("Gnome");
		categoryCombo.addItem("Garden Accessory");
		categoryCombo.addItem("Miscellaneous");
		rightPanel.add(categoryCombo);
		
		rightPanel.add(new CustomTextArea("Price"));
		
		porousware = new CustomLabel("Porousware", false);
		/*porousware = new JLabel("Porousware");
		porousware.setFont(CustomFont.getFont("ITALIC",14));*/
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
		
		rightPanel.add(addNewStock);
		 /*JFileChooser fileChooser = new JFileChooser();
		 fileChooser.setDialogTitle("Choose a file");
		 this.add(fileChooser);
		 fileChooser.setVisible(true);*/
		
		//heading = new JLabel("Add/Discontinue Stock Item");
		heading = new CustomLabel("Add/Discontinue Stock Item", true);
		
		optionOne = new CustomLabel("(1) Select an existing product to discontinue", false);
		/*optionOne = new JLabel("(1) Select an existing product to discontinue");
		optionOne.setFont(CustomFont.getFont("ITALIC", 14));
		optionOne.setForeground(new Color(0,122,0));*/
		
		productTable = new CustomJTable();
	
		
		 CustomButton discontinueStock = new CustomButton("Discontinue selected stock"); 
		
		
		Box HeadingandImage = Box.createHorizontalBox();

		HeadingandImage.add(new CustomImage());
		HeadingandImage.add(heading);

		leftPanel.add(HeadingandImage);

		leftPanel.add(optionOne);
		/*JScrollPane scrollPane = new JScrollPane(productTable);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());*/
		CustomScrollPane scrollPane = new CustomScrollPane(productTable);
	
		leftPanel.add(scrollPane);
		leftPanel.add(discontinueStock);
		//leftPanel.add(new TransparentImage());
	
      
     
		leftPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		
		//leftPanel.setBackground(Color.GREEN);
		this.setBackground(new Color(255,255,255));
		
		 Box top = Box.createHorizontalBox();
		    top.add(leftPanel);
		    top.add(rightPanel);
		
		this.add(top);
//<<<<<<< HEAD
	
//=======
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c
		/*this.setLayout(new GridLayout(1,1));
		this.add(new TransparentImage());*/
		
		
	}
//<<<<<<< HEAD
	

	
	
	public static void main(String[] args){
		  JFrame frame = new JFrame("Inventory Management System");

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JTabbedPane pane = new JTabbedPane();
	    //  pane.add(new LogIn());
	   
	      pane.setForeground(new Color(0,122,0));
	      pane.setBackground(Color.WHITE);
	      
	      pane.addTab("Daily Stock Report", new DailyStockReport());
	      pane.addTab("Purchase Order", new PurchaseOrder());
	      pane.addTab("Predicted Sales", new PredicatedSales());
	      pane.addTab("Add/Discontinue Stock", new AddDiscontinue());
	         
	        frame.setSize(1000,800);
	        frame.add(new TransparentImage(frame, pane));
	        //frame.pack();
	        //frame.add(pane);

	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        ImageIcon img = new ImageIcon("NBGardensLogo.png");
	        frame.setIconImage(img.getImage());
	        frame.setUndecorated(true);   
	        frame.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);   
//<<<<<<< HEAD
      

	}
//=======
	      
	}
//>>>>>>> ab27ee42ed16f44b5fc835c5d6eca36714c8db47
//=======
//>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c

