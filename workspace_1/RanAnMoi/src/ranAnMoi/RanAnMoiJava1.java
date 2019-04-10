package ranAnMoi;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class RanAnMoiJava1/* RanAnMoiJava */ extends JFrame {
	/* chứa màn hình chơi game trên Panel */

	private static final long serialVersionUID = 1L;
	GameScreen game;

	public RanAnMoiJava1() {
		// them vao frame
		game = new GameScreen();
		add(game);
		// them su kien
		this.addKeyListener(new handLer());
		// cài đặt vị trí, nút thoát ra ...
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650, 500);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		RanAnMoiJava1 f = new RanAnMoiJava1();
	}

	/*
	 * tao lop noi tai, lop nam trong lop, lop ban phim di chuyen con ran
	 */
	private class handLer implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				GameScreen.isPlaying = !GameScreen.isPlaying;
				if (GameScreen.isGameOver)
					GameScreen.isGameOver = false;
				game.ran.resetGame();// reset lai ban dau khi da bi game over
			}
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				game.ran.setVector(ConRan.GO_UP);
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				game.ran.setVector(ConRan.GO_DOWN);
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				game.ran.setVector(ConRan.GO_LEFT);
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				game.ran.setVector(ConRan.GO_RIGHT);
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
