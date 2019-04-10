package Theory;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class AdapterClassDemo extends JFrame {
	private Point point = new Point();

	public AdapterClassDemo(String title) {
		super(title);

		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent event) {
				point = event.getPoint();
				repaint();
			}

		});
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g) {
		g.fillOval(point.x, point.y, 8, 8);
	}

	public static void main(String[] args) {
		AdapterClassDemo frm = new AdapterClassDemo("Adapter Class Demo");
	}

}
