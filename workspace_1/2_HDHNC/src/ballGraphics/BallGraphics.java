package ballGraphics;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class Ball {
	// khai bao vector van toc y
	public double vY;
	// khai bao x
	public double vX;
	public double x, y;
	// so lan lap khi va cham xuong dat theo y
	private int timeLookAfterColY = 0;
	// theo X
	private int timeLookAfterColX = 0;

	public Ball(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		vY = 0;
		vX = 0;
	}

	// gan van toc ban dau
	public void setVY(double v) {
		this.vY = v;
	}

	public void setVX(double v) {
		this.vX = v;
	}

	public void paintBall(Graphics g) {
		// ve tam hinh tron
		g.drawRect((int) x, (int) y, 1, 1);
		// ve hinh tron
		g.drawOval((int) (x - 30), (int) (y - 30), 60, 60);
	}

	public void setPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void upDate() {
		if (timeLookAfterColY <= 0) {
			vY += BallGraphics.gravity;
		}
		y += (vY);
		if (timeLookAfterColY <= 0) {
			if (y + 30 > 600) {
				vY = -(vY) / 1.5;
				timeLookAfterColY = 0;
			}
		} else {
			timeLookAfterColY--;
		}
		// theo x
		if (timeLookAfterColX <= 0 && vX > 0) {
			vX += BallGraphics.Fc;
		}
		x += (vX);
		if (timeLookAfterColX <= 0) {
			if (x + 30 > 600 || x - 30 <= 0) {
				vX = -(vX) / 1.5;
				timeLookAfterColX = 0;
			}
		} else {
			timeLookAfterColX--;
		}
	}
}

public class BallGraphics extends JFrame implements Runnable, MouseMotionListener,  MouseListener {

	Thread thread;
	Ball ball;
	public static double gravity = 0.15;
	public static double Fc = -0.02;

	public BallGraphics() {
		// tao qua bong moi
		ball = new Ball(100, 100);
		//
		thread = new Thread(this);
		thread.start();
		//
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		//
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void paint(Graphics g) {
		super.paint(g);
		// ve qua bong tren Frame
		ball.paintBall(g);
	}

	public void upDate() {
		ball.upDate();
		repaint();
	}

	@Override
	public void run() {

		while (true) {

			upDate();

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		BallGraphics g = new BallGraphics();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		ball.setPoint(e.getX(), e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	double x1, x2, y1, y2;
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		ball.setVX((x2 - x1)/10);
		ball.setVY((y2 - y1)/10);
	}
}
