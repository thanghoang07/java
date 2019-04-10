package demo_ly_thuyet_do_thi;

import java.util.Stack;

public class UndiretedGraph extends Graph {

	public void addMatrix(int col, int row) {
		matrix[col][row]++;
		matrix[row][col]++;
	}

	// tính bậc của đỉnh
	public int deg(int col) {
		int temp = 0;
		for (int i = 0; i < size(); i++) {
			temp += matrix[col][i];
		}
		return temp;
	}

	public int canh() {
		int temp = 0;
		for (int i = 0; i < size(); i++) {
			temp += deg(i);
		}
		return temp / 2;
	}

	public void printMatrix() {
		for (int i = 0; i < this.size(); i++) {
			for (int j = 0; j < this.size(); j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int size() {
		return this.matrix.length;
	}

	// kiểm tra liên thông
	public boolean isConnected() {
		boolean[][] visted = new boolean[size()][size()];
		for (int j = 0; j < size(); j++) {
			for (int i = 0; i < size(); i++) {
				if (visted[i][j] == false) {
					if (!checkConnect(j, i))
						return false;
					visted[i][j] = true;
					visted[j][i] = true;
				}
			}
		}

		return true;

	}

	public boolean checkConnect(int a, int b) {
		boolean connect = false;
		if (matrix[a][b] > 0)
			return true;
		else {
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
		}

		return connect;

	}

	public void printEuler() {

	}

	public void prinCycle(int a) {
		if (isEuler()) {
			int[][] arr = matrix;
			String out = eulerCycle(a, a, arr);
			if (out != null)
				System.out.println(out);
			else
				System.out.println("khong co chu trinh");
		}

	}

	public String eulerCycle(int i, int k, int[][] arr) {
		String out = new String();
		Stack<Integer> stack = new Stack<Integer>();
		for (int j = 0; j < size(); j++) {
			if (arr[i][j] > 0) {
				if (j == k)
					return null;
				stack.add(j);
				arr[i][j] = 0;
				arr[j][i] = 0;
			}
			if (stack.size() == 0)
				return null;
			else
				out += i;
			while (stack.size() > 0) {
				out += eulerCycle(stack.pop(), k, arr);
			}

		}

		return out;
	}

	public boolean isEuler() {
		for (int i = 0; i < size(); i++) {
			if (!bacChan(i))
				return false;
		}
		return true;

	}

	public boolean bacChan(int i) {
		int bac = 0;
		for (int j = 0; j < size(); j++) {
			bac += matrix[i][j];
		}
		if (bac % 2 == 0)
			return true;
		else
			return false;
	}

	//
	@Override
	public void removeCanh(int i, int j) {
		this.matrix[i][j]--;
		this.matrix[j][i]--;
	}

	@Override
	public boolean isTree() {
		if (isConnected() || size() == (canh() - 1)) {
			return false;
		}
		return true;
	}

	@Override
	public int doLechTam() {
		return 0;
	}

	@Override
	public boolean isConnected_1() {
		int i = 0;
		boolean[] visited = new boolean[this.size()];
		Stack<Integer> stack = new Stack<>();
		stack.push(i);
		while (!stack.empty()) {
			i = stack.pop();
			visited[i] = true;
			for (int j = 0; j < this.size(); j++) {
				if (!visited[j] && matrix[i][j] > 0) {
					stack.push(j);
				}
			}
			for (int j = 0; j < this.size(); j++) {
				if (!visited[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
