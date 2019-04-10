package bai3;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
	private List<Observer> listObserver;
	private String productName, productType, availability;

	public Product(String productName, String productType, String availability) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability = availability;
		listObserver = new ArrayList<>();
	}

	public List<Observer> getListObserver() {
		return listObserver;
	}

	public void setListObserver(List<Observer> listObserver) {
		this.listObserver = listObserver;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer observer) {
		listObserver.add(observer);
	}

	@Override
	public void unRegisterObserver(Observer observer) {
		listObserver.remove(observer);

	}

	@Override
	public void notifyObserver() {
		System.out.println("Notifying to all the subscribers when product became available");
		for (Observer observer : listObserver) {
			observer.update(availability);
		}
	}

}
