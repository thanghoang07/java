package demo;

import java.util.*;

public class BoardState implements Comparable<BoardState> {
	private final int qCount; // So con hau
	public Queen[] queenPosition; // Vi tri cac con Hau tren ban co
	public ArrayList<BoardState> successorBoards;// Danh sach nhung con Hau lan
													// can
	private int heuristicValue; // tinh do do (So vi tri cac con hau co the tan
								// cong nhau)

	public BoardState(int queens) {
		successorBoards = new ArrayList<BoardState>();// Danh sach nhung con Hau
														// lan can la rong
		qCount = queens;
		queenPosition = new Queen[qCount];// khoi tao rong
	}

	// Dua tren khoi tao ban dau khoi tao ban co
	public BoardState(BoardState board, int queens) {
		successorBoards = new ArrayList<BoardState>();
		qCount = queens;
		queenPosition = new Queen[qCount];
		// Khoi tai vi tri con Hau
		for (int i = 0; i < qCount; i++) {
			int row = board.queenPosition[i].getposRow();
			int col = board.queenPosition[i].getposCol();
			queenPosition[i] = new Queen(row, col);
		}

		heuristicValue = 0;
	}

	// Chon con Hau tiep theo tren ban co theo dung heuristics (no phu thuoc vao
	// trang that ban dau)
	public ArrayList<BoardState> generateNeighbours(BoardState initialBoard) {
		int count = 0;// index counter for the current board successors
		for (int i = 0; i < qCount; i++) {
			for (int j = 1; j < qCount; j++) {
				BoardState st = new BoardState(initialBoard, qCount);
				successorBoards.add(count, st);
				successorBoards.get(count).queenPosition[i].shiftQueen(j, qCount);
				// Tinh lai gia tri ham muc tieu
				successorBoards.get(count).heuristicEvaluation();
				count++;
			}
		}

		return successorBoards;
	}

	// So duong con Hau bi tan cong
	public int heuristicEvaluation() {
		for (int i = 0; i < qCount - 1; i++) {
			for (int j = i + 1; j < qCount; j++) {
				// vi tri an nhau giua 2 con hau
				if (queenPosition[i].canAttack(queenPosition[j])) {
					heuristicValue++;
				}
			}
		}

		return heuristicValue;
	}

	public int getheuristicValue() {
		return heuristicValue;
	}

	// So sanh do thich nghi
	public int compareTo(BoardState board) {
		if (this.heuristicValue < board.getheuristicValue())
			return -1;
		else if (this.heuristicValue > board.getheuristicValue())
			return 1;
		else
			return 0;
	}

	// thay doi vi tri con co tren ban co
	public void setqueenPosition(Queen[] state) {
		for (int i = 0; i < qCount; i++) {
			int row = state[i].getposRow();
			int col = state[i].getposCol();
			queenPosition[i] = new Queen(row, col);
		}
	}

	public Queen[] getqueenPosition() {
		return queenPosition;
	}

	public String toString() {
		String[][] chessboard = new String[qCount][qCount];
		String output = "";
		// Ban dau cac vi tri tren ban co la 0
		for (int i = 0; i < qCount; i++)
			for (int j = 0; j < qCount; j++)
				chessboard[i][j] = "0";

		// Dat quan Hau len ban co
		for (int i = 0; i < qCount; i++) {
			// Vi tri nhung quan co neu thoa man do thich nghi, hien thi "X"
			int row = queenPosition[i].getposRow();
			int col = queenPosition[i].getposCol();
			chessboard[row][col] = "X";
		}

		// Xuat ra man hinh
		for (int i = 0; i < qCount; i++) {
			for (int j = 0; j < qCount; j++) {
				output += " " + chessboard[i][j];
			}
			output += "\n";
		}

		return output;
	}
}
