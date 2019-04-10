package ball;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class JPong extends JFrame {
	static final int iwidth = 60;
	static final int iheight = 60;
	ArrayList<Ball> balls = new ArrayList<>();
	Paddle paddle;

	public static void main(String[] args) {
		JPong app = new JPong();
	}

	public JPong() {
		setSize(500, 400);
		setTitle("JPong - APC Magazine Learn to Code Masterclass");

		// Change this value to change the number of balls - don't go beyond
		// 1000
		int numberOfBalls = 1;
		// Change this value to change the number of balls - don't go beyond
		// 1000

		for (int index = 0; index < numberOfBalls; index++) {
			int dx = (int) (Math.random() * 8) - 4;
			if (dx > -1 && dx < 1)
				dx = 1;
			int dy = (int) (Math.random() * 8) - 4;
			if (dy > -1 && dy < 1)
				dy = 1;
			balls.add(new Ball((int) (Math.random() * (getWidth() - iwidth - 40)),
					(int) (Math.random() * (getHeight() - iheight - 40)), dx, dy,
					new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255))));
		}
		paddle = new Paddle(getWidth() / 2, getHeight() - 150);

		class PaddleChecker extends KeyAdapter {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					paddle.move(getWidth(), getHeight(), 8);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					paddle.move(getWidth(), getHeight(), -8);
				}
				repaint();
			}
		}

		PaddleChecker paddleListener = new PaddleChecker();
		addKeyListener(paddleListener);

		setLayout(new BorderLayout());
		Map map = new Map();
		map.setBackground(Color.BLACK);
		add(map, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	class Map extends JPanel {
		public Map() {
			TimerListener animate = new TimerListener();
			Timer timer = new Timer(16, animate);
			timer.start();
		}

		private class TimerListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				paddle.y = getHeight() - 100;
				for (Ball ball : balls) {
					ball.move(getWidth(), getHeight());
				}
				repaint();
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (Ball block : balls) {
				g.setColor(block.colour);
				g.fillOval(block.x, block.y, block.bwidth, block.bheight);
			}
			g.setColor(Color.WHITE);
			g.fillRect(paddle.x, paddle.y, paddle.pwidth, paddle.pheight);
			g.setFont(new Font("Arial", Font.BOLD, 30));
			g.drawString("SCORE: " + paddle.score, getWidth() / 2 - 60, getHeight() - 40);
		}
	}

	class Paddle {
		int x;
		int y;
		int dx = 2;
		int pwidth = 60;
		int pheight = 10;
		Color colour = Color.RED;
		int score = 0;

		public Paddle() {
		}

		public Paddle(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void move(int width, int height, int dx) {
			if (x + pwidth <= width && x >= 0)
				x += dx;
			else if (x + pwidth > width)
				x = width - pwidth;
			else if (x < 0)
				x = 0;
		}
	}

	class Ball {
		int x;
		int y;
		int dx;
		int dy;
		int bwidth = iwidth;
		int bheight = iheight;
		Color colour;

		public Ball() {
		}

		public Ball(int x, int y, int dx, int dy, Color color) {
			this.x = x;
			this.y = y;
			this.dx = dx;
			this.dy = dy;
			colour = color;
		}

		public void move(int width, int height) {
			if (x + iwidth < width && x > 0)
				x += dx;
			else {
				dx = -dx;
				x += dx;
			}
			if (x + bwidth >= paddle.x && x <= paddle.x + paddle.pwidth && y + iheight >= paddle.y
					&& y + iheight <= paddle.y + paddle.pheight && dy > 0) {
				dy = -dy;
				y += dy;
				paddle.score++;
			}
			if (y + iheight < height && y > 0)
				y += dy;
			else {
				if (y + iheight >= height) {
					paddle.score--;
				}
				dy = -dy;
				y += dy;
			}
		}
	}
}
