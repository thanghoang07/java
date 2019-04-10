package tuan4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Ball extends JPanel {
	// toa do xy cua bong ban dau
	private int x = 40, y = 0;
	private int radius = 8;
	// toa do cua x y sau, khoang cach giua cac qua bong
	private int vx = 4, vy = 4;
	// delay : 30ms
	private Timer time = new Timer(30, new TimerListener());

	public Ball() {
		time.start();
	}

	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// set mau
		g.setColor(Color.RED);

		// kiem tra dieu kien
		if (x < radius)
			vx = Math.abs(vx);
		if (y < radius)
			vy = Math.abs(vy);
		if (x > getWidth() - radius)
			vx = -Math.abs(vx);
		if (y > getHeight() - radius)
			vy = -Math.abs(vy);

		x += vx;
		y += vy;
		// ve hinh tron
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}
	
	public void stop() {
		time.stop();

	}
	
	public void start(){
		time.start();
	}
	public void them(){
		
	}
}

