package atm.transaction;

import atm.ATM;
import atm.Session;
import bank.Bank;

public class BalanceInquiry extends Transaction {

	public BalanceInquiry(ATM atm, Session session, Bank bank) {
		super(atm, session, bank);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void finishTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendToBank() {
		// TODO Auto-generated method stub
		
	}
	
}
