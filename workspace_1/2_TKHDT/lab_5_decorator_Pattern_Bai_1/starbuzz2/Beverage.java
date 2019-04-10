package starbuzz2;

public abstract class Beverage {
	public String des = "Unknown Beverage";

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public abstract int cost();
}
