package tetris;

import java.awt.Dimension;
import java.awt.Graphics;

public class GridCanvas extends DoubleBufferedCanvas {
	private int grid[][];
	private boolean paint_background;
	public GridCanvas(int[][] grid, boolean do_background) {
		this.grid = grid;
		paint_background = do_background;
		clear();
	}

	void clear() {
		for(int i=0; i<grid.length; i++)
			for(int j=0; j<grid[0].length; j++)
				grid[i][j] = Tetris.EMPTY;
	}		
	public Dimension getPreferredSize() {
		return new Dimension(grid[0].length * 30, grid.length * 30);
	}
	public void paint(Graphics g) {
		g = this.startPaint(g); // returned g paints into offscreen image
		int width = this.getSize().width;
		int height = this.getSize().height;
		g.clearRect(0, 0, width, height);
		int cell_size, xstart, ystart;
		double panel_aspect_ratio = (double)width/height;
		double grid_aspect_ratio = (double)grid[0].length/grid.length;
		if(panel_aspect_ratio > grid_aspect_ratio) { 
			// extra space on sides
			cell_size = (int)((double)height/grid.length + 0.5);
			xstart = (int)(width/2 - (grid[0].length/2.0 * cell_size + 0.5));
			ystart = 0;
		}
		else { 
			// extra vertical space
			cell_size = (int)((double)width/grid[0].length + 0.5);
			xstart = 0;
			ystart = (int)(height/2 - (grid.length/2.0 * cell_size + 0.5));
		}
		if(paint_background) {
			g.setColor(Tetris.BACKGROUND_COLORS[(Tetris.num_rows_deleted / Tetris.DELETED_ROWS_PER_LEVEL) % Tetris.BACKGROUND_COLORS.length]);
			g.fillRect(xstart, ystart, Tetris.COLUMNS*cell_size, Tetris.ROWS*cell_size);
		}
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				if(grid[i][j] != Tetris.EMPTY) {
					g.setColor(Tetris.PIECE_COLORS[grid[i][j]]);
					int x = xstart + j*cell_size;
					int y = ystart + i*cell_size;
					g.fill3DRect(x, y, cell_size, cell_size, true);
				}
			}
		}
		this.endPaint(); // paints accumulated image in one shot
	}
} // end class GridCanvas
