package computer;

public class Server extends Computer {
	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu) {
		super(ComputerType.SERVER);
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
		return "Server: Ram: " + getRam() + ", Hdd: " + getHdd() + ", Cpu: " + getCpu();
	}
}
