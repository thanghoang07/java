package jpong;

import java.awt.Color;

public class Paddle {
	// khai bao bien x
	int x;
	// khai bao bien y
	int y;

	// int dx = 10;

	// khai bao do dai thanh go
	int pwidth = 60;
	// khai bao do rong thanh go
	int pheight = 10;
	/* Color colour = Color.RED; */
	// khai bao bien dem so diem
	int score = 0;

	public Paddle() {
	}

	public Paddle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// tao thanh go di chuyen
	public void movePaddle(int width, int height, int dx) {
		if (x + pwidth <= width && x >= 0)
			x += dx;
		else if (x + pwidth > width)
			x = width - pwidth;
		else if (x < 0)
			x = 0;
	}
}
