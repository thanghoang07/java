package computer;

public class ComputerFactory {

	public Computer getComputer(ComputerType model, String ram, String hdd, String cpu) {
		Computer com = null;
		switch (model) {
		case PC:
			com = new PC(ram, hdd, cpu);
			break;
		case LAPTOP:
			com = new Laptop(ram, hdd, cpu);
			break;
		case SERVER:
			com = new Server(ram, hdd, cpu);
			break;

		default:
			break;
		}
		return com;
	}

}
