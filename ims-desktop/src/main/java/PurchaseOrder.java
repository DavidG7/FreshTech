import java.awt.FlowLayout;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PurchaseOrder extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel title;
	private JLabel subTitle;
	
	private JFrame mainFrame; 
	
	private JPanel purchaseOrderPanel;	

	private JComboBox<String> listOfSuppliers;
	private JComboBox<Integer> quantityRequired;
	
	private JScrollPane scrollPane;
	
	private JButton placeOrder;
	
	public PurchaseOrder()
	{		
		setLayout(new FlowLayout());
		
		purchaseOrderPanel = new JPanel();
		
		add(createInformationPanel());
		add(createProductListPanel());
		add(createActionPanel());
				
		add(purchaseOrderPanel);
				
		initPurchaseOrder();
		
	}
	
	public void initPurchaseOrder()
	{
		purchaseOrderPanel.setLayout(new GroupLayout(purchaseOrderPanel));

	}
	
	public JComponent createInformationPanel()
	{
		JPanel infoPanel = new JPanel(new FlowLayout());
		
		title = new JLabel("Purchase Order");
		subTitle = new JLabel("Place a purchase order here");
		
		title.setLocation(10,  10);
		subTitle.setLocation(10, 40);
		
		infoPanel.add(title);
		infoPanel.add(subTitle);
		
		return infoPanel;
	}
	
	public JComponent createProductListPanel()
	{
		JPanel productPanel = new JPanel();
		
		productPanel.setLayout(new GroupLayout(productPanel));
		
		DefaultTableModel productModel = new DefaultTableModel();
		JTable productTable = new JTable(productModel);
	
		productModel.addColumn("Product ID");
		productModel.addColumn("Product Name");
		productModel.addColumn("Current Quantity");
		
		scrollPane = new JScrollPane(productTable);
		
		productPanel.add(scrollPane);
		
		return productPanel;
		
	}
	
	public JComponent createActionPanel()
	{		
		JPanel actionPanel = new JPanel();
		
		actionPanel.setLayout(new FlowLayout());
		
		placeOrder = new JButton("Place Order");
		
		actionPanel.add(placeOrder);
		
		return actionPanel;
	}
	
	public static void createJFrame()
	{
		JFrame main = new JFrame("Purchase Order");
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main.add(new PurchaseOrder());
	
		main.pack();
	    //main.setResizable(false);
	    main.setLocation(700,300);
	    main.setVisible(true);
	}
		
	public static void main(String[] args)
	{
		createJFrame();
		
	}
	
}
