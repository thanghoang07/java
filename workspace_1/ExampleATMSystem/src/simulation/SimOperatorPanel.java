/*
 * ATM Example system - file SimOperatorPanel.java
 *
 * copyright (c) 2001 - Russell C. Bjork
 *
 */

package simulation;

import atm.ATM;

import java.awt.*;
import java.awt.event.*;

/**
 * Simulate the operator panel
 */
class SimOperatorPanel extends Panel {
	/**
	 * Constructor
	 *
	 * @param simulation
	 *            the overall simulation object
	 */
	SimOperatorPanel(final Simulation simulation) {
		setLayout(new BorderLayout(10, 0));
		setBackground(new Color(128, 128, 255));
		add(new Label("     Operator Panel"), BorderLayout.WEST);
		final Label message = new Label("Click button to turn ATM on", Label.CENTER);
		add(message, BorderLayout.CENTER);
		final Button button = new Button(" ON ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button.getLabel().equals("OFF")) // ATM is currently on
				{
					message.setText("Click button to turn ATM on  ");
					button.setLabel(" ON ");

					simulation.switchChanged(false);
				} else // ATM is currently off
				{
					message.setText("Click button to turn ATM off");
					button.setLabel("OFF");

					simulation.switchChanged(true);
				}
			}
		});
		Panel buttonPanel = new Panel();
		buttonPanel.add(button);
		add(buttonPanel, BorderLayout.EAST);

		// Use a thread to blink the "Click button to turn ATM on" message when
		// the ATM is off. This will also make the message invisible when the
		// button is not enabled.

		new Thread() {
			public void run() {
				while (true) {
					try {
						sleep(1000);
					} catch (InterruptedException e) {
					}

					if (message.isVisible() && !button.getLabel().equals("OFF") || !SimOperatorPanel.this.isEnabled())
						message.setVisible(false);
					else
						message.setVisible(true);
				}
			}
		}.start();
	}
}
