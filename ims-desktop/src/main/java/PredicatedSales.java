import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import CustomUI.CustomButton;
import CustomUI.CustomFont;
import CustomUI.CustomLabel;
import CustomUI.CustomPieChart;
import CustomUI.CustomScrollPane;
import CustomUI.CustomTextArea;
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
	JTextArea salesPrediction;
	String productName = "PRODUCTNAME";
	///chart......

	
	
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
		final CustomPieChart pie = new CustomPieChart("Sales","Sales");
		rightPanel.add(pie);
		salesPrediction = new JTextArea("Expecting {" + productName + "} to sell 14,000 this quarter");
		salesPrediction.setEditable(false);
		salesPrediction.setMargin(new Insets(150,20,150,150));
		salesPrediction.setFont(new CustomFont().getFont("BOLD", 12));
		rightPanel.add(salesPrediction);
		this.add(leftPanel);
		this.add(rightPanel);
		
		leftPanel.setBackground(Color.WHITE);
		rightPanel.setBackground(Color.WHITE);
		leftPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
		rightPanel.setBorder(new EmptyBorder(95, 30, 30, 100));
		
		setVisible(true);
		
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		ListSelectionModel selectionModel = table.getSelectionModel();

		selectionModel.addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		    	
		        pie.refreshChart();
		        productName = (String)table.getModel().getValueAt(table.getSelectedRow(),1);
		        salesPrediction.setText(("Expected " + productName + " sales this quarter are 14,000"));
		    }
		});

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//pack();
	}	

	
	
}
