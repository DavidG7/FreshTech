import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

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
import javax.swing.table.DefaultTableModel;

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
		setLayout(new GridLayout(2,1));
			
		add(createInformationPanel());
		
		JPanel splitPanel = new JPanel();
		
		splitPanel.setSize(600, 600);
		splitPanel.setLayout(new BoxLayout(splitPanel, BoxLayout.LINE_AXIS));
		
		splitPanel.add(createProductListPanel());
		splitPanel.add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
		
		splitPanel.add(createPurchaseOrderInfoPanel());
		
		add(splitPanel);

	}
	
	public JComponent createInformationPanel()
	{
		JPanel infoPanel = new JPanel(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel title = new JLabel("Purchase Order");
		JLabel subTitle = new JLabel("Place a purchase order here");
			
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		
		infoPanel.add(title, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		
		infoPanel.add(subTitle, c);
		
		infoPanel.setSize(600, 200);
		
		return infoPanel;
	}
	
	public JComponent createProductListPanel()
	{
		JPanel productPanel = new JPanel();
		
		GridBagConstraints c = new GridBagConstraints();
		
		productPanel.setLayout(new GridBagLayout());
		
		JLabel instructionSet = new JLabel ("(1) Select a product");
		
		DefaultTableModel productModel = new DefaultTableModel();
		
		String [] colNames = {"ProductID","Product Name","Product Quantity","Status"};
		Object[][] data = new Object [5][5];
		
		JTable productTable = new JTable(data, colNames);
	
		productModel.addColumn("Product ID");
		productModel.addColumn("Product Name");
		productModel.addColumn("Current Quantity");
		
		JScrollPane scrollPane = new JScrollPane(productTable);
		
		JButton placeOrder = new JButton("Place Order");
				
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		productPanel.add(instructionSet, c);
					
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.ipady = 200; 
		c.gridx = 0;
		c.gridy = 10;
		productPanel.add(scrollPane, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.ipady = 1; 
		c.gridx = 0;
		c.gridy = 20;
		productPanel.add(placeOrder, c);
		
		return productPanel;
	}
	
	public JComponent createPurchaseOrderInfoPanel()
	{
		JPanel orderInfoPanel = new JPanel(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
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
		
		JLabel instruction = new JLabel("Select supplier");
		JLabel instructionTwo = new JLabel("Select Quantity");
		
		JComboBox<String> listOfSuppliers = new JComboBox<String>(tempNames);
		JComboBox<String> quantityRequired = new JComboBox<String>(quantity);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 20;
		c.gridx = 0;
		c.gridy = 0;
		orderInfoPanel.add(instruction, c);
				
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;
		c.gridx = 0;
		c.gridy = 20;
		orderInfoPanel.add(listOfSuppliers, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.ipady = 40; 
		c.gridx = 0;
		c.gridy = 40;
		orderInfoPanel.add(instructionTwo, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.ipady = 40;
		c.gridx = 0;
		c.gridy = 60;
		orderInfoPanel.add(quantityRequired, c);
		
		return orderInfoPanel;
	}

	public static void createJFrame()
	{
		JFrame main = new JFrame("Purchase Order");
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main.add(new PurchaseOrder());
	
		main.pack();
	    
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
