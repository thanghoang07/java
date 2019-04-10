/*
 * ATM Example system - file Session.java
 *
 * copyright (c) 2001 - Russell C. Bjork
 *
 */

package atm;

import banking.Card;
import banking.Status;
import banking.Receipt;
import atm.physical.CustomerConsole;
import atm.transaction.Transaction;

public class Session {
	// Instance variables
	private ATM atm;
	private int pin;
	private int state;
	// Possible values for state
	private static final int READING_CARD_STATE = 1;
	private static final int READING_PIN_STATE = 2;
	private static final int CHOOSING_TRANSACTION_STATE = 3;
	private static final int PERFORMING_TRANSACTION_STATE = 4;
	private static final int EJECTING_CARD_STATE = 5;
	private static final int FINAL_STATE = 6;

	public void setPIN(int pin) {
		this.pin = pin;
	}

	public Session(ATM atm) {
		this.atm = atm;
		state = READING_CARD_STATE;
	}

	// thuc hien phien
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
					atm.getCustomerConsole().display("Unable to read card");
					state = EJECTING_CARD_STATE;
				}
				break;
			case READING_PIN_STATE:
				try {
					pin = atm.getCustomerConsole().readPIN("Please enter your PIN\n" + "Then press ENTER");
					state = CHOOSING_TRANSACTION_STATE;
				} catch (CustomerConsole.Cancelled e) {
					state = EJECTING_CARD_STATE;
				}
				break;
			case CHOOSING_TRANSACTION_STATE:
				try {
					currentTransaction = Transaction.makeTransaction(atm, this, card, pin);
					state = PERFORMING_TRANSACTION_STATE;
				} catch (CustomerConsole.Cancelled e) {
					state = EJECTING_CARD_STATE;
				}
				break;
			case PERFORMING_TRANSACTION_STATE:
				try {
					boolean doAgain = currentTransaction.performTransaction();
					if (doAgain)
						state = CHOOSING_TRANSACTION_STATE;
					else
						state = EJECTING_CARD_STATE;
				} catch (Transaction.CardRetained e) {
					state = FINAL_STATE;
				}
				break;
			case EJECTING_CARD_STATE:
				atm.getCardReader().ejectCard();
				state = FINAL_STATE;
				break;
			}
		}
	}
}