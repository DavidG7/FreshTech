import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class SplashScreen extends JPanel implements ActionListener {

	ImageLoader loader;

	Timer timer=new Timer(50, this);
	int aplhaCount = 0;
	Image logoImage;
	JFrame parent;
	JComponent pane;
	 
    SplashScreen(JFrame parent){//, JComponent pane) {
    	timer.start();
    	this.parent = parent;
    	this.pane = pane;
    	this.setBackground(Color.WHITE);
    	loader = new ImageLoader();
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
     this.setBackground(new Color(0, 122, 0, aplhaCount));

    	 
	logoImage = loader.load();
	
     
     g.drawImage(logoImage, 375, 275, this);

    }

   public void actionPerformed(ActionEvent ev){
	    if(ev.getSource()==timer){
	      repaint();// this will call at every 1 second
	      if(aplhaCount < 35){
	      aplhaCount++;
	      }else{
	    	  timer.stop();
	    	  parent.remove(this);
	    	  parent.add(new LogIn());
	    	  parent.revalidate();
	    	  parent.repaint();
              
	    	  //getParent().add(new TransparentImage());
	      }
	      
	    }
   }
}