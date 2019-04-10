package atm;

import atm.physical.Keyboard;
import atm.transaction.Transaction;
import bank.Card;

public class Session {
	private ATM atm;
	private int pin; // ????????
	private int state;

	/**
	 * Reading the customer's card
	 */
	private static final int READING_CARD_STATE = 1;

	/**
	 * Asking the customer to enter a PIN
	 */
	private static final int READING_PIN_STATE = 2;

	/**
	 * Asking the customer to choose a transaction type
	 */
	private static final int CHOOSING_TRANSACTION_STATE = 3;

	/**
	 * Peforming a transaction
	 */
	private static final int PERFORMING_TRANSACTION_STATE = 4;

	/**
	 * Ejecting the customer's card
	 */
	private static final int EJECTING_CARD_STATE = 5;

	/**
	 * Session finished
	 */
	private static final int FINAL_STATE = 6;

	public Session(ATM atm) {
		this.atm = atm;

		this.state = READING_CARD_STATE;
	}

	public void performSession() {
		Card card = null;
		Transaction currentTransaction = null;

		while (state != FINAL_STATE) {
			switch (state) {
			case READING_CARD_STATE:
				card = atm.getCardReader().readCard();

				if (card != null)
					state = READING_PIN_STATE;
				else {
					atm.getDisplay().display("Thẻ không thể đọc");
					state = EJECTING_CARD_STATE;
				}
				break;
			case READING_PIN_STATE:

				try {
					pin = atm.getKeyboard().readPIN("Vui lòng nhập mã PIN\n \nSau đó nhấn Enter");
					state = CHOOSING_TRANSACTION_STATE;
				} catch (Keyboard.Cancelled e) {
					state = EJECTING_CARD_STATE;
				}
				break;

			case CHOOSING_TRANSACTION_STATE:
				
			}
		}
	}

	/**
	 * Kiem tra ma pin do nguoi dung nhap voi ma pin trong ngan hang co dung
	 * khong
	 * 
	 */
	public boolean checkPIN() {
		return true;
	}

}
