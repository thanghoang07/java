package khac;

public class Queen {
private final int SIZE = 8;//board size
private int[][] board;//chess board
private int[]hor;//horizontal moves
private int[]ver;//vertical moves
private int eliminatedSquares;
private int remainingSquares;

public Queen () {
    //constructor initializes the board
    //initializes the moves


    board = new int[SIZE][SIZE];

    //first row
    board[0][0] = 21;
    board[0][1] = 21;
    board[0][2] = 21;
    board[0][3] = 21;
    board[0][4] = 21;
    board[0][5] = 21;
    board[0][6] = 21;
    board[0][7] = 21;
    //second row
    board[1][0] = 21;
    board[1][1] = 23;
    board[1][2] = 23;
    board[1][3] = 23;
    board[1][4] = 23;
    board[1][5] = 23;
    board[1][6] = 23;
    board[1][7] = 21;
    //third row
    board[2][0] = 21;
    board[2][1] = 23;
    board[2][2] = 25;
    board[2][3] = 25;
    board[2][4] = 25;
    board[2][5] = 25;
    board[2][6] = 23;
    board[2][7] = 21;
    //forth row
    board[3][0] = 21;
    board[3][1] = 23;
    board[3][2] = 25;
    board[3][3] = 27;
    board[3][4] = 27;
    board[3][5] = 25;
    board[3][6] = 23;
    board[3][7] = 21;
    //fifth row
    board[4][0] = 21;
    board[4][1] = 23;
    board[4][2] = 25;
    board[4][3] = 27;
    board[4][4] = 27;
    board[4][5] = 25;
    board[4][6] = 23;
    board[4][7] = 21;
    //sixth row
    board[5][0] = 21;
    board[5][1] = 23;
    board[5][2] = 25;
    board[5][3] = 25;
    board[5][4] = 25;
    board[5][5] = 25;
    board[5][6] = 23;
    board[5][7] = 21;
    //seventh row
    board[6][0] = 21;
    board[6][1] = 23;
    board[6][2] = 23;
    board[6][3] = 23;
    board[6][4] = 23;
    board[6][5] = 23;
    board[6][6] = 23;
    board[6][7] = 21;
    //eighth row
    board[7][0] = 21;
    board[7][1] = 21;
    board[7][2] = 21;
    board[7][3] = 21;
    board[7][4] = 21;
    board[7][5] = 21;
    board[7][6] = 21;
    board[7][7] = 21;

    //initializing moves
    hor = new int[SIZE];
    ver = new int[SIZE];
    //right
    hor[0] = 1;
    ver[0] = 0;
    //left
    hor[1] = -1;
    ver[1] = 0;
    //up
    hor[2] = 0;
    ver[2] = -1;
    //down
    hor[3] = 0;
    ver[3] = 1;
    //upper right
    hor[4] = 1;
    ver[4] = -1;
    //upper left
    hor[5] = -1;
    ver[5] = -1;
    //down right
    hor[6] = 1;
    ver[6] = 1;
    //down left
    hor[7] = -1;
    ver[7] = 1;

}//end constructor

public void displayBoard () {
    //displays the board

    for (int row = 0; row < board.length; row++) {
        for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] == -1) {
                System.out.printf("[%-2s]","Q");
            }
            else {
                System.out.printf("[%-2d]",board[row][col]);
            }

            if (board[row][col] == 0 || board[row][col] == -1) {
                ++eliminatedSquares;
            }
        }//end inner for
        System.out.println();
    }//end for

}//end displayBoard

public boolean possibleMove (int move, int row, int col) {
    //tests whether a move is valid

    if (move < 0 || move > 7)  {
        return false;
    }//end if
    else if (row + ver[move] < 0|| row + ver[move] > 7) {
        return false;
    }//end else if
    else if (col + hor[move] < 0|| col + hor[move] > 7) {
        return false;
    }//end else if
    else{
        return true;
    }//end else

}//end possibleMove

public void placeQueen (int row, int col) {
    //eliminates the squares attacked by the current square of the queen
    board[row][col] = -1;
    ++eliminatedSquares;
    //try the eight possible moves
    for (int move = 0; move < SIZE; move++) {
        int r = row;
        int c = col;
        while (possibleMove(move, r, c)) {
            r += ver[move];
            c += hor[move];
            if (board[r][c] != -1 && board[r][c] > 0) {
                board[r][c] = 0;
                decreaseAccessibilty(r, c);
                ++eliminatedSquares;
            }
        }//end while
    }//end for
}//placeQueen

public boolean testSquare (int row, int col) {

    if (board[row][col] > 0) {
        return true;
    }
    else {
        return false;
    }
}


public void decreaseAccessibilty (int row, int col) {
    for (int move = 0; move < SIZE; move++) {
        int r = row;
        int c = col;
        while (possibleMove(move, r, c)) {
            r += ver[move];
            c += hor[move];
            if (board[r][c] > 0) {
                board[r][c]--;
            }//end if
        }//end while
    }
}//end decrease accessibility 

public int getAccessibility (int row, int col) {
    //returns the accessibility number of a square
    return board[row][col];

}

public int getEliminatedSquares () {
    return eliminatedSquares;
}
public int getRemainingSquares () {
    remainingSquares = 64 - eliminatedSquares;
    return remainingSquares;
}   }//end Queen

