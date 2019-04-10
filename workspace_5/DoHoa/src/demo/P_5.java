package demo;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLJPanel;
import javax.media.opengl.fixedfunc.GLMatrixFunc;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import javax.swing.JFrame;

public class P_5 {
	public static void main(String[] arg) {
		Gui5 gui = new Gui5();

		long dt = 100; // 0.1s
		while (true) {
			long t_start = System.currentTimeMillis();

			gui.alpha += 2.0;
			gui.f.repaint();

			long dt_real = System.currentTimeMillis() - t_start;
			if (dt_real < dt)
				try {
					Thread.sleep(dt - dt_real);
				} catch (InterruptedException e) {
				}
			else
				System.out.println("PC too slow; please increase dt");
		}
	}
}

class Gui5 {
	JFrame f;
	DrawingPanel p;
	float dx = 20, alpha = 0;

	class DrawingPanel extends GLJPanel {
		GLU glu;
		GLUquadric quad;

		DrawingPanel() {
			super(new GLCapabilities(GLProfile.getDefault()));

			this.addGLEventListener(new GLEventListener() {
				public void init(GLAutoDrawable drawable) // ********** INIT
				{
					GL2 gl = drawable.getGL().getGL2();

					glu = new GLU();
					quad = glu.gluNewQuadric();
					glu.gluQuadricDrawStyle(quad, GLU.GLU_LINE);

					gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
				}

				public void reshape(GLAutoDrawable drawable, int x, int y, int w, int h) // **********
																							// RESHAPE
				{
					GL2 gl = drawable.getGL().getGL2();

					gl.glViewport(0, 0, w, h);

					gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);
					gl.glLoadIdentity();
					glu.gluPerspective(30.0f, (float) w / h, 1.0f, 1000.0f);
				}

				public void display(GLAutoDrawable drawable) // **********
																// DISPLAY
				{
					GL2 gl = drawable.getGL().getGL2();

					gl.glClear(GL.GL_COLOR_BUFFER_BIT);
					gl.glMatrixMode(GLMatrixFunc.GL_MODELVIEW);
					gl.glLoadIdentity();
					glu.gluLookAt(50.0f, 40.0f, 50.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f);

					gl.glRotatef(alpha, 0.0f, -3.0f, 0.0f);
					gl.glTranslatef(dx, 0f, 0f);

					gl.glColor4f(0.5f, 0.5f, 1.0f, 1.0f);
					glu.gluSphere(quad, 5.0f, 40, 10);

					gl.glRotatef(alpha, 0.0f, -3.0f, 0.0f);
					gl.glTranslatef(dx, 0f, 0f);

					gl.glColor4f(0.5f, 0.5f, 1.0f, 1.0f);
					glu.gluSphere(quad, 5.0f, 40, 10);

					gl.glRotatef(alpha, 0.0f, -3.0f, 0.0f);
					gl.glTranslatef(dx, 0f, 0f);

					gl.glColor4f(0.5f, 0.5f, 1.0f, 1.0f);
					glu.gluSphere(quad, 5.0f, 40, 10);

					gl.glRotatef(alpha, 0.0f, -3.0f, 0.0f);
					gl.glTranslatef(dx, 0f, 0f);

					gl.glColor4f(0.5f, 0.5f, 1.0f, 1.0f);
					glu.gluSphere(quad, 5.0f, 40, 10);

					gl.glFlush();
				}

				public void dispose(GLAutoDrawable drawable) // **********
																// DISPOSE
				{
				}
			});

		}
	}

	Gui5() {
		f = new JFrame();
		f.setFocusable(true);
		f.setVisible(true);
		p = new DrawingPanel();
		f.getContentPane().add(p, BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(new Dimension(1280 + 16, 820 + 38));
	}
}
