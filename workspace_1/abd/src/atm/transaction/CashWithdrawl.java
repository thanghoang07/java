package atm.transaction;

import atm.ATM;
import atm.Session;
import bank.Bank;
import bank.Money;


public class CashWithdrawl extends Transaction{
	private Money amount;
	
	

	public CashWithdrawl(ATM atm, Session session, Bank bank, Money amount) {
		super(atm, session, bank);
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
