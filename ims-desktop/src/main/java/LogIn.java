import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import CustomUI.CustomButton;
import CustomUI.CustomLabel;
import CustomUI.CustomTextArea;

public class LogIn extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	CustomTextArea userField;
	CustomTextArea passField;
    Font regularFont, italicFont;
    JLabel logInDisplay;
    final static int GAP = 10;
    JFrame topFrame;
    ImageLoader loader;
 
    public LogIn() {
    	
    	//topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        setLayout(new GridLayout(1,2));
    
        JPanel leftHalf = new JPanel() {
			private static final long serialVersionUID = 1L;
        };

        JPanel rightHalf = new JPanel(){
			private static final long serialVersionUID = 1L;
        	
        };

        leftHalf.setLayout(new BoxLayout(leftHalf,BoxLayout.PAGE_AXIS));
        //rightHalf.setLayout(new BoxLayout(rightHalf, BoxLayout.PAGE_AXIS));
        //rightHalf.add(new CustomLabel("  Welcome to NBGardens IMS",true), BorderLayout.CENTER);
        BufferedImage myPicture;
        JLabel picLabel = null;
        loader = new ImageLoader();
		
		myPicture = loader.load();
		picLabel = new JLabel(new ImageIcon(myPicture));
		
        
        rightHalf.add(picLabel);
        rightHalf.setBorder(new EmptyBorder(200,0,0,0));
        rightHalf.setBackground(Color.WHITE);
        leftHalf.setBorder(new EmptyBorder(200,50,50,50));
        leftHalf.setBackground(Color.WHITE);
        //rightHalf.add(new JSeparator(SwingConstants.VERTICAL));
        
      
        
        leftHalf.add(createEntryFields());
        leftHalf.add(createButton());
 
        add(leftHalf);
        //add(new JSeparator(JSeparator.VERTICAL),BorderLayout.LINE_START);
      //  add(createLogInDisplay());
        add(rightHalf);


    }
 
    protected JComponent createButton() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        panel.setBackground(Color.WHITE);
 
        //JButton button = new JButton("Log in");
        CustomButton button = new CustomButton("Log In");
        button.addActionListener(this);
        panel.add(button);
 
        //Match the SpringLayout's gap, subtracting 5 to make
        //up for the default gap FlowLayout provides.
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0,
                                                GAP-5, GAP-5));
        return panel;
    }
 

    public void actionPerformed(ActionEvent e) {
    	
    	topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
    	  
    	  JTabbedPane pane = new JTabbedPane();
  	   
	      pane.setForeground(new Color(0,122,0));
	      pane.setBackground(Color.WHITE);
	      
	      pane.addTab("Daily Stock Report", new DailyStockReport());
	      pane.addTab("Purchase Order", new PurchaseOrder());
	      pane.addTab("Predicted Sales", new PredicatedSales());
	      pane.addTab("Add/Discontinue Stock", new AddDiscontinue());
	         
	      topFrame.remove(this);
    	  topFrame.add(pane);
    	  topFrame.revalidate();
    	  topFrame.repaint();
	       
    }
 
 
 
    protected JComponent createLogInDisplay() {
        JPanel panel = new JPanel(new BorderLayout());
        logInDisplay = new JLabel();
        logInDisplay.setHorizontalAlignment(JLabel.CENTER);
        regularFont = logInDisplay.getFont().deriveFont(Font.PLAIN,
                                                            16.0f);
        italicFont = regularFont.deriveFont(Font.ITALIC);
 
        //Lay out the panel.
        panel.setBorder(BorderFactory.createEmptyBorder(
                                GAP/2, //top
                                0,     //left
                                GAP/2, //bottom
                                0));   //right
        panel.add(new JSeparator(JSeparator.VERTICAL),
                  BorderLayout.LINE_START);
        panel.add(logInDisplay,
                  BorderLayout.CENTER);
        panel.setPreferredSize(new Dimension(200, 150));
 
        return panel;
    }
 
    protected JComponent createEntryFields() {
        JPanel panel = new JPanel(new SpringLayout());
        panel.setBackground(Color.WHITE);
 
        String[] labelStrings = {
            "Username: ",
            "Password: "
        };
 
        CustomLabel[] labels = new CustomLabel[labelStrings.length];
        CustomTextArea[] fields = new CustomTextArea[labelStrings.length];
        int fieldNum = 0;
 
        //Create the text field and set it up.
        userField  = new CustomTextArea("Enter Username");
        userField.setColumns(10);
        fields[fieldNum++] = userField;
 
        passField = new CustomTextArea("Password");
        passField.setColumns(10);
        fields[fieldNum++] = passField;


        for (int i = 0; i < labelStrings.length; i++) {
            labels[i] = new CustomLabel(labelStrings[i], false);
            labels[i].setLabelFor(fields[i]);
            panel.add(labels[i]);
            panel.add(fields[i]);
 
            //Add listeners to each field.
            JTextField tf = null;
            tf = (JTextField)fields[i];
            tf.addActionListener(this);
        }
        SpringUtilities.makeCompactGrid(panel,
                                        labelStrings.length, 2,
                                        GAP, GAP, //init x,y
                                        GAP, GAP/2);//xpad, ypad
        return panel;
    }
 

 
    /*private static void createAndShowGUI() {
        JFrame frame = new JFrame("Please Log In");

      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //frame.add(new LogIn());
        frame.setSize(800, 600);
       // frame.setLayout(new GridLayout(4, 1));
        frame.add(new AddDiscontinue());
        //frame.pack();

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new LogIn());
       // frame.setSize(300, 300);
        frame.setLayout(new GridLayout(4, 1));
        //frame.add(new AddDiscontinue());
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        createAndShowGUI();
    }*/
}