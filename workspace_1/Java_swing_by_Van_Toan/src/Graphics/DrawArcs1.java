package Graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawArcs1 extends JFrame {
	public DrawArcs1() {
		super("Drawing arcs");

		add(new Paint());

		setSize(350, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new DrawArcs1();
	}

	class Paint extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.setColor(Color.RED);
			g.drawRect(10, 10, 100, 100);
			g.setColor(Color.BLACK);
			g.drawRoundRect(10, 10, 100, 100, 100, 100);
			
			g.setColor(Color.RED);
			g.drawRect(120, 10, 100, 100);
			g.setColor(Color.BLACK);
			g.drawArc(120, 10, 100, 100, 0, 90);
			
			g.setColor(Color.RED);
			g.drawRect(230, 10, 100, 100);
			g.setColor(Color.BLACK);
			g.drawArc(230, 10, 100, 100, 0, -270);
			
			g.fillArc(10, 120, 100, 100, 0, 360);
			
			g.fillArc(120, 120, 100, 100, 270, -90);
			
			g.fillArc(230, 120, 100, 100, 0, -270);
		}
	}
}
