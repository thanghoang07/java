package atm.transaction;

import atm.ATM;
import atm.Session;
import bank.Bank;

public abstract class Transaction {
	protected ATM atm;
	protected int pin;
	protected int numTransaction;
	protected Session session;
	protected Bank bank;

	public Transaction(ATM atm, Session session, Bank bank) {
		super();
		this.atm = atm;
		this.pin = pin;
		this.numTransaction = numTransaction;
		this.session = session;
		this.bank = bank;
	}
	
	public abstract void sendToBank() ;
		
	
	public abstract void finishTransaction() ;
		
	

}
