import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


public class GUIMain 
{
	
	//MongoDB Variables
	static String mongohost = "";
	static int port = 27017;
	static MongoClient mongoClient;
	static MongoDatabase db;
	
		
	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Inventory Management System");

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	         
	    frame.setSize(1000,800);
	    
	    frame.add(new SplashScreen(frame));
	    
	    DatabaseController dbc = new DatabaseController();
	    
	    
	    //mongoClient = new MongoClient(mongohost, port);
		//db = mongoClient.getDatabase("test"); 
	    
	    
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	   // ImageIcon img = new ImageIcon("NBGardensLogo.png");
	    BufferedImage icon = null;
		try {
			icon = ImageIO.read(GUIMain.class.getResource("/images/NBGardensLogo.png"));
			//icon = ImageIO.read(new File("images/NBGardensLogo.png"));
		} catch (IOException e) {
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