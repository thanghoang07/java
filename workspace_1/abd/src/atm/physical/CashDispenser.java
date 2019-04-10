package atm.physical;

import bank.Log;
import bank.Money;

public class CashDispenser {
	private Money cashOnHand;
	private Log log;

	public CashDispenser(Log log) {
		this.cashOnHand = new Money(0);
		this.log = log;
	}

	/**
	 * thiet lap so tien khi bat may
	 * 
	 * @param intinialCash
	 *            : so tien ban dau khi bat may
	 */
	public void setInitialCashMoney(Money initialCash) {
		cashOnHand = initialCash;
	}

	/**
	 * Kiem tra so tien khach hang yeu cau thuc hien trong may con khong
	 * 
	 * @param amount
	 *            : so tien khac khach hang yeu cau thuc hien
	 * 
	 * @return true : neu so tien trong may phu hop, false : so tien trong may
	 *         khong phu hop
	 */
	public boolean checkCashOnHand(Money amount) {
		return true;
	}

	/**
	 * Xuat tien ra khi khach hang thuc hien rut tien
	 * 
	 * @param so
	 *            tien can rut
	 */
	public void dispenseCash(Money amount) {

	}
}
