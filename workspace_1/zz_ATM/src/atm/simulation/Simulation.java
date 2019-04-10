package atm.simulation;

import Strategy.DisplayCenter;
import atm.ATM;
import customer.Card;
import bank.Money;

public class Simulation {
	private ATM atm;
	private SimCardReader cardReader;
	private SimDisplay display;
	private SimOperator operator;
	private SimulationPrinter printer;
	private SimKeyboardDigital keyboardDigital;
	private ButtonChoose buttonChoose;
	private GUI gui;

	public static final int PIN_MODE = 1;

	public static final int AMOUNT_MODE = 2;

	public static final int MENU_MODE = 3;

	private static Simulation theInstance;

	public Simulation(ATM atm) {
		this.atm = atm;

		cardReader = new SimCardReader(this);
		//display = new DisplayCenter();
		operator = new SimOperator(this);
		printer = new SimulationPrinter();
		keyboardDigital = new SimKeyboardDigital(display);
		buttonChoose = new ButtonChoose();

		gui = new GUI(cardReader, display, operator, keyboardDigital, printer, buttonChoose);

		theInstance = this;
	}

	public static Simulation getInstance() {
		return theInstance;
	}

	/**
	 * Mo phong qua trinh doc the ATM
	 * 
	 * @return Card chua thong tin the neu doc thanh cong, neu may khong doc
	 *         duoc thi tra ve null
	 * 
	 */
	public Card readCard() {

		return cardReader.readCard();
	}

	public void ejectCard() {

	}

	public GUI getGUI() {
		return gui;
	}

	public Money getInitialCash() {
		return gui.getInitialCash();
	}

	public void switchChanged(boolean on) {
		cardReader.getJtfNumberCard().setEnabled(on);

		if (on)
			atm.switchOn();
		else
			atm.switchOff();
	}

	public void display(String text) {
		display.display(text);
	}

	public void clearDisplay() {
		display.clearDisplay();
	}

	public void cardInserted() {
		atm.cardInserted();
	}

	public String readInput(int mode, int maxValue) {
		return keyboardDigital.readInput(mode, maxValue);
	}
}
