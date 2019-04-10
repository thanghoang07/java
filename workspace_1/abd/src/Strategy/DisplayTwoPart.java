package Strategy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import atm.simulation.ATMPanel;
import atm.simulation.SimDisplay;

public class DisplayTwoPart extends SimDisplay {
	public DisplayTwoPart() {
		this.displayStrategy = new TwoPart();
		currentDisplayLine = 0;

		setOpaque(false);
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(440, 350));
		JPanel panelLeft = new JPanel();
		panelLeft.setOpaque(false);
		panelLeft.setLayout(new GridLayout(8, 1));
		JPanel panelTop = new JPanel();
		panelTop.setOpaque(false);
		panelTop.setLayout(new GridLayout(3, 1));
		JPanel panelRight = new JPanel();
		panelRight.setOpaque(false);
		panelRight.setLayout(new GridLayout(8, 1));
		displayLine = new JLabel[20];
		for (int i = 0; i < displayLine.length; i++) {
			if (i <= 2) {
				displayLine[i] = new JLabel(ATMPanel.BLANK_DISPLAY_LINE, JLabel.CENTER);
				displayLine[i].setFont(fontLabel);
				displayLine[i].setForeground(Color.WHITE);
				panelTop.add(displayLine[i]);
			} else if (i > 2 && i <= 10) {
				displayLine[i] = new JLabel(ATMPanel.BLANK_DISPLAY_LINE_SMILE, JLabel.LEFT);
				displayLine[i].setFont(fontLabel);
				displayLine[i].setForeground(Color.WHITE);
				panelLeft.add(displayLine[i]);
			} else if (i > 10) {
				displayLine[i] = new JLabel(ATMPanel.BLANK_DISPLAY_LINE_SMILE, JLabel.RIGHT);
				displayLine[i].setFont(fontLabel);
				displayLine[i].setForeground(Color.WHITE);
				panelRight.add(displayLine[i]);
			}

		}
		add(panelTop, BorderLayout.PAGE_START);
		add(panelLeft, BorderLayout.WEST);
		add(panelRight, BorderLayout.EAST);

	}
}
