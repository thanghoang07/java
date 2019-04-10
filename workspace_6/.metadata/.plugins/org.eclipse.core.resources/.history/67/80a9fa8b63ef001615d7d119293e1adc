package model;

import java.awt.Point;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import controller.ATileMove;

/**
 * Stores a representation of the state of the game. All incoming and outgoing cell locations assume the same convention used in the ATileMove class in the
 * Controller package. Specifically: The point information is to be in (x,y) coordinates where (0,0) refers to the top-left cell, while (1,2) would be one cell down
 * and two cells to the right. However this need not be representative for how the information is stored internally.
 */
public class Board implements Serializable {
    private static final long serialVersionUID = 7603293598183278839L;
    private int[][] grid;
    private int width, height;
    private int score, highScore;
    private boolean isGameWon, isGameOver;

    /**
     * Only allows instantiations from within the model package.
     */
    protected Board() {}

    /**
     * Returns the value of the given cell location if the cell is on the board, otherwise 0;
     * @param cell The location where the value is being queried.
     * @return The value at the given location.
     */
    public int valueAt(Point cell) {
	if (isContained(cell)) return grid[cell.x][cell.y];
	return 0;
    }

    /**
     * Returns the value of the given cell location if the cell is on the board, otherwise 0;
     * @param x x coordinate of the location where the value is being queried.
     * @param y y coordinate of the location where the value is being queried.
     * @return The value at the given location.
     */
    public int valueAt(int x, int y) {
	if (isContained(x, y)) return grid[x][y];
	return 0;
    }

    private boolean isContained(int x, int y) {
	if (x < 0 || x >= width || y < 0 || y >= height) return false;
	return true;
    }

    /**
     * A check to see if the given cell is a valid location on this board.
     * @param cell The cell location in question.
     * @return True if the cell is a valid location on this board, false otherwise.
     */
    public boolean isContained(Point cell) {
	if (cell.x < 0 || cell.x >= width || cell.y < 0 || cell.y >= height) return false;
	return true;
    }

    /**
     * Sets the value of the given cell, if contained on this board, to the value given.
     * @param cell The location where the value will be changed.
     * @param val The value the given cell will be changed to.
     */
    public void setCell(Point cell, int val) {
	if (isContained(cell)) grid[cell.x][cell.y] = val;
    }

    /**
     * Returns the width of this board.
     * @return the width of this board.
     */
    public int getWidth() {
	return width;
    }

    /**
     * Returns the height of this board.
     * @return the height of this board.
     */
    public int getHeight() {
	return height;
    }

    /**
     * Sets the size of this board.
     * @param width the width of this board
     * @param height the height of this board
     */
    public void setSize(int width, int height) {
	this.width = width;
	this.height = height;
	grid = new int[width][height];
    }

    /**
     * Returns the score associated with this board.
     * @return the score associated this board.
     */
    public int getScore() {
	return score;
    }

    /**
     * Sets the score associated with this board.
     * @param score the score associated with this board.
     */
    public void setScore(int score) {
	this.score = score;
    }

    /**
     * Returns the highest score associated with this board.
     * @return the highest score associated with this board.
     */
    public int getHighScore() {
	return highScore;
    }

    /**
     * Sets the highest score associated with this board.
     * @param highScore the highest score associated with this board
     */
    public void setHighScore(int highScore) {
	this.highScore = highScore;
    }

    /**
     * Returns state information about this board.
     * @return true if this board is marked as won, else false.
     */
    public boolean isGameWon() {
	return isGameWon;
    }

    /**
     * Set state information about this board.
     * @param isGameWon represents if this board is marked as won (true) or not (false)
     */
    public void setGameWon(boolean isGameWon) {
	this.isGameWon = isGameWon;
    }

    /**
     * Returns state information about this board.
     * @return true if this board is marked as over, else false.
     */
    public boolean isGameOver() {
	return isGameOver;
    }

    /**
     * Set state information about this board.
     * @param isGameOver represents if this board is marked as over (true) or not (false)
     */
    public void setGameOver(boolean isGameOver) {
	this.isGameOver = isGameOver;
    }

    /**
     * Returns a list of all tiles on this board.
     * @return a list of all tiles on this board.
     */
    public List<ATileMove> getAllTiles() {
	LinkedList<ATileMove> list = new LinkedList<ATileMove>();
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		if (grid[x][y] == 0) continue;
		list.add(new ATileMove(new Point(x, y), grid[x][y]));
	    }
	return list;
    }

    @Override
    public String toString() {
	StringBuilder str = new StringBuilder();
	str.append("Width:" + width);
	str.append(",Height:" + height);
	str.append(",Score:" + score);
	str.append(",HighScore:" + highScore);
	str.append(",isGameWon:" + isGameWon);
	str.append(",isGameOver:" + isGameOver);
	str.append(";\n");
	for (int y = 0; y < height; y++) {
	    for (int x = 0; x < width; x++) {
		str.append(grid[x][y] + "\t");
	    }
	    str.append("\n");
	}
	return str.toString();
    }

}