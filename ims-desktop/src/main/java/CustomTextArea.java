
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.security.sasl.SaslException;
import javax.swing.*;



class CustomTextArea extends JTextField{

  private final String hint;
  private boolean showingHint;

  public CustomTextArea(final String hint) {
   // super(hint);
    this.hint = hint;
    this.showingHint = true;
    this.setText(hint);
    this.setFont(CustomFont.getFont("ITALIC",14));
    this.setForeground(Color.GRAY);
    this.setMargin(new Insets(5, 50, 5, 50));
    
    this.addMouseListener(new MouseAdapter() { 
        public void mousePressed(MouseEvent me) { 
        	if(hint.equals("Price")){
        		setText("£");
        	}else{
        		setText("");
        	}
        } 
      }); 
    
  }

}