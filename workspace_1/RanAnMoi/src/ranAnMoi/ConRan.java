package ranAnMoi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class ConRan {
	// khai bao do dai con ran ban dau
	int doDai = 3;
	// khai bao mang chua toa do do dai con ran
	int[] x, y;
	// khai bao thoi gian update ran
	long t1 = 0, t2 = 0;
	// khai bao khoang thoi gian de them toc do cho con ran
	double speed = 200;
	// khai bao do dai toi da de ran them toc do
	int maxLen = 10;
	// huong cho con ran mac dinh tu dau di xuong
	int vector = ConRan.GO_DOWN;
	//
	boolean upDateAfterChangeVt = true;
	// khai bao bien tinh
	public static int GO_UP = 1;
	public static int GO_DOWN = -1;
	public static int GO_LEFT = 2;
	public static int GO_RIGHT = -2;

	public ConRan() {
		x = new int[20];// do dai toi da
		y = new int[20];// do dai toi da
		x[0] = 5;
		y[0] = 4;
		//
		x[1] = 5;
		y[1] = 3;
		//
		x[2] = 5;
		y[2] = 2;
	}

	// phuong thuc reset lai game
	public void resetGame() {
		x = new int[100];// do dai toi da
		y = new int[100];// do dai toi da
		x[0] = 5;
		y[0] = 4;
		//
		x[1] = 5;
		y[1] = 3;
		//
		x[2] = 5;
		y[2] = 2;
		doDai = 3;
		
		vector = ConRan.GO_DOWN;
	}

	// phuong thuc thay doi duong di
	public void setVector(int v) {
		if (vector != -v && upDateAfterChangeVt) {
			vector = v;
			upDateAfterChangeVt = false;
		}
	}

	// kiem tra coi con moi co nam tren than ran hay ko??
	public boolean toaDoCoNamTrongTranRan(int x1, int y1) {
		for (int i = 0; i < doDai; i++) {
			if (x[i] == x1 && y[i] == y1)
				return true;
		}
		return false;
	}

	// tao diem con moi moi
	public Point layToaDoMoi() {
		Random r = new Random();
		int x, y;
		do {
			x = r.nextInt(GameScreen.DODAIKHUNG - 1);
			y = r.nextInt(GameScreen.DODAIKHUNG - 1);
		} while (toaDoCoNamTrongTranRan(x, y));
		return new Point(x, y);
	}
	public int getCurrentSpeed(){
		int speed = 200;
		for (int i = 0; i < GameScreen.currentLevel; i++) {
			speed *= 0.8;			
		}
		return speed;
	}
	// cap nhat do dai con ran
	public void upDate() {
		// them cap do moi cho con ran
		if (doDai == maxLen) {
			GameScreen.isPlaying = false;
			resetGame();
			
			GameScreen.currentLevel++;
			speed = getCurrentSpeed();
			
			maxLen += 5;
		}
		// kiem tra coi ran co can voa than hay ko??
		for (int i = 1; i < doDai; i++) {
			if (x[0] == x[i] && y[0] == y[i]) {
				GameScreen.isPlaying = false;
				GameScreen.isGameOver = true;
				// bat dau lai khi game over
				GameScreen.diem = 0;
				GameScreen.currentLevel = 1;
			}
		}
		if (System.currentTimeMillis() - t2 > 200) {

			upDateAfterChangeVt = true;

			Data.HeadGoUp.update();
			Data.HeadGoDown.update();
			Data.HeadGoLeft.update();
			Data.HeadGoRight.update();

			t2 = System.currentTimeMillis();
		}
		if (System.currentTimeMillis() - t1 > speed) {
			/* khi ran an moi */
			if (GameScreen.bg[x[0]][y[0]] == 2) {
				doDai++;
				// ăn con moi
				GameScreen.bg[x[0]][y[0]] = 0;
				// them con moi moi
				GameScreen.bg[layToaDoMoi().x][layToaDoMoi().y] = 2;
				// tang diem so
				GameScreen.diem+=100;
			}
			for (int i = doDai - 1; i > 0; i--) {
				x[i] = x[i - 1];
				y[i] = y[i - 1];
			}
			if (vector == ConRan.GO_UP)
				y[0]--;
			if (vector == ConRan.GO_DOWN)
				y[0]++;
			if (vector == ConRan.GO_LEFT)
				x[0]--;
			if (vector == ConRan.GO_RIGHT)
				x[0]++;
			/*
			 * lam xuat hien lai con ran khi cham vao khung luoi, 20 la do dai
			 * khung luoi
			 */
			if (x[0] < 0)//
				x[0] = GameScreen.DODAIKHUNG - 1;
			if (x[0] > GameScreen.DODAIKHUNG - 1)
				x[0] = 0;
			if (y[0] < 0)// 20 la do dai khung luoi
				y[0] = GameScreen.DODAIKHUNG - 1;
			if (y[0] > GameScreen.DODAIKHUNG - 1)
				y[0] = 0;

			t1 = System.currentTimeMillis();
		}
	}

	// ve con ran
	public void veRan(Graphics g) {
		g.setColor(Color.RED);
		for (int i = 1; i < doDai; i++) {
			/* tao o co do lon nhu o trong khung luoi */
			// ve than
			g.drawImage(Data.imgBody, x[i] * GameScreen.DODAIKHUNG + GameScreen.padding,
					y[0] * GameScreen.DODAIKHUNG + GameScreen.padding, null);
		}
		// ve dau ran
		if (vector == ConRan.GO_UP) {
			g.drawImage(Data.HeadGoUp.getCurrentImage(), x[0] * GameScreen.DODAIKHUNG - 6 + GameScreen.padding,
					y[0] * GameScreen.DODAIKHUNG - 6 + GameScreen.padding, null);
		} else if (vector == ConRan.GO_DOWN) {
			g.drawImage(Data.HeadGoDown.getCurrentImage(), x[0] * GameScreen.DODAIKHUNG - 6 + GameScreen.padding,
					y[0] * GameScreen.DODAIKHUNG - 6 + GameScreen.padding, null);
		} else if (vector == ConRan.GO_RIGHT) {
			g.drawImage(Data.HeadGoRight.getCurrentImage(), x[0] * GameScreen.DODAIKHUNG - 6 + GameScreen.padding,
					y[0] * GameScreen.DODAIKHUNG - 6 + GameScreen.padding, null);
		} else if (vector == ConRan.GO_LEFT) {
			g.drawImage(Data.HeadGoLeft.getCurrentImage(), x[0] * GameScreen.DODAIKHUNG - 6 + GameScreen.padding,
					y[0] * GameScreen.DODAIKHUNG - 6 + GameScreen.padding, null);
		}
	}
}
