package demo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * A panel that displays a two-dimensional animation that is constructed using
 * hierarchical modeling. A cart rolls down a road while a sun shines and three
 * windmills turn in the background. This class also contains a main() routine
 * that simply opens a window that displays the animation.
 */
public class HierarchicalModeling2D extends JPanel {

	public static void main(String[] args) {
		JFrame window = new JFrame("Hierarchical Modeling in 2D");
		window.setContentPane(new HierarchicalModeling2D());
		window.pack();
		window.setLocation(100, 60);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	private int frameNumber; // For animation, increases by 1 in each frame.

	private GeneralPath ground; // A path used for drawing the ground, with
								// "hills".
	private GeneralPath windmillVane; // A path used for drawing one windmill
										// blade.

	private float pixelSize; // The size of a pixel in drawing coordinates.
	private double[] limitsRequested = new double[] { 0, 7, 4, -1 }; // Desired
																		// coordinate
																		// limits.

	/**
	 * Constructor sets the preferred size of the panel to 700-by-500, adds a
	 * gray border, and starts a timer that will drive the animation.
	 */
	public HierarchicalModeling2D() {
		setPreferredSize(new Dimension(700, 500));
		setBackground(Color.LIGHT_GRAY);
		setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
		ground = new GeneralPath();
		ground.moveTo(0, -1);
		ground.lineTo(0, 1);
		ground.curveTo(1, 2, 1, 2, 1.5F, 2);
		ground.curveTo(2.5F, 2, 2.5F, 1.5F, 2, 1.5F);
		ground.curveTo(2.5F, 1.5F, 2.5F, 2.5F, 3, 2.5F);
		ground.curveTo(3.5F, 2.5F, 3.5F, 1.8F, 4, 1.8F);
		ground.curveTo(5, 1.8F, 4, 2.2F, 5, 2.2F);
		ground.curveTo(6, 2.2F, 6, 2, 7, 2);
		ground.lineTo(7, -1);
		ground.closePath();
		windmillVane = new GeneralPath();
		windmillVane.moveTo(0, 0);
		windmillVane.lineTo(0.5F, 0.1F);
		windmillVane.lineTo(1.5F, 0);
		windmillVane.lineTo(0.5F, -0.1F);
		windmillVane.closePath();
		new Timer(30, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frameNumber++;
				repaint();
			}
		}).start();
	}

	/**
	 * Draw the current frame of the animation.
	 */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		/*
		 * Apply coordinates with x ranging from 0 on the left to 7 on the right
		 * and y ranging from -1 at the bottom to 4 at the top. Note that the
		 * aspect ration is NOT preserved, so the aspect ratio of the panel
		 * should closely match the aspect ratio of the coordinate rectangle.
		 */

		applyLimits(g2, getWidth(), getHeight(), limitsRequested, false);

		/* Draw the sky, ground, and road directly. */
		g2.setColor(new Color(150, 150, 255));
		g2.fillRect(0, 0, 7, 4); // fills the sky, behind the hills
		g2.setColor(new Color(0, 150, 30));
		g2.fill(ground); // the ground
		g2.setColor(new Color(100, 100, 150));
		g2.fill(new Rectangle2D.Double(0, -0.4, 7, 0.8)); // the road
		g2.setStroke(
				new BasicStroke(0.1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 0.25F, 0.2F }, 1));
		g2.setColor(Color.WHITE);
		g2.drawLine(0, 0, 7, 0); // the stripes on the road, drawn as a dashed
									// line
		g2.setStroke(new BasicStroke(pixelSize));

		/*
		 * Keep a copy of the current transform, so that it can be restored
		 * after drawing each object. Note that transforms will be applied to
		 * the objects and that the methods that draw the objects can make
		 * further changes to the transforms.
		 */

		AffineTransform saveTr = g2.getTransform();

		/*
		 * Draw the sun. The drawSun method draws the sun centered at (0,0). A
		 * translation is applied to move the center of the sun to (5,3.3).
		 */

		g2.translate(5, 3.3);
		drawSun(g2);
		g2.setTransform(saveTr);

		/*
		 * Draw three windmills. The drawWindmill method draws the windmill with
		 * its base at (0,0), and the top of the pole at (0,3). Each windmill is
		 * first scaled to change its size and then translated to move its base
		 * to a different paint. In the animation, the vanes of the windmill
		 * rotate. That rotation is done with a transform inside the
		 * drawWindmill method.
		 */

		g2.translate(0.75, 1);
		g2.scale(0.6, 0.6);
		drawWindmill(g2);
		g2.setTransform(saveTr);

		g2.translate(2.2, 1.6);
		g2.scale(0.4, 0.4);
		drawWindmill(g2);
		g2.setTransform(saveTr);

		g2.translate(3.7, 0.8);
		g2.scale(0.7, 0.7);
		drawWindmill(g2);
		g2.setTransform(saveTr);

		/*
		 * Draw the cart. The drawCart method draws the cart with the center of
		 * its base at (0,0). The body of the cart is 5 units long and 2 units
		 * high. A scale is first applied to the cart to make its size more
		 * reasonable for the picture. Then a translation is applied to move the
		 * cart horizontally. The amount of the translation depends on the frame
		 * number, which makes the cart move from left to right across the
		 * screen as the animation progresses. The cart animation repeats every
		 * 300 frames. At the beginning of the animation, the cart is off the
		 * left edge of the screen.
		 */

		g2.translate(-3 + 13 * (frameNumber % 300) / 300.0, 0);
		g2.scale(0.3, 0.3);
		drawCart(g2);
	}

	/**
	 * Applies a coordinate transform to a Graphics2D graphics context. The
	 * upper left corner of the viewport where the graphics context draws is
	 * assumed to be (0,0). (This method sets the global variable pixelSize.)
	 * 
	 * @param g2
	 *            The drawing context whose transform will be set.
	 * @param width
	 *            The width of the viewport where g2 draws.
	 * @param height
	 *            The height of the viewport where g2 draws.
	 * @param limitsRequested
	 *            Specifies a rectangle that will be visible in the viewport.
	 *            Under the transform, the rectangle with corners
	 *            (limitsRequested[0],limitsRequested[1]) and
	 *            (limitsRequested[2],limitsRequested[3]) will just fit in the
	 *            viewport.
	 * @param preserveAspect
	 *            if preserveAspect is false, then the limitsRequested rectangle
	 *            will exactly fill the viewport; if it is true, then the limits
	 *            will be expanded in one direction, horizontally or vertically,
	 *            to make the aspect ratio of the displayed rectangle match the
	 *            aspect ratio of the viewport. Note that when preserveAspect is
	 *            false, the units of measure in the horizontal and vertical
	 *            directions will be different.
	 */
	private void applyLimits(Graphics2D g2, int width, int height, double[] limitsRequested, boolean preserveAspect) {
		double[] limits = limitsRequested;
		if (preserveAspect) {
			double displayAspect = Math.abs((double) height / width);
			double requestedAspect = Math.abs((limits[3] - limits[2]) / (limits[1] - limits[0]));
			if (displayAspect > requestedAspect) {
				double excess = (limits[3] - limits[2]) * (displayAspect / requestedAspect - 1);
				limits = new double[] { limits[0], limits[1], limits[2] - excess / 2, limits[3] + excess / 2 };
			} else if (displayAspect < requestedAspect) {
				double excess = (limits[1] - limits[0]) * (requestedAspect / displayAspect - 1);
				limits = new double[] { limits[0] - excess / 2, limits[1] + excess / 2, limits[2], limits[3] };
			}
		}
		double pixelWidth = Math.abs((limits[1] - limits[0]) / width);
		double pixelHeight = Math.abs((limits[3] - limits[2]) / height);
		pixelSize = (float) Math.min(pixelWidth, pixelHeight);
		g2.scale(width / (limits[1] - limits[0]), height / (limits[3] - limits[2]));
		g2.translate(-limits[0], -limits[2]);
		// transform = g2.getTransform(); // not used in this application
	}

	/**
	 * Draw a sun with radius 0.5 centered at (0,0). There are also 13 rays
	 * which extend outside from the sun for another 0.25 units.
	 */
	private void drawSun(Graphics2D g2) {
		g2.setColor(Color.YELLOW);
		for (int i = 0; i < 13; i++) { // Draw 13 rays, with different
										// rotations.
			g2.rotate(2 * Math.PI / 13); // Note that the rotations accumulate!
			g2.draw(new Line2D.Double(0, 0, 0.75, 0)); // This line is subjected
														// to a rotation!
		}
		g2.fill(new Ellipse2D.Double(-0.5, -0.5, 1, 1)); // The sun itself.
		g2.setColor(new Color(180, 180, 0));
		g2.draw(new Ellipse2D.Double(-0.5, -0.5, 1, 1));
	}

	/**
	 * Draw a windmill, consisting of a pole and three vanes. The pole extends
	 * from the point (0,0) to (0,3). The vanes radiate out from (0,3). A
	 * rotation that depends on the frame number is applied to the whole set of
	 * vanes, which causes the windmill to rotate as the animation proceeds.
	 */
	private void drawWindmill(Graphics2D g2) {
		g2.setColor(new Color(200, 200, 225));
		g2.fill(new Rectangle2D.Double(-0.05, 0, 0.1, 3));
		g2.translate(0, 3); // Translations to move the vanes to the top of the
							// pole.
		g2.rotate(frameNumber / 23.0); // Apply an overall rotation to the set
										// of 3 vanes.
		g2.setColor(new Color(100, 100, 200));
		for (int i = 0; i < 3; i++) {
			g2.rotate(2 * Math.PI / 3); // Note: these rotations accumulate!
			g2.fill(windmillVane); // Vane is subject to a rotation!
		}
	}

	/**
	 * Draw a cart consisting of a rectangular body and two wheels. The wheels
	 * are drawn by the drawWheel() method; a different translation is applied
	 * to each wheel to move them into position under the body. The body of the
	 * cart is a red rectangle with corner at (0,-2.5), width 5, and height 2.
	 * The center of the bottom of the rectangle is at (0,0).
	 */
	private void drawCart(Graphics2D g2) {
		AffineTransform tr = g2.getTransform(); // save the current transform
		g2.translate(-1.5, -0.1); // center of first wheel will be at
									// (-1.5,-0.1)
		g2.scale(0.8, 0.8);
		drawWheel(g2);
		g2.setTransform(tr); // restore the transform
		g2.translate(1.5, -0.1); // center of second wheel will be at (1.5,-0.1)
		g2.scale(0.8, 0.8);
		drawWheel(g2);
		g2.setTransform(tr); // restore the transform
		g2.setColor(Color.RED);
		g2.fill(new Rectangle2D.Double(-2.5, 0, 5, 2)); // draw the body of the
														// cart
	}

	/**
	 * Draw a wheel, centered at (0,0) and with radius 1. The wheel has 15
	 * spokes that rotate in a clockwise direction as the animation proceeds.
	 */
	private void drawWheel(Graphics2D g2) {
		g2.setColor(Color.BLACK);
		g2.fill(new Ellipse2D.Double(-1, -1, 2, 2));
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(new Ellipse2D.Double(-0.8, -0.8, 1.6, 1.6));
		g2.setColor(Color.BLACK);
		g2.fill(new Ellipse2D.Double(-0.2, -0.2, 0.4, 0.4));
		g2.rotate(-frameNumber / 30.0);
		for (int i = 0; i < 15; i++) { // draw 15 spokes
			g2.rotate(2 * Math.PI / 15);
			g2.draw(new Rectangle2D.Double(0, -0.1, 1, 0.2));
		}
	}

}
