package jpong;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

public class JPong extends JFrame {
	// dat chieu rong cho trai bong
	static final int iwidth = 60;
	// dat chieu cao cho trai bong
	static final int iheight = 60;
	// thiet dat danh sach trai bong
	static ArrayList<Ball> balls = new ArrayList<>();

	static Paddle paddle;
	//
	GameScreen map = new GameScreen();

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
					paddle.movePaddle(getWidth(), getHeight(), 8);
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					paddle.movePaddle(getWidth(), getHeight(), -8);
				}
				repaint();
			}
		}

		PaddleChecker paddleListener = new PaddleChecker();
		addKeyListener(paddleListener);

		setLayout(new BorderLayout());
		GameScreen map = new GameScreen();
		map.setBackground(Color.BLACK);
		add(map, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
