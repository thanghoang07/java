package jpong;

import java.awt.Color;

public class Ball {
	int x;
	int y;
	int dx;
	int dy;
	int bwidth = JPong.iwidth;
	int bheight = JPong.iheight;
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

	// di chuyen qua bong
	public void moveBall(int width, int height) {
		if (x + JPong.iwidth < width && x > 0)
			x += dx;
		else {
			dx = -dx;
			x += dx;
		}
		if (x + bwidth >= JPong.paddle.x && x <= JPong.paddle.x + JPong.paddle.pwidth
				&& y + JPong.iheight >= JPong.paddle.y && y + JPong.iheight <= JPong.paddle.y + JPong.paddle.pheight
				&& dy > 0) {
			dy = -dy;
			y += dy;

			/*
			 * khi bong cham vao thanh go va nay len thi tang dien
			 * 
			 */
			JPong.paddle.score++;
		}
		if (y + JPong.iheight < height && y > 0)
			y += dy;
		else {
			if (y + JPong.iheight >= height) {

				/*
				 * khi bong vuot qua thanh go thi giam diem
				 */
				JPong.paddle.score--;
			}
			dy = -dy;
			y += dy;
		}
	}
}
