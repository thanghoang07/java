package LTNC_12072012;

public class Bus extends DaiLy {
	private int noSeats;

	public Bus(String model, int madeYear, double price, Manufactor manufactor,
			int noSeats) {
		super(model, madeYear, price, manufactor);
		this.noSeats = noSeats;
	}

	@Override
	public String toString() {
		return "Bus [model=" + model + ", madeYear=" + madeYear + ", price="
				+ price + ", manufactor=" + manufactor + "noSeats=" + noSeats
				+ "]";
	}

	@Override
	public double khuyenMai() {
		return price - 1000;
	}

}
