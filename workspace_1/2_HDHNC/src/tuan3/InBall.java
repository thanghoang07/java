package tuan3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class InBall extends JPanel implements Runnable {
	Color color;
	int duongKinh;
	String ballColor;
	int vX, vY;
	int delay = 10;
	Timer timer = new Timer(delay, new TimerListener());

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			repaint();
		}

	}

	public InBall(String ballColor, int vx, int vy) {
		if (ballColor == "red") {
			color = Color.RED;
		} else if (ballColor == "green") {
			color = Color.GREEN;
		} else if (ballColor == "gray") {
			color = Color.GRAY;
		} else {
			color = Color.CYAN;
		}
		duongKinh = 1;
		delay = 1;
		vX = vx;
		vY = vy;

		new Thread(this).start();
	}

	public void painComponet(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);// them mau
		g.fillOval(0, 0, 30, 35);
		g.setColor(Color.BLACK);
		g2.drawOval(0, 0, 30, 35);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(30, 30);
	}

	public void move() {
		int x = getX();
		int y = getY();

		if (x + vX < 0 || x + duongKinh + vX > getParent().getWidth()) {
			vX *= -1;
		}
		if (y + vY < 0 || y + duongKinh + vY > getParent().getHeight()) {
			vY *= -1;
		}
		x += vX;
		y += vY;

		setSize(getPreferredSize());
		setLocation(x, y);
	}

	public void suspend() {
		timer.stop();
	}

	public void resume() {
		timer.start();
	}

	public void setDelay(int delay) {
		this.delay = delay;
		timer.setDelay(delay);
	}

	@Override
	public void run() {
		try {
			// tao vi tri ngau nhien
			SwingUtilities.invokeAndWait(new Runnable() {
				@Override
				public void run() {
					int x = (int) (Math.round(Math.random() * getParent().getWidth()));
					int y = (int) (Math.round(Math.random() * getParent().getHeight()));

					setLocation(x, y);
				}
			});
		} catch (InterruptedException exp) {
			exp.printStackTrace();
		} catch (InvocationTargetException exp) {
			exp.printStackTrace();
		}
		while (isVisible()) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				SwingUtilities.invokeAndWait(new Runnable() {
					@Override
					public void run() {
						move();
						repaint();
					}
				});
			} catch (InterruptedException exp) {
				exp.printStackTrace();
			} catch (InvocationTargetException exp) {
				exp.printStackTrace();
			}
		}
	}
}
