package atm.physical;

import atm.simulation.Simulation;
import bank.Money;

public class Keyboard {
	/*
	 * Doc ma pin cua the
	 */
	public Keyboard() {
		
	}
	
	public int readPIN(String prompt) throws Cancelled {
		Simulation.getInstance().clearDisplay();
		Simulation.getInstance().display(prompt + "\n ");
//		Simulation.getInstance().display("T");

		String input = Simulation.getInstance().readInput(Simulation.PIN_MODE, 0);

		Simulation.getInstance().clearDisplay();

		if (input == null)
			throw new Cancelled();
		else
			return Integer.parseInt(input);
	}

	/*
	 * Doc cac phim tren ban phim xem nguoi dung chon phim gi
	 * 
	 */
	public int readMenuChoice(int numItems) {
		return 0;
	}

	/*
	 * Doc so tien nguoi dung nhap vao
	 * 
	 * @param Display echo khi nguoi dung nhap vao so tien thi dong thoi tren
	 * man hinh cung hien thi so tien
	 * 
	 * @return so tien khach nhap
	 */
	public Money readAmount(Display echo) {
		long amount = 0;
		return new Money(amount);
	}

	public static class Cancelled extends Exception {
		/**
		 * Constructor
		 */
		public Cancelled() {
			super("Cancelled by customer");
		}
	}
}
