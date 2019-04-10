package demo_dong_ho;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class TextClock2 extends JApplet {

	// ====================================================== constructor
	public TextClock2() {
		add(new Clock());
	}

	// ============================================================= main
	public static void main(String[] args) {
		JFrame window = new JFrame("Time of Day");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.setContentPane(new Clock());

		window.pack();
		window.setVisible(true);
		System.out.println(window.getContentPane().size());
	}
}
