import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


public class GUIMain 
{
	
	public static JFrame frame;
	
	//MongoDB Variables
	static String mongohost = "10.50.15.34";
	static int port = 27017;
	static MongoClient mongoClient;
	static DB db;
	
		
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		
		frame = new JFrame("Inventory Management System");

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	         
	    frame.setSize(1000,800);
	    
	    frame.add(new SplashScreen(frame));
	      
	    mongoClient = new MongoClient(mongohost, port);
		db = mongoClient.getDB("FreshTech"); 
	   
		DBCollection coll = db.getCollection("Product");
		
		try{
			 DBCursor cursor = coll.find();
	         int i=1;
	         while (cursor.hasNext()) { 
	            System.out.println("Inserted Document: "+i); 
	            System.out.println(cursor.next()); 
	            i++;
	         }
	      }catch(Exception e){
		     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		}
	    
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
		   frame.setVisible(true);

	}
}