
import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.JTableHeader;


public class CustomJTable extends JTable{

	private static final long serialVersionUID = 1L;

	public CustomJTable(){
		this.setModel(new ProductTableModel());
		JTableHeader header = this.getTableHeader();
	      header.setBackground(new Color(0,122,0));
	      header.setForeground(Color.WHITE);
	     this.setPreferredScrollableViewportSize(this.getPreferredSize());
	     
	     
	  
	}
}
