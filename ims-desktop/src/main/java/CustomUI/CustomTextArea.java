package CustomUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import CustomUI.CustomFont;


public class CustomTextArea extends JTextField{

private static final long serialVersionUID = 1L;
public CustomTextArea(final String hint) {
   this.setText(hint);
    this.setFont(CustomFont.getFont("ITALIC",14));
    this.setForeground(Color.GRAY);
    this.setBackground(Color.WHITE);
    //this.setBorder(BorderFactory.create);
 

    
    this.addMouseListener(new MouseAdapter() { 
        public void mousePressed(MouseEvent me) { 
        	if(hint.equals("Price")){
        		setText("$");
        	}else if(hint.equals("Your expected sales this quarter for XXXX are $14,000")){
        		
        	}else{
        		setText("");
        	}
        } 
      }); 
    
  }

}