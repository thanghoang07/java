package LTNC_12072012;

public class Car extends DaiLy {
	private int noSeats;
	private int maxSpeed;
	private int fuelPer100km;

	public Car(String model, int madeYear, double price, Manufactor manufactor,
			int noSeats, int maxSpeed, int fuelPer100km) {
		super(model, madeYear, price, manufactor);
		this.noSeats = noSeats;
		this.maxSpeed = maxSpeed;
		this.fuelPer100km = fuelPer100km;
	}	

	@Override
	public String toString() {
		return "Car [model=" + model + ", madeYear=" + madeYear + ", price="
				+ price + ", manufactor=" + manufactor + "noSeats=" + noSeats + ", maxSpeed=" + maxSpeed
				+ ", fuelPer100km=" + fuelPer100km + "]";
	}

	@Override
	public double khuyenMai() {
		return price;
	}

}
