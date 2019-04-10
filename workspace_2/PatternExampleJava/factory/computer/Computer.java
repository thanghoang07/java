package computer;

public abstract class Computer {
	private ComputerType model = null;

	public Computer(ComputerType model) {
		this.model = model;
	}

	public abstract String getRam();

	public abstract String getHdd();

	public abstract String getCpu();

	public abstract String toString();

	public ComputerType getModel() {
		return model;
	}

	public void setModel(ComputerType model) {
		this.model = model;
	}

}
