package Theory;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import lab1.Bai2;

public class ShowBorderLayout extends JFrame {
	public ShowBorderLayout(String title) {
		super(title);
		setLayout(new BorderLayout(5, 10));
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ShowBorderLayout("");
	}
}
