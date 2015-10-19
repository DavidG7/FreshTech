package CustomUI;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CustomScrollPane extends JScrollPane{

	private static final long serialVersionUID = 1L;

	public CustomScrollPane(JTable productTable) {
		// TODO Auto-generated constructor stub
		
		this.getViewport ().add (productTable);
		this.getViewport().setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

}
