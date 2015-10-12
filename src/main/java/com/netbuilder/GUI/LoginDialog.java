package com.netbuilder.GUI;
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import javax.swing.JButton;
	import javax.swing.JDialog;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;
	import javax.swing.border.LineBorder;

	@SuppressWarnings("serial")
	public class LoginDialog extends JDialog {
		
		private JTextField tfUsername;
		private JPasswordField pfPassword;
		private JLabel lbUsername;
		private JLabel lbPassword;
		private JButton btnLogin;
		private JButton btnCancel;
		
		public LoginDialog(JFrame parent) {
			
			
			JPanel panel = new JPanel(new GridBagLayout());
			GridBagConstraints cs = new GridBagConstraints();
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

			cs.fill = GridBagConstraints.HORIZONTAL;

			lbUsername = new JLabel("Username: ");
			cs.gridx = 0;
			cs.gridy = 0;
			cs.gridwidth = 1;
			panel.add(lbUsername, cs);

			tfUsername = new JTextField(20);
			cs.gridx = 1;
			cs.gridy = 0;
			cs.gridwidth = 2;
			panel.add(tfUsername, cs);

			lbPassword = new JLabel("Password: ");
			cs.gridx = 0;
			cs.gridy = 1;
			cs.gridwidth = 1;
			panel.add(lbPassword, cs);

			pfPassword = new JPasswordField(20);
			cs.gridx = 1;
			cs.gridy = 1;
			cs.gridwidth = 2;
			panel.add(pfPassword, cs);
			panel.setBorder(new LineBorder(Color.GRAY));

			btnLogin = new JButton("Login");
			btnCancel = new JButton("Cancel");
			JPanel bp = new JPanel();
			bp.add(btnLogin);
			bp.add(btnCancel);
			bp.setFocusable(true);
			getContentPane().add(panel, BorderLayout.CENTER);
			getContentPane().add(bp, BorderLayout.PAGE_END);
			setFocusable(true);
			setResizable(false);
			setLocationRelativeTo(parent);
			setSize(450, 200);
			add(panel);
			setTitle("Login");
			setVisible(true);
		

		}

		public JButton getBtnLogin() {
			return btnLogin;
		}

		public void setBtnLogin(JButton btnLogin) {
			this.btnLogin = btnLogin;
		}

		public JButton getBtnCancel() {
			return btnCancel;
		}

		public void setBtnCancel(JButton btnCancel) {
			this.btnCancel = btnCancel;
		}

		public JTextField getTfUsername() {
			return tfUsername;
		}

		public void setTfUsername(JTextField tfUsername) {
			this.tfUsername = tfUsername;
		}

		public JPasswordField getPfPassword() {
			return pfPassword;
		}

		public void setPfPassword(JPasswordField pfPassword) {
			this.pfPassword = pfPassword;
		}

		public String getUsername() {
			return tfUsername.getText();
		}

		public char[] getPassword() {
			return pfPassword.getPassword();

		}	

	}

