package bong_nay;

import java.awt.Color;
import java.awt.Graphics;

public class TraiBong {

	final static int DUONGKINH = 21;

	private int m_x;
	private int m_y;

	private int m_vantocX;
	private int m_vantocY;

	private int m_rightBound;
	private int m_bottomBound;

	private String m_text;

	public TraiBong(int x, int y, int vantocX, int vantocY, String text) {
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
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
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

}
