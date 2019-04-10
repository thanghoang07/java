package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.awt.Point;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import controller.Direction;
import controller.ATileMove;

/**
 * Unit tests using JUnit to test the {@link Rules.java rules} of the game.
 */
public class RulesTest {
    private Board board, ansBoard;
    private List<ATileMove> moves;
    private Random rand = new Random();
    private final int width = 21, height = 21;

    @Test
    public void testStart() {
	List<Point> testList = new LinkedList<Point>();
	for (int x = -1; x < width; x++) {
	    for (int y = -1; y < height; y++) {
		board = new Board();
		try {
		    moves = Rules.startGame(board, x, y);
		    assertTrue("A new game should not already be over", board.isGameOver() == false);
		    assertTrue("A new gmae should not already be won", board.isGameWon() == false);
		    assertTrue("incorrect width", board.getWidth() == x);
		    assertTrue("incorrect height", board.getHeight() == y);
		    assertTrue("incorrect initial score", board.getScore() == 0);
		    assertTrue("incorrect initial highScore", board.getHighScore() == 0);
		    if (moves.size() < Rules.DFLT_STARTNUM) fail("less than 2 tiles were added to the board");
		    else if (moves.size() > Rules.DFLT_STARTNUM) fail("More than 2 tiles were added to the board");
		    testList.clear();
		    for (ATileMove aMove : moves) {
			testTileValues(aMove, true, 0, null, 0, null, false, false);
			testList.add(aMove.getCurLoc());
		    }
		} catch (IllegalArgumentException e) {
		    if (x >= Rules.DFLT_WIDTH && y >= Rules.DFLT_HEIGHT) fail("An error should not have been thrown for the width " + x + " or the height " + y);
		}
	    }
	}
    }

    @Test
    public void testRestart() {
	List<Point> testList = new LinkedList<Point>();
	int previousHighScore;
	for (int x = -1; x < width; x++) {
	    for (int y = -1; y < height; y++) {
		board = new Board();
		insertRandomBoardInfo(board);
		previousHighScore = board.getHighScore();
		try {
		    moves = Rules.restartGame(board, x, y);
		    assertTrue("A new game should not already be over", board.isGameOver() == false);
		    assertTrue("A new gmae should not already be won", board.isGameWon() == false);
		    assertTrue("incorrect width", board.getWidth() == x);
		    assertTrue("incorrect height", board.getHeight() == y);
		    assertTrue("incorrect initial score", board.getScore() == 0);
		    assertTrue("highscore should carry over after a restart", board.getHighScore() == previousHighScore);
		    if (moves.size() < Rules.DFLT_STARTNUM) fail("less than 2 tiles were added to the board");
		    else if (moves.size() > Rules.DFLT_STARTNUM) fail("More than 2 tiles were added to the board");
		    testList.clear();
		    for (ATileMove aMove : moves) {
			testTileValues(aMove, true, 0, null, 0, null, false, false);
			testList.add(aMove.getCurLoc());
		    }
		} catch (IllegalArgumentException e) {
		    if (x >= Rules.DFLT_WIDTH && y >= Rules.DFLT_HEIGHT) fail("An error should not have been thrown for the width " + x + " or the height " + y);
		}
	    }
	}
    }

