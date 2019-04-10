package atm.physical;

import atm.simulation.Simulation;

public class Display {
	public Display() {
	}

	/**
	 * Hien thi thong bao ra man hinh cho nguoi dung biet
	 * 
	 * @param message
	 *            thong bao ra man hinh
	 */
	public void display(String message) {
		Simulation.getInstance().clearDisplay();
		Simulation.getInstance().display(message);
	}

	
}
