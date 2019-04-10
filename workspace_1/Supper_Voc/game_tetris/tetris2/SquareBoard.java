package tetris2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.Hashtable;

import javax.swing.JComponent;




public class SquareBoard extends Object {

	/**
	 * The board width (in squares)
	 */
	public final int width;

	/**
	 * The board height (in squares).
	 */
	public final int height;

	/**
	 * The square board color matrix. This matrix (or grid) contains a color
	 * entry for each square in the board. The matrix is indexed by the
	 * vertical, and then the horizontal coordinate.
	 */
	public Color[][] matrix = null;

	/**
	 * An optional board message. The board message can be set at any time,
	 * printing it on top of the board.
	 */
	public String message = null;

	/**
	 * The number of lines removed. This counter is increased each time a line
	 * is removed from the board.
	 */
	public int removedLines = 0;

	/**
	 * The graphical sqare board component. This graphical representation is
	 * created upon the first call to getComponent().
	 */
	public final SquareBoardComponent component;

	/**
	 * Creates a new square board with the specified size. The square board will
	 * initially be empty.
	 *
	 * @param width
	 *            the width of the board (in squares)
	 * @param height
	 *            the height of the board (in squares)
	 */
	public SquareBoard(int width, int height) {
		this.width = width;
		this.height = height;
		this.matrix = new Color[height][width];
		this.component = new SquareBoardComponent();
		clear();
	}

	/**
	 * Checks if a specified square is empty, i.e. if it is not marked with a
	 * color. If the square is outside the board, false will be returned in all
	 * cases except when the square is directly above the board.
	 *
	 * @param x
	 *            the horizontal position (0 <= x < width)
	 * @param y
	 *            the vertical position (0 <= y < height)
	 * 
	 * @return true if the square is emtpy, or false otherwise
	 */
	public boolean isSquareEmpty(int x, int y) {
		if (x < 0 || x >= width || y < 0 || y >= height) {
			return x >= 0 && x < width && y < 0;
		} else {
			return matrix[y][x] == null;
		}
	}

