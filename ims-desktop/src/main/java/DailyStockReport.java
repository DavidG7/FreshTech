import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import CustomUI.CustomScrollPane;

/**
 * 
 * @author ricky luu
 *
 */

public class DailyStockReport extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTable  reportTable;
	private JLabel label = new JLabel("Daily Stock Report");
	private JPanel panel;
	private JPanel topBar = new JPanel();
	private JPanel bottomBar = new JPanel();
	private JLabel date  = new JLabel(new Date().toString());
	private JButton rturn = new JButton("return");
	private JTextField searchText;
	
	//TEMPORARY - WILL BE EQUAL TO NUMBER OF PRODUCTS IN STOCK REPORT
	int x = 25;
	//---------------------------------------------------------------

	public DailyStockReport(){
		
		setBackground(Color.WHITE);
		String [] colNames = {"ProductID","Product Name","Product Quantity","Status"};
		Object[][] data = new Object [x][5];// <--- Here is where X is used
		reportTable = new JTable(data,colNames);
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		topBar.setBackground(Color.WHITE);
		topBar.add(label);
		searchText = new JTextField("Search");
		topBar.add(searchText);
		panel.add(topBar, BorderLayout.NORTH);
		panel.add(new CustomScrollPane(reportTable),BorderLayout.CENTER);
		bottomBar.setBackground(Color.white);
		bottomBar.add(date);
		bottomBar.add(rturn);
		panel.add(bottomBar,BorderLayout.SOUTH);
		add(panel);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,250);
		//pack();
		setVisible(true);
		
	}

}