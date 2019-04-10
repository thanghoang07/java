package model;

import java.util.Comparator;

public abstract class People implements Comparable<People>, Comparator<People> {
	protected int id;
	protected String name;
	protected int dob;
	protected String pob;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof People) {
			People tmp = (People) obj;
			if (tmp.getId() == getId() && tmp.getName().equals(getName()) && tmp.getDob() == getDob()
					&& tmp.getPob().equals(getPob())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", dob=" + dob + ", pob=" + pob + "]";
	}

	@Override
	public int compare(People o1, People o2) {
		return o1.getId() - o2.getId();
	}

	@Override
	public int compareTo(People o) {
		return getId() - o.getId();
	}

}
