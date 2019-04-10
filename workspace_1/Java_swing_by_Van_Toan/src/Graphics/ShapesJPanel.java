package Graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShapesJPanel extends JFrame {
	public ShapesJPanel() {
		super("Shapers");

		add(new Paint());

		setSize(425, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ShapesJPanel();
	}

	class Paint extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			Graphics2D g2d = (Graphics2D) g;

			// draw 2D ellipse filled with a blue-yellow gradient
			g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
					Color.YELLOW, true));
			g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

			// draw 2D rectangle in red
			g2d.setPaint(Color.RED);
			//tao nét cho hinh
			g2d.setStroke(new BasicStroke(10.0f));
			g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

		}
	}
}
