package khac;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class AnalogTimer extends JFrame {
	Clock clockFace;

	// ================================================================= main
	public static void main(String[] args) {
		JFrame windo = new AnalogTimer();
		windo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windo.setVisible(true);
	}// end main
		// ==========================================================
		// constructor

	public AnalogTimer() {
		Container content = this.getContentPane();
		content.setLayout(new BorderLayout());
		clockFace = new Clock();
		content.add(clockFace, BorderLayout.CENTER);
		this.setTitle("Analog Clock");
		this.pack();
		clockFace.start();
	}// end constructor
}// end class ClockAnalogBuf

class Clock extends JPanel {
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	private int millis = 0;
	private static final int spacing = 10;
	private static final float twoPi = (float) (2.0 * Math.PI);
	private static final float threePi = (float) (3.0 * Math.PI);
	// Angles for the trigonometric functions are measured in radians.
	// The following in the number of radians per sec or min.
	private static final float radPerSecMin = (float) (Math.PI / 30.0);
	private int size; // height and width of clock face
	private int centerX; // x coord of middle of clock
	private int centerY; // y coord of middle of clock
	private BufferedImage clockImage;
	private javax.swing.Timer t;

	// ==================================================== Clock constructor
	public Clock() {
		this.setPreferredSize(new Dimension(300, 300));
		this.setBackground(Color.white);
		this.setForeground(Color.black);
		t = new javax.swing.Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
	}// end constructor
		// ===============================================================
		// update
		// Replace the default update so that the plain background
		// doesn't get drawn.

	public void update() {
		this.repaint();
	}// end update
		// ================================================================
		// start

	public void start() {
		t.start(); // start the timer
	}// end start
		// =================================================================
		// stop

	public void stop() {
		t.stop(); // start the timer
	}// end stop
		// =======================================================
		// paintComponent

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // paint background, borders
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// The panel may have been resized, get current dimensions
		int w = getWidth();
		int h = getHeight();
		size = ((w < h) ? w : h) - 2 * spacing;
		centerX = size / 2 + spacing;
		centerY = size / 2 + spacing;
		// Create the clock face background image if this is the first time,
		// or if the size of the panel has changed
		if (clockImage == null | clockImage.getWidth() != w || clockImage.getHeight() != h) {
			clockImage = (BufferedImage) (this.createImage(w, h));
			// now get a graphics context from this image
			Graphics2D gc = clockImage.createGraphics();
			gc.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			drawClockFace(gc);
		}
		// Now get the time and draw the hands.
		Calendar now = Calendar.getInstance();
		hours = now.get(Calendar.HOUR);
		minutes = now.get(Calendar.MINUTE);
		seconds = now.get(Calendar.SECOND);
		millis = now.get(Calendar.MILLISECOND);
		// Draw the clock face from the precomputed image
		g2.drawImage(clockImage, null, 0, 0);
		// Draw the clock hands
		drawClockHands(g);
	}// end paintComponent
		// =======================================================
		// drawClockHands

	private void drawClockHands(Graphics g) {
		int secondRadius = size / 2;
		int minuteRadius = secondRadius * 3 / 4;
		int hourRadius = secondRadius / 2;
		// second hand
		float fseconds = seconds + (float) millis / 1000;
		float secondAngle = threePi - (radPerSecMin * fseconds);
		drawRadius(g, centerX, centerY, secondAngle, 0, secondRadius);
		// minute hand
		float fminutes = (float) (minutes + fseconds / 60.0);
		float minuteAngle = threePi - (radPerSecMin * fminutes);
		drawRadius(g, centerX, centerY, minuteAngle, 0, minuteRadius);
		// hour hand
		float fhours = (float) (hours + fminutes / 60.0);
		float hourAngle = threePi - (5 * radPerSecMin * fhours);
		drawRadius(g, centerX, centerY, hourAngle, 0, hourRadius);
	}// end drawClockHands
		// ========================================================
		// drawClockFace

	private void drawClockFace(Graphics g) {
		// clock face
		g.setColor(Color.lightGray);
		g.fillOval(spacing, spacing, size, size);
		g.setColor(Color.black);
		g.drawOval(spacing, spacing, size, size);
		// tic marks
		for (int sec = 0; sec < 60; sec++) {
			int ticStart;
			if (sec % 5 == 0) {
				ticStart = size / 2 - 10;
			} else {
				ticStart = size / 2 - 5;
			}
			drawRadius(g, centerX, centerY, radPerSecMin * sec, ticStart, size / 2);
		}
	}// endmethod drawClockFace
		// ===========================================================
		// drawRadius

	private void drawRadius(Graphics g, int x, int y, double angle, int minRadius, int maxRadius) {
		float sine = (float) Math.sin(angle);
		float cosine = (float) Math.cos(angle);
		int dxmin = (int) (minRadius * sine);
		int dymin = (int) (minRadius * cosine);
		int dxmax = (int) (maxRadius * sine);
		int dymax = (int) (maxRadius * cosine);
		g.drawLine(x + dxmin, y + dymin, x + dxmax, y + dymax);
	}// end drawRadius
}
