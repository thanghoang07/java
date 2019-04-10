package atm.simulation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bank.Card;

public class SimCardReader extends JPanel {
	// dung de hien thi trang thai cua may doc the
	private JLabel jlbNotifi;
	// khung de nguoi dung nhap vao ma the
	private static JTextField jtfNumberCard;

	public SimCardReader(Simulation simulation) {
		setPreferredSize(new Dimension(150, 40));
		setLayout(new GridLayout(2, 1));

		jlbNotifi = new JLabel(">>> Chưa có thẻ <<<", JLabel.CENTER);
		jlbNotifi.setBackground(new Color(128, 128, 255));
		jlbNotifi.setOpaque(true);
		jtfNumberCard = new JTextField();
		jtfNumberCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readCard();
				simulation.cardInserted();
			}
		});

		add(jlbNotifi);
		add(jtfNumberCard);

		jtfNumberCard.setEnabled(false);
	}

	/**
	 * Phuong thuc de khoi doc the/ khoi tao the
	 * 
	 * @return khoi tao 1 card neu thanh cong, khong thanh cong se thi the se
	 *         khong doc duoc
	 * 
	 */
	public Card readCard() {

		int cardNumber = Integer.parseInt(jtfNumberCard.getText());
		if (cardNumber > 0) {
			Card card = new Card(cardNumber);
			//System.out.println(card);
			jlbNotifi.setText(">>> Đã đọc thẻ <<<");
			jtfNumberCard.setEnabled(false);
			return card;
		} else
			return null;

	}

	/**
	 */
	public void behaviorEjection() {
		jlbNotifi.setText(">>> Chưa có thẻ <<<");
		jtfNumberCard.setEnabled(true);
	}

	public JTextField getJtfNumberCard() {
		return jtfNumberCard;
	}

}
