package Strategy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.StringTokenizer;

import javax.swing.JLabel;

import atm.simulation.ATMPanel;
import atm.simulation.SimDisplay;

public class DisplayCenter extends SimDisplay {

	public DisplayCenter() {
		this.displayStrategy = new Center();

		setLayout(new GridLayout(ATMPanel.DISPLAYABLE_LINES, 1));
		setPreferredSize(new Dimension(440, 350));
		Font fontLabel = new Font("Times New Roman", Font.PLAIN, 24);
		displayLine = new JLabel[ATMPanel.DISPLAYABLE_LINES];
		for (int i = 0; i < ATMPanel.DISPLAYABLE_LINES; i++) {
			displayLine[i] = new JLabel(ATMPanel.BLANK_DISPLAY_LINE, JLabel.CENTER);
			displayLine[i].setFont(fontLabel);
			displayLine[i].setForeground(Color.RED);
			add(displayLine[i]);

		}

		currentDisplayLine = 0;
	}

	
}
