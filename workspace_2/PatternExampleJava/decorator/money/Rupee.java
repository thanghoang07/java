package money;

public class Rupee extends Currency {
	protected double value;

	public Rupee() {
		description = "Indian rupee";
	}

	@Override
	public double cost(double value) {
		this.value = value;
		return this.value;
	}

}
