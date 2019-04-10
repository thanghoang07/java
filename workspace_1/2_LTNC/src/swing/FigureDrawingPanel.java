package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FigureDrawingPanel extends JPanel {
	public static final int RECTANGLE = 2;
	public static final int OVAL = 4;
	private int type = 1;
	private boolean filled = false;

	public FigureDrawingPanel(int type) {
		super();
		this.type = type;
	}

	public FigureDrawingPanel(int type, boolean filled) {
		super();
		this.type = type;
		this.filled = filled;
	}

	public Dimension getPreferredSize() {
		return new Dimension(129, 120);
	}

	public void setBackground(Color bg) {
		bg = Color.WHITE;
		super.setBackground(bg);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int width = 100;
		int height = 100;

		switch (type) {
		case RECTANGLE:
			if (filled)
				g.fillRect(10, 10, width, height);
			else
				g.drawRect(10, 10, width, height);
			break;
		case OVAL:
			if (filled)
				g.fillOval(10, 10, width, height);
			else
				g.drawOval(10, 10, width, height);
			break;

		default:
			break;
		}
	}
}
