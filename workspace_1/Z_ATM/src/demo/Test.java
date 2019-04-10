package demo;

import javax.swing.JFrame;

public class Test {
		public static void digitalClock(Clock clock) {
			JFrame frame = new JFrame("Digital Clock");
			frame.add(new DigitalLock(clock));
			frame.setSize(250, 100);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
		}
		
		public static void analogClock(Clock clock) {
			JFrame frame1 = new JFrame("Analog Clock");
			frame1.add(new AnalogClock(clock));
			frame1.setSize(300, 300);
			frame1.setVisible(true);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.setLocation(250, 200);
		}

		public static void main(String[] args) {
			Clock clock = new Clock();
			digitalClock(clock);
			analogClock(clock);
			clock.startClock();
		}
}
