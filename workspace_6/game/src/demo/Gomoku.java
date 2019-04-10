package demo;

/*
 * Gomoku.java
 * 
 * Name: Javier Chavez
 * Email: javierc@unm.edu
 * Sept. 4 2013
 * CS 251 Lab 2
 * 
 */

import java.util.Random;

import cs251.lab2.GomokuGUI;
import cs251.lab2.GomokuModel;

//TODO allow for Draw game

public class Gomoku implements GomokuModel{
    private StringBuilder sb;
    private Square [][] moves;
    private Player winner = null;
    private Player[] players;
    private Player current;
    private int playerNum;

    
    public Gomoku() {
        //create new array with empty values
        this("computer");
        
    }
    
    public Gomoku(String s) {
        //create new array with empty values
        if (s.contains("computer")) {
            
            players =  new Player[]{ 
                    new Player(Square.CROSS, true),
                    new Player(Square.RING, false) };
            System.out.print("com");
            
        } else if (s.contains("person")) {
            
            players =  new Player[]{ 
                    new Player(Square.CROSS, false),
                    new Player(Square.RING, false) };
        }
        
        
        initMovesArray();
        
        playerNum = new Random().nextInt(19283)%2==0?1:0;
        System.out.print(playerNum);
        current = players[playerNum];
        if (current.isComputer()) {
            compterTurn();
            altPlayer();
        }


    }
    
    /**
     * main entry point of the game
     * javac -cp "lab2.jar:." Gomoku.java
     * @param args can be computer, x or just x
     */
    public static void main(String[] args) {
        //getting out of main to call non static methods
        if (args.length == 0) {
//          System.out.print(args.length);
            new GomokuGUI ( new Gomoku() );
        } else {
            new GomokuGUI ( new Gomoku(args[0]) );
        }
        
    }
    
    @Override
    public Outcome doClick(int row, int col) {
        
        //System.out.print(current.getSymbol());
        
        // Make sure the square is not filled
        if (moves[row][col] == Square.EMPTY) {
            moves[row][col] = current.getSymbol();
//          System.out.println(row+ ", " + col);
            createBoardString();
        }else{
            // not recreating the string only logging it
            System.out.println("filled");
        }
        
        // Check for win
        if (isWin()) {
//          currentPlayer.toChar();
             winner = current;
            return winner.getOutcome();
        } else{
            altPlayer();
        }
        

        if (current.isComputer()) {
             
            compterTurn();
            
            if (isWin()) {
                 winner = current;
                return winner.getOutcome();
            }else{
                //alternate players
                altPlayer();    
            }
        }
        

        
        // return the outcome of the game
        return GomokuModel.Outcome.GAME_NOT_OVER;
    }

    // TODO add init fn 
    @Override
    public void newGame() {
        // in order to keep everything cleaner Create a Player player1 player2
        if (winner != null){
            current = winner;
            


            // Create a new empty array
            initMovesArray();
            // create board string
            createBoardString();
            if (current.isComputer()) {
                compterTurn();
                altPlayer();
            }
        } else{
            
            // Create a new empty array
            initMovesArray();
            // create board string
            createBoardString();    
        }
        
    }
    
    /**
     * returns a string that represents the board
     */
    @Override
    public String boardString() {
        return sb.toString();

    }
    
    /* Visually inspect how to check for a win
     *                  TABLE 1
     *                      [x,y]  [x,y]  [x,y]
     * 1) rightward         [3,3], [4,3], [5,3]
     * 2) downward          [3,3], [3,4], [3,5]
     * 3) right-diagonal    [3,3], [4,4], [5,5]
     * 4) left-diagonal     [3,3], [2,4], [1,5]
     */
    private boolean rDiagonal(int r, int c){
        Square _sq = moves[r][c];
        int w = 0;
        //increment in both col and row see TABLE 1
        for (int x = c, y = r; x < GomokuModel.NUM_HSQUARES && y < GomokuModel.NUM_VSQUARES; x++,y++) {
            if (_sq.toChar() == moves[y][x].toChar()) {
                w++;
            } else {
                break;
            }
        }
        
        return (w >= GomokuModel.SQUARES_IN_LINE_FOR_WIN);
        
    }
    
