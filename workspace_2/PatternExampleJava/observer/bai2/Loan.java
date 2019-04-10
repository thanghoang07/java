package bai2;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {
	private List<Observer> listObserver;
	private String type, bank;
	private float interest;

	public Loan(String type, String bank, float interest) {
		super();
		this.type = type;
		this.bank = bank;
		this.interest = interest;
		listObserver = new ArrayList<>();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
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
		for (Observer observer : listObserver) {
			System.out.println("Notifying Observers on change in Loan interest rate");
			observer.update(this.interest);
		}

	}

}
