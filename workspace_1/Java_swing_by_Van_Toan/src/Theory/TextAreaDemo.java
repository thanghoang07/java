package Theory;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextAreaDemo extends JFrame{
	public TextAreaDemo(String title) {
		super(title);
		setLayout(new FlowLayout());
		JLabel lbl = new JLabel("Descrip2tion");
		add(lbl);
		JTextArea txt = new JTextArea(5, 20);
		add(txt);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new TextAreaDemo("JTextArea Demo");
	}
	
}
