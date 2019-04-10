package demo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GL2ES1;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLJPanel;
import javax.media.opengl.fixedfunc.GLLightingFunc;
import javax.media.opengl.fixedfunc.GLMatrixFunc;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class P_8 {
	public static void main(String[] arg) {
		Gui gui = new Gui();
	}
}

class Gui {
	JFrame f;
	DrawingPanel p;

	float diff_r, diff_g, diff_b, spec_r, spec_g, spec_b, spec_e;
	JPanel ps;
	JSlider s_diff_r, s_diff_g, s_diff_b, s_spec_r, s_spec_g, s_spec_b, s_spec_e;
	JLabel l_diff_r, l_diff_g, l_diff_b, l_spec_r, l_spec_g, l_spec_b, l_spec_e;

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
					glu.gluQuadricDrawStyle(quad, GLU.GLU_FILL);
					glu.gluQuadricNormals(quad, GLU.GLU_SMOOTH);

					gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

					gl.glEnable(GL.GL_DEPTH_TEST);
					gl.glEnable(GLLightingFunc.GL_LIGHTING);
					gl.glLightModelfv(GL2ES1.GL_LIGHT_MODEL_AMBIENT, new float[] { 0.2f, 0.2f, 0.2f, 1.0f }, 0);

					gl.glEnable(GLLightingFunc.GL_LIGHT0);
				}

				public void reshape(GLAutoDrawable drawable, int x, int y, int w, int h) // **********
																							// RESHAPE
				{
					GL2 gl = drawable.getGL().getGL2();

					gl.glViewport(0, 0, w, h);

					gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);
					gl.glLoadIdentity();
					glu.gluPerspective(60.0f, (float) w / h, 1.0f, 10000.0f);
				}

				public void display(GLAutoDrawable drawable) // **********
																// DISPLAY
				{
					GL2 gl = drawable.getGL().getGL2();

					gl.glClear(GL.GL_COLOR_BUFFER_BIT);
					gl.glClear(GL.GL_DEPTH_BUFFER_BIT);

					gl.glMatrixMode(GLMatrixFunc.GL_MODELVIEW);
					gl.glLoadIdentity();
					glu.gluLookAt(100.0f, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);

					//// ------- LIGHT
					gl.glLightfv(GLLightingFunc.GL_LIGHT0, GLLightingFunc.GL_POSITION,
							new float[] { 100.0f, 100.0f, 50.0f, 1.0f }, 0);
					gl.glLightfv(GLLightingFunc.GL_LIGHT0, GLLightingFunc.GL_AMBIENT,
							new float[] { 0.1f, 0.1f, 0.1f, 1.0f }, 0);
					gl.glLightfv(GLLightingFunc.GL_LIGHT0, GLLightingFunc.GL_DIFFUSE,
							new float[] { 1.0f, 1.0f, 1.0f, 1.0f }, 0);
					gl.glLightfv(GLLightingFunc.GL_LIGHT0, GLLightingFunc.GL_SPECULAR,
							new float[] { 1.0f, 1.0f, 1.0f, 1.0f }, 0);

					//// ------- SPHERE
					gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GLLightingFunc.GL_AMBIENT_AND_DIFFUSE,
							new float[] { diff_r, diff_g, diff_b, 1.0f }, 0);
					gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GLLightingFunc.GL_SPECULAR,
							new float[] { spec_r, spec_g, spec_b, 1.0f }, 0);
					gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GLLightingFunc.GL_SHININESS, new float[] { spec_e }, 0);

					glu.gluSphere(quad, 60.0f, 50, 50);

					gl.glFlush();
				}

				public void dispose(GLAutoDrawable drawable) // **********
																// DISPOSE
				{
				}
			});

		}
	}

	Gui() {
		f = new JFrame();
		f.setFocusable(true);
		f.setVisible(true);
		p = new DrawingPanel();
		f.getContentPane().add(p, BorderLayout.CENTER);

		//// ------------------------ CAMERA
		ps = new JPanel();
		ps.setLayout(new GridLayout(0, 2));
		f.getContentPane().add(ps, BorderLayout.EAST);

		s_diff_r = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		ps.add(s_diff_r);
		l_diff_r = new JLabel("    ambiant and diffuse red");
		ps.add(l_diff_r);
		s_diff_g = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		ps.add(s_diff_g);
		l_diff_g = new JLabel("    ambiant and diffuse green");
		ps.add(l_diff_g);
		s_diff_b = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		ps.add(s_diff_b);
		l_diff_b = new JLabel("    ambiant and diffuse blue");
		ps.add(l_diff_b);
		s_spec_r = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		ps.add(s_spec_r);
		l_spec_r = new JLabel("    specular red");
		ps.add(l_spec_r);
		s_spec_g = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		ps.add(s_spec_g);
		l_spec_g = new JLabel("    specular green");
		ps.add(l_spec_g);
		s_spec_b = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		ps.add(s_spec_b);
		l_spec_b = new JLabel("    specular blue");
		ps.add(l_spec_b);
		s_spec_e = new JSlider(JSlider.HORIZONTAL, 0, 128, 0);
		ps.add(s_spec_e);
		l_spec_e = new JLabel("    specular exponent");
		ps.add(l_spec_e);

		s_diff_r.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				diff_r = 0.01f * s_diff_r.getValue();
				f.repaint();
			}
		});
		s_diff_g.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				diff_g = 0.01f * s_diff_g.getValue();
				f.repaint();
			}
		});
		s_diff_b.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				diff_b = 0.01f * s_diff_b.getValue();
				f.repaint();
			}
		});
		s_spec_r.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				spec_r = 0.01f * s_spec_r.getValue();
				f.repaint();
			}
		});
		s_spec_g.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				spec_g = 0.01f * s_spec_g.getValue();
				f.repaint();
			}
		});
		s_spec_b.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				spec_b = 0.01f * s_spec_b.getValue();
				f.repaint();
			}
		});
		s_spec_e.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				spec_e = s_spec_e.getValue();
				f.repaint();
			}
		});

		f.setSize(new Dimension(800 + 16, 400 + 38));
	}
}
