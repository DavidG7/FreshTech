import java.awt.BorderLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;



public class DailyStockReport extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTable  reportTable;
	private JLabel label = new JLabel("Daily Stock Report");
	private JPanel panel;
	private JPanel topBar = new JPanel();
	private JPanel bottomBar = new JPanel();
	private JLabel date  = new JLabel(new Date().toString());
	private JButton rturn = new JButton("return");
	private JTextField searchText;

	public DailyStockReport(){
		setTitle("DailyStockReport");
		String [] colNames = {"ProductID","Product Name","Product Quantity","Status"};
		Object[][] data = new Object [5][5];
		reportTable = new JTable(data,colNames);
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		topBar.add(label);
		searchText = new JTextField("Search");
		topBar.add(searchText);
		panel.add(topBar, BorderLayout.NORTH);
		panel.add(new JScrollPane(reportTable),BorderLayout.CENTER);
		bottomBar.add(date);
		bottomBar.add(rturn);
		panel.add(bottomBar,BorderLayout.SOUTH);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,250);
		pack();
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args){
		new DailyStockReport();
	}
}