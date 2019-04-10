package demo3;

import java.util.ArrayList;

public class People extends Person {
	public ArrayList<Icecream> ice;

	public People(ArrayList<Icecream> ice) {
		super();
		this.ice = ice;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void drink(String name) {
		// TODO Auto-generated method stub

	}

	public void getIce(ArrayList<Icecream> ice) {
		for (int i = 0; i < ice.size(); i++) {
			System.out.println(ice.get(i).ten);
		}
	}

	public void getIce2() {
		for (int i = 0; i < ice.size(); i++) {
			System.out.println(ice.get(i).ten);
		}
	}

}
