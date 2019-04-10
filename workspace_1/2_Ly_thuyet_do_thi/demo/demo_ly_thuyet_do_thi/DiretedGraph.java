package demo_ly_thuyet_do_thi;

import java.util.Stack;

public class DiretedGraph extends Graph {

	public void addMatrix(int col, int row) {
		matrix[col][row]++;
	}

	public int deg(int col) {
		return inDeg(col);
	}

	public int canh() {
		int temp = 0;
		for (int i = 0; i < this.size(); i++) {
			temp += inDeg(i);
		}
		return temp;
	}

	public int outDeg(int col) {
		int temp = 0;
		for (int i = 0; i < this.size(); i++) {
			temp += matrix[col][i];
		}
		return temp;
	}

	public int inDeg(int col) {
		int temp = 0;
		for (int i = 0; i < this.size(); i++) {
			temp += matrix[i][col];
		}
		return temp;
	}

	public void printMatrix() {
		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int size() {
		return this.matrix.length;
	}

	public boolean isConnected() {
		boolean[][] visted = new boolean[size()][size()];
		for (int j = 0; j < size(); j++) {
			for (int i = 0; i < size(); i++) {
				if (visted[i][j] == false) {
					if (!checkConnect(j, i) && !checkConnect(i, j))
						return false;
					visted[i][j] = true;
					visted[j][i] = true;
				}
			}
		}
		return true;

	}

	public boolean isStrongConnected() {
		for (int j = 0; j < size(); j++) {
			for (int i = 0; i < size(); i++) {

				if (!checkConnect(j, i))
					return false;
			}
		}

		return true;
	}

	public boolean isWeakConnected() {
		if (!isStrongConnected() && isConnected())
			return true;

		else
			return false;
	}

	public boolean checkConnect(int a, int b) {
		boolean connect = false;
		if (matrix[a][b] > 0)
			return true;
		else {
			try {
				Stack<Integer> stack = new Stack<Integer>();
				for (int i = 0; i < size(); i++) {
					if (matrix[a][i] > 0 && i != a)
						stack.add(i);
				}
				while (stack.size() != 0) {
					connect = checkConnect(stack.pop(), b);
					if (connect == true)
						return true;
				}

			} catch (StackOverflowError e) {
				return false;

			}

		}

		return connect;

	}

	@Override
	public boolean isEuler() {
		if (!isConnected() || inDeg(this.size()) != outDeg(this.size())) {
			return false;
		}
		return true;
	}

	@Override
	public void removeCanh(int i, int j) {
		this.matrix[i][j]--;
	}

	@Override
	public void printEuler() {

	}

	@Override
	public boolean isTree() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int doLechTam() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isConnected_1() {
		// TODO Auto-generated method stub
		return false;
	}

}
