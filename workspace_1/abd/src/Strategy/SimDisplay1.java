package Strategy;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class SimDisplay1 extends JPanel {
	Image background = new ImageIcon("image/bidv2.jpg").getImage();
	protected static JLabel[] displayLine;
	protected int currentDisplayLine;
	
	protected DisplayStrategy displayStrategy;
	protected Font fontLabel = new Font("Times New Roman", Font.PLAIN, 24);

	public SimDisplay1() {

	}

	public void performDisplay(String text) {
		displayStrategy.display(text, currentDisplayLine, displayLine);
	}

	public void clearDisplay() {
		for (int i = 0; i < displayLine.length; i++) {
			displayLine[i].setText("");
		}
		currentDisplayLine = 0;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
	}

}
