package atm.physical;

import atm.ATM;
import atm.simulation.Simulation;
import customer.Card;

public class CardReader {
	private ATM atm;

	public CardReader() {
		this.atm = atm;
	}

	/*
	 * Doc the khi khach hang dua the vao may
	 */
	public Card readCard() {
		return Simulation.getInstance().readCard();
	}

	/*
	 * Day the ra ngoai khi may khong doc duoc , khi ket thuc giao dich
	 */
	public void ejectCard() {

	}

	/*
	 * Giu the lai khi khach hang nhap sai ma pin qua 3 lan
	 */
	public void retainCard(int number) {

	}
}
