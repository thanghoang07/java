/*package ly_thuyet_do_thi_3_saving;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;

public class UndirectedGraphIncidenceMatrix extends GraphTheory {
	int[][] matrix = null;
	int numVex;
	private BufferedReader br;

	@Override
	public int[][] readMatrix(File fileName) {
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
		// TODO Auto-generated method stub

	}

	@Override
	public void removeEdges(int src, int dest) {
		// TODO Auto-generated method stub

	}

	@Override
	public int degreeGraph()  // tong_bac
		throws Exception {
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
	
	// bac_ke_voi_dinh
	public int bacKe(int vex){
		int tempt = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			if (matrix[vex][i] == 1) {
				tempt++;
			}
		}
		return tempt;
	}
	// bac_khong_ke_voi_dinh
	public int zeroKe(int vex){
		int temp = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			temp = matrix[vex].length - bacKe(vex);
		}
		return temp;
	}

	@Override
	public int numEdges() throws Exception { // tinh_so_canh
		int temp = 0;
		temp = degreeGraph() / 2;
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
	public int[][] readIncidenceMatrix(File fileName) {
		String line;
		int row = 0; // so_dong
		int vex = 0; // so_dinh_cua_do_thi
		int edge = 0; // so_cạnh
		int count = 0;// đếm_số_dòng_đã_đọc_dòng_đầu_tiên_là_số_đỉnh
		try {
			br = new BufferedReader(new FileReader(fileName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					String[] elements;
					if (count == 1) { // số_đỉnh_của_đồ_thị
						elements = line.split(" "); // doc_dong_dau_tien_va_lay_cac_gia_tri
						vex = Integer.parseInt(elements[0]);
						edge = Integer.parseInt(elements[1]);
						matrix = new int[vex][edge];
					} else {// matrix
						elements = line.split(" ");
						for (int col = 0; col < edge; col++) {// lấy_từng_phần_tử_gán_vào_matrix
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
	public int countConnected() {
		// TODO Auto-generated method stub
		return 0;
	}
}
*/