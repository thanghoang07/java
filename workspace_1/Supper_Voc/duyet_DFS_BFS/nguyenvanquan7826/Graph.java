package nguyenvanquan7826;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ----------------- @author nguyenvanquan7826 -----------------
 * ---------------nguyenvanquan7826.wordpress.com --------------
 */
public class Graph {

	private int numberPoint;
	private ArrayList<Integer> listPoint;
	private int matrix[][];
	private boolean[] visit;
	private int[] back;
	private ArrayList<Integer> listVisit;

	public void DFS1(int i) {
		Stack<Integer> stack = new Stack<Integer>();
		visit = new boolean[numberPoint];
		visit[i] = true;
		stack.push(i);
		while (!stack.empty()) {
			i = stack.peek();
			stack.pop();
			listVisit.add(i);
			for (int j = 0; j < numberPoint; j++) {
				if (matrix[i][j] > 0) {
					if (!visit[j]) {
						visit[j] = true;
						back[j] = i;
						stack.push(j);
					}
				}
			}
		}
	}

	public void DFS(int i) {
		visit[i] = true;
		listVisit.add(i);
		for (int j = 0; j < listPoint.size(); j++) {
			if (matrix[i][j] > 0) {
				if (!visit[j]) {
					back[j] = i;
					DFS(j);
				}
			}
		}
	}

	public void BFS(int i) {
		ArrayList<Integer> queue = new ArrayList<Integer>();
		visit[i] = true;
		queue.add(0, i);
		while (queue.size() > 0) {
			i = queue.get(queue.size() - 1);
			queue.remove(queue.size() - 1);
			listVisit.add(i);
			for (int j = 0; j < listPoint.size(); j++) {
				if (matrix[i][j] > 0) {
					if (!visit[j]) {
						visit[j] = true;
						back[j] = i;
						queue.add(0, j);
					}
				}
			}
		}
	}

	// --------- init value --------- //
	public void initValue() {
		initListPoint();
		initListVisit();
		initMatrix();
	}

	private void initListPoint() {
		listPoint = new ArrayList<Integer>();
		for (int i = 0; i < numberPoint; i++) {
			listPoint.add(i);
		}
	}

	public void initVisit() {
		visit = new boolean[numberPoint];
		back = new int[numberPoint];
	}

	public void initListVisit() {
		listVisit = new ArrayList<Integer>();
	}

	private void initMatrix() {
		matrix = new int[numberPoint][numberPoint];
	}

	public String toStringListPoint(int type) {
		String string = "";
		String temp = ", ";
		ArrayList<Integer> list = listPoint;
		if (type == 1) {
			temp = " -> ";
			list = listVisit;
		}
		for (int i = 0; i < list.size(); i++) {
			string += list.get(i) + 1;
			if (i < list.size() - 1) {
				string += temp;
			}
		}
		return string;
	}

	public void showMatrix() {
		for (int i = 0; i < numberPoint; i++) {
			for (int j = 0; j < numberPoint; j++) {
				System.out.print(String.format("%3d", matrix[i][j]));
			}
			System.out.println();
		}
	}

	// --------- getter - setter --------- //
	public int getNumberPoint() {
		return numberPoint;
	}

	public void setNumberPoint(int numberPoint) {
		this.numberPoint = numberPoint;
	}

	public ArrayList<Integer> getListPoint() {
		return listPoint;
	}

	public void setListPoint(ArrayList<Integer> listPoint) {
		this.listPoint = listPoint;
	}

	public ArrayList<Integer> getListVisit() {
		return listVisit;
	}

	public void setListVisit(ArrayList<Integer> listVisit) {
		this.listVisit = listVisit;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public boolean[] getVisit() {
		return visit;
	}

	public void setVisit(boolean[] visit) {
		this.visit = visit;
	}

	public int[] getBack() {
		return back;
	}

	public void setBack(int[] back) {
		this.back = back;
	}
}
