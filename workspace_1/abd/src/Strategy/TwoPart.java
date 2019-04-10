package Strategy;

import java.util.StringTokenizer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwoPart implements DisplayStrategy {

	@Override
	public void display(String text, int numberLine, JLabel[] displayLine) {
		char first = text.charAt(0);
		numberLine = partDisplay(first);
		StringTokenizer tokenizer = new StringTokenizer(text, "\n", false);
		while (tokenizer.hasMoreTokens()) {
			try {
				displayLine[numberLine++].setText(tokenizer.nextToken());
			} catch (Exception e) {
			}

		}
	}

	public int partDisplay(char first) {
		int tmp = 0;
		switch (first) {
		case 'T':
			tmp = 0;
			break;
		case 'L':
			tmp = 3;
			break;
		case 'R':
			tmp = 10;
			break;
		}
		return tmp;
	}

	@Override
	public int getCurrently() {
		// TODO Auto-generated method stub
		return 0;
	}


}
