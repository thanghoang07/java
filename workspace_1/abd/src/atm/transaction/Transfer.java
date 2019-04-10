package atm.transaction;

import atm.ATM;
import atm.Session;
import bank.Bank;
import bank.Money;

public class Transfer extends Transaction {
	private int toCardNumber;
	private Money amount;

	public Transfer(ATM atm, Session session, Bank bank, int toCardNumber, Money amount) {
		super(atm, session, bank);
		this.toCardNumber = toCardNumber;
		this.amount = amount;
	}

	@Override
	public void sendToBank() {
		// TODO Auto-generated method stub

	}

	@Override
	public void finishTransaction() {
		// TODO Auto-generated method stub

	}

}
