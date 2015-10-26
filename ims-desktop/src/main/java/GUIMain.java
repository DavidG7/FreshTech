import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GUIMain 
{
	
	public static JFrame frame;

		
	public static void main(String[] args)
	{
		
		frame = new JFrame("Inventory Management System");

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	         
	    frame.setSize(1000,800);
	    
	    frame.add(new SplashScreen(frame));
	    
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	   // ImageIcon img = new ImageIcon("NBGardensLogo.png");
	    @SuppressWarnings("unused")
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