import java.awt.Color;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import java.awt.image.ColorModel;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class GUIMain 
{
	private BufferedImage image;
   try {                
	   image = ImageIO.read(getClass().getResource("/images/NBGardensLogo.png"));
   } catch (IOException ex) {
        // handle exception...
   }
	
	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Inventory Management System");

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   /* JTabbedPane pane = new JTabbedPane();
	    	   
	    pane.setForeground(new Color(0,122,0));
	    pane.setBackground(Color.WHITE);
	     
	    pane.addTab("Daily Stock Report", new DailyStockReport());
	    pane.addTab("Purchase Order", new PurchaseOrder());
	    pane.addTab("Predicted Sales", new PredicatedSales());
	    pane.addTab("Add/Discontinue Stock", new AddDiscontinue());*/
	         
	    frame.setSize(1000,800);
	    
	    frame.add(new TransparentImage(frame, new LogIn()));
	    
	    frame.setLocationRelativeTo(null);
	    
	    
	    frame.setIconImage(image.getImage());
	    frame.setVisible(true);
	   // frame.setUndecorated(true);   
	    //frame.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);   
	 
	    UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(new Color(0,122,0) ));
	    UIManager.put("InternalFrame.activeTitleForeground", new ColorUIResource(Color.WHITE));
	    UIManager.put("InternalFrame.titleFont", new Font("Dialog", Font.PLAIN, 11));
	   
	}
	
	
}
