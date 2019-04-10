package atm.simulation;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Strategy.DisplayStrategy;

public abstract class SimDisplay extends JPanel {
//	Image background = new ImageIcon("image/bidv2.jpg").getImage();
	protected static JLabel[] displayLine;
	protected int currentDisplayLine;
	protected DisplayStrategy displayStrategy;
	protected Font fontLabel = new Font("Times New Roman", Font.PLAIN, 24);

	public SimDisplay() {
	}

	public void clearDisplay() {
		for (int i = 0; i < displayLine.length; i++)
			displayLine[i].setText("");
		currentDisplayLine = 0;
	}

	public void clearDisplayLine(int numberLine) {
		int tmp = numberLine;
		for (int i = tmp; i < displayLine.length; i++)
			displayLine[i].setText("");
		// !!!!!!!!!!!
		setCurrentDisplayLine(numberLine);
	}

	public void display(String text) {
		displayStrategy.display(text, currentDisplayLine, displayLine);
		setCurrentDisplayLine(displayStrategy.getCurrently());

	}

	public void displayLine(int numberLine, String text) {
		displayStrategy.display(text, numberLine, displayLine);
	}

	public void setEcho(String echo) {
		displayLine[currentDisplayLine].setText(
				ATMPanel.BLANK_DISPLAY_LINE.substring(0, ATMPanel.BLANK_DISPLAY_LINE.length() / 2 - echo.length())
						+ echo);
	}

	public int getCurrentDisplayLine() {
		return currentDisplayLine;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(null, 0, 0, getWidth(), getHeight(), null);
	}

	public void setCurrentDisplayLine(int currentDisplayLine) {
		this.currentDisplayLine = currentDisplayLine;
	}

}
