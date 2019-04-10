package khac;

public class QueenTest extends Queen{
private static int lowest;
public static void main(String[] args) {
    Queen q = new Queen();

    int nextRow = 0;
    int nextCol = 0;
    
    lowest = q.getAccessibility(nextRow, nextCol);
    int remaining = q.getRemainingSquares();
    while (remaining != 0) {

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (q.testSquare(row, col)) {
                    lowest = q.getAccessibility(row, col);
                    nextRow = row;
                    nextCol = col;
                    col = 8;
                    row = 8;
                }
            }
        }

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (q.getAccessibility(row, col) > 0 
                		&& q.getAccessibility(row, col) <= lowest) {
                    lowest = q.getAccessibility(row, col);
                    nextRow = row;
                    nextCol = col;
                }
            }
        }

        q.placeQueen(nextRow, nextCol);

        remaining = q.getRemainingSquares();
        System.out.printf("queen placed at %d, %d\n", nextRow, nextCol);
    }

    q.displayBoard();
}}
