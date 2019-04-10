package khac;

import java.awt.*;
import javax.swing.*;

public class WindowsLookAndFeelDemo {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JLabel label = new JLabel("Label");
		JTextField field = new JTextField("www.java2s.com!");
		JList list = new JList(new String[] { "A", "B", "C" });
		JScrollPane listPane = new JScrollPane(list);
		listPane.setPreferredSize(new Dimension(250, 100));

		JScrollPane treePane = new JScrollPane(new JTree());
		treePane.setPreferredSize(new Dimension(250, 100));
		JButton button = new JButton("Click me");

		JPanel cp = new JPanel();
		cp.add(label);
		cp.add(field);
		cp.add(listPane);
		cp.add(treePane);
		cp.add(button);

		JFrame frame = new JFrame();
		frame.setTitle("Windows Look and Feel Demo");
		frame.setPreferredSize(new Dimension(280, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(cp);
		frame.pack();
		frame.setVisible(true);

	}
}
