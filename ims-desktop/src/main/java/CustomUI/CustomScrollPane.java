package CustomUI;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;

public class CustomScrollPane extends JScrollPane{
	
	public CustomScrollPane(JTable productTable) {
		// TODO Auto-generated constructor stub
		
		this.getViewport ().add (productTable);
		this.getViewport().setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

}
