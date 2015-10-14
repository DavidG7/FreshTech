import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TransparentImage extends JPanel implements ActionListener {


	Timer timer=new Timer(100, this);
	int aplhaCount = 0;
	Image logoImage;
	JFrame parent;
	JTabbedPane pane;
	 
    TransparentImage(JFrame parent, JTabbedPane pane) {
    	timer.start();
    	this.parent = parent;
    	this.pane = pane;
    	this.setBackground(Color.WHITE);
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
     this.setBackground(new Color(0, 122, 0, aplhaCount));
     File logoFile = new File("NBGardensLogo.png");
     try {
		logoImage = ImageIO.read(logoFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     g.drawImage(logoImage, 375, 275, this);
     
     System.out.println(aplhaCount);
    }

   public void actionPerformed(ActionEvent ev){
	    if(ev.getSource()==timer){
	      repaint();// this will call at every 1 second
	      if(aplhaCount < 25){
	      aplhaCount++;
	      }else{
	    	  timer.stop();
	    	  parent.remove(this);
	    	  parent.add(pane);
	    	  parent.revalidate();
	    	  parent.repaint();
              
	    	  //getParent().add(new TransparentImage());
	      }
	      
	    }
   }
}