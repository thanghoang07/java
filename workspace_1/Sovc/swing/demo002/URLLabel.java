package demo002;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JLabel;

public class URLLabel extends JLabel {

	boolean entered = false;

	boolean mousehover;

	public URLLabel(URL url) {
		this(url, url.toString());
	}

	public URLLabel(URL url, String str) {
		super(str);

		setForeground(Color.blue);
		mousehover = false;

	}

	public void mouseEntered(MouseEvent e) {
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		entered = true;

		if (mousehover) {
			repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		setCursor(Cursor.getDefaultCursor());
		entered = false;

		if (mousehover) {
			repaint();
		}
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void paint(Graphics g) {
		super.paint(g);

		if (entered || !mousehover) {
			Rectangle r = g.getClipBounds();

			g.drawLine(0, r.height - this.getFontMetrics(this.getFont()).getDescent(),
					this.getFontMetrics(this.getFont()).stringWidth(this.getText()),
					r.height - this.getFontMetrics(this.getFont()).getDescent());
		}
	}
}
