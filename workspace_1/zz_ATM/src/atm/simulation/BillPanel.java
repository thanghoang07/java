package atm.simulation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BillPanel extends JPanel {
	private JTextField amountCash;

	public BillPanel() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(100, 100));
		JPanel panelBill = new JPanel();
		panelBill.setLayout(new GridLayout(0, 1, 0, 0));
		panelBill.add(new JLabel("Nhập vào số tiền để có thể khởi động máy", JLabel.CENTER));
		amountCash = new JTextField();
		panelBill.add(amountCash);
		add(panelBill, BorderLayout.CENTER);
		amountCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				synchronized (BillPanel.this) {
					BillPanel.this.notify();
				}
			}
		});
	}

	/**
	 * Phuong thuc su dung de lay so tien nguoi quan ly nhap vao may
	 * 
	 * @return so tien nhap vao may
	 * 
	 */
	synchronized int readBill() {
		boolean validNumberRead = false;
		int billNumber = 0;

		amountCash.setText("");

		while (!validNumberRead) {
			amountCash.requestFocus();
			try {
				wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			try {
				billNumber = Integer.parseInt(amountCash.getText());
				if (billNumber > 0)
					validNumberRead = true;
				else
					getToolkit().beep();
			} catch (NumberFormatException e) {
				getToolkit().beep();
			}
			if (!validNumberRead) {
				amountCash.setText("Must be a valid integer >= 0");
				amountCash.selectAll();
			}
		}
		return billNumber;

	}
}
