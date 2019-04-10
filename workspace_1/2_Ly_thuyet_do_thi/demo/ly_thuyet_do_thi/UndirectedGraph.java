package ly_thuyet_do_thi;

import java.util.Stack;

public class UndirectedGraph extends GraphTheory {

	@Override
	public boolean isConnected() {
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	// tính bậc của đỉnh
	public int deg(int col) {
		int temp = 0;
		for (int i = 0; i < size(); i++) {
			temp += matrix[col][i];
		}
		return temp;
	}

	@Override
	public int canh() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printMatrix() {
		// TODO Auto-generated method stub

	}

}
