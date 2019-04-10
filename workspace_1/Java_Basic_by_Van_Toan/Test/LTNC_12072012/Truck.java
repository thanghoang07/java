package LTNC_12072012;

public class Truck extends DaiLy {
	private double loadingCap;

	public Truck(String model, int madeYear, double price,
			Manufactor manufactor, double loadingCap) {
		super(model, madeYear, price, manufactor);
		this.loadingCap = loadingCap;
	}

	@Override
	public String toString() {
		return "Truck [model=" + model + ", madeYear=" + madeYear + ", price="
				+ price + ", manufactor=" + manufactor + "loadingCap="
				+ loadingCap + "]";
	}

	@Override
	public double khuyenMai() {
		return price * (0.01);
	}

}
