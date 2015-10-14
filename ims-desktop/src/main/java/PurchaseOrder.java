import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import CustomUI.CustomFont;

/**
 * 
 * @author Thomas Dudley
 * 
 * This class will form the GUI for the Purchase Order page. 
 * The user will be able to select a product from the list,
 * select a supplier and and a quantity for the product.
 * These will then be added to the purchase order.
 *
 */

public class PurchaseOrder extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PurchaseOrder()
	{		
		setLayout(new BorderLayout());
		
		JPanel splitPanel = new JPanel();
	
		splitPanel.setLayout(new BoxLayout(splitPanel, BoxLayout.LINE_AXIS));
		
		splitPanel.add(createProductListPanel(), BorderLayout.WEST);
		splitPanel.add(createPurchaseOrderInfoPanel(), BorderLayout.CENTER);
		
		add(splitPanel);

	}
	public JComponent createProductListPanel()
	{
		Box productPanel = Box.createVerticalBox();
		
		JLabel title = new JLabel("Purchase Order");
		JLabel subTitle = new JLabel("Place a purchase order here");
		
		title.setFont(CustomFont.getFont("BOLD", 26));
		subTitle.setFont(CustomFont.getFont("ITALIC", 14));
		
		JLabel instructionSet = new JLabel ("(1) Select a product");
		
		String [] colNames = {"ProductID","Product Name","Product Quantity"};
		Object[][] data = new Object [5][5];
		
		JTable productTable = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(productTable);
				
		JButton placeOrder = new JButton("Place Order");
		
		placeOrder.setFont(CustomFont.getFont("PLAIN", 14));
	
		productPanel.add(title);
		productPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		productPanel.add(subTitle);
		productPanel.add(Box.createRigidArea(new Dimension(0, 60)));
		productPanel.add(instructionSet);
		productPanel.add(scrollPane);
		productPanel.add(placeOrder);
		
		return productPanel;
	}
	
	public JComponent createPurchaseOrderInfoPanel()
	{
		JPanel orderInfoPanel = new JPanel();
		GridLayout grid = new GridLayout(20, 1);

		orderInfoPanel.setLayout(grid);
		
		String[] tempNames = new String[5];
		
		tempNames[0] = new String("Supplier One");
		tempNames[1] = new String("Supplier Two");
		tempNames[2] = new String("Supplier Three");
		tempNames[3] = new String("Supplier Four");
		tempNames[4] = new String("Supplier Five");
				
		String[] quantity = new String[10];
		
		for(int i = 1; i < 11; i++)
		{
			quantity[i - 1] = "" + i;
		}
		
		JLabel instruction = new JLabel("(2) Select Supplier");
		JLabel instructionTwo = new JLabel("(3) Select Quantity");
		
		JComboBox<String> listOfSuppliers = new JComboBox<String>(tempNames);
		JComboBox<String> quantityRequired = new JComboBox<String>(quantity);

		grid.preferredLayoutSize(orderInfoPanel);
		
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 300)));
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 300)));
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 300)));
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 300)));
		orderInfoPanel.add(instruction);
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 100)));
		listOfSuppliers.setPreferredSize(new Dimension(100, 20));
		orderInfoPanel.add(listOfSuppliers);
	
		
		orderInfoPanel.add(Box.createRigidArea(new Dimension(0, 100)));
		orderInfoPanel.add(instructionTwo);
		orderInfoPanel.add(quantityRequired);
				
		return orderInfoPanel;
	}

	public static void createJFrame()
	{
		JFrame main = new JFrame("Purchase Order");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main.add(new PurchaseOrder());
	
	    main.setLocation(400,300);
	    main.setMinimumSize(new Dimension(800,600));
	    main.setSize(800, 600);
	    main.setVisible(true);
	}
		
	public static void main(String[] args)
	{
		createJFrame();
		
	}
	
}