    private boolean lDiagonal(int r, int c){
        Square _sq = moves[r][c];
        int w = 0;
        
        // there is no need to check out of the board or wrap
        if(r == 0 || c == 0) { return false; }
//      System.out.println(r + ' ' + c);
        //check diag.
        for (int x = c, y = r; x < GomokuModel.NUM_HSQUARES && y < GomokuModel.NUM_VSQUARES; x--,y++) {
            if (_sq.toChar() == moves[y][x].toChar()) {
                w++;
            } else {
                break;
            }
        }
        
        return (w >= GomokuModel.SQUARES_IN_LINE_FOR_WIN);
        
    }

    private boolean rightward(int r, int c){
        Square _sq = moves[r][c];
        int w = 0;
        //we only want to increment the column and search from that col. onwards
        for (int i = c; i < GomokuModel.NUM_HSQUARES; i++) {
            if (_sq.toChar() == moves[r][i].toChar()) {
                w++;
            } else {
                break;
            }
        }
        
        return (w >= GomokuModel.SQUARES_IN_LINE_FOR_WIN);
        
    }

    private boolean downward(int r, int c){
        Square _sq = moves[r][c];
        int w = 0;
        for (int i = r; i < GomokuModel.NUM_VSQUARES; i++) {
            if (_sq.toChar() == moves[i][c].toChar()) {
                w++;
            } else {
                break;
            }
        }
        
        return (w >= GomokuModel.SQUARES_IN_LINE_FOR_WIN);
        
    }
    /**
     * this checks for a win and returns if a win was detected.
     * works by scanning the board top down, when a non-empty square found it looks in all directions.
     * @return true if win detected
     * 
     */
    private boolean isWin(){
        for (int i = 0; i < GomokuModel.NUM_VSQUARES; i++) {
            for (int j = 0; j < GomokuModel.NUM_HSQUARES; j++) {
                if (moves[i][j].toChar() != Square.EMPTY.toChar()) {
                    if (downward(i, j) || rightward(i, j) || lDiagonal(i, j) || rDiagonal(i, j)) {
                        System.out.println("win");
                        return true;
                    }   
                } 
                
            }
        }

        return false;
        
    }
    /**
     * This initializes the board string based on the 
     * <code>GomokuModel.NUM_VSQUARES</code> and <code>GomokuModel.NUM_HSQUARES</code>.
     * Rather than a straight concat this uses the a StringBuilder.
     */
    private void createBoardString(){
        StringBuilder _sb = new StringBuilder();
        
        for (int i = 0; i < GomokuModel.NUM_VSQUARES; i++) {
            for (int j = 0; j < GomokuModel.NUM_HSQUARES; j++) {
                // getting the char value of square, then append using string builder.
                _sb.append(moves[i][j].toChar()); 
            }
        }
        sb = _sb;
    }
        
    /**
     * This initializes a 2d array with <code>Square.EMPTY</code>.
     */
    private void initMovesArray() {
        // Creating new array and filling it with empty values
        moves = new Square[GomokuModel.NUM_VSQUARES][GomokuModel.NUM_HSQUARES];
        
        for (int i = 0; i < GomokuModel.NUM_VSQUARES; i++) {
            for (int j = 0; j < GomokuModel.NUM_HSQUARES; j++) {
                moves[i][j] = Square.EMPTY;
            }
        }
    }
    
    private void altPlayer(){
        //alternate players
        if (playerNum == 0) { 
            current = players[++playerNum];
        } else{ 
            current = players[--playerNum]; 
        }
        
    }
    
    private void compterTurn(){
        int [] mv = new ComputerAI(moves).getMove(); // calling ai, setting the board, & getting a move
        moves[mv[0]][mv[1]] = current.getSymbol(); // add to board
        // System.out.print(mv[0]+ " " + mv[1]);
        createBoardString(); //update the board 
    }
}
