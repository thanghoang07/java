package demo2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.media.j3d.*;
import javax.vecmath.*;

public class Ex8 extends JApplet {
	public static void main(String s[]) {
		JFrame frame = new JFrame();
		frame.setTitle("Perlin Noise");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JApplet applet = new Ex8();
		applet.init();
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
	}

	PerlinNoise perlin = new PerlinNoise();
	Plot plot;

	public void init() {
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		plot = new Plot();
		cp.add(plot, BorderLayout.CENTER);
	}

	class Plot extends JPanel {
		public Plot() {
			this.setBackground(Color.white);
			this.setBorder(BorderFactory.createLoweredBevelBorder());
			this.setPreferredSize(new Dimension(800, 200));
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int x1 = 0;
			int y1 = 100;
			int x2 = 0;
			int y2 = 0;
			for (int i = 1; i < 1000; i++) {
				x2 = i;
				Point3d pt = new Point3d(i / 32.0, 0, 0);
				y2 = 100 - (int) (100 * perlin.perlinNoise(pt, 2, 2, 8));
				g.drawLine(x1, y1, x2, y2);
				x1 = x2;
				y1 = y2;
			}
		}
	}
}
