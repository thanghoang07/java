package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Observable;

import javax.swing.Timer;

public class Clock extends Observable {
	private int hours, minute, second;
	private Calendar cal = Calendar.getInstance();

	public Clock() {
		this.startClock();
	}

	public int getHours() {
		return hours;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeansurements(int hours, int minute, int second) {
		this.hours = hours;
		this.minute = minute;
		this.second = second;
		measurementsChanged();

	}

	public void startClock() {
		while (true) {
			GregorianCalendar calendario = new GregorianCalendar();
			int hours = calendario.get(GregorianCalendar.HOUR_OF_DAY);
			int minute = calendario.get(GregorianCalendar.MINUTE);
			int second = calendario.get(GregorianCalendar.SECOND);
			setMeansurements(hours, minute, second);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}

}