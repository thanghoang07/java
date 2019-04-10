package observerPattern;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class Analog extends JPanel implements Observer {
	private int hours;
	private int minute;
	private int second;
	private Observable observable;

	public Analog(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
		this.HienThi();
	}

	public void HienThi() {
		this.repaint();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Clock) {
			Clock clock = (Clock) o;
			this.hours = clock.getH();
			this.minute = clock.getM();
			this.second = clock.getS();
			this.repaint();
		}
	}

	/* Ve dong ho */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Lay thong so gom : tam dong ho, ban kich khi nguoi dung cho 1 kich
		// thuoc bat ky
		int clockRadius = (int) (Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;

		// ve khung dong ho
		g.setColor(Color.black);
		g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
		g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
		g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
		g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
		g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);

		// ve kim giay
		int sLength = (int) (clockRadius * 0.8);
		int xSecond = (int) (xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
		int ySecond = (int) (yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
		g.setColor(Color.red);
		g.drawLine(xCenter, yCenter, xSecond, ySecond);

		// ve kim phut
		int mLength = (int) (clockRadius * 0.65);
		int xMinute = (int) (xCenter + mLength * Math.sin(minute * (2 * Math.PI / 60)));
		int yMinute = (int) (yCenter - mLength * Math.cos(minute * (2 * Math.PI / 60)));
		g.setColor(Color.blue);
		g.drawLine(xCenter, yCenter, xMinute, yMinute);

		// ve kim gio
		int hLength = (int) (clockRadius * 0.5);
		int xHour = (int) (xCenter + hLength * Math.sin((hours % 12 + minute / 60.0) * (2 * Math.PI / 12)));
		int yHour = (int) (yCenter - hLength * Math.cos((hours % 12 + minute / 60.0) * (2 * Math.PI / 12)));
		g.setColor(Color.green);
		g.drawLine(xCenter, yCenter, xHour, yHour);
	}
}
