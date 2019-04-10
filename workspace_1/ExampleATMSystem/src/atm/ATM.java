/*
 * ATM Example system - file ATM.java
 *
 * copyright (c) 2001 - Russell C. Bjork
 *
 */

package atm;

import java.net.InetAddress;
import atm.physical.*;
import banking.Card;
import banking.Money;

public class ATM implements Runnable {
	private int id;
	private String place;
	private String bankName;
	private InetAddress bankAddress;
	private CardReader cardReader;
	private CashDispenser cashDispenser;
	private CustomerConsole customerConsole;
	private EnvelopeAcceptor envelopeAcceptor;
	private Log log;
	private NetworkToBank networkToBank;
	private OperatorPanel operatorPanel;
	private ReceiptPrinter receiptPrinter;
	private int state;
	private boolean switchOn;
	private boolean cardInserted;
	private static final int OFF_STATE = 0;
	private static final int IDLE_STATE = 1;
	private static final int SERVING_CUSTOMER_STATE = 2;

	public ATM(int id, String place, String bankName, InetAddress bankAddress) {
		this.id = id;
		this.place = place;
		this.bankName = bankName;
		this.bankAddress = bankAddress;

		// Create objects corresponding to component parts

		log = new Log();
		cardReader = new CardReader(this);
		cashDispenser = new CashDispenser(log);
		customerConsole = new CustomerConsole();
		envelopeAcceptor = new EnvelopeAcceptor(log);
		networkToBank = new NetworkToBank(log, bankAddress);
		operatorPanel = new OperatorPanel(this);
		receiptPrinter = new ReceiptPrinter();

		// Set up initial conditions when ATM first created

		state = OFF_STATE;
		switchOn = false;
		cardInserted = false;
	}

	public synchronized void switchOn() {
		switchOn = true;
		notify();
	}

	public synchronized void switchOff() {
		switchOn = false;
		notify();
	}

	public synchronized void cardInserted() {
		cardInserted = true;
		notify();
	}

	public int getID() {
		return id;
	}

	public String getPlace() {
		return place;
	}

	public String getBankName() {
		return bankName;
	}

	public CardReader getCardReader() {
		return cardReader;
	}

	public CashDispenser getCashDispenser() {
		return cashDispenser;
	}

	public CustomerConsole getCustomerConsole() {
		return customerConsole;
	}

	public EnvelopeAcceptor getEnvelopeAcceptor() {
		return envelopeAcceptor;
	}

	public Log getLog() {
		return log;
	}

	public NetworkToBank getNetworkToBank() {
		return networkToBank;
	}

	public OperatorPanel getOperatorPanel() {
		return operatorPanel;
	}

	public ReceiptPrinter getReceiptPrinter() {
		return receiptPrinter;
	}

	private void performStartup() {
		Money initialCash = operatorPanel.getInitialCash();
		cashDispenser.setInitialCash(initialCash);
		networkToBank.openConnection();
	}

	private void performShutdown() {
		networkToBank.closeConnection();
	}

	// Methods corresponding to major responsibilities of the ATM
	public void run() {
		Session currentSession = null;
		while (true) {
			switch (state) {
			case OFF_STATE:
				customerConsole.display("Not currently available");
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
				}
				if (switchOn) {
					performStartup();
					state = IDLE_STATE;
				}
				break;
			case IDLE_STATE:
				customerConsole.display("Please insert your card");
				cardInserted = false;
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
				}
				if (cardInserted) {
					currentSession = new Session(this);
					state = SERVING_CUSTOMER_STATE;
				} else if (!switchOn) {
					performShutdown();
					state = OFF_STATE;
				}
				break;
			case SERVING_CUSTOMER_STATE:
				currentSession.performSession();
				state = IDLE_STATE;
				break;
			}
		}
	}
}