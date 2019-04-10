package customer;

public class Card {
	/*
	 * Ma so the co tren the atm
	 */
	private int numberCard;

	public Card(int numberCard) {
		this.numberCard = numberCard;
	}

	/*
	 * Phuong thuc cho phep lay ma so the
	 * 
	 * @return ma so the
	 */
	public int getNumberCard() {
		return numberCard;
	}

	@Override
	public String toString() {
		return "Card [numberCard=" + numberCard + "]";
	}

}
