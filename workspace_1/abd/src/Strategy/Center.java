package Strategy;

import java.util.StringTokenizer;

import javax.swing.JLabel;

import atm.simulation.ATMPanel;

public class Center implements DisplayStrategy {
	private int lineNext ;
	@Override
	public void display(String text, int currentDisplayLine, JLabel[] displayLine) {
		StringTokenizer tokenizer = new StringTokenizer(text, "\n", false);
		while (tokenizer.hasMoreTokens()) {
//			System.out.println(currentDisplayLine);
			try {
				displayLine[currentDisplayLine++].setText(tokenizer.nextToken());
			} catch (Exception e) {
			}

		}
		lineNext = currentDisplayLine;
	}
	@Override
	public int getCurrently() {
		return lineNext;
	}

	
}
