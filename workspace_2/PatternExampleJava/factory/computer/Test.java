package computer;

public class Test {

	public static void main(String[] args) {
		ComputerFactory cpF = new ComputerFactory();
		System.out.println(cpF.getComputer(ComputerType.LAPTOP, "16GB", "1TB", "i7"));
		System.out.println(cpF.getComputer(ComputerType.PC, "16GB", "3TB", "i7"));
		System.out.println(cpF.getComputer(ComputerType.SERVER, "32TB", "3200TB", "Xeon"));
	}

}
