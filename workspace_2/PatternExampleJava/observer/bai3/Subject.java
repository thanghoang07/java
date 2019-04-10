package bai3;

public interface Subject {
	public void registerObserver(Observer observer);

	public void unRegisterObserver(Observer observer);

	public void notifyObserver();
}
