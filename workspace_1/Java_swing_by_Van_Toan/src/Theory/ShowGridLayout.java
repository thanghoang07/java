package Theory;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame {
	public ShowGridLayout(String title) {
		super(title);
		setLayout(new GridLayout(3, 2, 5, 5));
		add(new JLabel("Frist Name"));
		add(new JTextField(5));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
		setSize(300, 180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		new ShowGridLayout("");
	}
}
