package bank;

public class Money {
	private long amounOtVND;

	public Money(long amountVND) {
		this.amounOtVND = amountVND;
	}

	/*
	 * Tru tien trong tai khoan va trong may
	 * 
	 * @param amount : so tien tru
	 */
	public void subtractMoney(long amount) {

	}

	/*
	 * Kiem tra trong tai khoan va trong may co phu hop voi so tien yeu cau hay
	 * khong
	 * 
	 * @param Money : so tien can so sanh
	 * 
	 * @return true : neu so tien so phu hop , false so tien khong du
	 */
	public boolean lessEqual(Money other) {
		return true;
	}

	@Override
	public String toString() {
		return "Money [amounOtVND=" + amounOtVND + "]";
	}

}
