import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class CustomButton extends JButton{

	public CustomButton(String message){
		this.setText(message);
		this.setBackground(Color.WHITE);
		this.setForeground(new Color(0,122,0));
	//	this.setBorder(BorderFactory.createLineBorder(new Color(), 5));
		this.setFont(CustomFont.getFont("ITALIC", 14));
	}
}
