package CustomUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.security.sasl.SaslException;
import javax.swing.*;

import CustomUI.CustomFont;


public class CustomTextArea extends JTextField{

  private final String hint;
  private boolean showingHint;

  public CustomTextArea(final String hint) {
   // super(hint);
    this.hint = hint;
    this.showingHint = true;
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