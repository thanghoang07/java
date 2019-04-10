package demo;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class P_3 {
	public static void main(String[] arg) {
		Gui3 gui = new Gui3();
	}
}

class Gui3 {
	JFrame f;
	DrawingPanel p;
	JPanel ps;
	JSlider sa0, sa1, sa2, sa3, sa4, sa5;
	double a0 = 0, a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
	int b0 = 110, b1 = 90, b2 = 30, b3 = 20, b4 = 30, b5 = 20;
	int h0 = 16, h1 = 10, h2 = 6, h3 = 4, h4 = 6, h5 = 4;

	class DrawingPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2 = (Graphics2D) g;

			g2.translate(150, 50);

			g2.rotate(a0);
			g.setColor(Color.red);
			g.fillRect(-h0 / 2, -h0 / 2, b0 + h0 / 2, h0);
			g2.translate(b0, 0);

			g2.rotate(a1);
			g.setColor(Color.blue);
			g.fillRect(-h1 / 2, -h1 / 2, b1 + h1 / 2, h1);
			g2.translate(b1, 0);

			AffineTransform at = g2.getTransform();

			g2.rotate(a2);
			g.setColor(Color.green);
			g.fillRect(-h2 / 2, -h2 / 2, b2 + h2 / 2, h2);
			g2.translate(b2, 0);

			g2.rotate(a3);
			g.setColor(Color.cyan);
			g.fillRect(-h3 / 2, -h3 / 2, b3 + h3 / 2, h3);

			g2.setTransform(at);

			g2.rotate(a4);
			g.setColor(Color.green);
			g.fillRect(-h4 / 2, -h4 / 2, b4 + h4 / 2, h4);
			g2.translate(b4, 0);

			g2.rotate(a5);
			g.setColor(Color.cyan);
			g.fillRect(-h5 / 2, -h5 / 2, b5 + h5 / 2, h5);
		}
	}

	Gui3() {
		f = new JFrame();
		f.setFocusable(true);
		f.setVisible(true);
		p = new DrawingPanel();
		f.getContentPane().add(p, BorderLayout.CENTER);
		ps = new JPanel();
		ps.setLayout(new GridLayout(0, 1));
		f.getContentPane().add(ps, BorderLayout.EAST);

		sa0 = new JSlider(JSlider.HORIZONTAL, 0, +90, 0);
		ps.add(sa0);
		sa1 = new JSlider(JSlider.HORIZONTAL, 0, +90, 0);
		ps.add(sa1);
		sa2 = new JSlider(JSlider.HORIZONTAL, -90, 0, 0);
		ps.add(sa2);
		sa3 = new JSlider(JSlider.HORIZONTAL, 0, +90, 0);
		ps.add(sa3);
		sa4 = new JSlider(JSlider.HORIZONTAL, 0, +90, 0);
		ps.add(sa4);
		sa5 = new JSlider(JSlider.HORIZONTAL, -90, 0, 0);
		ps.add(sa5);

		sa0.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a0 = (Math.PI / 180) * sa0.getValue();
				f.repaint();
			}
		});

		sa1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a1 = (Math.PI / 180) * sa1.getValue();
				f.repaint();
			}
		});

		sa2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a2 = (Math.PI / 180) * sa2.getValue();
				f.repaint();
			}
		});

		sa3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a3 = (Math.PI / 180) * sa3.getValue();
				f.repaint();
			}
		});

		sa4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a4 = (Math.PI / 180) * sa4.getValue();
				f.repaint();
			}
		});

		sa5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a5 = (Math.PI / 180) * sa5.getValue();
				f.repaint();
			}
		});

		f.setSize(new Dimension(650 + 16, 320 + 38));
	}
}
