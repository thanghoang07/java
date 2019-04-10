package Theory;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ButtonDemo extends JFrame	{
	public ButtonDemo(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		JLabel lblPassword = new JLabel("Password:");
		add(lblPassword);
		
		JPasswordField password = new JPasswordField(12);
		password.setEchoChar('0');
		add(password);
		
		JButton tButton = new JButton("OK");
		add(tButton);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ButtonDemo("Button Demo");
	}
}
