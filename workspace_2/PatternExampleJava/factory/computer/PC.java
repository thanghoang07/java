package computer;

public class PC extends Computer {
	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		super(ComputerType.PC);
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
		return "PC: Ram: " + getRam() + ", Hdd: " + getHdd() + ", Cpu: " + getCpu();
	}
}
