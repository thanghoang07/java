/*package demo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.awt.GLJPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


*//**
 * A 2D OpenGL animation that demonstrates the use of glPushMatrix and
 * glPopMatrix to implement hierarchical modeling. This program is a port of
 * HierarchicalModeling2D, which did more or less the same thing using Java
 * Graphics2D.
 *//*
public class JoglHierarchicalModeling2D extends JPanel implements GLEventListener {

	public static void main(String[] args) {
		JFrame window = new JFrame("Basic JOGL Animation 2D");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new JoglHierarchicalModeling2D());
		window.pack();
		window.setVisible(true);
	}

	private GLJPanel drawable; // The OpenGL display panel.
	private int frameNumber; // Current frame number, increases by 1 in each
								// frame.

	*//**
	 * Constructor creates the GLJPanel that will be used for drawing and adds
	 * it to the main panel. It also starts a timer to draw the animation. And
	 * it sets the preferred size to be 700-by-500.
	 *//*
	public JoglHierarchicalModeling2D() {
		drawable = new GLJPanel();
		drawable.setPreferredSize(new Dimension(700, 500));
		drawable.addGLEventListener(this);
		setLayout(new BorderLayout());
		add(drawable, BorderLayout.CENTER);
		Timer timer = new Timer(30, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				frameNumber++;
				drawable.repaint();
			}
		});
		timer.setInitialDelay(1000);
		timer.start();
	}

	*//**
	 * This method is called when the GLJPanel is created. It initializes the GL
	 * context. Here, it sets the clear color to be sky blue and it sets the
	 * xy-limits for drawing so that x ranges from 0 to 7 and y ranges from -1
	 * to 4.
	 *//*
	public void init(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		gl.glClearColor(0.5f, 0.5f, 1, 1);
		// The next three lines set up the coordinates system.
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glOrtho(0, 7, -1, 4, -1, 1);
		gl.glMatrixMode(GL.GL_MODELVIEW);
	}

	*//**
	 * This method is called when the GLJPanel needs to be redrawn. It draws the
	 * current frame of the animation.
	 *//*
	public void display(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT); // Fills the scene with blue.
		gl.glLoadIdentity();

		
		 * Draw three green triangles to form a ridge of hills in the background
		 

		gl.glColor3f(0, 0.6f, 0.2f);
		gl.glBegin(GL.GL_POLYGON);
		gl.glVertex2f(-3, -1);
		gl.glVertex2f(1.5f, 1.65f);
		gl.glVertex2f(5, -1);
		gl.glEnd();
		gl.glBegin(GL.GL_POLYGON);
		gl.glVertex2f(-3, -1);
		gl.glVertex2f(3, 2.1f);
		gl.glVertex2f(7, -1);
		gl.glEnd();
		gl.glBegin(GL.GL_POLYGON);
		gl.glVertex2f(0, -1);
		gl.glVertex2f(6, 1.2f);
		gl.glVertex2f(20, -1);
		gl.glEnd();

		 Draw a bluish-gray rectangle to represent the road. 

		gl.glColor3f(0.4f, 0.4f, 0.5f);
		gl.glBegin(GL.GL_POLYGON);
		gl.glVertex2f(0, -0.4f);
		gl.glVertex2f(7, -0.4f);
		gl.glVertex2f(7, 0.4f);
		gl.glVertex2f(0, 0.4f);
		gl.glEnd();

		
		 * Draw a dashed white line to represent the stripe down the middle of
		 * the road. Dotted/dashed lines use line "stippling" -- look it up if
		 * you want to know how to do it.
		 

		gl.glLineStipple(3, (short) 0x3FF);
		gl.glEnable(GL.GL_LINE_STIPPLE);
		gl.glLineWidth(6); // Set the line width to be 6 pixels.
		gl.glColor3f(1, 1, 1);
		gl.glBegin(GL.GL_LINES);
		gl.glVertex2f(0, 0);
		gl.glVertex2f(7, 0);
		gl.glEnd();
		gl.glLineWidth(1); // Reset the line width to be 1 pixel.
		gl.glDisable(GL.GL_LINE_STIPPLE);

		
		 * Draw the sun. The drawSun method draws the sun centered at (0,0). A
		 * 2D translation is applied to move the center of the sun to (5,3.3).
		 

		gl.glPushMatrix();
		gl.glTranslated(5, 3.3, 0);
		drawSun(gl);
		gl.glPopMatrix();

		
		 * Draw three windmills. The drawWindmill method draws the windmill with
		 * its base at (0,0), and the top of the pole at (0,3). Each windmill is
		 * first scaled to change its size and then translated to move its base
		 * to a different paint. In the animation, the vanes of the windmill
		 * rotate. That rotation is done with a transform inside the
		 * drawWindmill method.
		 

		gl.glPushMatrix();
		gl.glTranslated(0.75, 1, 0);
		gl.glScaled(0.6, 0.6, 1);
		drawWindmill(gl);
		gl.glPopMatrix();

		gl.glPushMatrix();
		gl.glTranslated(2.2, 1.6, 0);
		gl.glScaled(0.4, 0.4, 1);
		drawWindmill(gl);
		gl.glPopMatrix();

		gl.glPushMatrix();
		gl.glTranslated(3.7, 0.8, 0);
		gl.glScaled(0.7, 0.7, 1);
		drawWindmill(gl);
		gl.glPopMatrix();

		
		 * Draw the cart. The drawCart method draws the cart with the center of
		 * its base at (0,0). The body of the cart is 5 units long and 2 units
		 * high. A scale is first applied to the cart to make its size more
		 * reasonable for the picture. Then a translation is applied to move the
		 * cart horizontally. The amount of the translation depends on the frame
		 * number, which makes the cart move from left to right across the
		 * screen as the animation progresses. The cart animation repeats every
		 * 300 frames. At the beginning of the animation, the cart is off the
		 * left edge of the screen.
		 

		gl.glPushMatrix();
		gl.glTranslated(-3 + 13 * (frameNumber % 300) / 300.0, 0, 0);
		gl.glScaled(0.3, 0.3, 1);
		drawCart(gl);
		gl.glPopMatrix();

	}

	*//**
	 * Draw a sun with radius 0.5 centered at (0,0). There are also 13 rays
	 * which extend outside from the sun for another 0.25 units.
	 *//*
	private void drawSun(GL gl) {
		gl.glColor3f(1, 1, 0);
		for (int i = 0; i < 13; i++) { // Draw 13 rays, with different
										// rotations.
			gl.glRotatef(360f / 13, 0, 0, 1); // Note that the rotations
												// accumulate!
			gl.glBegin(GL.GL_LINES);
			gl.glVertex2f(0, 0);
			gl.glVertex2f(0.75f, 0);
			gl.glEnd();
		}
		drawDisk(gl, 0.5);
		gl.glColor3f(0, 0, 0);
	}

	*//**
	 * Draw a 32-sided regular polygon as an approximation for a circular disk.
	 * (This is necessary since OpenGL has no commands for drawing ovals,
	 * circles, or curves.) The disk is centered at (0,0) with a radius given by
	 * the parameter.
	 *//*
	private void drawDisk(GL gl, double radius) {
		gl.glBegin(GL.GL_POLYGON);
		for (int d = 0; d < 32; d++) {
			double angle = 2 * Math.PI / 32 * d;
			gl.glVertex2d(radius * Math.cos(angle), radius * Math.sin(angle));
		}
		gl.glEnd();
	}

	*//**
	 * Draw a windmill, consisting of a pole and three vanes. The pole extends
	 * from the point (0,0) to (0,3). The vanes radiate out from (0,3). A
	 * rotation that depends on the frame number is applied to the whole set of
	 * vanes, which causes the windmill to rotate as the animation proceeds.
	 * Note that this method changes the current transform in the GL context gl!
	 * The caller of this subroutine should take care to save and restore the
	 * original transform, if necessary.
	 *//*
	private void drawWindmill(GL gl) {
		gl.glColor3f(0.8f, 0.8f, 0.9f);
		gl.glBegin(GL.GL_POLYGON);
		gl.glVertex2f(-0.05f, 0);
		gl.glVertex2f(0.05f, 0);
		gl.glVertex2f(0.05f, 3);
		gl.glVertex2f(-0.05f, 3);
		gl.glEnd();
		gl.glTranslatef(0, 3, 0);
		gl.glRotated(frameNumber * (180.0 / 46), 0, 0, 1);
		gl.glColor3f(0.4f, 0.4f, 0.8f);
		for (int i = 0; i < 3; i++) {
			gl.glRotated(120, 0, 0, 1); // Note: These rotations accumulate.
			gl.glBegin(GL.GL_POLYGON);
			gl.glVertex2f(0, 0);
			gl.glVertex2f(0.5f, 0.1f);
			gl.glVertex2f(1.5f, 0);
			gl.glVertex2f(0.5f, -0.1f);
			gl.glEnd();
		}
	}

	*//**
	 * Draw a cart consisting of a rectangular body and two wheels. The wheels
	 * are drawn by the drawWheel() method; a different translation is applied
	 * to each wheel to move them into position under the body. The body of the
	 * cart is a red rectangle with corner at (0,-2.5), width 5, and height 2.
	 * The center of the bottom of the rectangle is at (0,0).
	 *//*
	private void drawCart(GL gl) {
		gl.glPushMatrix();
		gl.glTranslatef(-1.5f, -0.1f, 0);
		gl.glScalef(0.8f, 0.8f, 1);
		drawWheel(gl);
		gl.glPopMatrix();
		gl.glPushMatrix();
		gl.glTranslatef(1.5f, -0.1f, 0);
		gl.glScalef(0.8f, 0.8f, 1);
		drawWheel(gl);
		gl.glPopMatrix();
		gl.glColor3f(1, 0, 0);
		gl.glBegin(GL.GL_POLYGON);
		gl.glVertex2f(-2.5f, 0);
		gl.glVertex2f(2.5f, 0);
		gl.glVertex2f(2.5f, 2);
		gl.glVertex2f(-2.5f, 2);
		gl.glEnd();
	}

	*//**
	 * Draw a wheel, centered at (0,0) and with radius 1. The wheel has 15
	 * spokes that rotate in a clockwise direction as the animation proceeds.
	 *//*
	private void drawWheel(GL gl) {
		gl.glColor3f(0, 0, 0);
		drawDisk(gl, 1);
		gl.glColor3f(0.75f, 0.75f, 0.75f);
		drawDisk(gl, 0.8);
		gl.glColor3f(0, 0, 0);
		drawDisk(gl, 0.2);
		gl.glRotatef(frameNumber * 20, 0, 0, 1);
		gl.glBegin(GL.GL_LINES);
		for (int i = 0; i < 15; i++) {
			gl.glVertex2f(0, 0);
			gl.glVertex2d(Math.cos(i * 2 * Math.PI / 15), Math.sin(i * 2 * Math.PI / 15));
		}
		gl.glEnd();
	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
	}

	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
	}
}
*/