package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;

public class DirectedGraph extends Graph {

	int numVex;
	int[][] matrix;

	public DirectedGraph() {
	}

	public DirectedGraph(int numVex) {
		this.numVex = numVex;
		this.matrix = new int[numVex][numVex];
	}

	@Override
	public int[][] readMatrix(File fileName) {
		String line;
		BufferedReader br;
		int row = 0; // so_dong
		int vex = 0; // so_dinh_cua_do_thi
		int count = 0;// Ä‘áº¿m_sá»‘_dÃ²ng_Ä‘Ã£_Ä‘á»c_dÃ²ng_Ä‘áº§u_tiÃªn_lÃ _sá»‘_Ä‘á»‰nh
		try {
			br = new BufferedReader(new FileReader(fileName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					if (count == 1) {// sá»‘_Ä‘á»‰nh_cá»§a_Ä‘á»“_thá»‹
						vex = Integer.parseInt(line);
						matrix = new int[vex][vex];
					} else {// matrix
						String[] elements = line.split(" ");
						for (int col = 0; col < vex; col++) {// láº¥y_tá»«ng_pháº§n_tá»­_gÃ¡n_vÃ o_matrix
							matrix[row][col] = Integer.parseInt(elements[col]);
						}
						row++;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return matrix;
	}


	public void addEdges(int src, int dest) {
		if (src >= 0 && dest >= 0)
			matrix[src][dest] = 1;
		else
			System.out.println("Error!!!");

	}

	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
		}

	}

	// tinh nua bac trong cua 1 dinh duyet theo cot
	public int deg_in(int ver) {
		int din = 0;
		for (int i = 0; i < matrix[ver].length; i++) {
			din += matrix[i][ver];
		}
		return din;
	}

	// tinh nua bac ngoai cua 1 dinh duyet theo cot
	public int deg_out(int ver) {
		int dout = 0;
		for (int i = 0; i < matrix[ver].length; i++) {
			dout += matrix[ver][i];
		}
		return dout;
	}

	public int degreeVertices(int ver) {
		int degreeVex = 0;
		for (int i = 0; i < matrix[ver].length; i++) {
			degreeVex += matrix[ver][i];
		}
		return degreeVex;
	}

	// tinh tong bac cua do thi
	public int degreeGraph() {
		int sumDeg = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumDeg += deg_out(i);
		}
		return sumDeg;
	}

	// tinh so cung cua ma tran co huong
	public int numEdge() {
		int tmp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				tmp += matrix[i][j];
			}
		}
		return tmp;
	}

	public boolean isConnected() {
		int i = 0;
		boolean[] visited = new boolean[matrix.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(i);
		while (!stack.empty()) {
			i = stack.pop();
			visited[i] = true;
			for (int j = 0; j < matrix.length; j++) {
				if (!visited[j] && matrix[i][j] > 0) {
					stack.push(j);
				}
			}
		}
		for (int j = 0; j < visited.length; j++) {
			if (!visited[j])
				return false;
		}
		return true;
	}

	public void viewGraph(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
