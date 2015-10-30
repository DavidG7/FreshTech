import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import CustomUI.CustomButton;
import CustomUI.CustomLabel;
import CustomUI.CustomTextArea;

public class LogIn extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	CustomTextArea userField;
	JPasswordField passField;
    Font regularFont, italicFont;
    JLabel logInDisplay;
    final static int GAP = 10;
    JFrame topFrame;
    ImageLoader loader;
 
    public LogIn() {
        setLayout(new FlowLayout(FlowLayout.CENTER,20,80));
    
        JPanel leftHalf = new JPanel() {
			private static final long serialVersionUID = 1L;
        };

        JPanel rightHalf = new JPanel(){
			private static final long serialVersionUID = 1L;
        	
        };

        leftHalf.setLayout(new BoxLayout(leftHalf,BoxLayout.PAGE_AXIS));
        BufferedImage myPicture;
        JLabel picLabel = null;
        loader = new ImageLoader();
		
		myPicture = loader.load();
		picLabel = new JLabel(new ImageIcon(myPicture));
		
        this.setBackground(Color.WHITE);
        rightHalf.add(picLabel);
        rightHalf.setBorder(new EmptyBorder(200,0,0,0));
        rightHalf.setBackground(Color.WHITE);
        leftHalf.setBorder(new EmptyBorder(220,0,50,0));
        leftHalf.setBackground(Color.WHITE);
               
        leftHalf.add(createEntryFields());
        leftHalf.add(createButton());
 
        add(leftHalf);
        add(rightHalf);


    }
 
    protected JComponent createButton() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        panel.setBackground(Color.WHITE);
 
        CustomButton button = new CustomButton("Log In");
        button.addActionListener(this);
        panel.add(button);
 
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0,
                                                GAP-5, GAP-5));
        return panel;
    }
 

    public void actionPerformed(ActionEvent e) {
    	
    	if(userField.getText() != null && passField.getPassword().length != 0)
    	{	
    		LoginSQL login = new LoginSQL();
    		String password = new String(passField.getPassword());
    		
    		if (login.establishlogin(userField.getText(), password))
    		{    			
    			topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
    	      	  
        		JTabbedPane pane = new JTabbedPane();
        	   
      	      	pane.setForeground(new Color(0,122,0));
      	      	pane.setBackground(Color.WHITE);
      	      
      	      	pane.addTab("Daily Stock Report", new DailyStockReport());
      	      	pane.addTab("Purchase Order", new PurchaseOrderIMS());
      	      	pane.addTab("Predicted Sales", new PredicatedSales());
      	      	pane.addTab("Add/Discontinue Stock", new AddDiscontinue());
      	      	
      	      	topFrame.remove(this);
      	      	topFrame.add(pane);
      	      	topFrame.revalidate();
          	  	topFrame.repaint();
    		}
    		else
    			JOptionPane.showMessageDialog(getParent(),"Please input a correct Username and Password." );
  	      	
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(getParent(),"Please input a correct Username and Password." );
        }
    
    }
 
 
 
    protected JComponent createLogInDisplay() {
        JPanel panel = new JPanel(new BorderLayout());
        logInDisplay = new JLabel();
        logInDisplay.setHorizontalAlignment(JLabel.CENTER);
        regularFont = logInDisplay.getFont().deriveFont(Font.PLAIN,
                                                            16.0f);
        italicFont = regularFont.deriveFont(Font.ITALIC);
 
        panel.setBorder(BorderFactory.createEmptyBorder(
                                GAP/2, //top
                                0,     //left
                                GAP/2, //bottom
                                0));   //right
        panel.add(new JSeparator(JSeparator.VERTICAL),
                  BorderLayout.LINE_START);
        panel.add(logInDisplay,
                  BorderLayout.CENTER);
        panel.setPreferredSize(new Dimension(400, 150));
 
        return panel;
    }
 
    protected JComponent createEntryFields() {
        JPanel panel = new JPanel(new SpringLayout());
        panel.setBackground(Color.WHITE);
 
        String[] labelStrings = {
            "Username: ",
            "Password: "
        };
 
        userField  = new CustomTextArea("");
        userField.setColumns(10);
        userField.setMaximumSize(new Dimension(300,100));
        userField.setMinimumSize(new Dimension(300,100));
 
        passField = new JPasswordField();
        passField.setMaximumSize(new Dimension(300,100));
        passField.setMinimumSize(new Dimension(300,100));
        
        panel.add(new CustomLabel(labelStrings[0],false));
        panel.add(userField);
        panel.add(new CustomLabel(labelStrings[1],false));
        panel.add(passField);
        
        SpringUtilities.makeCompactGrid(panel,
                                        labelStrings.length, 2,
                                        GAP, GAP, //init x,y
                                        GAP, GAP/2);//xpad, ypad
        return panel;
    }
}