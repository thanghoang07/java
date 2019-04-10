package knightTour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Horse {
	private int startX, startY;
	private int xSize, ySize;
	private static int[][] solution;
	int count = 1;

	public Horse(int xSize, int ySize, int startX, int startY) {
		this.xSize = xSize;
		this.ySize = ySize;
		this.startX = startX;
		this.startY = startY;

		solution = new int[ySize][xSize];
		for (int i = 0; i < solution.length; i++) {
			for (int j = 0; j < solution.length; j++) {
				solution[i][j] = 0; // vi tri chua di qua
			}
		}
		solution[startY][startX] = 1; // di qua roi
	}

	public State breadthFirstSearch(State initState) {
		Queue<State> frontier = new LinkedList<State>(); // Queue chua trang thai dong
		frontier.add(initState); // them vao
		while (true) {
			if (frontier.isEmpty()) {// kiem tra rong
				return null;
			}
			State state = frontier.poll();// lay trang thai ra
			if (solution[state.getyCood()][state.getxCood()] != 1) { // toa do do chua duoc di
				solution[state.getyCood()][state.getxCood()] = 1; // danh dau toa do da duoc di
				count++; // tang bien dem so buoc len 
				System.out.println("Danh dau vi tri ngua tai [" + state.getxCood() + "," + state.getyCood()
						+ "] \nVa so buoc: " + count);
				printSolution();
				System.out.println();

			}

			ArrayList<State> successors = state.getMoves(xSize, ySize); // mang chua tat ca trang thai
			for (State child : successors) { // duyet
				if (!frontier.contains(child)) { //kiem tra 
					if (child.isGoal(solution)) { // neu no laf dich thi tra ve trang thai dich
						return child;
					}
					// ko thi them vao frontier
					frontier.add(child);
				}
			}
		}
	}

	public void printSolution() {
		for (int i = 0; i < solution.length; i++) {
			System.out.print(" |");
			for (int j = 0; j < solution.length; j++) {
				System.out.print(solution[i][j] + "|");
			}
			System.out.println();
		}
	}

	// public static boolean dfs(int depth, State board, int row, int column) {
	// ArrayList<int[]> moves = new ArrayList<int[]>();
	// boolean done = false;
	//
	// board.board[row][column] = true;
	//
	// int[] temp = new int[2];
	// temp[0] = row;
	// temp[1] = column;
	// board.moves.push(temp);
	//
	// System.out.println("KT: " + row + " ==>> " + column);
	// if (depth < 64) {
	// moves = board.getMoves(row, column);
	// int i = 0;
	// while (i < moves.size() - 1 && !done) {
	// if (!board.board[moves.get(i)[0]][moves.get(i)[1]])
	// done = dfs(depth + 1, board, moves.get(i)[0], moves.get(i)[1]);
	// i++;
	// }
	// if (!done) {
	// board.moves.pop();
	// board.board[row][column] = false;
	// }
	// } else
	// done = true;
	//
	// return done;
	// }
}
