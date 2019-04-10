package swing;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;

public class ButtonDrawing extends JButton {
	public static final int RECTANGLE = 1;
	public static final int OVAL = 2;
	private int type = 1;

	public ButtonDrawing(int type) {
		super();
		this.type = type;
	}

	public Dimension getPreferredSize() {
		return new Dimension(30, 30);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int width = 20;
		int height = 20;

		switch (type) {
		case RECTANGLE:
			g.drawRect(5, 5, width, height);
			break;
		case OVAL:
			g.drawOval(5, 5, width, height);
			break;

		default:
			break;
		}
	}
}
