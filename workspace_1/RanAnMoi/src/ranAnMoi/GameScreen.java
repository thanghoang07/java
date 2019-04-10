package ranAnMoi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameScreen extends JPanel implements Runnable {
	/* chứa các đối tượng */
	// khai bao phan tu do dai khung luoi
	public final static int DODAIKHUNG = 20;
	// khai bao mang hai chieu
	static int[][] bg = new int[DODAIKHUNG][DODAIKHUNG];
	// khai bao doi tuong con ran
	ConRan ran;
	// khai bao bien
	Thread thread;
	// khai bao them bien padding them vao khong rong bo xung
	static int padding = 10, WIDTH = 400, HEIGHT = 400;
	// khai bao bien bat dau
	static boolean isPlaying = false;
	// khai bao bien tao chu dong
	static boolean enableTextStartGame = true;
	// khai bao bien tao thong bao
	static boolean isGameOver = false;
	// khai bao time
	long t = 0, t2 = 0;
	// level 
	static int currentLevel = 1;
	// diem
	static int diem = 0;
	
	public GameScreen() {// hàm khởi tạo
		// Con ran
		ran = new ConRan();
		// load hinh
		Data.loadImage();
		Data.loadAllAnim();
		// Thread
		thread = new Thread(this);
		thread.start();
		// toa do con moi ban dau
		bg[10][10] = 2;
	}

	// chay
	public void run() {
		while (true) {
			if (System.currentTimeMillis() - t2 > 500) {
				enableTextStartGame = !enableTextStartGame;
				t2 = System.currentTimeMillis();
			}
			if (isPlaying) {
				if (System.currentTimeMillis() - t > 200) {
					Data.Worm.update();
					t = System.currentTimeMillis();
				}
				ran.upDate();
			}

			repaint();
			try {
				Thread.sleep(20);
			} catch (InterruptedException ex) {
			}
		}
	}

	// ve luoi
	public void paintBg(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH + padding * 2 + 200, HEIGHT + padding * 2);
		for (int i = 0; i < DODAIKHUNG; i++)
			for (int j = 0; j < DODAIKHUNG; j++) {
				// g.fillRect(i * DODAIKHUNG + 1, j * DODAIKHUNG + 1, 18, 18);
				if (bg[i][j] == 2) {
					g.drawImage(Data.Worm.getCurrentImage(), i * DODAIKHUNG - 7 + padding, j * DODAIKHUNG - 7 + padding,
							null);
				}
			}
	}

	// ve vien
	private void veKhung(Graphics g) {
		g.setColor(Color.ORANGE);
		g.drawRect(0, 0, WIDTH + padding * 2, HEIGHT + padding * 2);
		g.drawRect(1, 1, WIDTH + padding * 2 - 2, HEIGHT + padding * 2 - 2);
		g.drawRect(2, 2, WIDTH + padding * 2 - 4, HEIGHT + padding * 2 - 4);
		g.drawRect(0, 0, WIDTH + padding * 2 + 200, HEIGHT + padding * 2);
		g.drawRect(1, 1, WIDTH + padding * 2 - 2 + 200, HEIGHT + padding * 2 - 2);
		g.drawRect(2, 2, WIDTH + padding * 2 - 4 + 200, HEIGHT + padding * 2 - 4);
	}

	// ve khung va ran
	public void paint(Graphics g) {
		paintBg(g);
		ran.veRan(g);
		veKhung(g);
		// tao chu xuat hien khi bat dau game
		if (!isPlaying) {
			if (enableTextStartGame) {
				g.setColor(Color.WHITE);
				g.setFont(g.getFont().deriveFont(18.0f));
				g.drawString("Press space to play game!", 80, 200);
			}

		}
		if (isGameOver) {

			g.setColor(Color.WHITE);
			g.setFont(g.getFont().deriveFont(28.0f));
			g.drawString("Game Over!", 60, 250);

		}
		g.setColor(Color.WHITE);
		g.setFont(g.getFont().deriveFont(28.0f));
		g.drawString("Level: " + currentLevel, 450, 100);
		g.setFont(g.getFont().deriveFont(20.0f));
		g.drawString("Diem: " + diem, 450, 150);
	}
}
