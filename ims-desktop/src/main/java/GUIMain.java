import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


public class GUIMain 
{

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Inventory Management System");

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JTabbedPane pane = new JTabbedPane();
	    	   
	    pane.setForeground(new Color(0,122,0));
	    pane.setBackground(Color.WHITE);
	     
	    pane.addTab("Daily Stock Report", new DailyStockReport());
	    pane.addTab("Purchase Order", new PurchaseOrder());
	    pane.addTab("Predicted Sales", new PredicatedSales());
	    pane.addTab("Add/Discontinue Stock", new AddDiscontinue());
	         
	    frame.add(new LogIn());
	    
	    frame.setSize(1000,800);
	    
	    
	    
	    frame.add(new TransparentImage(frame, pane));
	    
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    ImageIcon img = new ImageIcon("NBGardensLogo.png");
	    frame.setIconImage(img.getImage());
	    frame.setUndecorated(true);   
	    frame.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);   
	        
	    UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(new Color(0,122,0) ));
	    UIManager.put("InternalFrame.activeTitleForeground", new ColorUIResource(Color.WHITE));
	    UIManager.put("InternalFrame.titleFont", new Font("Dialog", Font.PLAIN, 11));
	}
	
	
}
