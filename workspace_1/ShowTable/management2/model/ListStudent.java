package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStudent implements ModelInterface {
	private List<Student> listStudent = new ArrayList<Student>();;
	private ArrayList<ObserverInformation> listObserver = new ArrayList<ObserverInformation>();

	@Override
	public void add(int stCode, String stName, String stDob, String stPob) {
		Student st = new Student(stCode, stName, stDob, stPob);
		listStudent.add(st);
		notifyObservers();
	}

	@Override
	public void registerObserver(ObserverInformation o) {
		listObserver.add(o);
	}

	@Override
	public void removeObserver(ObserverInformation o) {
		listObserver.remove(o);

	}

	public void notifyObservers() {
		Iterator<ObserverInformation> iter = listObserver.iterator();
		while (iter.hasNext()) {
			ObserverInformation o = iter.next();
			o.update(listStudent.get(listStudent.size() - 1));
		}
	}

}
