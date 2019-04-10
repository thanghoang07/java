package ga_demo;

import java.util.*;

public class BoardState {
	int conflicts;// do thich nghi
	int[] queens;// vi tri cac con hau tren ban co

	public BoardState(int size) {
		queens = new int[size];
		populateQueens(size);
		conflicts = pairsHeuristic();
	}

	public BoardState(int[] queens) {
		this.queens = Arrays.copyOf(queens, queens.length);
		conflicts = pairsHeuristic();
	}

	// Tao vi tri cac con hau tren ban co
	public void populateQueens(int size) {
		for (int i = 0; i < size; i++) {
			queens[i] = i;
		}
	}

	// Ham danh gia do thich nghi
	public int pairsHeuristic() {
		int pairs = 0;
		for (int i = 0; i < queens.length; i++) {
			for (int j = i + 1; j < queens.length; j++) {
				// dong , cot va duong cheo
				if ((queens[i] == queens[j]) || (Math.abs(i - j) == Math.abs(queens[i] - queens[j])))
					pairs++;
			}
		}
		return pairs;
	}

	// Tim vi tri di chuyen tot nhat
	public BoardState getBestChild() {
		int min = conflicts;
		BoardState best = this;
		for (int i = 0; i < queens.length; i++) {
			int original = queens[i];
			for (int j = 0; j < queens.length; j++) {
				if (queens[i] != j) {
					swap(i, j);
					int temp = pairsHeuristic();

					if (temp <= min) {
						best = new BoardState(queens);
						min = temp;
					}
					swap(i, original);
					if (temp == 0) {
						break;
					}
				}
			}
		}
		return best;
	}

	public void swap(int index, int move) {
		queens[index] = move;
	}

	public void print() {
		for (int i = 0; i < queens.length; i++) {
			System.out.print(queens[i] + " ");
		}
		System.out.println();
	}

	public void printBoard() {
		for (int row = 0; row < queens.length; row++) {
			System.out.println();

			for (int i = 0; i < queens.length * 2 + 1; i++) {
				System.out.print("-");
			}
			System.out.println();

			int x = 0;
			int y = 0;

			for (int column = 0; column < queens.length; column++) {
				System.out.print("|");

				if (queens.length - 1 - queens[row] == column) {
					System.out.print("Q");
					x = queens.length - row;
					y = queens.length - queens[row];
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.print("|" + " Queen at Row:" + x + " Col:" + y);
		}
		System.out.println();

		for (int i = 0; i < queens.length * 2 + 1; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}

class ConflictsComparator implements Comparator<BoardState> {
	@Override
	public int compare(BoardState x, BoardState y) {
		return x.conflicts - y.conflicts;
	}
}