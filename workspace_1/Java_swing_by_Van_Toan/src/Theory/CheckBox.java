package Theory;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBox extends JFrame{
	public CheckBox(String title) {
		super(title);
		setLayout(new GridLayout(5, 2));
		
		JLabel lblHobbies = new JLabel("Your hobbies:");
		add(lblHobbies);
		
		JCheckBox cbMovies = new JCheckBox("Watching movie");
		JCheckBox cbMusic = new JCheckBox("Listening to music");
		JCheckBox cbBook = new JCheckBox("Reading Book");
		add(cbMovies);
		add(cbBook);
		add(cbMusic);
		
		JButton bt = new JButton("ok");
		add(bt);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new CheckBox("CheckBox Demo");
	}
}
