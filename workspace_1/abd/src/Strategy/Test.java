package Strategy;

import javax.swing.JFrame;

import atm.simulation.SimDisplay;

public class Test {
	public static void main(String[] args) {
		SimDisplay display = new DisplayTwoPart();
		JFrame frame = new JFrame();
		frame.add(display);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
}
