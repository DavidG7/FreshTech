import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.util.Vector;


import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;

import CustomUI.*;

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
		this.setLayout(new BorderLayout());
		
		JPanel splitPanel = new JPanel();
	
		splitPanel.setLayout(new BoxLayout(splitPanel, BoxLayout.LINE_AXIS));
		splitPanel.add(createProductListPanel());
		
		JPanel northSouthPanel = new JPanel();
	
		northSouthPanel.setLayout(new BorderLayout());
		northSouthPanel.setBorder(new EmptyBorder( 142, 0, 0, 0));
		northSouthPanel.setBackground(Color.WHITE);
		northSouthPanel.add(createPurchaseOrderInfoPanel(), BorderLayout.CENTER);
		northSouthPanel.add(createPurchaseOrderPanel(), BorderLayout.SOUTH);
		
		JPanel buttons = new JPanel();
		buttons.setBackground(Color.WHITE);
		buttons.setPreferredSize(new Dimension(200,200));
		buttons.setBorder(new EmptyBorder(30,0,0,50));
		
		
		CustomButton add = new CustomButton("Add");
		add.setPreferredSize(new Dimension(150,30));
		CustomButton remove = new CustomButton("Remove");
		remove.setPreferredSize(new Dimension(150,30));
		CustomButton clear = new CustomButton("Clear");
		clear.setPreferredSize(new Dimension(150,30));
		CustomButton placeOrder = new CustomButton("Place Order");
		placeOrder.setPreferredSize(new Dimension(150,30));
		
		buttons.add(add);
		buttons.add(remove);
		buttons.add(clear);
		buttons.add(placeOrder);
		
		northSouthPanel.add(buttons,BorderLayout.EAST);
		
		splitPanel.add(northSouthPanel, BorderLayout.SOUTH);
		splitPanel.setBackground(Color.WHITE);
		
		this.add(splitPanel);

	}
	public JComponent createProductListPanel()
	{
		Box productPanel = Box.createVerticalBox();
				
		CustomLabel title = new CustomLabel("Purchase Order", true);
		CustomLabel subTitle = new CustomLabel("Place a Purchase Order Here", true);
		CustomLabel instructionSet = new CustomLabel ("(1) Select a Product", false);
		
		String [] colNames = {"ProductID","Product Name","Quantity"};
		Object[][] data = new Object [35][5];
		JTable productTable = new JTable(data, colNames);
		productTable.setPreferredSize(new Dimension(400,700));
		
		JScrollPane scrollPane = new JScrollPane(productTable);		
		
		
		
		JTableHeader header = productTable.getTableHeader();
	    header.setBackground(new Color(0,122,0));
	    header.setForeground(Color.WHITE);
	    productTable.setPreferredScrollableViewportSize(productTable.getPreferredSize());
		
		productPanel.setForeground(Color.WHITE);
		title.setFont(CustomFont.getFont("BOLD", 26));
		subTitle.setFont(CustomFont.getFont("ITALIC", 14));
		instructionSet.setFont(CustomFont.getFont("PLAIN", 14));
		scrollPane.setFont(CustomFont.getFont("PLAIN", 14));
		scrollPane.getViewport().setBackground(Color.WHITE);
		
		productTable.setFont(CustomFont.getFont("PLAIN", 14));
		
		productPanel.add(title);
		productPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		productPanel.add(subTitle);
		productPanel.add(Box.createRigidArea(new Dimension(0, 60)));
		productPanel.add(instructionSet);
		productPanel.add(scrollPane);

		productPanel.setBorder(new EmptyBorder(30, 30, 30, 30));
				
		return productPanel;
	}
	
	public JComponent createPurchaseOrderInfoPanel()
	{
		JPanel orderInfoPanel = new JPanel();
		BoxLayout grid = new BoxLayout(orderInfoPanel, BoxLayout.Y_AXIS);
		
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
		
		CustomLabel instruction = new CustomLabel("(2) Select Supplier", false);
		CustomLabel instructionTwo = new CustomLabel("(3) Select Quantity", false);
				
		JComboBox<String> listOfSuppliers = new JComboBox<String>(tempNames);
		JComboBox<String> quantityRequired = new JComboBox<String>(quantity);

		orderInfoPanel.setLayout(grid);
		orderInfoPanel.setBackground(Color.WHITE);		
		
		instruction.setFont(CustomFont.getFont("PLAIN", 14));
		instructionTwo.setFont(CustomFont.getFont("PLAIN", 14));
		listOfSuppliers.setFont(CustomFont.getFont("PLAIN", 14));
		quantityRequired.setFont(CustomFont.getFont("PLAIN", 14));
		
		listOfSuppliers.setForeground(new Color(0,122,0));
		quantityRequired.setForeground(new Color(0,122,0));

		orderInfoPanel.add(instruction);
		listOfSuppliers.setPreferredSize(new Dimension(50, 30));
		orderInfoPanel.add(listOfSuppliers);
	
		orderInfoPanel.add(instructionTwo);
		orderInfoPanel.add(quantityRequired);
		
		orderInfoPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		return orderInfoPanel;
	}	
	
	public JComponent createPurchaseOrderPanel()
	{
		JPanel purchaseOrderPanel = new JPanel();
		
		String [] colNames = {"Product ID", "Product Name", "Quantity"};
		Object[][] data = new Object[19][4];
		JTable purchaseOrderTable = new JTable(data, colNames);
		CustomScrollPane scrollPane = new CustomScrollPane(purchaseOrderTable);
		
		JTableHeader header = purchaseOrderTable.getTableHeader();
	    header.setBackground(new Color(0,122,0));
	    header.setForeground(Color.WHITE);
	    purchaseOrderTable.setPreferredSize(new Dimension(450, 300));
	    purchaseOrderTable.setPreferredScrollableViewportSize(purchaseOrderTable.getPreferredSize());
	    
	    //purchaseOrderPanel.setPreferredSize(new Dimension(480,600));
	    
		
		scrollPane.getViewport().setBackground(Color.WHITE);

	    purchaseOrderPanel.setBorder(new EmptyBorder(50, 0, 25, 38));
		purchaseOrderPanel.add(scrollPane);
		purchaseOrderPanel.setBackground(Color.WHITE);
		
		return purchaseOrderPanel;
	}
	
	public void addPurchaseOrder(CustomButton button, final JTable productTable, 
			final JComboBox<String> suppliers, final JComboBox<String> quant)
	{
		//final Vector<String> product = new Vector<String>();
		
		button.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent e) 
			{
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) 
			{
				/*
				int productRow = productTable.getSelectedRow();
				int productCol = productTable.getSelectedColumn();
				
				//Object tempObj = productTable.getValueAt(productRow);
				//product.add((String) tempObj);
				
				String tempSupplier = (String) suppliers.getSelectedItem();
				String tempQuant = (String) quant.getSelectedItem();*/

			}
			

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		});
	}
}
