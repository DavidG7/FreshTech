import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogIn extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	JTextField userField, passField;
    Font regularFont, italicFont;
    JLabel logInDisplay;
    final static int GAP = 10;
 
    public LogIn() {
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
 
        JPanel leftHalf = new JPanel() {
			private static final long serialVersionUID = 1L;
        };
        JPanel ;
        leftHalf.setLayout(new BoxLayout(leftHalf,BoxLayout.PAGE_AXIS));
        leftHalf.add(createEntryFields());
        leftHalf.add(createButton());
 
        add(leftHalf);
        add(createLogInDisplay());
    }
 
    protected JComponent createButton() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
 
        JButton button = new JButton("Log in");
        button.addActionListener(this);
        panel.add(button);
 
        //Match the SpringLayout's gap, subtracting 5 to make
        //up for the default gap FlowLayout provides.
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0,
                                                GAP-5, GAP-5));
        return panel;
    }
 
    /**
     * Called when the user clicks the button or presses
     * Enter in a text field.
     */
    public void actionPerformed(ActionEvent e) {
       
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
 
        String[] labelStrings = {
            "Username: ",
            "Password: "
        };
 
        JLabel[] labels = new JLabel[labelStrings.length];
        JComponent[] fields = new JComponent[labelStrings.length];
        int fieldNum = 0;
 
        //Create the text field and set it up.
        userField  = new JTextField();
        userField.setColumns(20);
        fields[fieldNum++] = userField;
 
        passField = new JTextField();
        passField.setColumns(20);
        fields[fieldNum++] = passField;


        for (int i = 0; i < labelStrings.length; i++) {
            labels[i] = new JLabel(labelStrings[i], JLabel.TRAILING);
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
 

 
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Please Log In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.add(new LogIn());

        frame.pack();
        frame.setResizable(false);
        frame.setLocation(700,300);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        createAndShowGUI();
    }
}