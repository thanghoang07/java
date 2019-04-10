package Theory;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

public class AbsoluteLayoutDemo extends JFrame {
	public AbsoluteLayoutDemo(String title) {
		super(title);
		setLayout(null);
		JButton b1 = new JButton("One");
		JButton b2 = new JButton("Two");	
		JButton b3 = new JButton("Three"); 
		add(b1); add(b2); add(b3); 
		Insets insets = getInsets();
		Dimension size = b1.getPreferredSize();
		b1.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);
		size = b2.getPreferredSize();
		b2.setBounds(55 + insets.left, 40 + insets.top, size.width, size.height);
		size = b3.getPreferredSize(); 
		b3.setBounds(150+insets.left, 15+insets.top, size.width+50, size.height+20); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		JTextArea b4 = new JTextArea(5, 5);
		add(b4);
	}
	
	public static void main(String args[]) {
		new AbsoluteLayoutDemo("");
	}

}
