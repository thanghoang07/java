/*
 * The MIT License
 *
 * Copyright 2017 mhrimaz.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package knighttourfx;

import java.util.ArrayList;
import java.util.List;

/**
 * Immutable design
 *
 * @author mhrimaz
 */
public class ArrayState {

    private static final int X_MOVE[] = {2, 1, -1, -2, -2, -1, 1, 2};
    private static final int Y_MOVE[] = {1, 2, 2, 1, -1, -2, -2, -1};

    private final int[][] board;
    private final int boardSize;
    private int lastX;
    private int lastY;
    private int moveNumber;

    /**
     * Copy constructor
     *
     * @param original original ArrayState
     */
    public ArrayState(ArrayState original) {
        board = new int[original.boardSize][original.boardSize];
        for (int i = 0; i < original.boardSize; i++) {
            int[] aMatrix = original.board[i];
            System.arraycopy(aMatrix, 0, board[i], 0, aMatrix.length);
        }
        boardSize = original.boardSize;
        moveNumber = original.moveNumber;
        lastX = original.lastX;
        lastY = original.lastY;
    }

    /**
     * ArrayState constructor
     *
     * @param n size of the board
     * @param i initial i position
     * @param j initial y position
     */
    public ArrayState(int n, int i, int j) {
        board = new int[n][n];
        board[i][j] = 1;
        boardSize = n;
        lastX = i;
        lastY = j;
        moveNumber = 1;
    }

    /**
     * Checks if a position is valid or not. Or if it is possible to move to
     *
     * @param x destination x position
     * @param y destination y position
     * @return return true if the destination is valid
     */
    public boolean isSafe(int x, int y) {
        return (x >= 0 && x < boardSize
                && y >= 0 && y < boardSize
                && board[x][y] == 0);
    }

    /**
     * Move the knight to the destination
     *
     * @param pos destination position
     * @return a new ArrayState
     */
    public ArrayState moveTo(Position pos) {
        ArrayState arrayState = new ArrayState(this);
        arrayState.setPosition(pos.getX(), pos.getY());
        return arrayState;
    }

    /**
     *
     * @return a list of possible position to go to
     */
    public List<Position> getAllPossiblePositions() {
        List<Position> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int x = getLastX() + ArrayState.getX_MOVE(i);
            int y = getLastY() + ArrayState.getY_MOVE(i);
            if (isSafe(x, y)) {
                list.add(new Position(x, y));
            }
        }
        return list;
    }

    /**
     * if the ignoreLastPositon parameter is set to true we count the last
     * position if we can go to it from provided position
     *
     * @param pos a position
     * @return an integer shows how many possible moves exist from position
     */
    public int allPossibleMoves(Position pos) {
        return allPossibleMoves(pos.getX(), pos.getY());
    }

    /**
     *
     * @param xPos
     * @param yPos
     * @return an integer shows how many possible moves exist from position
     */
    private int allPossibleMoves(int xPos, int yPos) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int x = xPos + ArrayState.getX_MOVE(i);
            int y = yPos + ArrayState.getY_MOVE(i);
            //we can go to the last position in the other word from our last position we can go to this positionّ
            if (isSafe(x, y)) {
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @param xPos
     * @param yPos
     * @return an integer shows how is this node reachable or not a dead end
     */
    private boolean isDeadEnd(int xPos, int yPos) {
        for (int i = 0; i < 8; i++) {
            int x = xPos + ArrayState.getX_MOVE(i);
            int y = yPos + ArrayState.getY_MOVE(i);
            //we can go to the last position in the other word from our last position we can go to this positionّ
            if (isSafe(x, y) || (x == lastX && y == lastY)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return an integer shows how many possible moves exist from current
     * position
     */
    public int allPossibleMoves() {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int x = getLastX() + ArrayState.getX_MOVE(i);
            int y = getLastY() + ArrayState.getY_MOVE(i);
            if (isSafe(x, y)) {
                count++;
            }
        }
        return count;
    }

    public boolean hasDeadEnd() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == 0) {
                    if (isDeadEnd(i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     *
     * @param i destination x position
     * @param j destination y position
     */
    private void setPosition(int i, int j) {
        board[i][j] = moveNumber + 1;
        moveNumber++;
        lastX = i;
        lastY = j;
    }

    /**
     * Check if the path is founded or not
     *
     * @return true if this state is the goal state
     */
    public boolean isPathExist() {
        return moveNumber == boardSize * boardSize;
    }

    public int getLastY() {
        return lastY;
    }

    public int getLastX() {
        return lastX;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public int getMoveNumber() {
        return moveNumber;
    }

    public int getPosition(int i, int j) {
        return board[i][j];
    }

    /**
     * @param index
     * @return the X_MOVE
     */
    public static int getX_MOVE(int index) {
        return X_MOVE[index];
    }

    /**
     * @param index
     * @return the Y_MOVE
     */
    public static int getY_MOVE(int index) {
        return Y_MOVE[index];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int[] row : board) {
            for (int i : row) {
                builder.append(String.format("%-5d", i));
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
