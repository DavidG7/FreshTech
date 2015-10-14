import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
/**
 * 
 * @author Ricky Luu
 *
 */
public class PredicatedSales extends JPanel{
	
	private static final long serialVersionUID = 1L;
	JLabel titlelb = new JLabel("PredictedSales");
	JPanel topBar = new JPanel();
	JTable table;
	///chart......
	JPanel centre = new JPanel();
	JButton  rturn = new JButton("Return");
	String text2 =  "Your expected sales this quarter are £14.333";
	JLabel textlb2 = new JLabel(text2);
	JPanel buttonBar  = new JPanel();
	JPanel panel = new JPanel();
	
	
	public PredicatedSales(){
		panel.setLayout(new BorderLayout());
		topBar.add(titlelb);
		panel.add(topBar,BorderLayout.NORTH);
		String [] colNames = {"ProductID", "ProductName", "Current Quantity"};
		Object [][] data=  new Object [5][5];
		table = new JTable(data,colNames);
		centre.add(new JScrollPane(table));
		panel.add(centre, BorderLayout.CENTER);
		add(panel);
		//setTitle("PredictedSales");
		//setSize(400,400);
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack();
	}	

	
	/*public static void main(String [] args){
		new PredicatedSales();
 }*/
}
