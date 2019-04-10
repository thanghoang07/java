package demo;

import java.util.ArrayList;
import java.util.Random;

public class Hill_Climbing {

	private static int qCount;// so con Hau
	private BoardState initBoard;// Trang thai ban dau cua ban co
	private Queen[] initQpos;// Vi tri con Hau tren ban co

	//
	public Hill_Climbing(int queens) {
		qCount = queens;
		// Khoi tao trang thai ban co
		initBoard = new BoardState(qCount);
		// Khoi tao mang chua vi tri cac quan Hau
		initQpos = randomBoardState();
		// thay doi vi tri con co tren ban co
		initBoard.setqueenPosition(initQpos);
		// So duong con Hau bi tan cong
		initBoard.heuristicEvaluation();

	}

	// Giai thuat Leo Doi
	public BoardState hillClimbing(BoardState present) {
		//
		int count = 0;
		while (true) {
			BoardState current = present;
			BoardState neighbor = null;
			ArrayList<BoardState> successors = current.generateNeighbours(current);
			if (current.getheuristicValue() == 0) {
				System.out.println("done");
				return current;
			}
			for (int i = 0; i < successors.size(); i++) {
				if (successors.get(i).getheuristicValue() < current.getheuristicValue()) {
					neighbor = successors.get(i);
				}
//				if (successors.get(i).compareTo(current) < 0) {
//					neighbor = successors.get(i);
//				}
			}
			current = neighbor;
			for (BoardState boardState : successors) {
				if (current.compareTo(boardState) > 0) {
					neighbor = boardState;
					count++;
				}
			}
			if (count == 0) {
				System.out.println("no");
			}
		}
	}

	// Khoi tao trang thai ban dau cua ban co
	public static Queen[] randomBoardState() {
		Queen[] queenStartpos = new Queen[qCount];
		Random rand = new Random();
		for (int col = 0; col < qCount; col++) {
			queenStartpos[col] = new Queen(rand.nextInt(qCount), col);
		}
		return queenStartpos;
	}

	public static void main(String[] args) {
		// for (int i = 0; i < 100; i++) {
		Hill_Climbing board = new Hill_Climbing(10);
		System.out.println("A\n" + board.initBoard);
		System.out.println("A\n" + board.initBoard.getheuristicValue());
		long start = System.currentTimeMillis();
		board.hillClimbing(board.initBoard);
		long stop = System.currentTimeMillis();
		System.out.println("B\n" + board.initBoard);
		System.out.println("B\n" + board.initBoard.getheuristicValue());
		// }
	}

}
