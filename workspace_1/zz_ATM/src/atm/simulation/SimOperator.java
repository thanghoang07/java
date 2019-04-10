package atm.simulation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimOperator extends JPanel {
	private JButton buttonON;

	public SimOperator(final Simulation simulation) {
		setLayout(new BorderLayout(10, 0));
		add(new JLabel("     Operator Panel"), BorderLayout.WEST);
		JLabel message = new JLabel("Click button to turn ATM on", JLabel.CENTER);
		add(message, BorderLayout.CENTER);
		buttonON = new JButton(" ON ");
		buttonON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (buttonON.getText().equals("OFF")) { // ATM is currently on
					message.setText("Click button to turn ATM on  ");
					buttonON.setText(" ON ");
					simulation.switchChanged(false);

				} else // ATM is currently off
				{
//					buttonON.setText(" ON ");
					message.setText("Click button to turn ATM off");
					buttonON.setText("OFF");

					simulation.switchChanged(true);

				}
			}
		});

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(128, 128, 255));
		buttonPanel.add(buttonON);
		add(buttonPanel, BorderLayout.EAST);

		new Thread() {
			public void run() {
				while (true) {
					try {
						sleep(1000);
					} catch (InterruptedException e) {
					}

					if (message.isVisible() && !buttonON.getText().equals("OFF") || !SimOperator.this.isEnabled())
						message.setVisible(false);
					else
						message.setVisible(true);
				}
			}
		}.start();

		setBackground(new Color(128, 128, 255));
	}
}
