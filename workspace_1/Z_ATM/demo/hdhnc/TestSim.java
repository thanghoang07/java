package hdhnc;

import javax.swing.JFrame;

public class TestSim extends JFrame {
	ButtonKeyDigital btChoose = new ButtonKeyDigital();

	public TestSim() {
		add(btChoose);

		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestSim();
	}
}
