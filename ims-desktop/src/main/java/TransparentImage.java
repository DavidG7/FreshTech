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
	 
    TransparentImage() {
    	timer.start();
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
     this.setBackground(new Color(99, 185, 45, aplhaCount));
     File logoFile = new File("NBGardensLogo.png");
     try {
		logoImage = ImageIO.read(logoFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     g.drawImage(logoImage, 285, 200, this);
     System.out.println(aplhaCount);
    }

   public void actionPerformed(ActionEvent ev){
	    if(ev.getSource()==timer){
	      repaint();// this will call at every 1 second
	      if(aplhaCount < 20){
	      aplhaCount++;
	      }else{
	    	  timer.stop();
	      }
	      
	    }
   }
}