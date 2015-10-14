import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import CustomUI.CustomButton;
import CustomUI.CustomImage;
import CustomUI.CustomLabel;
import CustomUI.CustomPieChart;
import CustomUI.CustomScrollPane;
/**
 * 
 * @author Ricky Luu
 *
 */
public class PredicatedSales extends JPanel{
	
	//private static final long serialVersionUID = 1L;
	JLabel heading, option;
	JPanel topBar = new JPanel();
	CustomJTable table;
	JPanel leftPanel,rightPanel, headingLeft;
	///chart......
	/*JPanel centre = new JPanel();
	JButton  rturn = new JButton("Return");
	String text2 =  "Your expected sales this quarter are £14.333";
	JLabel textlb2 = new JLabel(text2);
	JPanel buttonBar  = new JPanel();
	JPanel panel = new JPanel();*/
	
	
	public PredicatedSales(){
		this.setLayout(new GridLayout(1,2));
		leftPanel = new JPanel(new GridLayout(2,1));
		rightPanel = new JPanel(new GridLayout(2,1));
		headingLeft = new JPanel(new GridLayout(1,2));
		heading = new CustomLabel("Predicted Sales",true);
		headingLeft.setBackground(Color.WHITE);
		//option = new CustomLabel("Select a product to view it's predicted sales", false);
		//option.setVerticalAlignment(SwingConstants.TOP);
		CustomImage icon = new CustomImage();
		
		headingLeft.add(heading);	
		headingLeft.add(icon);
		
		leftPanel.add(headingLeft);
		//leftPanel.add(option);
		//this.add(topBar,BorderLayout.NORTH);
		table = new CustomJTable();
		CustomScrollPane scrollPane = new CustomScrollPane(table);
		leftPanel.add(scrollPane);
		
		//CustomButton butReturn = new CustomButton("Return");
		//leftPanel.add(butReturn);
		rightPanel.add(new CustomPieChart("Sales","Sales"));
		this.add(leftPanel);
		this.add(rightPanel);
		//panel.add(centre, BorderLayout.CENTER);
		//this.add(panel);
		//setTitle("PredictedSales");
		//setSize(400,400);
		leftPanel.setBackground(Color.WHITE);
		rightPanel.setBackground(Color.WHITE);
		leftPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//pack();
	}	

	
	
}
