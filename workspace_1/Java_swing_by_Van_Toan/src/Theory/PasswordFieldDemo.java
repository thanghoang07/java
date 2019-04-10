package Theory;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordFieldDemo extends JFrame{
	public PasswordFieldDemo(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		JLabel lblPassword = new JLabel("Password:");
		add(lblPassword);
		JPasswordField tfPassword = new JPasswordField(12);
		tfPassword.setEchoChar('*');
		add(tfPassword);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new PasswordFieldDemo("PasswordFieldDemo");
	}
}
