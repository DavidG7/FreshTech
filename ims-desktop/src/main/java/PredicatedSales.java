import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.JTableHeader;

import CustomUI.CustomFont;
import CustomUI.CustomLabel;
import CustomUI.CustomPieChart;
import CustomUI.CustomScrollPane;
/**
 * 
 * @author Ricky Luu
 *
 */
public class PredicatedSales extends JPanel{

	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1L;
	JLabel heading, option, salesPrediction;
	JPanel topBar = new JPanel();
	Box main;
	JTable table;
	JPanel leftPanel,rightPanel, headingLeft;
	String productName = "PRODUCTNAME";
	///chart......

	int x = 35;
	
	public PredicatedSales(){
		this.setLayout(new BorderLayout());
		leftPanel = new JPanel();
		rightPanel = new JPanel();
		headingLeft = new JPanel(new GridLayout(1,2));
		heading = new CustomLabel("Predicted Sales",true);
		headingLeft.setBackground(Color.WHITE);
		//option = new CustomLabel("Select a product to view it's predicted sales", false);
		//option.setVerticalAlignment(SwingConstants.TOP);
		CustomImage icon = new CustomImage();
		heading.setPreferredSize(new Dimension(1000,100));
		headingLeft.add(heading);	
		headingLeft.add(icon);
		
		headingLeft.setBorder(new EmptyBorder(30, 200, 30, 200));
		
		add(headingLeft, BorderLayout.NORTH);
		//leftPanel.add(option);
		//this.add(topBar,BorderLayout.NORTH);
		
		
		String [] colNames = {"ProductID","Product Name","Quantity","Yearly Sales"};
		Object[][] data = new Object[x][5];
		table = new JTable(data ,colNames);
		JTableHeader header = table.getTableHeader();
	      header.setBackground(new Color(0,122,0));
	      header.setForeground(Color.WHITE);
		
	      
	      
		CustomScrollPane scrollPane = new CustomScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(500,500));
		leftPanel.add(scrollPane);
		
		
		//CustomButton butReturn = new CustomButton("Return");
		//leftPanel.add(butReturn);
		final CustomPieChart pie = new CustomPieChart("Sales","Sales");
		rightPanel.add(pie);
		pie.setBackground(Color.WHITE);
		pie.setBorder(new EmptyBorder(70,0,0,0));
		salesPrediction = new JLabel("Expecting {" + productName + "} to sell 14,000 this quarter");
		
		//salesPrediction.setMargin(new Insets(150,20,150,150));
		new CustomFont();
		salesPrediction.setFont(CustomFont.getFont("BOLD", 12));
		//rightPanel.add(salesPrediction);
		
		
		main = Box.createHorizontalBox();
		this.add(main,BorderLayout.CENTER);
		main.setBackground(Color.WHITE);
		main.add(leftPanel);
		main.add(rightPanel);
		leftPanel.setBackground(Color.WHITE);
		rightPanel.setBackground(Color.WHITE);

		
		//GUIMain.frame.pack();
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
	}	

	
	
}
