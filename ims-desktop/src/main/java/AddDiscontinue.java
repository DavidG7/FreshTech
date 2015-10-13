import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AddDiscontinue extends JPanel{
	
	JPanel leftPanel,rightPanel;
	JLabel heading,subHeading,optionOne,optionTwo;
	JComboBox<String> categoryCombo;
	
	public AddDiscontinue(){
		setLayout(new GridLayout(5, 1));
		optionTwo = new JLabel("(2) Add a new product");
		categoryCombo = new JComboBox<String>();
		optionTwo.setFont(CustomFont.getFont());
		this.add(optionTwo);
		
		this.add(new CustomTextArea("Name"));
		
		this.add(new CustomTextArea("Description"));
	
		categoryCombo.addItem("Gnome");
		categoryCombo.addItem("Garden Accessory");
		categoryCombo.addItem("");
		this.add(categoryCombo);
		
		this.add(new CustomTextArea("Price"));
	}

}
