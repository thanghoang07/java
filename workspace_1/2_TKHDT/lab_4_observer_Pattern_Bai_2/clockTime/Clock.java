package clockTime;

import java.util.ArrayList;

public class Clock implements Subject {
	public ArrayList<Observer> observers;
	public double gio, phut, giay;

	public Clock() {
		super();
		this.observers = new ArrayList<Observer>();
	}

	public double getGio() {
		return gio;
	}

	public void setGio(double gio) {
		this.gio = gio;
	}

	public double getPhut() {
		return phut;
	}

	public void setPhut(double phut) {
		this.phut = phut;
	}

	public double getGiay() {
		return giay;
	}

	public void setGiay(double giay) {
		this.giay = giay;
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(double gio, double phut, double giay) {
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
		measurementsChanged();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegisterObserver(Observer observer) {
		// lay vi tri cua observer
		int i = observers.indexOf(observer);
		// roi xoa khoi
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer ob = (Observer) observers.get(i);
			ob.update(getGio(), getPhut(), getGiay());
		}
	}
}
