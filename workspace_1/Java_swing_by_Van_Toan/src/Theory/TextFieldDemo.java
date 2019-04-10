package Theory;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame{
	public TextFieldDemo(String title) {
		super(title);
		setLayout(new FlowLayout());
		JLabel lbl = new JLabel("Sample TextField");
		add(lbl);
		JTextField txt = new JTextField(20);
		add(txt);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new TextFieldDemo("Sample JTextFiled");
	}
	
}
