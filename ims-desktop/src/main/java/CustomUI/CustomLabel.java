package CustomUI;

import java.awt.Color;

import javax.swing.JLabel;

public class CustomLabel extends JLabel {

	public CustomLabel(String message, boolean isHeading) {
		// TODO Auto-generated constructor stub
		this.setText(message);
		if(isHeading){
			this.setFont(CustomFont.getFont("BOLD", 22));
		}else{
			this.setFont(CustomFont.getFont("ITALIC", 14));
		}
		this.setForeground(new Color(0,122,0));
	}

}
