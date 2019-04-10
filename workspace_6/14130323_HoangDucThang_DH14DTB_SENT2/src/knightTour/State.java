package knightTour;

import java.util.ArrayList;

public class State {
	private int row;
	private int column;
		
	public State(int row, int columm) {
		this.row = row;
		this.column = columm;
	}

	public int getxCood() {
		return row;
	}

	public void setxCood(int xCood) {
		this.row = xCood;
	}

	public int getyCood() {
		return column;
	}

	public void setyCood(int yCood) {
		this.column = yCood;
	}

	public boolean isGoal(int[][] solution) {
		for (int i = 0; i < solution.length; i++) {
			for (int j = 0; j < solution[i].length; j++) {
				if (solution[i][j] != 1)
					return false;
			}
		}
		return true;
	}

	public ArrayList<State> getMoves(int rowSize, int columnSize) {
		ArrayList<State> output = new ArrayList<State>();
		int[] temp = new int[2];
		if (row - 2 >= 0 && column - 1 >= 0) {
			temp[0] = row - 2;
			temp[1] = column - 1;
			// qua trai va len tren
			output.add(new State(temp[0], temp[1]));
		}
		if (row - 2 >= 0 && column + 1 < columnSize) {
			temp[0] = row - 2;
			temp[1] = column + 1;
			// qua trai va xuong duoi
			output.add(new State(temp[0], temp[1]));
		}
		if (row + 2 < rowSize && column - 1 >= 0) {
			temp[0] = row + 2;
			temp[1] = column - 1;
			// qua phai va len tren
			output.add(new State(temp[0], temp[1]));
		}
		if (row + 2 < rowSize && column + 1 < columnSize) {
			temp[0] = row + 2;
			temp[1] = column + 1;
			// qua phai va xuong duoi
			output.add(new State(temp[0], temp[1]));
		}

		if (row - 1 >= 0 && column + 2 < columnSize) {
			temp[0] = row - 1;
			temp[1] = column + 2;
			// xuong duoi va qua trai
			output.add(new State(temp[0], temp[1]));
		}
		if (row - 1 >= 0 && column - 2 >= 0) {
			temp[0] = row - 1;
			temp[1] = column - 2;
			// len tren va qua trai
			output.add(new State(temp[0], temp[1]));
		}
		if (row + 1 < rowSize && column + 2 < columnSize) {
			temp[0] = row + 1;
			temp[1] = column + 2;
			// xuong duoi va qua phai
			output.add(new State(temp[0], temp[1]));
		}
		if (row + 1 < rowSize && column - 2 >= 0) {
			temp[0] = row + 1;
			temp[1] = column - 2;
			// len tren va qua phai
			output.add(new State(temp[0], temp[1]));
		}
		return output;
	}
}
