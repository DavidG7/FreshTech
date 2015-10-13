import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;


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
		optionTwo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10)); 
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
		porouswareButtonN = new JRadioButton("N");
		
		ButtonGroup porouswareGrouping = new ButtonGroup();
		porouswareGrouping.add(porouswareButtonY);
		porouswareGrouping.add(porouswareButtonN);
		rightPanel.add(porouswareButtonY);
		rightPanel.add(porouswareButtonN);
		
		JButton addNewStock = new JButton("Add new stock item");
		addNewStock.setFont(CustomFont.getFont("ITALIC", 14));
		rightPanel.add(addNewStock);
		 /*JFileChooser fileChooser = new JFileChooser();
		 fileChooser.setDialogTitle("Choose a file");
		 this.add(fileChooser);
		 fileChooser.setVisible(true);*/
		
		heading = new JLabel("Add/Discontinue Stock Item");
		heading.setFont(CustomFont.getFont("BOLD", 22));
		
		subHeading = new JLabel("New products can be added ");
		subHeading.setFont(CustomFont.getFont("ITALIC" ,16));
		
		optionOne = new JLabel("(1) Select an existing product to discontinue");
		optionOne.setFont(CustomFont.getFont("ITALIC", 14));
		
		productTable = new JTable(new ProductTableModel());
		
		JButton discontinueStock = new JButton("Discontinue selected stock");
		discontinueStock.setFont(CustomFont.getFont("ITALIC", 14));
		
		
	
		leftPanel.add(heading);
		leftPanel.add(subHeading);
		leftPanel.add(new JPanel());
		leftPanel.add(optionOne);
		leftPanel.add(new JScrollPane(productTable));
		leftPanel.add(discontinueStock);
      
     
		leftPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		 Box top = Box.createHorizontalBox();
		    top.add(leftPanel);
		    top.add(rightPanel);
		
		this.add(top);
		
		/*this.setLayout(new GridLayout(1,1));
		this.add(new TransparentImage());*/
		
		
	}

}
