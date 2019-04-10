package jpong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameScreen extends JPanel {
	// khai bao bien bat dau
	static boolean isPlaying = false;
	// khai bao bien tao chu dong
	static boolean enableTextStartGame = true;
	// khai bao bien tao thong bao
	static boolean isGameOver = false;

	public GameScreen() {
		TimerListener animate = new TimerListener();
		Timer timer = new Timer(10, animate);
		timer.start();
	}

	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JPong.paddle.y = getHeight() - 100;
			for (Ball ball : JPong.balls) {
				ball.moveBall(getWidth(), getHeight());
			}
			// ve lai trai bong
			repaint();
		}
	}

	// ve khung va bong
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Ball block : JPong.balls) {
			// dat mau cho hinh
			g.setColor(block.colour);
			// ve hinh tron
			g.fillOval(block.x, block.y, block.bwidth, block.bheight);
		}
		// ve thanh go
		g.setColor(Color.WHITE);
		// ve khung
		g.fillRect(JPong.paddle.x, JPong.paddle.y, JPong.paddle.pwidth, JPong.paddle.pheight);
		// dat phong chu
		g.setFont(new Font("Arial", Font.BOLD, 30));
		// ve thanh ghi diem
		g.drawString("SCORE: " + JPong.paddle.score, getWidth() / 2 - 60, getHeight() - 40);
	}
}
