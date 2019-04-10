package model;

import java.util.List;

import controller.Direction;
import controller.ATileMove;

/**
 * An interface describing tasks that the model shall be responsible for.
 */
public interface ModelInterface {

    /**
     * Starts a new game from a saved file, if no file exists it starts a game with the default dimensions.
     * @return A list of all tiles on the board.
     */
    public List<ATileMove> startGame();

    /**
     * Starts a new game with the given dimensions.
     * @param width The width of the board to be made.
     * @param height The height of the board to be made.
     * @return A list of all tile on the board.
     */
    public List<ATileMove> startGame(int width, int height);

    /**
     * Ends the current game and starts a new one with the given dimensions.
     * @param width The width of the board to be made.
     * @param height The height of the board to be made.
     * @return A list of all tile on the board.
     */
    public List<ATileMove> restartGame(int width, int height);

    /**
     * Ends the current game. This attempts to save the current board to file, no errors are thrown if the save fails.
     */
    public void endGame();

    /**
     * Shifts all tiles on the board in the given direction.
     * @param d The direction to shift the tiles on the board.
     * @return The past and present positions and values of all tiles that were affected by the move as well as the tile that was added to the board (only added
     *         after a successful move).
     */
    public List<ATileMove> makeMove(Direction d);

    /**
     * Returns the score of this current game.
     * @return The score of this current game.
     */
    public int getScore();

    /**
     * Returns the highScore of this game.
     * @return The highScore of this game.
     */
    public int getHighScore();

    /**
     * Indicates whether this game has been won or not. Note that to win the game the '2048' tile must be created, however the user can continue to play after that
     * point.
     * @return true If this game has been won, otherwise false.
     */
    public boolean isGameWon();

    /**
     * Indicates whether this game is over. For a game to be over, the board must be completely filled and no moves are available.
     * @return true If this game is over, otherwise false.
     */
    public boolean isGameOver();

    /**
     * Returns the width of this game.
     * @return the width of this game.
     */
    public int getWidth();

    /**
     * Returns the height of this game.
     * @return the height of this game.
     */
    public int getHeight();

}