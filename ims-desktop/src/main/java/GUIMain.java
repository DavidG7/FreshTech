import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
<<<<<<< HEAD
	private BufferedImage image;
   try {                
	   image = ImageIO.read(getClass().getResource("/images/NBGardensLogo.png"));
   } catch (IOException ex) {
        // handle exception...
   }
	
=======
	

>>>>>>> 0fd12969cadac4d70333612e56de12d5375a1685
	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Inventory Management System");

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    
	    
	    
	         
	    frame.setSize(1000,800);
	    
	    frame.add(new SplashScreen(frame));
	    
	    frame.setLocationRelativeTo(null);
<<<<<<< HEAD
	    
	    
	    frame.setIconImage(image.getImage());
=======
>>>>>>> 0fd12969cadac4d70333612e56de12d5375a1685
	    frame.setVisible(true);
	   // ImageIcon img = new ImageIcon("NBGardensLogo.png");
	    BufferedImage icon = null;
		try {
			icon = ImageIO.read(GUIMain.class.getResource("/images/NBGardensLogo.png"));
			//icon = ImageIO.read(new File("images/NBGardensLogo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    frame.setIconImage(icon);
	    frame.setUndecorated(true);   
	    frame.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);   
	        
	    UIManager.put("InternalFrame.activeTitleBackground", new ColorUIResource(new Color(0,122,0) ));
	    UIManager.put("InternalFrame.activeTitleForeground", new ColorUIResource(Color.WHITE));
	    UIManager.put("InternalFrame.titleFont", new Font("Dialog", Font.PLAIN, 11));
	}
	

	
	
}
