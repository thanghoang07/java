package weatherStation2;

import java.util.ArrayList;

public class WeatherData implements Subject {
	public ArrayList<Observer> observers;
	public double nhietDo, doAm, apXuat;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public double getNhietDo() {
		return nhietDo;
	}

	public void setNhietDo(double nhietDo) {
		this.nhietDo = nhietDo;
	}

	public double getDoAm() {
		return doAm;
	}

	public void setDoAm(double doAm) {
		this.doAm = doAm;
	}

	public double getApXuat() {
		return apXuat;
	}

	public void setApXuat(double apXuat) {
		this.apXuat = apXuat;
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(double nhietDo, double doAm, double apXuat) {
		this.apXuat = apXuat;
		this.doAm = doAm;
		this.nhietDo = nhietDo;
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
			ob.capNhatThongTin(getNhietDo(), getDoAm(), getApXuat());
		}

	}
}
