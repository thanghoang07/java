import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aravind Sankaran
 */
public class AnalogClock extends JPanel {

	ImageIcon img;

	private GregorianCalendar m_calendar;
	private int[] x = new int[2];
	private int[] y = new int[2];
	private java.util.Timer clocktimer = new java.util.Timer();

	/**
	 * You could set the TimeZone for the clock here. I used the Dfault time
	 * zone from the user so that every time the program runs on different
	 * computers the correct time is displayed
	 */

	private TimeZone clockTimeZone = TimeZone.getDefault();

	// Constructor
	public AnalogClock() {
		this.setPreferredSize(new Dimension(210, 210));
		this.setMinimumSize(new Dimension(210, 210));

		// schedules the clocktimer task to scan for every 1000ms=1sec
		clocktimer.schedule(new TickTimerTask(), 0, 1000);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Analog Clock");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		AnalogClock m_AnalogClock = new AnalogClock();
		frame.add(m_AnalogClock);
		frame.setVisible(true);

	}

	// The Clock Face instance method
	public void paint(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		drawCardinals((Graphics2D) g);
		drawHands((Graphics2D) g);

	}

	// Endpoints of the Clock Hand
	void clockMinutes(int startRadius, int endRadius, double theta) {
		theta -= Math.PI / 2;
		x[0] = (int) (getWidth() / 2 + startRadius * Math.cos(theta));
		y[0] = (int) (getHeight() / 2 + startRadius * Math.sin(theta));
		x[1] = (int) (getWidth() / 2 + endRadius * Math.cos(theta));
		y[1] = (int) (getHeight() / 2 + endRadius * Math.sin(theta));
	}

	// The Hours/Cardinals of the clock
	/** Set Stroke sets the thickness of the cardinals and hands */
	void drawCardinals(Graphics2D g) {
		// g.setStroke(new BasicStroke(9));
		g.setStroke(new BasicStroke(12));
		g.setColor(Color.black);

		for (double theta = 0; theta < Math.PI * 2; theta += Math.PI / 6) {
			clockMinutes(100, 100, theta);
			/**
			 * Draws a sequence of connected lines defined by arrays of x and y
			 * coordinates. Each pair of (x, y) coordinates defines a point. The
			 * figure is not closed if the first point differs from the last
			 * point.
			 */
			g.drawPolyline(x, y, 2);
		}
	}

	// The Hand of the Clocks instance method
	public void drawHands(Graphics2D g) {
		double h = 2 * Math.PI * (m_calendar.get(Calendar.HOUR));
		double m = 2 * Math.PI * (m_calendar.get(Calendar.MINUTE));
		double s = 2 * Math.PI * (m_calendar.get(Calendar.SECOND));

		g.setStroke(new BasicStroke(9));

		clockMinutes(0, 55, h / 12 + m / (60 * 12));
		g.setColor(Color.BLACK);
		g.drawPolyline(x, y, 2);

		clockMinutes(0, 70, m / 60 + s / (60 * 60));
		g.setColor(Color.black);
		g.drawPolyline(x, y, 2);

		clockMinutes(0, 70, s / 60);
		g.setColor(Color.red);
		g.drawPolyline(x, y, 2);

		g.fillOval(getWidth() / 2 - 8, getHeight() / 2 - 8, 16, 16);
	}

	// method to update/refresh the clock every second
	class TickTimerTask extends TimerTask {
		public void run() {
			m_calendar = (GregorianCalendar) GregorianCalendar.getInstance(clockTimeZone);
			repaint();
		}
	}
}