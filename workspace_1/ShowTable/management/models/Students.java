package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import view.Observer;

public class Students extends People {
	private String code, name, dob, pob;
	private List<Students> listStudent;
	private List<Observer> listObserver;

	public Students(String code, String name, String dob, String pob) {
		this.code = code;
		this.name = name;
		this.dob = dob;
		this.pob = pob;

		listStudent = new ArrayList<Students>();
		listObserver = new ArrayList<Observer>();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	@Override
	public void registerObserver(view.Observer observer) {
		listObserver.add(observer);
	}

	@Override
	public void unRegisterObserver(view.Observer observer) {
		// lay vi tri cua observer
		int i = listObserver.indexOf(observer);
		// roi xoa khoi
		if (i >= 0) {
			listObserver.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		Iterator<Observer> iter = listObserver.iterator();
		while (iter.hasNext()) {
			Observer o = iter.next();
			o.capNhatThongTin(listStudent.get(listStudent.size() - 1));
		}
	}

	public void setData(String code, String name, String dob, String pob) {
		this.code = code;
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		Students st = new Students(code, name, dob, pob);
		listStudent.add(st);
		notifyObserver();
	}

}
