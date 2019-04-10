package Graphics;

import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPolygon extends JFrame {
	public DrawPolygon() {
		super("Draw Polygon");

		add(new paint());
		setSize(200, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new DrawPolygon();
	}

	class paint extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			int xCenter = getWidth() / 2;
			int yCenter = getHeight() / 2;
			int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);

			Polygon polygon = new Polygon();

			polygon.addPoint(xCenter + radius, yCenter);
			polygon.addPoint(
					(int) (xCenter + radius * Math.cos(2 * Math.PI / 6)),
					(int) (yCenter - radius * Math.sin(2 * Math.PI / 6)));

			polygon.addPoint(
					(int) (xCenter + radius * Math.cos(2 * 2 * Math.PI / 6)),
					(int) (yCenter - radius * Math.sin(2 * 2 * Math.PI / 6)));
			polygon.addPoint(
					(int) (xCenter + radius * Math.cos(3 * 2 * Math.PI / 6)),
					(int) (yCenter - radius * Math.sin(3 * 2 * Math.PI / 6)));
			polygon.addPoint(
					(int) (xCenter + radius * Math.cos(4 * 2 * Math.PI / 6)),
					(int) (yCenter - radius * Math.sin(4 * 2 * Math.PI / 6)));
			polygon.addPoint(
					(int) (xCenter + radius * Math.cos(5 * 2 * Math.PI / 6)),
					(int) (yCenter - radius * Math.sin(5 * 2 * Math.PI / 6)));

			g.drawPolygon(polygon);
		}
	}
}
