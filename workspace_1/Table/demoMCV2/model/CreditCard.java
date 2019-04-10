package model;

import javax.swing.JTextField;

public class CreditCard {

	public CreditCard() {

	}

	public CreditCard(JTextField cardNumber) {
		String cardNum = getCardNumber(cardNumber);
	}

	public String getCardNumber(JTextField cardNumber) {
		return cardNumber.getText();
	}
}
