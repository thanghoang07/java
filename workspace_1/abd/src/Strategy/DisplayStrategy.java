package Strategy;

import javax.swing.JLabel;

public interface DisplayStrategy {
	public void display(String text, int currentDisplayLine, JLabel[] displayLine);
	
	public int getCurrently();
}
