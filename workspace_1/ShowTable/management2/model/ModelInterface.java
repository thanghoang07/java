package model;

public interface ModelInterface {
	public void add(int stCode, String stName, String stDob, String stPob);

	public void registerObserver(ObserverInformation o);

	public void removeObserver(ObserverInformation o);
}
