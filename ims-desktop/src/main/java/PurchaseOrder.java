import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
		setLayout(new GridLayout(5,5));
			
		add(createInformationPanel());
		add(createProductListPanel());
		add(createPurchaseOrderInfoPanel());

	}
	
	public JComponent createInformationPanel()
	{
		JPanel infoPanel = new JPanel(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel title = new JLabel("Purchase Order");
		JLabel subTitle = new JLabel("Place a purchase order here");
		
		title.setLocation(10,  10);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		
		subTitle.setLocation(10, 40);
		
		
		
		infoPanel.add(title);
		
		
		
		infoPanel.add(subTitle);
		
		return infoPanel;
	}
	
	public JComponent createProductListPanel()
	{
		JPanel productPanel = new JPanel();
		
		productPanel.setLayout(new GridLayout(2, 1));
		
		JLabel instructionSet = new JLabel ("(1) Select a product");
		
		DefaultTableModel productModel = new DefaultTableModel();
		JTable productTable = new JTable(productModel);
	
		productModel.addColumn("Product ID");
		productModel.addColumn("Product Name");
		productModel.addColumn("Current Quantity");
		
		JScrollPane scrollPane = new JScrollPane(productTable);
		
		JButton placeOrder = new JButton("Place Order");
				
		productPanel.add(instructionSet);
		productPanel.add(scrollPane);
		productPanel.add(placeOrder);
		
		return productPanel;
	}
	
	public JComponent createPurchaseOrderInfoPanel()
	{
		JPanel orderInfoPanel = new JPanel(new GridLayout(4, 1));
		
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
		
		orderInfoPanel.add(instruction);
		orderInfoPanel.add(listOfSuppliers);
		orderInfoPanel.add(instructionTwo);
		orderInfoPanel.add(quantityRequired);
		
		return orderInfoPanel;
	}

	public static void createJFrame()
	{
		JFrame main = new JFrame("Purchase Order");
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main.add(new PurchaseOrder());
	
		main.pack();
	    
	    main.setLocation(700,300);
	    main.setVisible(true);
	}
		
	public static void main(String[] args)
	{
		createJFrame();
		
	}
	
}