	/**
	 * Checks if a specified line is empty, i.e. only contains empty squares. If
	 * the line is outside the board, false will always be returned.
	 *
	 * @param y
	 *            the vertical position (0 <= y < height)
	 * 
	 * @return true if the whole line is empty, or false otherwise
	 */
	public boolean isLineEmpty(int y) {
		if (y < 0 || y >= height) {
			return false;
		}
		for (int x = 0; x < width; x++) {
			if (matrix[y][x] != null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if a specified line is full, i.e. only contains no empty squares.
	 * If the line is outside the board, true will always be returned.
	 *
	 * @param y
	 *            the vertical position (0 <= y < height)
	 * 
	 * @return true if the whole line is full, or false otherwise
	 */
	public boolean isLineFull(int y) {
		if (y < 0 || y >= height) {
			return true;
		}
		for (int x = 0; x < width; x++) {
			if (matrix[y][x] == null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if the board contains any full lines.
	 *
	 * @return true if there are full lines on the board, or false otherwise
	 */
	public boolean hasFullLines() {
		for (int y = height - 1; y >= 0; y--) {
			if (isLineFull(y)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns a graphical component to draw the board. The component returned
	 * will automatically be updated when changes are made to this board.
	 * Multiple calls to this method will return the same component, as a square
	 * board can only have a single graphical representation.
	 * 
	 * @return a graphical component that draws this board
	 */
	public Component getComponent() {
		return component;
	}

	/**
	 * Returns the board height (in squares). This method returns, i.e, the
	 * number of vertical squares that fit on the board.
	 * 
	 * @return the board height in squares
	 */
	public int getBoardHeight() {
		return height;
	}

	/**
	 * Returns the board width (in squares). This method returns, i.e, the
	 * number of horizontal squares that fit on the board.
	 * 
	 * @return the board width in squares
	 */
	public int getBoardWidth() {
		return width;
	}

	/**
	 * Returns the number of lines removed since the last clear().
	 * 
	 * @return the number of lines removed since the last clear call
	 */
	public int getRemovedLines() {
		return removedLines;
	}

	/**
	 * Returns the color of an individual square on the board. If the square is
	 * empty or outside the board, null will be returned.
	 *
	 * @param x
	 *            the horizontal position (0 <= x < width)
	 * @param y
	 *            the vertical position (0 <= y < height)
	 * 
	 * @return the square color, or null for none
	 */
	public Color getSquareColor(int x, int y) {
		if (x < 0 || x >= width || y < 0 || y >= height) {
			return null;
		} else {
			return matrix[y][x];
		}
	}

	/**
	 * Changes the color of an individual square on the board. The square will
	 * be marked as in need of a repaint, but the graphical component will NOT
	 * be repainted until the update() method is called.
	 *
	 * @param x
	 *            the horizontal position (0 <= x < width)
	 * @param y
	 *            the vertical position (0 <= y < height)
	 * @param color
	 *            the new square color, or null for empty
	 */
	public void setSquareColor(int x, int y, Color color) {
		if (x < 0 || x >= width || y < 0 || y >= height) {
			return;
		}
		matrix[y][x] = color;
		if (component != null) {
			component.invalidateSquare(x, y);
		}
	}

	/**
	 * Sets a message to display on the square board. This is supposed to be
	 * used when the board is not being used for active drawing, as it slows
	 * down the drawing considerably.
	 *
	 * @param message
	 *            a message to display, or null to remove a previous message
	 */
	public void setMessage(String message) {
		this.message = message;
		if (component != null) {
			component.redrawAll();
		}
	}

	/**
	 * Clears the board, i.e. removes all the colored squares. As side-effects,
	 * the number of removed lines will be reset to zero, and the component will
	 * be repainted immediately.
	 */
	public void clear() {
		removedLines = 0;
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				this.matrix[y][x] = null;
			}
		}
		if (component != null) {
			component.redrawAll();
		}
	}

	/**
	 * Removes all full lines. All lines above a removed line will be moved
	 * downward one step, and a new empty line will be added at the top. After
	 * removing all full lines, the component will be repainted.
	 * 
	 * @see #hasFullLines
	 */
	public void removeFullLines() {
		boolean repaint = false;

		// Remove full lines
		for (int y = height - 1; y >= 0; y--) {
			if (isLineFull(y)) {
				removeLine(y);
				removedLines++;
				repaint = true;
				y++;
			}
		}

		// Repaint if necessary
		if (repaint && component != null) {
			component.redrawAll();
		}
	}

	/**
	 * Removes a single line. All lines above are moved down one step, and a new
	 * empty line is added at the top. No repainting will be done after removing
	 * the line.
	 *
	 * @param y
	 *            the vertical position (0 <= y < height)
	 */
	public void removeLine(int y) {
		if (y < 0 || y >= height) {
			return;
		}
		for (; y > 0; y--) {
			for (int x = 0; x < width; x++) {
				matrix[y][x] = matrix[y - 1][x];
			}
		}
		for (int x = 0; x < width; x++) {
			matrix[0][x] = null;
		}
	}

	/**
	 * Updates the graphical component. Any squares previously changed will be
	 * repainted by this method.
	 */
	public void update() {
		component.redraw();
	}

	/**
	 * The graphical component that paints the square board. This is implemented
	 * as an inner class in order to better abstract the detailed information
	 * that must be sent between the square board and its graphical
	 * representation.
	 */
	public class SquareBoardComponent extends JComponent {

		/**
		 * The component size. If the component has been resized, that will be
		 * detected when the paint method executes. If this value is set to
		 * null, the component dimensions are unknown.
		 */
		public Dimension size = null;

		/**
		 * The component insets. The inset values are used to create a border
		 * around the board to compensate for a skewed aspect ratio. If the
		 * component has been resized, the insets values will be recalculated
		 * when the paint method executes.
		 */
		public Insets insets = new Insets(0, 0, 0, 0);

		/**
		 * The square size in pixels. This value is updated when the component
		 * size is changed, i.e. when the <code>size</code> variable is
		 * modified.
		 */
		public Dimension squareSize = new Dimension(0, 0);

		/**
		 * An image used for double buffering. The board is first painted onto
		 * this image, and that image is then painted onto the real surface in
		 * order to avoid making the drawing process visible to the user. This
		 * image is recreated each time the component size changes.
		 */
		public Image bufferImage = null;

		/**
		 * A clip boundary buffer rectangle. This rectangle is used when
		 * calculating the clip boundaries, in order to avoid allocating a new
		 * clip rectangle for each board square.
		 */
		public Rectangle bufferRect = new Rectangle();

		/**
		 * The board message color.
		 */
		public Color messageColor = Color.white;

		/**
		 * A lookup table containing lighter versions of the colors. This table
		 * is used to avoid calculating the lighter versions of the colors for
		 * each and every square drawn.
		 */
		public Hashtable lighterColors = new Hashtable();

		/**
		 * A lookup table containing darker versions of the colors. This table
		 * is used to avoid calculating the darker versions of the colors for
		 * each and every square drawn.
		 */
		public Hashtable darkerColors = new Hashtable();

		/**
		 * A flag set when the component has been updated.
		 */
		public boolean updated = true;

		/**
		 * A bounding box of the squares to update. The coordinates used in the
		 * rectangle refers to the square matrix.
		 */
		public Rectangle updateRect = new Rectangle();

		/**
		 * Creates a new square board component.
		 */
		public SquareBoardComponent() {
			setBackground(Configuration.getColor("board.background", "#000000"));
			messageColor = Configuration.getColor("board.message", "#ffffff");
		}

		/**
		 * Adds a square to the set of squares in need of redrawing.
		 *
		 * @param x
		 *            the horizontal position (0 <= x < width)
		 * @param y
		 *            the vertical position (0 <= y < height)
		 */
		public void invalidateSquare(int x, int y) {
			if (updated) {
				updated = false;
				updateRect.x = x;
				updateRect.y = y;
				updateRect.width = 0;
				updateRect.height = 0;
			} else {
				if (x < updateRect.x) {
					updateRect.width += updateRect.x - x;
					updateRect.x = x;
				} else if (x > updateRect.x + updateRect.width) {
					updateRect.width = x - updateRect.x;
				}
				if (y < updateRect.y) {
					updateRect.height += updateRect.y - y;
					updateRect.y = y;
				} else if (y > updateRect.y + updateRect.height) {
					updateRect.height = y - updateRect.y;
				}
			}
		}

		/**
		 * Redraws all the invalidated squares. If no squares have been marked
		 * as in need of redrawing, no redrawing will occur.
		 */
		public void redraw() {
			Graphics g;

			if (!updated) {
				updated = true;
				g = getGraphics();
				if (g == null)
					return;
				g.setClip(insets.left + updateRect.x * squareSize.width, insets.top + updateRect.y * squareSize.height,
						(updateRect.width + 1) * squareSize.width, (updateRect.height + 1) * squareSize.height);
				paint(g);
			}
		}

		/**
		 * Redraws the whole component.
		 */
		public void redrawAll() {
			Graphics g;

			updated = true;
			g = getGraphics();
			if (g == null)
				return;
			g.setClip(insets.left, insets.top, width * squareSize.width, height * squareSize.height);
			paint(g);
		}

		/**
		 * Returns true as this component is double buffered.
		 * 
		 * @return true as this component is double buffered
		 */
		public boolean isDoubleBuffered() {
			return true;
		}

		/**
		 * Returns the preferred size of this component.
		 * 
		 * @return the preferred component size
		 */
		public Dimension getPreferredSize() {
			return new Dimension(width * 20, height * 20);
		}

		/**
		 * Returns the minimum size of this component.
		 * 
		 * @return the minimum component size
		 */
		public Dimension getMinimumSize() {
			return getPreferredSize();
		}

		/**
		 * Returns the maximum size of this component.
		 * 
		 * @return the maximum component size
		 */
		public Dimension getMaximumSize() {
			return getPreferredSize();
		}

		/**
		 * Returns a lighter version of the specified color. The lighter color
		 * will looked up in a hashtable, making this method fast. If the color
		 * is not found, the ligher color will be calculated and added to the
		 * lookup table for later reference.
		 * 
		 * @param c
		 *            the base color
		 * 
		 * @return the lighter version of the color
		 */
		public Color getLighterColor(Color c) {
			Color lighter;

			lighter = (Color) lighterColors.get(c);
			if (lighter == null) {
				lighter = c.brighter().brighter();
				lighterColors.put(c, lighter);
			}
			return lighter;
		}

		/**
		 * Returns a darker version of the specified color. The darker color
		 * will looked up in a hashtable, making this method fast. If the color
		 * is not found, the darker color will be calculated and added to the
		 * lookup table for later reference.
		 * 
		 * @param c
		 *            the base color
		 * 
		 * @return the darker version of the color
		 */
		public Color getDarkerColor(Color c) {
			Color darker;

			darker = (Color) darkerColors.get(c);
			if (darker == null) {
				darker = c.darker().darker();
				darkerColors.put(c, darker);
			}
			return darker;
		}

		/**
		 * Paints this component indirectly. The painting is first done to a
		 * buffer image, that is then painted directly to the specified graphics
		 * context.
		 * 
		 * @param g
		 *            the graphics context to use
		 */
		public synchronized void paint(Graphics g) {
			Graphics bufferGraphics;
			Rectangle rect;

			// Handle component size change
			if (size == null || !size.equals(getSize())) {
				size = getSize();
				squareSize.width = size.width / width;
				squareSize.height = size.height / height;

				// if (squareSize.width <= squareSize.height) {
				// squareSize.height = squareSize.width;
				// } else {
				// squareSize.width = squareSize.height;
				// }

				insets.left = (size.width - width * squareSize.width) / 2;
				insets.right = insets.left;
				insets.top = 0;
				insets.bottom = size.height - height * squareSize.height;
				bufferImage = createImage(width * squareSize.width, height * squareSize.height);
			}

			// Paint component in buffer image
			rect = g.getClipBounds();
			bufferGraphics = bufferImage.getGraphics();
			bufferGraphics.setClip(rect.x - insets.left, rect.y - insets.top, rect.width, rect.height);
			doPaintComponent(bufferGraphics);

			// Paint image buffer
			g.drawImage(bufferImage, insets.left, insets.top, getBackground(), null);
		}

		/**
		 * Paints this component directly. All the squares on the board will be
		 * painted directly to the specified graphics context.
		 * 
		 * @param g
		 *            the graphics context to use
		 */
		public void doPaintComponent(Graphics g) {

			// Paint background
			g.setColor(getBackground());
			g.fillRect(0, 0, width * squareSize.width, height * squareSize.height);

			// Paint squares
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					if (matrix[y][x] != null) {
						paintSquare(g, x, y);
					}
				}
			}

			// Paint message
			if (message != null) {
				paintMessage(g, message);
			}
		}

		/**
		 * Paints a single board square. The specified position must contain a
		 * color object.
		 *
		 * @param g
		 *            the graphics context to use
		 * @param x
		 *            the horizontal position (0 <= x < width)
		 * @param y
		 *            the vertical position (0 <= y < height)
		 */
		public void paintSquare(Graphics g, int x, int y) {
			Color color = matrix[y][x];
			int xMin = x * squareSize.width;
			int yMin = y * squareSize.height;
			int xMax = xMin + squareSize.width - 1;
			int yMax = yMin + squareSize.height - 1;
			int i;

			// Skip drawing if not visible
			bufferRect.x = xMin;
			bufferRect.y = yMin;
			bufferRect.width = squareSize.width;
			bufferRect.height = squareSize.height;
			if (!bufferRect.intersects(g.getClipBounds())) {
				return;
			}

			// Fill with base color
			g.setColor(color);
			g.fillRect(xMin, yMin, squareSize.width, squareSize.height);

			// Draw brighter lines
			g.setColor(getLighterColor(color));
			for (i = 0; i < squareSize.width / 10; i++) {
				g.drawLine(xMin + i, yMin + i, xMax - i, yMin + i);
				g.drawLine(xMin + i, yMin + i, xMin + i, yMax - i);
			}

			// Draw darker lines
			g.setColor(getDarkerColor(color));
			for (i = 0; i < squareSize.width / 10; i++) {
				g.drawLine(xMax - i, yMin + i, xMax - i, yMax - i);
				g.drawLine(xMin + i, yMax - i, xMax - i, yMax - i);
			}
		}

		/**
		 * Paints a board message. The message will be drawn at the center of
		 * the component.
		 *
		 * @param g
		 *            the graphics context to use
		 * @param msg
		 *            the string message
		 */
		public void paintMessage(Graphics g, String msg) {
			int fontWidth;
			int offset;
			int x;
			int y;

			// Find string font width
			g.setFont(new Font("SansSerif", Font.BOLD, squareSize.width + 4));
			fontWidth = g.getFontMetrics().stringWidth(msg);

			// Find centered position
			x = (width * squareSize.width - fontWidth) / 2;
			y = height * squareSize.height / 2;

			// Draw black version of the string
			offset = squareSize.width / 10;
			g.setColor(Color.black);
			g.drawString(msg, x - offset, y - offset);
			g.drawString(msg, x - offset, y);
			g.drawString(msg, x - offset, y - offset);
			g.drawString(msg, x, y - offset);
			g.drawString(msg, x, y + offset);
			g.drawString(msg, x + offset, y - offset);
			g.drawString(msg, x + offset, y);
			g.drawString(msg, x + offset, y + offset);

			// Draw white version of the string
			g.setColor(messageColor);
			g.drawString(msg, x, y);
		}
	}
}