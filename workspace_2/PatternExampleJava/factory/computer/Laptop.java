package computer;

public class Laptop extends Computer {
	private String ram;
	private String hdd;
	private String cpu;

	public Laptop(String ram, String hdd, String cpu) {
		super(ComputerType.LAPTOP);
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		toString();
	}

	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getHdd() {
		return this.hdd;
	}

	@Override
	public String getCpu() {
		return this.cpu;
	}

	@Override
	public String toString() {
		return "Laptop: Ram: " + getRam() + ", Hdd: " + getHdd() + ", Cpu: " + getCpu();
	}
}
