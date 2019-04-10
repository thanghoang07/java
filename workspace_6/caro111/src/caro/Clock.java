package caro;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Clock extends Thread {
	JTextField txtTime;
	private static final int TIME = 6;
	public static int i = TIME;
	public static int j = 0;

	public Clock(JTextField lblTime) {
		this.txtTime = lblTime;
	}

	// @SuppressWarnings("static-access")
	public Clock(int a) {
		this.i = a;
	}

	@Override
	public void run() {

		while (i > 0) {
			i--;
			int minute = i / 60;
			int Second = i - minute * 60;
			String time = minute + ":" + Second;
			if (Second < 10) {
				time = minute + ":0" + Second;
			}
			//System.out.println(j);
			txtTime.setText(time);
			try {
				j++;
				Thread.sleep(1000);
			} catch (InterruptedException ex) {

			}
		}
	}

	public void reset() {
		i = TIME;
		j = 0;
	}

	public static String TimePlay() {
		int minute = j / 60;
		int Second = j - minute * 60;
		// String time = minute+":"+Second;
		String time = minute + ":" + Second;
		if (Second < 10) {
			time = minute + ":0" + Second;
		}
		return time;
	}
	
	public boolean timeRun() {
		int minute = 0, Second = 0;
		while (i > 0) {
			i--;
			minute = i / 60;
			Second = i - minute * 60;
			String time = minute + ":" + Second;
			if (Second < 10) {
				time = minute + ":0" + Second;
			}
			// System.out.println(j);
			txtTime.setText(time);
			try {
				j++;
				Thread.sleep(1000);
			} catch (InterruptedException ex) {

			}
		}
		if (minute == 0 && Second == 0) {
			return true;
		} else {
			return false;
		}
	}

}