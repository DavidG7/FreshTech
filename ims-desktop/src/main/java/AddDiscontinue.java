import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;


public class AddDiscontinue extends JPanel{
	
	JPanel leftPanel,rightPanel;
	JLabel heading,subHeading,optionOne,optionTwo,porousware;
	JComboBox<String> categoryCombo;
	JRadioButton porouswareButtonY,porouswareButtonN;
	
	String newline = System.getProperty("line.separator");

	public AddDiscontinue(){
		this.setLayout(new GridLayout(1,2));
		rightPanel = new JPanel(new GridLayout(9, 1));
		leftPanel = new JPanel(new GridLayout(5, 1));
		optionTwo = new JLabel("(2) Add a new product");
		categoryCombo = new JComboBox<String>();
		optionTwo.setFont(CustomFont.getFont(14));
		rightPanel.add(optionTwo);
		
		rightPanel.add(new CustomTextArea("Name"));
		
		rightPanel.add(new CustomTextArea("Description"));
	
		categoryCombo.addItem("Gnome");
		categoryCombo.addItem("Garden Accessory");
		categoryCombo.addItem("Miscellaneous");
		rightPanel.add(categoryCombo);
		
		rightPanel.add(new CustomTextArea("Price"));
		porousware = new JLabel("Porousware");
		porousware.setFont(CustomFont.getFont(14));
		rightPanel.add(porousware);
		
		porouswareButtonY = new JRadioButton("Y");
		porouswareButtonN = new JRadioButton("N");
		
		ButtonGroup porouswareGrouping = new ButtonGroup();
		porouswareGrouping.add(porouswareButtonY);
		porouswareGrouping.add(porouswareButtonN);
		rightPanel.add(porouswareButtonY);
		rightPanel.add(porouswareButtonN);
		
		JButton addNewStock = new JButton("Add new stock item");
		rightPanel.add(addNewStock);
		 /*JFileChooser fileChooser = new JFileChooser();
		 fileChooser.setDialogTitle("Choose a file");
		 this.add(fileChooser);
		 fileChooser.setVisible(true);*/
		

		heading = new JLabel("Add/Discontinue Stock Item");
		heading.setFont(CustomFont.getFont(30));
		
		subHeading = new JLabel("New products can be added ");
		subHeading.setFont(CustomFont.getFont(20));
		
		optionOne = new JLabel("(1) Select an existing product to discontinue");
		
		leftPanel.add(heading);
		leftPanel.add(subHeading);
		leftPanel.add(optionOne);
		
		this.add(leftPanel);
		this.add(rightPanel);
		
		
	}

}
