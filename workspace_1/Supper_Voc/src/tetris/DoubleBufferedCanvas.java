package tetris;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

public class DoubleBufferedCanvas extends Canvas {
	public Image mActiveOffscreenImage = null;
	public Dimension mOffscreenSize = new Dimension(-1, -1);
	public Graphics mActiveOffscreenGraphics = null;
	public Graphics mSystemGraphics = null;

	DoubleBufferedCanvas() {
		/*
		 * this.addComponentListener(new ComponentAdapter() { public void
		 * componentResized(ComponentEvent e) { repaint(); } });
		 */
	}

	/**
	 * NOTE: when extending applets: this overrides update() to *not* erase the
	 * background before painting
	 */
	public void update(Graphics g) {
		paint(g);
	}

	public Graphics startPaint(Graphics sysgraph) {
		mSystemGraphics = sysgraph;
		// Initialize if this is the first pass or the size has changed
		Dimension d = getSize();
		if ((mActiveOffscreenImage == null) || (d.width != mOffscreenSize.width)
				|| (d.height != mOffscreenSize.height)) {
			mActiveOffscreenImage = createImage(d.width, d.height);
			mActiveOffscreenGraphics = mActiveOffscreenImage.getGraphics();
			mOffscreenSize = d;
			mActiveOffscreenGraphics.setFont(getFont());
		}
		// mActiveOffscreenGraphics.clearRect(0, 0, mOffscreenSize.width,
		// mOffscreenSize.height);
		return mActiveOffscreenGraphics;
	}

	public void endPaint() {
		// Start copying the offscreen image to this canvas
		// The application will begin drawing into the other one while this
		// happens
		mSystemGraphics.drawImage(mActiveOffscreenImage, 0, 0, null);
	}
}
