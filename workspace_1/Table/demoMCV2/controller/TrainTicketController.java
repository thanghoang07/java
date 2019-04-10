package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

import model.*;
import view.*;

public class TrainTicketController {

	private MainForm view = null;
	private Destination model = null;
	private CreditCard model1 = null;

	public TrainTicketController(MainForm mainform, Destination destination, CreditCard card) {
		this.view = mainform;
		this.model = destination;
		this.model1 = card;

		// add listener
		SubmitButtonListener submit = new SubmitButtonListener();
		this.view.addSubmitListener(submit);

	}

	class SubmitButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// set variables
			boolean validCard = false;
			boolean validName = false;
			boolean validPhone = false;
			boolean validPaintSelect = false;
			String destinationSelected = "";
			int count = 0;

			Destination destination = new Destination(view.jrbChicago, view.jrbNewYork, view.jrbSeattle,
					view.jrbSanFransisco, view.jtfName, view.jtfPhone);

			CreditCard card = new CreditCard();

			// validate fields
			ValidateFields validate = new ValidateFields();
			validName = validate.nameCheck(view.jtfName.getText());
			if (validName) {
				count++;
				validPhone = validate.validatePhone(view.jtfPhone.getText());
			}
			if (validPhone) {
				count++;
				validCard = validate.hasText(card.getCardNumber(view.jtfCardNumber));
			}

			if (validCard)
				count++;

			// if(count < 3)
			// displayError();
			else {
				destinationSelected = destination.getRadioButtonValue(view.jrbChicago, view.jrbNewYork, view.jrbSeattle,
						view.jrbSanFransisco);
				String cardNumber = card.getCardNumber(view.jtfCardNumber);
				String name = destination.getCustName(view.jtfName);
				String phone = destination.getPhoneNum(view.jtfPhone);
				displayMessage(cardNumber, name, phone);

			}
		}

		private void displayError() {
			// TODO Auto-generated method stub

			StringBuilder sb = new StringBuilder();

			sb.append("Oops sorry, you typed something wrong");
			JOptionPane.showMessageDialog(null, sb);

		}

		public void displayMessage(String cardNumber, String name, String phone) {
			// TODO Auto-generated method stub

			StringBuilder sb = new StringBuilder();
			NumberFormat f = NumberFormat.getCurrencyInstance();

			sb.append("Hello! Here is your estimate for the paint job:\n");
			sb.append("You chose the:" + cardNumber + name + phone);

			JOptionPane.showMessageDialog(null, sb);
		}
	}
}