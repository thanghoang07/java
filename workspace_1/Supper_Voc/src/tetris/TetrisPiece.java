package tetris;

import java.awt.Point;

public class TetrisPiece {
	private boolean squares[][];
	private int type;
	private Point position = new Point(3, -4); // -4 to start above top row

	public int getX() {
		return position.x;
	}

	public int getY() {
		return position.y;
	}

	public void setX(int newx) {
		position.x = newx;
	}

	public void setY(int newy) {
		position.y = newy;
	}

	public void setPosition(int newx, int newy) {
		setX(newx);
		setY(newy);
	}

	public TetrisPiece(int type) {
		this.type = type;
		this.squares = new boolean[4][4];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				this.squares[i][j] = Tetris.PIECE_BITS[type][i][j];
	}

	public boolean canStepDown() {
		synchronized (Tetris.timer) {
			cut();
			position.y++;
			boolean OK = canPaste();
			position.y--;
			paste();
			return OK;
		}
	}

	public boolean canPaste() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int to_x = j + position.x;
				int to_y = i + position.y;
				if (squares[i][j]) { // piece contains this square?
					if (0 > to_x || to_x >= Tetris.COLUMNS // square too far left or
													// right?
							|| to_y >= Tetris.ROWS) // square off bottom?
					{
						return false;
						// note: it's always considered OK to paste a square
						// *above* the grid though attempting to do so does
						// nothing.
						// This allows the user to move a piece before it drops
						// completely into view.
					}
					if (to_y >= 0 && Tetris.grid[to_y][to_x] != Tetris.EMPTY)
						return false;
				}
			}
		}
		return true;
	}

	public void stepDown() {
		position.y++;
	}

	public void cut() {
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				if (squares[i][j] && position.y + i >= 0)
					Tetris.grid[position.y + i][position.x + j] = Tetris.EMPTY;
	}

	/**
	 * Paste the color info of this piece into the given grid
	 */
	public void paste(int into[][]) {
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				if (squares[i][j] && position.y + i >= 0)
					into[position.y + i][position.x + j] = type;
	}

	/**
	 * No argument version assumes pasting into main game grid
	 */
	public void paste() {
		paste(Tetris.grid);
	}

	public void rotate() {
		// copy the piece's data into a temp array
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				Tetris.tmp_grid[i][j] = squares[i][j];
		// copy back rotated 90 degrees
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				squares[j][i] = Tetris.tmp_grid[i][3 - j];
	}

	public void rotateBack() {
		// copy originally saved version back
		// this of course assumes this call was preceeded by
		// a call to rotate() for the same piece
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				squares[i][j] = Tetris.tmp_grid[i][j];
	}

	// this method is a bit of a hack to check for the case
	// where a piece may be safely on the grid but have one or more
	// rows of empty squares that are above the grid and therefore OK
	public boolean isTotallyOnGrid() {
		for (int i = 0; i < 4; i++) {
			if (position.y + i >= 0)
				return true; // everything from here down is on grid
			// this row is above grid so look for non-empty squares
			for (int j = 0; j < 4; j++)
				if (squares[i][j])
					return false;
		}
		System.err.println("TetrisPiece.isTotallyOnGrid internal error");
		return false;
	}
} // end class TetrisPiece
