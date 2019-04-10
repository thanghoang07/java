package bong_nay;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

public class NayBongTrongBox extends JPanel {
	private TraiBong m_ball_01 = new TraiBong(0, 10, 15, 17, "A");
	private TraiBong m_ball_02 = new TraiBong(30, 0, 16, 18, "B");
	private TraiBong m_ball_03 = new TraiBong(60, 0, 10, 10, "C");
	private TraiBong m_ball_04 = new TraiBong(10, 0, 20, 30, "D");

	private int m_interval = 35;
	private Timer m_timer;

	public NayBongTrongBox() {
		setPreferredSize(new Dimension(200, 80));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));// mau khung
		m_timer = new Timer(m_interval, new TimerAction());
	}

	public void setAnimation(boolean turnOnOff) {
		if (turnOnOff) {
			m_timer.start();
		} else {
			m_timer.stop();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		m_ball_01.draw(g);
		m_ball_02.draw(g);
		m_ball_03.draw(g);
		m_ball_04.draw(g);
	}

	class TimerAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			m_ball_01.setBounds(getWidth(), getHeight());
			m_ball_01.move();

			m_ball_02.setBounds(getWidth(), getHeight());
			m_ball_02.move();

			m_ball_03.setBounds(getWidth(), getHeight());
			m_ball_03.move();

			m_ball_04.setBounds(getWidth(), getHeight());
			m_ball_04.move();

			repaint();
		}
	}
}