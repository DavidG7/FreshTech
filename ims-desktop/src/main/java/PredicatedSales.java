import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;

import CustomUI.CustomScrollPane;
/**
 * 
 * @author Ricky Luu
 *
 */
public class PredicatedSales extends JPanel{
	
	//private static final long serialVersionUID = 1L;
	JLabel titlelb = new JLabel("Predicted Sales");
	JPanel topBar = new JPanel();
	CustomJTable table;
	///chart......
	/*JPanel centre = new JPanel();
	JButton  rturn = new JButton("Return");
	String text2 =  "Your expected sales this quarter are £14.333";
	JLabel textlb2 = new JLabel(text2);
	JPanel buttonBar  = new JPanel();
	JPanel panel = new JPanel();*/
	
	
	public PredicatedSales(){
		this.setLayout(new BorderLayout());
		this.add(titlelb);
		this.add(topBar,BorderLayout.NORTH);
		
		table = new CustomJTable();
		CustomScrollPane scrollPane = new CustomScrollPane(table);
		this.add(scrollPane, BorderLayout.CENTER);
		//panel.add(centre, BorderLayout.CENTER);
		//this.add(panel);
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
