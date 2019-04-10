package ai;

import java.util.ArrayList;
import java.util.Collections;

import caro.GameState;
import caro.Pair;
import caro.Player;
import caro.Square;
import util.Function;

public class AlphaBetaPrunning {

    public static int cnt = 0;
    public static final int MAXDEPTH = 3;

    public static Pair searchAB(GameState boardGame) {
        if (boardGame.getCurrentPlayer() == Player.AI) {
            return maxValue(boardGame, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        } else {
            return minValue(boardGame, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }
    }
    
    public static Pair maxValue(GameState boardGame, int alpha, int beta, int depth) {
        int value = Integer.MIN_VALUE;
        if (isCutOff(boardGame, depth)) { //cat tia
            return evaluateState(boardGame);
        }
        ArrayList<Square> successors = boardGame.getSuccessors();
        ArrayList<Pair> successorSort = new ArrayList<Pair>();
        for (Square square : successors) {
            boardGame.addSquare(square);
            int f = Function.evaluate(boardGame, boardGame.getCurrentPlayer().getOpponent());
            successorSort.add(new Pair(square, f));
            boardGame.removeSquare(square);
        }
        //
        Collections.sort(successorSort);
        Square bestMove = null;
        //
        for (Pair pair : successorSort) {
            cnt++;
            Square square = pair.getSquare();
            boardGame.addSquare(square);
            Pair tryMove = minValue(boardGame, alpha, beta, depth + 1);
            if (value < tryMove.getValue()) {
                value = tryMove.getValue();
                bestMove = square;
            }
            if (value >= beta) {
                boardGame.removeSquare(square);
                return new Pair(bestMove, value);
            }
            alpha = Math.max(alpha, value);
            boardGame.removeSquare(square);
        }
        return new Pair(bestMove, value);
    }
   
    public static Pair minValue(GameState boardGame, int alpha, int beta, int depth) {
        int value = Integer.MAX_VALUE;
        if (isCutOff(boardGame, depth)) {
            return evaluateState(boardGame);
        }
        ArrayList<Square> successors = boardGame.getSuccessors();
        ArrayList<Pair> successorSort = new ArrayList<Pair>();
        for (Square square : successors) {
            boardGame.addSquare(square);

            int f = Function.evaluate(boardGame, boardGame.getCurrentPlayer().getOpponent());
            successorSort.add(new Pair(square, f));
            boardGame.removeSquare(square);
        }
        Collections.sort(successorSort);
        Square bestMove = null;
        for (Pair pair : successorSort) {
            Square square = pair.getSquare();
            cnt++;
            boardGame.addSquare(square);
            Pair tryMove = maxValue(boardGame, alpha, beta, depth + 1);
            if (value > tryMove.getValue()) {
                value = tryMove.getValue();
                bestMove = square;
            }
            if (value <= alpha) {
                boardGame.removeSquare(square);
                return new Pair(bestMove, value);
            }
            beta = Math.min(beta, value);
            boardGame.removeSquare(square);
        }
        return new Pair(bestMove, value);
    }

    public static boolean isCutOff(GameState boardGame, int depth) {
        if (depth == MAXDEPTH) {
            return true;
        }
        ArrayList<Square> successors = boardGame.getSuccessors();
        if (successors.size() == 0) {
            return true;
        }
        if (Function.evaluate(boardGame, Player.AI) >= 10000 || Function.evaluate(boardGame, Player.HM) >= 10000) {
            return true;
        }
        return false;
    }

    public static Pair evaluateState(GameState boardGame) {
        int ai = Function.evaluate(boardGame, Player.AI);
        int hm = Function.evaluate(boardGame, Player.HM);
        if (boardGame.getCurrentPlayer() == Player.AI) {
            ai *= 2;
        } else {
            hm *= 2;
        }
        return new Pair(null, ai - hm);
    }
}
