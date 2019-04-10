package demo;
/*package ly_thuyet_do_thi_3_saving;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;

public class DirectedGraph extends GraphTheory {
	int[][] matrix = null;
	int numVex;
	private BufferedReader br;

	@Override
	public int[][] readMatrix(File fileName) {
		String line;
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

	@Override
	public void printGraph(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%2d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

	@Override
	public void addEgdes(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 0;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	@Override
	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// bậc_vào_cuả_đỉnh_duyệt_theo_chiều_dọc_của_matrix_kề
	public int din(int vex) {
		int din = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			din += matrix[i][vex];
		}
		return din;
	}

	// bậc_ra_của_đỉnh_duyệt_theo_chiều_ngang_của_matrix_kề
	public int dout(int vex) {
		int dout = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			dout += matrix[vex][i];
		}
		return dout;
	}

	@Override
	public int degreeGraph() throws Exception {
		if (matrix.length == 0) {
			throw new Exception("Matrix chưa được tạo");
		}
		int degreeG = 0;
		for (int i = 0; i < matrix.length; i++) {
			degreeG += dout(i);
		}
		return degreeG;
	}

	@Override
	public int numEdges() throws Exception {
		if (matrix.length == 0) {
			throw new Exception("Matrix chưa được tạo");
		}
		int temp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				temp += matrix[i][j];
			}
		}
		return temp;
	}

	@Override
	public boolean isConnected() {
		int i = 0;
		boolean[] visited = new boolean[matrix.length];
		Stack<Integer> stack = new Stack<>();
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
		for (int j = 0; j < matrix.length; j++) {
			if (!visited[j]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int countConnected() {
		// TODO Auto-generated method stub
		return 0;
	}

}
*/