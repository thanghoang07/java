package observerPattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.util.Observable;

import javax.swing.Timer;

public class Clock extends Observable implements ActionListener {
	private int h, m, s;
	public static Timer timer;

	public Clock() {
		this.startClock();
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public String getTime() {
		String time = "";

		GregorianCalendar calendario = new GregorianCalendar();
		h = calendario.get(GregorianCalendar.HOUR_OF_DAY);
		m = calendario.get(GregorianCalendar.MINUTE);
		s = calendario.get(GregorianCalendar.SECOND);
		time += ((h < 10) ? "0" : "") + h + ":";
		time += ((m < 10) ? "0" : "") + m + ":";
		time += ((s < 10) ? "0" : "") + s;

		return time;
	}

	public void actionPerformed(ActionEvent e) {
		setChanged();
		notifyObservers(this.getTime());
	}

	public void startClock() {
		if (timer == null) {
			timer = new javax.swing.Timer(1000, this);
			timer.setInitialDelay(0);
			timer.start();
		}
	}

}
