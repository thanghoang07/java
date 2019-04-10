package bai1;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {
	private boolean stateChange;
	private List<Observer> observerList;
	
	public Blog() {
		super();
		this.stateChange = false;
		this.observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);

	}

	@Override
	public void notifyObserver() {
		if(stateChange){
			for (Observer observer : observerList) {
				observer.update();
			}
		}
	}

	@Override
	public void unRegisterObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public Object getUpdate() {
		Object changedState = null;
		if(stateChange){
			changedState = "Observer Disign pattern";
		}
		return changedState;		
	}
	
	public void postNewArticle(){
		stateChange = true;
		notifyObserver();
	}

}
