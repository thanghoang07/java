package money;

public class Dollar extends Currency {

	protected double value;

	public Dollar() {
		description = "Dollar";
	}

	@Override
	public double cost(double value) {
		this.value = value;
		return this.value;
	}
}
