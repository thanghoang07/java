package LTNC_12072012;

public abstract class DaiLy implements Comparable{

	protected String model;
	protected int madeYear;
	protected double price;
	protected Manufactor manufactor;

	public DaiLy(String model, int madeYear, double price, Manufactor manufactor) {
		this.model = model;
		this.madeYear = madeYear;
		this.price = price;
		this.manufactor = manufactor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMadeYear() {
		return madeYear;
	}

	public void setMadeYear(int madeYear) {
		this.madeYear = madeYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Manufactor getManufactor() {
		return manufactor;
	}

	public void setManufactor(Manufactor manufactor) {
		this.manufactor = manufactor;
	}

	@Override
	public String toString() {
		return "DaiLy [model=" + model + ", madeYear=" + madeYear + ", price="
				+ price + ", manufactor=" + manufactor + "]";
	}
	public abstract double khuyenMai();
	
	@Override
	public int compareTo(Object o) {
		DaiLy d1 = (DaiLy) o ;
		return model.compareToIgnoreCase(d1.model);
	}
}
