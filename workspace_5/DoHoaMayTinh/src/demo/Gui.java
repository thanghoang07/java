package demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GL2ES1;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLJPanel;
import javax.media.opengl.fixedfunc.GLLightingFunc;
import javax.media.opengl.fixedfunc.GLMatrixFunc;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import demo.Gui.Curve;
import demo.Gui.DrawingPanel;

public class Gui {
	JFrame f;
	DrawingPanel p;

	static final int M = 1000;
	int m = 0;
	Curve[] curve = new Curve[M];

	class Curve {
		static final int N = 1000;
		int n = 0;
		int[] x = new int[N], y = new int[N];
	}

	class DrawingPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.red);
			for (int i = 0; i < m; i++)

				g.drawPolyline(curve[i].x, curve[i].y, curve[i].n);
		}
	}

	Gui() {
		f = new JFrame();
		f.setFocusable(true);
		f.setVisible(true);
		p = new DrawingPanel();
		f.getContentPane().add(p, BorderLayout.CENTER);

		p.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (m < M) {
					m++;
					curve[m - 1] = new Curve();
				}
			}
		});

		p.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Curve c = curve[m - 1];
				if (c.n < Curve.N) {
					c.n++;
					c.x[c.n - 1] = e.getX();
					c.y[c.n - 1] = e.getY();
				}
				f.repaint();
			}
		});

		f.setSize(new Dimension(300, 300 + 22));
	}
}
