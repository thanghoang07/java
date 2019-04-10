package demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class P_4 {
	public static void main(String[] arg) {
		Game game = new Game();
		game.play();
	}
}

class Game {
	boolean end = false;

	synchronized void set_end(boolean v) {
		end = v;
	}

	synchronized boolean get_end() {
		return end;
	}

	static int size;
	static long dt;
	World world;
	Gui4 gui;

	Game() {
		size = 500;
		dt = 100;
		world = new World();
		gui = new Gui4(this);
	}

	void play() {
		while (!get_end()) {
			long t_start = System.currentTimeMillis();

			world.evolve();
			gui.p.repaint();

			long dt_real = System.currentTimeMillis() - t_start;
			if (dt_real < dt)
				try {
					Thread.sleep(dt - dt_real);
				} catch (InterruptedException e) {
				}
			else
				System.out.println("PC too slow; please increase dt");
		}

		System.exit(0);
	}
}

class World {
	static final int N = 30;
	Obj[] obj = new Obj[N];
	SpaceCraft spacecraft;

	World() {
		obj[0] = spacecraft = new SpaceCraft();
		for (int i = 1; i < N; i++)
			obj[i] = new Asteroid();
	}

	void evolve() {
		for (int i = 0; i < N; i++)
			if (obj[i] != null)
				obj[i].evolve();
	}

	void draw(Graphics g) {
		for (int i = 0; i < N; i++)
			if (obj[i] != null)
				obj[i].draw(g);
	}
}

abstract class Obj {
	abstract void evolve();

	abstract void draw(Graphics g);
}

class Asteroid extends Obj {
	int x, y, vx, vy;

	Asteroid() {
		x = (int) (Math.random() * Game.size);
		vx = (int) ((2 * Math.random() - 1) * Game.size / 300.0);
		y = (int) (Math.random() * Game.size);
		vy = (int) ((2 * Math.random() - 1) * Game.size / 300.0);
	}

	void evolve() {
		x += vx * Game.dt / 1000.0;
		y += vy * Game.dt / 1000.0;
	}

	void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x - 5, y - 5, 10, 10);
	}
}

class SpaceCraft extends Obj {
	int x, y;
	double dir;
	int COMdir;

	synchronized void set_COMdir(int c) {
		COMdir = c;
	}

	double thr;
	int COMthr;

	synchronized void set_COMthr(int c) {
		COMthr = c;
	}

	SpaceCraft() {
		x = y = Game.size / 2;
		dir = 0.0;
		thr = 0.0;
	}

	synchronized void evolve() {
		dir += COMdir * (2.0 * Math.PI / 5) * Game.dt / 1000.0;
		thr += COMthr * (1.0 / 5) * Game.dt / 1000.0;
		if (thr < 0.0)
			thr = 0.0;
		if (thr > 1.0)
			thr = 1.0;

		double v = thr * Game.size / 10.0;
		x += (int) (v * Math.cos(dir) * Game.dt / 1000.0);
		y += (int) (v * Math.sin(dir) * Game.dt / 1000.0);
	}

	int n = 4;
	int[] X = new int[] { 15, -15, -10, -15 };
	int[] Y = new int[] { 0, 10, 0, -10 };

	void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		java.awt.geom.AffineTransform at0 = g2.getTransform();

		g2.translate(x, y);
		g2.rotate(dir);

		g.setColor(Color.blue);
		g.fillPolygon(X, Y, n);

		g2.setTransform(at0);
	}
}

class Gui4 {
	Game game;
	JFrame f;
	DrawingPanel p;

	class DrawingPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			game.world.draw(g);
		}
	}

	Gui4(Game game) {
		this.game = game;
		f = new JFrame();
		f.setFocusable(true);
		f.setVisible(true);
		p = new DrawingPanel();
		f.getContentPane().add(p, BorderLayout.CENTER);

		f.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int c = e.getKeyCode();
				SpaceCraft sc = Gui4.this.game.world.spacecraft;
				switch (c) {
				case KeyEvent.VK_LEFT:
					sc.set_COMdir(-1);
					break;
				case KeyEvent.VK_RIGHT:
					sc.set_COMdir(+1);
					break;
				case KeyEvent.VK_DOWN:
					sc.set_COMthr(-1);
					break;
				case KeyEvent.VK_UP:
					sc.set_COMthr(+1);
					break;
				case KeyEvent.VK_ESCAPE:
					Gui4.this.game.set_end(true);
					break;
				}
			}
		});

		f.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int c = e.getKeyCode();
				SpaceCraft sc = Gui4.this.game.world.spacecraft;
				switch (c) {
				case KeyEvent.VK_LEFT:
					sc.set_COMdir(0);
					break;
				case KeyEvent.VK_RIGHT:
					sc.set_COMdir(0);
					break;
				case KeyEvent.VK_DOWN:
					sc.set_COMthr(0);
					break;
				case KeyEvent.VK_UP:
					sc.set_COMthr(0);
					break;
				}
			}
		});

		f.setSize(new Dimension(Game.size + 16, Game.size + 38));
	}
}
