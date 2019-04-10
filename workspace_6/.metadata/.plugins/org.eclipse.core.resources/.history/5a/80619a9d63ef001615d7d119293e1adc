package controller;

/**
 * An interface describing tasks that the controller shall be responsible for.
 */
public interface ControllerInterface {
    /**
     * Executes the appropriate actions to cause the Model associated with this Controller to shift the tiles in the direction given, if possible, then updates the
     * View that is associated with this Controller.
     * @param d A desired shift direction given by the user.
     */
    public void makeMove(Direction d);

    /**
     * Executes the appropriate actions to cause the Model associated with this Controller to restart the game with the given number of horizontal & vertical tiles,
     * then updates the View that is associated with this Controller.
     * @param newWidth The number of horizontal tiles to use when restarting the game.
     * @param newHeight The number of vertical tiles to use when restarting the game.
     */
    public void restartGame(int newWidth, int newHeight);

    /**
     * Executes the appropriate actions to first end the game and then terminate the program.
     */
    public void endGame();
}