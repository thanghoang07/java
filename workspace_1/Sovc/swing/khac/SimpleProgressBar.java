package khac;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class SimpleProgressBar extends JFrame {

	JProgressBar current = new JProgressBar(0, 2000);
	int num = 0;

	public SimpleProgressBar() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("VNLIVES.NET");
		JPanel pane = new JPanel();
		current.setValue(0);
		current.setStringPainted(true);
		pane.add(current);
		setContentPane(pane);
	}

	public void iterate() {
		while (num < 2000) {
			current.setValue(num);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}

			num += 110;
		}
	}

	public static void main(String[] args) {
		SimpleProgressBar frame = new SimpleProgressBar();
		frame.pack();
		frame.setVisible(true);
		frame.iterate();
		frame.setSize(300, 300);
	}
}
