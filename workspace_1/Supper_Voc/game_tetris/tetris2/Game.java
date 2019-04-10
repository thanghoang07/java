package tetris2;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Game extends Object 
{
    public static final int STATE_GETREADY =1;
    public static final int STATE_PLAYING = 2;
    public static final int STATE_PAUSED =  3;
    public static final int STATE_GAMEOVER =4;
       
    
    /**
     * The PropertyChangeSupport Object able to register listener and dispatch events to them.
     */
    public final PropertyChangeSupport PCS = new PropertyChangeSupport(this);
    
    /**
     * The main square board. This board is used for the game itself.
     */
    public final SquareBoard board;

    /**
     * The preview square board. This board is used to display a 
     * preview of the figures.
     */
    public final SquareBoard previewBoard = new SquareBoard(5, 5);

    /**
     * The figures used on both boards. All figures are reutilized in 
     * order to avoid creating new objects while the game is running.
     * Special care has to be taken when the preview figure and the
     * current figure refers to the same object.
     */
    public Figure[] figures = {
        new Figure(Figure.SQUARE_FIGURE),
        new Figure(Figure.LINE_FIGURE),
        new Figure(Figure.S_FIGURE),
        new Figure(Figure.Z_FIGURE),
        new Figure(Figure.RIGHT_ANGLE_FIGURE),
        new Figure(Figure.LEFT_ANGLE_FIGURE),
        new Figure(Figure.TRIANGLE_FIGURE)
    };

    /**
     * The thread that runs the game. When this variable is set to 
     * null, the game thread will terminate.
     */
    public final GameThread thread;

    /**
     * The game level. The level will be increased for every 20 lines 
     * removed from the square board.
     */
    public int level = 1;

    /**
     * The current score. The score is increased for every figure that
     * is possible to place on the main board.
     */
    public int score = 0;

    /**
     * The current figure. The figure will be updated when 
     */
    public Figure figure = null;

    /**
     * The next figure.
     */
    public Figure nextFigure = null;
    
    /**
     * The rotation of the next figure.
     */
    public int nextRotation = 0;

    /**
     * The figure preview flag. If this flag is set, the figure
     * will be shown in the figure preview board.
     */
    public boolean preview = true;

    /**
     * The move lock flag. If this flag is set, the current figure
     * cannot be moved. This flag is set when a figure is moved all 
     * the way down, and reset when a new figure is displayed.
     */
    public boolean moveLock = false;
    
    /**
     * 
     */
    public int state;

    /**
     * Creates a new Tetris game. The square board will be given
     * the default size of 10x20.
     */
    public Game() {
        this(10, 20);
    }

    /**
     * Creates a new Tetris game. The square board will be given
     * the specified size.
     *
     * @param width     the width of the square board (in positions)
     * @param height    the height of the square board (in positions)
     */
    public Game(int width, int height) {
        board = new SquareBoard(width, height);
        thread = new GameThread();
        handleGetReady();
        board.getComponent().setFocusable(true);
        board.getComponent().addKeyListener(new KeyAdapter() {
          public void keyPressed(KeyEvent e) {
             handleKeyEvent(e);
          }
        });
        
    }

    /**
     * Adds a PropertyChangeListener to this Game.
     * 
     * This is the list the Events that can be fired: 
     * 
     * name: "state" 
     * value: new current state (int) one of those: STATE_OVER,STATE_PLAYING,STATE_PAUSED 
     * when: fired when the state changes.  
     * 
     * name: "level"
     * value: current level (int)
     * when: fired when the player moves to the next level.
     * 
     * name: "score"
     * value: current score (int)
     * when: fired when the player increases his/her score.
     * 
     * name: "lines"
     * value: number of 'removed' lines (int)
     * when: fired when the player removes one or more lines.
     * 
     * @param l the property change listener which is going to be notified.
     */
    public void addPropertyChangeListener(PropertyChangeListener l)
    {
       PCS.addPropertyChangeListener(l);
    }

    /**
     * Removes this propertyChangeListener
     * @param l the PropertyChangeListener object to remove.
     */
    public void removePropertyChangeListener(PropertyChangeListener l)
    {
       PCS.removePropertyChangeListener(l);
    }

    /**
     * Gets the current 'state'. 
     * One of the following: 
     * STATE_GETREADY,STATE_PLAYING,STATE_PAUSED,STATE_GAMEOVER. 
     * @return the current state.
     */
    public int getState()
    {
       return state;
    }
     
    /**
     * Gets the current level.
     * @return the current level.
     */
    public int getLevel()
    {
       return level;
    }
    
    /**
     * Gets the current score. 
     * @return the current score.
    **/
    public int getScore()
    {
       return score;
    }
    
    /**
     * Gets the number of lines that have been removed since the game started.
     * @return the number of removed lines.
     */
    public int getRemovedLines()
    {
       return board.getRemovedLines();
    }
    
    /**
     * Gets the java.awt.Component for the board.
     * @return the gui component for the board.
     */
    public Component getSquareBoardComponent()
    {
       return board.getComponent();
    }
    

    /**
     * Gets the java.awt.Component for the preview board (5x5)
     * @return the gui component for the board.
     */
    public Component getPreviewBoardComponent()
    {
       return previewBoard.getComponent();
    }
    
    /**
     * Initializes the game ready if the state is on STATE_GAMEOVER
     * otherwise it does nothing.
    **/
    public void init()
    {
       if (state == STATE_GAMEOVER)
       {
          handleGetReady();
       }
    }
    
    /**
     * Starts the game. (No matter what the current state is)
    **/
    public void start()
    {
       handleStart();
    }
    
    /**
     * Pauses the game  if the state is on STATE_PLAYING
     * otherwise it does nothing.
    **/
    public void pause()
    {
       if (state == STATE_PLAYING)
       {
          handlePause();
       }
    }

    /**
     * Resumes the game  if the state is on STATE_PAUSED
     * otherwise it does nothing.
    **/
    public void resume()
    {
       if (state == STATE_PAUSED)
       {
          handleResume();
       }
    }
    
    /**
     * Terminates the game. (No matter what the current state is)
    **/
    public void terminate()
    {
       handleGameOver();
    }    

    /**
     * Handles a game start event. Both the main and preview square
     * boards will be reset, and all other game parameters will be
     * reset. Finally the game thread will be launched.
     */
    public void handleStart() {

        // Reset score and figures
        level = 1;
        score = 0;
        figure = null;
        nextFigure = randomFigure();
        nextFigure.rotateRandom();
        nextRotation = nextFigure.getRotation();  

        // Reset components
        state = STATE_PLAYING;
        board.setMessage(null);
        board.clear();
        previewBoard.clear();
        handleLevelModification();
        handleScoreModification();
        
        PCS.firePropertyChange("state",-1, STATE_PLAYING );
        
        // Start game thread
        thread.reset();
    }

    /**
     * Handles a game over event. This will stop the game thread,
     * reset all figures and print a game over message.
     */
    public void handleGameOver() {

        // Stop game thred
        thread.setPaused(true);

        // Reset figures
        if (figure != null) {
            figure.detach();
        }
        figure = null;
        if (nextFigure != null) {
            nextFigure.detach();
        }
        nextFigure = null;

        // Handle components
        state = STATE_GAMEOVER;
        board.setMessage("Game Over");
        PCS.firePropertyChange("state",-1, STATE_GAMEOVER );
    }
    
    /**
     * Handles a getReady event. 
     * This will print a 'get ready' message on the game board.
     */
    public void handleGetReady()
    {
       board.setMessage("Get Ready");
       board.clear();
       previewBoard.clear();
       state = STATE_GETREADY;
       PCS.firePropertyChange("state",-1, STATE_GETREADY );
    }

    /**
     * Handles a game pause event. This will pause the game thread and
     * print a pause message on the game board.
     */
    public void handlePause() {
        thread.setPaused(true);
        state = STATE_PAUSED;
        board.setMessage("Paused");
        PCS.firePropertyChange("state",-1, STATE_PAUSED );
    }

    /**
     * Handles a game resume event. This will resume the game thread 
     * and remove any messages on the game board.
     */
    public void handleResume() {
        state = STATE_PLAYING;
        board.setMessage(null);
        thread.setPaused(false);
        PCS.firePropertyChange("state",-1,STATE_PLAYING);
    }

    /**
     * Handles a level modification event. This will modify the level
     * label and adjust the thread speed.
     */
    public void handleLevelModification() {
        PCS.firePropertyChange("level",-1,level);
        thread.adjustSpeed();
    }
    
    /**
     * Handle a score modification event. This will modify the score
     * label.
     */
    public void handleScoreModification() {
       PCS.firePropertyChange("score",-1,score);
    }

    /**
     * Handles a figure start event. This will move the next figure
     * to the current figure position, while also creating a new 
     * preview figure. If the figure cannot be introduced onto the
     * game board, a game over event will be launched.
     */
    public void handleFigureStart() {
        int  rotation;

        // Move next figure to current
        figure = nextFigure;
        moveLock = false;
        rotation = nextRotation;
        nextFigure = randomFigure();
        nextFigure.rotateRandom(); 
        nextRotation = nextFigure.getRotation(); 

        // Handle figure preview
        if (preview) {
            previewBoard.clear(); 
            nextFigure.attach(previewBoard, true);
            nextFigure.detach();
        }

        // Attach figure to game board
        figure.setRotation(rotation);
        if (!figure.attach(board, false)) {
            previewBoard.clear();
            figure.attach(previewBoard, true);
            figure.detach();
            handleGameOver();
        }
    }

    /**
     * Handles a figure landed event. This will check that the figure
     * is completely visible, or a game over event will be launched.
     * After this control, any full lines will be removed. If no full
     * lines could be removed, a figure start event is launched 
     * directly.
     */
    public void handleFigureLanded() {

        // Check and detach figure
        if (figure.isAllVisible()) {
            score += 10;
            handleScoreModification();
        } else {
            handleGameOver();
            return;
        }
        figure.detach();
        figure = null;

        // Check for full lines or create new figure
        if (board.hasFullLines()) {
            board.removeFullLines();
            PCS.firePropertyChange("lines", -1, board.getRemovedLines());
            if (level < 9 && board.getRemovedLines() / 20 > level) {
                level = board.getRemovedLines() / 20;
                handleLevelModification();
            }
        } else {
            handleFigureStart();
        }
    }

    /**
     * Handles a timer event. This will normally move the figure down
     * one step, but when a figure has landed or isn't ready other 
     * events will be launched. This method is synchronized to avoid 
     * race conditions with other asynchronous events (keyboard and
     * mouse).
     */
    public synchronized void handleTimer() {
        if (figure == null) {
            handleFigureStart();
        } else if (figure.hasLanded()) {
            handleFigureLanded();
        } else {
            figure.moveDown();
        }
    }

    /**
     * Handles a button press event. This will launch different events
     * depending on the state of the game, as the button semantics
     * change as the game changes. This method is synchronized to 
     * avoid race conditions with other asynchronous events (timer and
     * keyboard).
     */
    public synchronized void handlePauseOnOff() {
        if (nextFigure == null) {
            handleStart();
        } else if (thread.isPaused()) {
            handleResume();
        } else {
            handlePause();
        }
    }
    
    /**
     * Handles a keyboard event. This will result in different actions
     * being taken, depending on the key pressed. In some cases, other
     * events will be launched. This method is synchronized to avoid 
     * race conditions with other asynchronous events (timer and 
     * mouse).
     * 
     * @param e         the key event
     */
    public synchronized void handleKeyEvent(KeyEvent e) 
    {
        // Handle start (any key to start !!!)
        if (state == STATE_GETREADY) 
        {
           handleStart();
           return;
        }
        
        // pause and resume
        if (e.getKeyCode() == KeyEvent.VK_P) {
            handlePauseOnOff();
            return;
        }

        // Don't proceed if stopped or paused
        if (figure == null || moveLock || thread.isPaused()) {
            return;
        }

        // Handle remaining key events
        switch (e.getKeyCode()) {

        case KeyEvent.VK_LEFT:
            figure.moveLeft();
            break;

        case KeyEvent.VK_RIGHT:
            figure.moveRight();
            break;

        case KeyEvent.VK_DOWN:
            figure.moveAllWayDown();
            moveLock = true;
            break;

        case KeyEvent.VK_UP:
        case KeyEvent.VK_SPACE:
            if (e.isControlDown()) {
                figure.rotateRandom();  
            } else if (e.isShiftDown()) { 
                figure.rotateClockwise();
            } else {
                figure.rotateCounterClockwise();
            }
            break;

        case KeyEvent.VK_S:
            if (level < 9) {
                level++;
                handleLevelModification();
            }
            break;

        case KeyEvent.VK_N:
            preview = !preview;
            if (preview && figure != nextFigure) {
                nextFigure.attach(previewBoard, true);
                nextFigure.detach(); 
            } else {
                previewBoard.clear();
            }
            break;
        }
    }

    /**
     * Returns a random figure. The figures come from the figures
     * array, and will not be initialized.
     * 
     * @return a random figure
     */
    public Figure randomFigure() {
        return figures[(int) (Math.random() * figures.length)];
    }


    /**
     * The game time thread. This thread makes sure that the timer
     * events are launched appropriately, making the current figure 
     * fall. This thread can be reused across games, but should be set
     * to paused state when no game is running.
     */
    public class GameThread extends Thread {

        /**
         * The game pause flag. This flag is set to true while the 
         * game should pause.
         */
        public boolean paused = true;

        /**
         * The number of milliseconds to sleep before each automatic
         * move. This number will be lowered as the game progresses.
         */
        public int sleepTime = 500;

        /**
         * Creates a new game thread with default values.
         */
        public GameThread() {
        }

        /**
         * Resets the game thread. This will adjust the speed and 
         * start the game thread if not previously started.
         */
        public void reset() {
            adjustSpeed();
            setPaused(false);
            if (!isAlive()) {
                this.start();
            }
        }

        /**
         * Checks if the thread is paused.
         * 
         * @return true if the thread is paused, or
         *         false otherwise
         */
        public boolean isPaused() {
            return paused;
        }

        /**
         * Sets the thread pause flag.
         * 
         * @param paused     the new paused flag value
         */
        public void setPaused(boolean paused) {
            this.paused = paused;
        }

        /**
         * Adjusts the game speed according to the current level. The 
         * sleeping time is calculated with a function making larger 
         * steps initially an smaller as the level increases. A level 
         * above ten (10) doesn't have any further effect.
         */
        public void adjustSpeed() {
            sleepTime = 4500 / (level + 5) - 250;
            if (sleepTime < 50) {
                sleepTime = 50;
            }
        }

        /**
         * Runs the game.
         */
        public void run() {
            while (thread == this) {
                // Make the time step
                handleTimer();

                // Sleep for some time
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException ignore) {
                    // Do nothing
                }

                // Sleep if paused
                while (paused && thread == this) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignore) {
                        // Do nothing
                    }
                }
            }
        }
    }


}
