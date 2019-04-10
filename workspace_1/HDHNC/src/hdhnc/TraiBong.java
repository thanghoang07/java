package hdhnc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TraiBong extends JPanel implements Runnable {

	final static int DUONGKINH = 20;

	private int m_x;
	private int m_y;
	Color color;
	private int m_vantocX;
	private int m_vantocY;

	private int m_rightBound;
	private int m_bottomBound;
	long delay;

	private String m_text;

	public TraiBong(String ballcolor, int x, int y, int vantocX, int vantocY, String text) {
		if (ballcolor == "red") {
			color = Color.red;
		} else if (ballcolor == "blue") {
			color = Color.blue;
		} else if (ballcolor == "black") {
			color = Color.black;
		} else if (ballcolor == "cyan") {
			color = Color.cyan;
		} else if (ballcolor == "darkGray") {
			color = Color.darkGray;
		} else if (ballcolor == "gray") {
			color = Color.gray;
		} else if (ballcolor == "green") {
			color = Color.green;
		} else if (ballcolor == "yellow") {
			color = Color.yellow;
		} else if (ballcolor == "lightGray") {
			color = Color.lightGray;
		} else if (ballcolor == "magenta") {
			color = Color.magenta;
		} else if (ballcolor == "orange") {
			color = Color.orange;
		} else if (ballcolor == "pink") {
			color = Color.pink;
		} else if (ballcolor == "white") {
			color = Color.white;
		}
		m_x = x;
		m_y = y;
		m_vantocX = vantocX;
		m_vantocY = vantocY;
		m_text = text;
	}

	public void setBounds(int width, int height) {
		m_rightBound = width - DUONGKINH;
		m_bottomBound = height - DUONGKINH;
	}

	public void move() {
		m_x += m_vantocX;
		m_y += m_vantocY;

		if (m_x < 0) {
			m_x = 0;
			m_vantocX = -m_vantocX;

		} else if (m_x > m_rightBound) {
			m_x = m_rightBound;
			m_vantocX = -m_vantocX;
		}

		if (m_y < 0) {
			m_y = 0;
			m_vantocY = -m_vantocY;

		} else if (m_y > m_bottomBound) {
			m_y = m_bottomBound;
			m_vantocY = -m_vantocY;
		}

		setSize(getPreferredSize());
	}

	public void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillOval(m_x, m_y, DUONGKINH, DUONGKINH);

		g.setColor(Color.white);
		g.drawString(m_text, m_x - DUONGKINH / 2 + 17, m_y - DUONGKINH / 2 + 25);

	}

	public int getDiameter() {
		return DUONGKINH;
	}

	public int getX() {
		return m_x;
	}

	public int getY() {
		return m_y;
	}

	public String getText() {
		return m_text;
	}

	public void setPosition(int x, int y) {
		m_x = x;
		m_y = y;
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(10, 10);
	}

	@Override
	public void run() {
		try {
			// Randamize the location...
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
				System.out.println("interrupted");
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
