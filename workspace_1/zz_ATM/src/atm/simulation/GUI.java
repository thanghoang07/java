package atm.simulation;

import java.awt.CardLayout;

import javax.swing.JPanel;

import bank.Money;

public class GUI extends JPanel {
	private CardLayout mainLayout;
	private ATMPanel atmPanel;
	private BillPanel billPanel;
	private LogPanel logPanel;
	private LoginPanel loginPanel;

	public GUI(SimCardReader cardReader, SimDisplay display, SimOperator operator, SimKeyboardDigital keyboardDigital,
			SimulationPrinter printer, ButtonChoose buttonChoose) {

		mainLayout = new CardLayout(5, 5);
		setLayout(mainLayout);

		atmPanel = new ATMPanel(this, cardReader, operator, display, keyboardDigital, printer);
		add(atmPanel, "ATM");

		billPanel = new BillPanel();
		add(billPanel, "BILL");

		logPanel = new LogPanel(this);
		add(logPanel, "LOG");

		loginPanel = new LoginPanel();
		add(loginPanel, "LOGIN");

		mainLayout.show(this, "ATM");
	}

	public void showCard(String cardName) {
		mainLayout.show(this, cardName);
	}

	/**
	 * Phuong thuc de lay so tien khi nguoi quan ly may dua vao trong may khi
	 * bat may
	 * 
	 * @return Money khoi tao so tien cho may ATM
	 * 
	 */
	public Money getInitialCash() {
		mainLayout.show(this, "BILL");
		int numberOfBill = billPanel.readBill();
		mainLayout.show(this, "ATM");
		
		
		Money money = new Money(numberOfBill);
		System.out.println(money);
		return new Money(numberOfBill);
	}
}
