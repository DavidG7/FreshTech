import java.awt.BorderLayout;
<<<<<<< HEAD
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.ScrollPane;
=======
import java.awt.GridLayout;
>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c

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
import javax.swing.JTable;
<<<<<<< HEAD
import javax.swing.UIManager;
import javax.swing.border.Border;
=======
>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.table.JTableHeader;
/**
 * 
 * @author dgordon
 *
 */

public class AddDiscontinue extends JPanel{
	
	Box leftPanel,rightPanel;
	JLabel heading,subHeading,optionOne,optionTwo,porousware;
	JComboBox<String> categoryCombo;
	JRadioButton porouswareButtonY,porouswareButtonN;
	JTable productTable;
	
	String newline = System.getProperty("line.separator");

	public AddDiscontinue(){
		this.setLayout(new BorderLayout());
		
		rightPanel = Box.createVerticalBox();
		leftPanel =  Box.createVerticalBox();
		optionTwo = new JLabel("(2) Add a new product");
		optionTwo.setForeground(new Color(0,122,0));
		categoryCombo = new JComboBox<String>();
		optionTwo.setFont(CustomFont.getFont("ITALIC", 14));
	
		rightPanel.add(optionTwo);
		
		rightPanel.add(new CustomTextArea("Name"));

		rightPanel.add(new CustomTextArea("Description"));
	
		categoryCombo.addItem("Gnome");
		categoryCombo.addItem("Garden Accessory");
		categoryCombo.addItem("Miscellaneous");
		rightPanel.add(categoryCombo);
		
		rightPanel.add(new CustomTextArea("Price"));
		porousware = new JLabel("Porousware");
		porousware.setFont(CustomFont.getFont("ITALIC",14));
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
		
		heading = new JLabel("Add/Discontinue Stock Item");
		heading.setFont(CustomFont.getFont("BOLD", 22));
		heading.setForeground(new Color(0,122,0));
		
		subHeading = new JLabel("New products can be added ");
		subHeading.setFont(CustomFont.getFont("ITALIC" ,16));
		subHeading.setForeground(new Color(0,122,0));
		
		optionOne = new JLabel("(1) Select an existing product to discontinue");
		optionOne.setFont(CustomFont.getFont("ITALIC", 14));
		optionOne.setForeground(new Color(0,122,0));
		
		productTable = new JTable(new ProductTableModel());
	
		
		 CustomButton discontinueStock = new CustomButton("Discontinue selected stock"); 
		
		
		Box HeadingandImage = Box.createHorizontalBox();

		HeadingandImage.add(new CustomImage());
		HeadingandImage.add(heading);

		leftPanel.add(HeadingandImage);
		leftPanel.add(subHeading);

		leftPanel.add(optionOne);
		JScrollPane scrollPane = new JScrollPane(productTable);
		scrollPane.getViewport().setBackground(Color.WHITE);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		JTableHeader header = productTable.getTableHeader();
	      header.setBackground(new Color(0,122,0));
	      header.setForeground(Color.WHITE);
		leftPanel.add(scrollPane);
		leftPanel.add(discontinueStock);
		leftPanel.add(new TransparentImage());
	
      
     
		leftPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		
		//leftPanel.setBackground(Color.GREEN);
		this.setBackground(new Color(255,255,255));
		
		 Box top = Box.createHorizontalBox();
		    top.add(leftPanel);
		    top.add(rightPanel);
		
		this.add(top);
<<<<<<< HEAD
	
=======
>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c
		/*this.setLayout(new GridLayout(1,1));
		this.add(new TransparentImage());*/
		
		
	}
<<<<<<< HEAD
	

	
	
	public static void main(String[] args){
		  JFrame frame = new JFrame("Please Log In");

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	    
	        frame.setSize(1000,800);
	        frame.add(new TransparentImage(frame));
	        //frame.pack();

	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        ImageIcon img = new ImageIcon("NBGardensLogo.png");
	        frame.setIconImage(img.getImage());
	        frame.setUndecorated(true);   
	        frame.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);   
	        
	        UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(new Color(0,122,0) ));
	        UIManager.put("InternalFrame.activeTitleForeground", new ColorUIResource(Color.WHITE));
	        UIManager.put("InternalFrame.titleFont", new Font("Dialog", Font.PLAIN, 11));
	}
=======
>>>>>>> ef1d975f1403ce48560a93618ceee397a370e58c

}
