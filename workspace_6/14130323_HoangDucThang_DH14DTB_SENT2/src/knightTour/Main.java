package knightTour;

import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		int row, column, xCood = 0, yCood = 0;
		sc = new Scanner(System.in);
		System.out.println("Nhap vao so dong hoac cot cua ma tran vuong m * m: ");
		column = row = sc.nextInt();
		long ta4 = System.currentTimeMillis();
		Horse board = new Horse(row, column, xCood, yCood);
		State state = new State(xCood, yCood);

		System.out.println(
				"Danh dau vi tri ngua tai [" + state.getxCood() + "," + state.getyCood() + "] \nVa so buoc: " + 1);
		board.printSolution();
		board.breadthFirstSearch(state);
		long tb4 = System.currentTimeMillis();
		System.out.println("Duration: " + (tb4 - ta4) + " milliseconds.");
	}

}
