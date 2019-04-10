package ly_thuyet_do_thi_3_saving;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;

public class UndiretedGraph extends GraphTheory {
	int[][] matrix = null;
	int numVex;
	private BufferedReader br;
	boolean[] visited;

	// khoi tao matrix
	public UndiretedGraph() {

	}

	/*
	 * // khoi tao matrix dang nhap vao dinh public UndiretedGraph(int numVex) {
	 * this.numVex = numVex; this.matrix = new int[numVex][numVex]; }
	 */
	// doc matran tu file
	@Override
	public int[][] readMatrix(File fileName) {
		String line;
		matrix = null;
		int row = 0; // so_dong
		int vex = 0; // so_dinh_cua_do_thi
		int count = 0;// đếm_số_dòng_đã_đọc_dòng_đầu_tiên_là_số_đỉnh
		try {
			br = new BufferedReader(new FileReader(fileName));
			try {

				while ((line = br.readLine()) != null) {
					count++;
					if (count == 1) {// số_đỉnh_của_đồ_thị
						vex = Integer.parseInt(line);
						matrix = new int[vex][vex];
					} else {// matrix
						String[] elements = line.split(" ");
						for (int col = 0; col < vex; col++) {// lấy_từng_phần_tử_gán_vào_matrix
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

	@Override
	public int[][] readIncidenceMatrix(File fileName) {

		return null;
	}

	// in matrix
	@Override
	public void printGraph(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%2d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	// them vao matrix mot canh
	@Override
	public void addEgdes(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 1;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	/*
	 * // lay kich thuoc matrix public int size() { return this.matrix.length; }
	 */

	// xoa bo mot canh
	@Override
	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// tinh bac cua mot dinh bat ky
	public int degreeVex(int vex) throws Exception {
		if (matrix.length == 0) {
			throw new Exception("Matrix chưa được tạo");
		}
		int degreeVex = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			degreeVex += matrix[vex][i];
		}
		return degreeVex;
	}

	// tinh tong bac cua do thi
	@Override
	public int degreeGraph() throws Exception {
		int degreeG = 0;
		for (int i = 0; i < matrix.length; i++) {
			degreeG += degreeVex(i);
		}
		return degreeG;
	}

	// tinh so canh cua do thi
	@Override
	public int numEdges() throws Exception {
		if (matrix.length == 0) {
			throw new Exception("Matrix chưa được tạo");
		}
		int temp = 0;
		temp = degreeGraph() / 2;
		return temp;
	}

	@Override
	public boolean isConnected() {// tim_kiem_theo_chieu_sau
		int i = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(i);
		visited = new boolean[matrix.length];
		while (!stack.empty()) {
			i = stack.pop();
			visited[i] = true;
			for (int j = 0; j < matrix.length; j++) {
				if (!visited[j] && matrix[i][j] > 0) {
					stack.push(j);
				}
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			if (!visited[j]) {
				return false;
			}
		}
		return true;
	}

	public boolean isConnected1(int vex) {// duyet_theo_chieu_sau
		Stack<Integer> stack = new Stack<>();
		stack.push(vex);
		visited = new boolean[matrix.length];
		while (!stack.empty()) {
			vex = stack.pop();
			visited[vex] = true;
			for (int j = 0; j < matrix.length; j++) {
				if (!visited[j] && matrix[vex][j] > 0) {
					stack.push(j);
				}
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			if (!visited[j]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int countConnected() {
		int countConnected = 1;
		for (int i = 0; i < matrix.length; i++) {
			if (visited[i] == false) {
				countConnected++;
				isConnected1(i);
			}
		}
		return countConnected;
	}

}