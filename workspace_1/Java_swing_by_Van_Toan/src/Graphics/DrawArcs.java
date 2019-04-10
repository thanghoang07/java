package Graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawArcs extends JFrame {
	public DrawArcs() {
		super("Draw Arcs");
		
		add(new paint());

		setSize(250, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new DrawArcs();
	}
	class paint extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			int xCenter = getWidth() / 2;
			int yCenter = getHeight() / 2;
			int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);
			int x = xCenter - radius;
			int y = yCenter - radius;
			
			g.fillArc(x, x, 2 * radius, 2 * radius, 0, 30);
			g.fillArc(x, x, 2 * radius, 2 * radius, 90, 30);
			g.fillArc(x, x, 2 * radius, 2 * radius, 180, 30);
			g.fillArc(x, x, 2 * radius, 2 * radius, 270, 30);
		}
	}
}
