package atm.simulation;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
	private JTextField user;
	private JPasswordField password;

	public LoginPanel() {
		setLayout(new GridLayout(0, 1, 0, 0));
		setPreferredSize(new Dimension(200, 130));
		
		add(new JLabel("Đăng nhập tài khoản ADMIN", JLabel.CENTER));
		add(new JLabel("User : ", JLabel.LEFT));
		user = new JTextField(30);
		add(user);
		add(new JLabel("Password : ", JLabel.LEFT));
		password = new JPasswordField(30);
		add(password);
	}
}
