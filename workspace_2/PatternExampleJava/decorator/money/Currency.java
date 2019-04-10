package money;

public abstract class Currency {
	protected String description = "Unknown currency";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double cost(double value);
}
