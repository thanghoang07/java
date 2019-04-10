package atm;

import atm.physical.CardReader;
import atm.physical.CashDispenser;
import atm.physical.Display;
import atm.physical.Keyboard;
import atm.physical.Operator;
import atm.physical.Printer;
import bank.Bank;
import bank.Log;
import bank.Money;

public class ATM implements Runnable {
	private CardReader cardReader;
	private CashDispenser cashDispenser;
	private Display display;
	private Keyboard keyboard;
	private Log log;
	private Printer printer;
	private Operator operator;

	private String idATM;
	private String location;
	private Bank bank;
	private boolean switchOn;
	private int state;

	private static final int OFF_STATE = 0;

	private static final int IDLE_STATE = 1;

	private static final int SERVING_CUSTOMER_STATE = 2;

	private boolean cardInserted;

	public ATM(String idATM, String location, Bank bank) {
		cardReader = new CardReader();
		cashDispenser = new CashDispenser(log);
		display = new Display();
		keyboard = new Keyboard();
		log = new Log();
		printer = new Printer();
		operator = new Operator(this);

		this.idATM = idATM;
		this.location = location;
		this.bank = bank;

		switchOn = false;
		cardInserted = false;
		state = OFF_STATE;

	}

	@Override
	public void run() {
		Session currentSession = null;
		while (true) {
			switch (state) {
			case OFF_STATE:

				display.display("Máy ATM chưa kích hoạt\nXin hãy kích hoạt máy");

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

				display.display("Cảm ơn quý khách đã sử dụng\ndịch vụ của chúng tôi.\n\nXin vui lòng cho thẻ vào !");
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
					state = OFF_STATE;
				}

				break;

			case SERVING_CUSTOMER_STATE:

				// The following will not return until the session has
				// completed
				currentSession.performSession();
				state = IDLE_STATE;

				break;

			}
		}
	}

	private void performStartup() {
		Money initialCash = operator.getInitialCash();
		cashDispenser.setInitialCashMoney(initialCash);
	}

	/**
	 * Thong bao den ATM khi nnguoi quan ly nhan button "on" de bat may ATM
	 */
	public synchronized void switchOn() {
		switchOn = true;
		notify();
	}

	/**
	 * Thong bao den ATM khi nnguoi quan ly nhan button "off" de tat may ATM
	 */
	public synchronized void switchOff() {
		switchOn = false;
		notify();
	}

	public synchronized void cardInserted() {
		cardInserted = true;
		notify();
	}

	public CardReader getCardReader() {
		return cardReader;
	}

	public CashDispenser getCashDispenser() {
		return cashDispenser;
	}

	public Display getDisplay() {
		return display;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Log getLog() {
		return log;
	}

	public Printer getPrinter() {
		return printer;
	}

	public Operator getOperator() {
		return operator;
	}

	public String getIdATM() {
		return idATM;
	}

	public String getLocation() {
		return location;
	}

	public Bank getBank() {
		return bank;
	}

	public int getState() {
		return state;
	}

	public boolean isCardInserted() {
		return cardInserted;
	}
	
	
	
}