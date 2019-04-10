package test;

import javax.swing.JFrame;

import controller.*;
import model.*;
import view.MainForm;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainForm view = new MainForm();
		Destination model = new Destination();
		CreditCard model1 = new CreditCard();

		@SuppressWarnings("unused")
		TrainTicketController controller = new TrainTicketController(view, model, model1);

		view.setTitle("Paint Job Information");
		view.setSize(500, 300);
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);
	}
}