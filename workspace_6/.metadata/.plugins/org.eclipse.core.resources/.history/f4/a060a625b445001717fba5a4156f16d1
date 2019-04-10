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

    public static Pair search(GameState game) {
        if (game.getCurrentPlayer() == Player.BLACK) {
            return maxValue(game, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        } else {
            return minValue(game, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }
    }
    
    public static Pair maxValue(GameState game, int alpha, int beta, int depth) {
     //   System.out.println("may di");
        int value = Integer.MIN_VALUE;
        if (isCutOff(game, depth)) {
            return evaluateState(game);
        }
        ArrayList<Square> successors = game.getSuccessors();
        ArrayList<Pair> successorSort = new ArrayList<Pair>();
        for (Square square : successors) {
            game.addSquare(square);
            int f = Function.evaluate(game, game.getCurrentPlayer().getOpponent());
            successorSort.add(new Pair(square, f));
            game.removeSquare(square);
        }
        Collections.sort(successorSort);
        Square bestMove = null;
        for (Pair pair : successorSort) {
            cnt++;
            Square square = pair.getSquare();
            game.addSquare(square);
            Pair tryMove = minValue(game, alpha, beta, depth + 1);
            if (value < tryMove.getValue()) {
                value = tryMove.getValue();
                bestMove = square;
            }
            if (value >= beta) {
                game.removeSquare(square);
                return new Pair(bestMove, value);
            }
            alpha = Math.max(alpha, value);
            game.removeSquare(square);
        }
        return new Pair(bestMove, value);
    }
   
    public static Pair minValue(GameState game, int alpha, int beta, int depth) {
        int value = Integer.MAX_VALUE;
        if (isCutOff(game, depth)) {
            return evaluateState(game);
        }
        ArrayList<Square> successors = game.getSuccessors();
        ArrayList<Pair> successorSort = new ArrayList<Pair>();
        for (Square square : successors) {
            game.addSquare(square);

            int f = Function.evaluate(game, game.getCurrentPlayer().getOpponent());
            successorSort.add(new Pair(square, f));
            game.removeSquare(square);
        }
        Collections.sort(successorSort);
        Square bestMove = null;
        for (Pair pair : successorSort) {
            Square square = pair.getSquare();
            cnt++;
            game.addSquare(square);
            Pair tryMove = maxValue(game, alpha, beta, depth + 1);
            if (value > tryMove.getValue()) {
                value = tryMove.getValue();
                bestMove = square;
            }
            if (value <= alpha) {
                game.removeSquare(square);
                return new Pair(bestMove, value);
            }
            beta = Math.min(beta, value);
            game.removeSquare(square);
        }
        return new Pair(bestMove, value);
    }

    public static boolean isCutOff(GameState game, int depth) {
        if (depth == MAXDEPTH) {
            return true;
        }
        ArrayList<Square> successors = game.getSuccessors();
        if (successors.size() == 0) {
            return true;
        }
        if (Function.evaluate(game, Player.BLACK) >= 10000 || Function.evaluate(game, Player.WHITE) >= 10000) {
            return true;
        }
        return false;
    }

    public static Pair evaluateState(GameState game) {
        int black = Function.evaluate(game, Player.BLACK);
        int white = Function.evaluate(game, Player.WHITE);
        if (game.getCurrentPlayer() == Player.BLACK) {
            black *= 2;
        } else {
            white *= 2;
        }
        return new Pair(null, black - white);
    }
}
