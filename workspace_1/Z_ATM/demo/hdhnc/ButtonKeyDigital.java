package hdhnc;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonKeyDigital extends JPanel {
	public ButtonKeyDigital() {
		setLayout(new GridLayout(6, 3));
		JButton[] number = new JButton[12];
		for (int i = 1; i < 10; i++) {
			number[i] = new JButton("" + i);
			add(number[i]);
		}
		add(new Label(""));
		number[0] = new JButton("0");
		add(number[0]);
		add(new Label(""));
		JButton enter = new JButton("Enter");
		add(enter);
		JButton clear = new JButton("Clear");
		add(clear);
		JButton cannel = new JButton("Cannel");
		add(cannel);
		JButton admin = new JButton("Admin");
		add(new Label(""));
		add(admin);
	}
}