    @Test
    public void testBasicRight() {
	board = new Board();
	ansBoard = new Board();
	int i;
	Point moveFromPnt = null, moveToPnt = null;
	ATileMove tile = null;
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		board.setSize(width, height);
		i = (int) Math.pow(2, rand.nextInt(30));
		moveFromPnt = new Point(x, y);
		board.setCell(moveFromPnt, i);
		moves = Rules.makeMove(board, Direction.RIGHT);
		moveToPnt = new Point(width - 1, y);
		ansBoard.setSize(width, height);
		ansBoard.setCell(moveToPnt, i);
		compareBoardsAfterMove(true);
		if (x == moveToPnt.x) assertTrue("No move made, but a tile was still added", moves.isEmpty());
		else {
		    assertTrue("Valid move made, thus list should have 2 items", moves.size() == 2);
		    tile = new ATileMove(moveFromPnt, i);
		    tile.move(moveToPnt);
		    assertTrue("Moved tile should have been in the list", moves.contains(tile));
		    moves.remove(tile);
		    testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false);
		}
	    }
    }

    @Test
    public void testBasicLeft() {
	board = new Board();
	ansBoard = new Board();
	int i;
	Point moveFromPnt = null, moveToPnt = null;
	ATileMove tile = null;
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		board.setSize(width, height);
		i = (int) Math.pow(2, rand.nextInt(30));
		moveFromPnt = new Point(x, y);
		board.setCell(moveFromPnt, i);
		moves = Rules.makeMove(board, Direction.LEFT);
		moveToPnt = new Point(0, y);
		ansBoard.setSize(width, height);
		ansBoard.setCell(moveToPnt, i);
		compareBoardsAfterMove(true);
		if (x == moveToPnt.x) assertTrue("No move made, but a tile was still added", moves.isEmpty());
		else {
		    assertTrue("Valid move made, thus list should have 2 items", moves.size() == 2);
		    tile = new ATileMove(moveFromPnt, i);
		    tile.move(moveToPnt);
		    assertTrue("Moved tile should have been in the list", moves.contains(tile));
		    moves.remove(tile);
		    testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false);
		}
	    }
    }

    @Test
    public void testBasicDown() {
	board = new Board();
	ansBoard = new Board();
	int i;
	Point moveFromPnt = null, moveToPnt = null;
	ATileMove tile = null;
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		board.setSize(width, height);
		i = (int) Math.pow(2, rand.nextInt(30));
		moveFromPnt = new Point(x, y);
		board.setCell(moveFromPnt, i);
		moves = Rules.makeMove(board, Direction.DOWN);
		moveToPnt = new Point(x, height - 1);
		ansBoard.setSize(width, height);
		ansBoard.setCell(moveToPnt, i);
		compareBoardsAfterMove(true);
		if (y == moveToPnt.y) assertTrue("No move made, but a tile was still added", moves.isEmpty());
		else {
		    assertTrue("Valid move made, thus list should have 2 items", moves.size() == 2);
		    tile = new ATileMove(moveFromPnt, i);
		    tile.move(moveToPnt);
		    assertTrue("Moved tile should have been in the list", moves.contains(tile));
		    moves.remove(tile);
		    testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false);
		}
	    }
    }

    @Test
    public void testBasicUp() {
	board = new Board();
	ansBoard = new Board();
	int i;
	Point moveFromPnt = null, moveToPnt = null;
	ATileMove tile = null;
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		board.setSize(width, height);
		i = (int) Math.pow(2, rand.nextInt(30));
		moveFromPnt = new Point(x, y);
		board.setCell(moveFromPnt, i);
		moves = Rules.makeMove(board, Direction.UP);
		moveToPnt = new Point(x, 0);
		ansBoard.setSize(width, height);
		ansBoard.setCell(moveToPnt, i);
		compareBoardsAfterMove(true);
		if (y == moveToPnt.y) assertTrue("No move made, but a tile was still added", moves.isEmpty());
		else {
		    assertTrue("Valid move made, thus list should have 2 items", moves.size() == 2);
		    tile = new ATileMove(moveFromPnt, i);
		    tile.move(moveToPnt);
		    assertTrue("Moved tile should have been in the list", moves.contains(tile));
		    moves.remove(tile);
		    testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false);
		}
	    }
    }

    @Test
    public void testMergeRight() {
	final int initVal = 8, mergeVal = 16;
	board = new Board();
	ansBoard = new Board();
	Point fromPnt1 = null, fromPnt2 = null, moveToPnt = null;
	ATileMove tile1 = null, tile2 = null;
	ansBoard.setScore(mergeVal);
	ansBoard.setHighScore(mergeVal);
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		board.setScore(0);
		board.setHighScore(0);
		board.setSize(width, height);
		fromPnt1 = new Point(x, y);
		board.setCell(fromPnt1, initVal);
		do {
		    fromPnt2 = new Point(rand.nextInt(width), y);
		} while (fromPnt2.equals(fromPnt1));
		board.setCell(fromPnt2, initVal);
		moves = Rules.makeMove(board, Direction.RIGHT);
		moveToPnt = new Point(width - 1, y);
		ansBoard.setSize(width, height);
		ansBoard.setCell(moveToPnt, mergeVal);
		compareBoardsAfterMove(true);
		assertTrue("Incorrect number of tiles, 2 moved and 1 added = 3", moves.size() == 3);
		tile1 = new ATileMove(fromPnt1, initVal);
		tile2 = new ATileMove(fromPnt2, initVal);
		if (fromPnt1.x > fromPnt2.x) {
		    if (fromPnt1.x != moveToPnt.x) tile1.move(moveToPnt);
		    tile1.delete();
		    tile2.merge(moveToPnt, mergeVal);
		} else {
		    if (fromPnt2.x != moveToPnt.x) tile2.move(moveToPnt);
		    tile2.delete();
		    tile1.merge(moveToPnt, mergeVal);
		}
		assertTrue("List should contain both starting tiles", moves.contains(tile1));
		moves.remove(tile1);
		assertTrue("List should contain both starting tiles", moves.contains(tile2));
		moves.remove(tile2);
		testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false); // moves would only contain the randomly placed tile
	    }
    }

    @Test
    public void testMergeLeft() {
	final int initVal = 8, mergeVal = 16;
	board = new Board();
	ansBoard = new Board();
	Point fromPnt1 = null, fromPnt2 = null, moveToPnt = null;
	ATileMove tile1 = null, tile2 = null;
	ansBoard.setScore(mergeVal);
	ansBoard.setHighScore(mergeVal);
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		board.setScore(0);
		board.setHighScore(0);
		board.setSize(width, height);
		fromPnt1 = new Point(x, y);
		board.setCell(fromPnt1, initVal);
		do {
		    fromPnt2 = new Point(rand.nextInt(width), y);
		} while (fromPnt2.equals(fromPnt1));
		board.setCell(fromPnt2, initVal);
		moves = Rules.makeMove(board, Direction.LEFT);
		moveToPnt = new Point(0, y);
		ansBoard.setSize(width, height);
		ansBoard.setCell(moveToPnt, mergeVal);
		compareBoardsAfterMove(true);
		assertTrue("Incorrect number of tiles, 2 moved and 1 added = 3", moves.size() == 3);
		tile1 = new ATileMove(fromPnt1, initVal);
		tile2 = new ATileMove(fromPnt2, initVal);
		if (fromPnt1.x < fromPnt2.x) {
		    if (fromPnt1.x != moveToPnt.x) tile1.move(moveToPnt);
		    tile1.delete();
		    tile2.merge(moveToPnt, mergeVal);
		} else {
		    if (fromPnt2.x != moveToPnt.x) tile2.move(moveToPnt);
		    tile2.delete();
		    tile1.merge(moveToPnt, mergeVal);
		}
		assertTrue("List should contain both starting tiles", moves.contains(tile1));
		moves.remove(tile1);
		assertTrue("List should contain both starting tiles", moves.contains(tile2));
		moves.remove(tile2);
		testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false); // moves would only contain the randomly placed tile
	    }
    }

    @Test
    public void testMergeDown() {
	final int initVal = 8, mergeVal = 16;
	board = new Board();
	ansBoard = new Board();
	Point fromPnt1 = null, fromPnt2 = null, moveToPnt = null;
	ATileMove tile1 = null, tile2 = null;
	ansBoard.setScore(mergeVal);
	ansBoard.setHighScore(mergeVal);
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		board.setScore(0);
		board.setHighScore(0);
		board.setSize(width, height);
		fromPnt1 = new Point(x, y);
		board.setCell(fromPnt1, initVal);
		do {
		    fromPnt2 = new Point(x, rand.nextInt(height));
		} while (fromPnt2.equals(fromPnt1));
		board.setCell(fromPnt2, initVal);
		moves = Rules.makeMove(board, Direction.DOWN);
		moveToPnt = new Point(x, height - 1);
		ansBoard.setSize(width, height);
		ansBoard.setCell(moveToPnt, mergeVal);
		compareBoardsAfterMove(true);
		assertTrue("Incorrect number of tiles, 2 moved and 1 added = 3", moves.size() == 3);
		tile1 = new ATileMove(fromPnt1, initVal);
		tile2 = new ATileMove(fromPnt2, initVal);
		if (fromPnt1.y > fromPnt2.y) {
		    if (fromPnt1.y != moveToPnt.y) tile1.move(moveToPnt);
		    tile1.delete();
		    tile2.merge(moveToPnt, mergeVal);
		} else {
		    if (fromPnt2.y != moveToPnt.y) tile2.move(moveToPnt);
		    tile2.delete();
		    tile1.merge(moveToPnt, mergeVal);
		}
		assertTrue("List should contain both starting tiles", moves.contains(tile1));
		moves.remove(tile1);
		assertTrue("List should contain both starting tiles", moves.contains(tile2));
		moves.remove(tile2);
		testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false); // moves would only contain the randomly placed tile
	    }
    }

    @Test
    public void testMergeUp() {
	final int initVal = 8, mergeVal = 16;
	board = new Board();
	ansBoard = new Board();
	Point fromPnt1 = null, fromPnt2 = null, moveToPnt = null;
	ATileMove tile1 = null, tile2 = null;
	ansBoard.setScore(mergeVal);
	ansBoard.setHighScore(mergeVal);
	for (int x = 0; x < width; x++)
	    for (int y = 0; y < height; y++) {
		board.setScore(0);
		board.setHighScore(0);
		board.setSize(width, height);
		fromPnt1 = new Point(x, y);
		board.setCell(fromPnt1, initVal);
		do {
		    fromPnt2 = new Point(x, rand.nextInt(height));
		} while (fromPnt2.equals(fromPnt1));
		board.setCell(fromPnt2, initVal);
		moves = Rules.makeMove(board, Direction.DOWN);
		moveToPnt = new Point(x, height - 1);
		ansBoard.setSize(width, height);
		ansBoard.setCell(moveToPnt, mergeVal);
		compareBoardsAfterMove(true);
		assertTrue("Incorrect number of tiles, 2 moved and 1 added = 3", moves.size() == 3);
		tile1 = new ATileMove(fromPnt1, initVal);
		tile2 = new ATileMove(fromPnt2, initVal);
		if (fromPnt1.y > fromPnt2.y) {
		    if (fromPnt1.y != moveToPnt.y) tile1.move(moveToPnt);
		    tile1.delete();
		    tile2.merge(moveToPnt, mergeVal);
		} else {
		    if (fromPnt2.y != moveToPnt.y) tile2.move(moveToPnt);
		    tile2.delete();
		    tile1.merge(moveToPnt, mergeVal);
		}
		assertTrue("List should contain both starting tiles", moves.contains(tile1));
		moves.remove(tile1);
		assertTrue("List should contain both starting tiles", moves.contains(tile2));
		moves.remove(tile2);
		testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false); // moves would only contain the randomly placed tile
	    }
    }

    @Test
    public void testInneffectiveVerticalMove() {
	board = new Board();
	ansBoard = new Board();
	board.setSize(width, height);
	ansBoard.setSize(width, height);
	int tmpScore = rand.nextInt(100000);// random large number
	board.setScore(tmpScore);
	board.setHighScore(tmpScore);
	ansBoard.setScore(tmpScore);
	ansBoard.setHighScore(tmpScore);
	boolean altCell = true;
	int x = rand.nextInt(width);
	for (int y = 0; y < height; y++) { // fill a column in each board with alternating values
	    board.setCell(new Point(x, y), altCell ? 16 : 32);
	    ansBoard.setCell(new Point(x, y), altCell ? 16 : 32);
	    altCell = !altCell;
	}
	moves = Rules.makeMove(board, Direction.UP);
	assertTrue("No moves made should have empty list", moves.isEmpty());
	compareBoardsAfterMove(false);
	moves = Rules.makeMove(board, Direction.DOWN);
	assertTrue("No moves made should have empty list", moves.isEmpty());
	compareBoardsAfterMove(false);
    }

    @Test
    public void testInneffectiveHorizontalMove() {
	board = new Board();
	ansBoard = new Board();
	board.setSize(width, height);
	ansBoard.setSize(width, height);
	int tmpScore = rand.nextInt(100000);// random large number
	board.setScore(tmpScore);
	board.setHighScore(tmpScore);
	ansBoard.setScore(tmpScore);
	ansBoard.setHighScore(tmpScore);
	boolean altCell = true;
	int y = rand.nextInt(width);
	for (int x = 0; x < height; x++) { // fill a row in each board with alternating values
	    board.setCell(new Point(x, y), altCell ? 16 : 32);
	    ansBoard.setCell(new Point(x, y), altCell ? 16 : 32);
	    altCell = !altCell;
	}
	moves = Rules.makeMove(board, Direction.RIGHT);
	assertTrue("No moves made should have empty list", moves.isEmpty());
	compareBoardsAfterMove(false);
	moves = Rules.makeMove(board, Direction.LEFT);
	assertTrue("No moves made should have empty list", moves.isEmpty());
	compareBoardsAfterMove(false);
    }

    @Test
    public void testWinCondition() {
	board = new Board();
	ansBoard = new Board();
	board.setSize(width, height);
	ansBoard.setSize(width, height);
	int tmpScore = rand.nextInt(100000);// random large number
	board.setScore(tmpScore);
	board.setHighScore(tmpScore);
	ansBoard.setScore(tmpScore + Rules.DFLT_WINVALUE);// will gain 2048 points after a game winning merge
	ansBoard.setHighScore(tmpScore + Rules.DFLT_WINVALUE);
	ansBoard.setGameWon(true);
	Point pnt1 = new Point(rand.nextInt(width), rand.nextInt(height));
	Point pnt2 = null;
	Point moveToPnt = null;
	do {
	    pnt2 = new Point(pnt1.x, rand.nextInt(height)); // points are in same column
	} while (pnt1.equals(pnt2));
	board.setCell(pnt1, Rules.DFLT_WINVALUE / 2);
	board.setCell(pnt2, Rules.DFLT_WINVALUE / 2);
	moves = Rules.makeMove(board, Direction.DOWN); // points are in same column, so do a vertical move
	moveToPnt = new Point(pnt1.x, height - 1);
	ansBoard.setCell(moveToPnt, Rules.DFLT_WINVALUE);
	compareBoardsAfterMove(true);
	assertTrue("After move list should have size = 3", moves.size() == 3);
	ATileMove tile1 = new ATileMove(pnt1, Rules.DFLT_WINVALUE / 2);
	ATileMove tile2 = new ATileMove(pnt2, Rules.DFLT_WINVALUE / 2);
	if (pnt1.y > pnt2.y) {
	    if (pnt1.y != moveToPnt.y) tile1.move(moveToPnt);
	    tile1.delete();
	    tile2.merge(moveToPnt, Rules.DFLT_WINVALUE);
	} else {
	    if (pnt2.y != moveToPnt.y) tile2.move(moveToPnt);
	    tile2.delete();
	    tile1.merge(moveToPnt, Rules.DFLT_WINVALUE);
	}
	assertTrue(moves.contains(tile1)); // error?
	moves.remove(tile1);
	assertTrue(moves.contains(tile2));
	moves.remove(tile2);
	testTileValues(moves.get(0), true, 0, moveToPnt, 0, null, false, false); // moves would only contain the randomly placed tile
    }

    @Test
    public void testLossCondition() {
	final int smallNum = 4;
	board = new Board();
	ansBoard = new Board();
	board.setSize(width, height);
	ansBoard.setSize(width, height);
	int tmpScore = rand.nextInt(100000);// random large number
	board.setScore(tmpScore);
	board.setHighScore(tmpScore);
	ansBoard.setScore(tmpScore + 2 * smallNum);  // 2 cells of value 4 will be combined on board thus increasing score by 8
	ansBoard.setHighScore(tmpScore + 2 * smallNum);
	ansBoard.setGameOver(true);
	boolean altCell;
	boolean altCol = true;
	for (int x = 0; x < width; x++) { // fill boards with alternating values so no moves are possible
	    altCell = altCol;
	    for (int y = 0; y < height; y++) {
		board.setCell(new Point(x, y), altCell ? 16 : 32);
		ansBoard.setCell(new Point(x, y), altCell ? 16 : 32);
		altCell = !altCell;
	    }
	    altCol = !altCol;
	}
	/*
	 * Make 2 cells in bottom right have the same value (4) so that a shift up will combine them, a new tile will be added to extreme bottom right which will be
	 * either 2 or 4, which can't combine with anything and thus ends the game
	 */
	Point pnt1 = new Point(width - 1, height - 2);
	Point pnt2 = new Point(width - 1, height - 1);
	board.setCell(pnt1, smallNum);
	board.setCell(pnt2, smallNum);
	moves = Rules.makeMove(board, Direction.UP);
	/*
	 * The value of tile added to the board is unknown so we set the ansBoard val to 0 which indicates to compareBoardsAfterMove() that a value of 2 or 4 may be
	 * inserted on the board at that point and that it should be ignored in the comparison
	 */
	ansBoard.setCell(pnt1, 2 * smallNum);
	ansBoard.setCell(pnt2, 0);
	compareBoardsAfterMove(true);
	assertTrue("list should only contain 3 items after the move", moves.size() == 3);
	ATileMove tile1 = new ATileMove(pnt1, smallNum);
	ATileMove tile2 = new ATileMove(pnt2, smallNum);
	tile1.delete();
	tile2.merge(pnt1, 2 * smallNum);
	assertTrue("list should have contained this tile", moves.contains(tile1));
	moves.remove(tile1);
	assertTrue("list should have contained this tile", moves.contains(tile2));
	moves.remove(tile2);
	ATileMove newTile = moves.get(0);
	assertTrue("Newly placed tile should have only had a single possible location", newTile.getCurLoc().equals(pnt2));
	assertTrue("Incorrect value for a new tile", newTile.getCurVal() == 2 || newTile.getCurVal() == 4);
    }

    private void insertRandomBoardInfo(Board board) {
	board.setSize(rand.nextInt(width - Rules.DFLT_WIDTH) + Rules.DFLT_WIDTH, rand.nextInt(height - Rules.DFLT_HEIGHT) + Rules.DFLT_HEIGHT);
	board.setScore(rand.nextInt(Integer.MAX_VALUE));
	board.setHighScore(rand.nextInt(Integer.MAX_VALUE - board.getScore() + 1));
	board.setGameOver(rand.nextBoolean());
	board.setGameWon(rand.nextBoolean());
	for (int x = 0; x < board.getWidth(); x++)
	    for (int y = 0; y < board.getHeight(); y++)
		if (rand.nextBoolean() == true) board.setCell(new Point(x, y), (int) Math.pow(2, rand.nextInt(30)));
    }

    private void testTileValues(ATileMove tile, boolean isNew, int curVal, Point curLoc, int prvVal, Point prvLoc, boolean isMerged, boolean isDeleted) {
	if (isNew) {
	    assertTrue("Incorrect curVal for a New Tile", tile.getCurVal() == 2 || tile.getCurVal() == 4);
	    assertFalse("Incorrect curLoc", tile.getCurLoc().equals(curLoc));	// enforce where a new tile cant be
	    assertTrue("New Tile shouldnt have a prvVal", tile.getPrvVal() == 0);
	    assertTrue("New Tile shouldnt have a prvLoc", tile.getPrvLoc() == null);
	    assertTrue("Incorrect isMerged state for a New Tile", tile.isMerged() == false);
	    assertTrue("Incorrect isDeleted state for a New TIle", tile.isDeleted() == false);
	} else {
	    if (isDeleted) {
		assertTrue("Incorrect curVal", tile.getCurVal() == 0); // assumes that deleted tiles have their curVal set to 0
		if (tile.getPrvLoc() == null) assertTrue(prvLoc == null); // it was merged into while on the edge, thus no prvLoc
		else assertTrue("Incorrect prvLoc", tile.getPrvLoc().equals(prvLoc)); // it was merged into but not on an edge, thus has prvLoc
	    } else {
		assertTrue("Incorrect curVal", tile.getCurVal() == curVal);
		assertTrue("Incorrect prvLoc", tile.getPrvLoc().equals(prvLoc));
	    }
	    assertTrue("Incorrect curLoc", tile.getCurLoc().equals(curLoc));
	    assertTrue("Incorrect prvVal", tile.getPrvVal() == prvVal);
	    assertTrue("Incorrect isMerged state", tile.isMerged() == isMerged);
	    assertTrue("Incorrect isDeleted state", tile.isDeleted() == isDeleted);
	}
    }

    private void compareBoardsAfterMove(boolean allowOneDifference) {
	assertEquals("Width changed?", ansBoard.getWidth(), board.getWidth());
	assertEquals("Height changed?", ansBoard.getHeight(), board.getHeight());
	assertEquals("Incorrect Score", ansBoard.getScore(), board.getScore());
	assertEquals("Incorrect highScore", ansBoard.getHighScore(), board.getHighScore());
	assertEquals("Incorrect gameOver status", ansBoard.isGameOver(), board.isGameOver());
	assertEquals("Ioncorrect gameWon status", ansBoard.isGameWon(), board.isGameWon());
	boolean foundAddition = allowOneDifference ? false : true;
	for (int x = 0; x < board.getWidth(); x++)
	    for (int y = 0; y < board.getHeight(); y++)
		if (board.valueAt(x, y) != ansBoard.valueAt(x, y)) {
		    if (ansBoard.valueAt(x, y) != 0) fail("Either AnswerBoard is incorrect, or makeMove created errors");
		    else if (foundAddition) fail("Tiles did not shift correctly or more than one tile inserted after a move.");
		    else if (board.valueAt(x, y) != 2 && board.valueAt(x, y) != 4) fail("Wrong number inserted after a move");
		    else foundAddition = true;
		}
    }

}