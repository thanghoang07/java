package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JFileChooser;

public class Tree {
	//
	static File file;
	static JFileChooser fc;
	// khởi tạo một matrix rỗng
	int[][] matrix = null;
	// khỏi tạo số cạnh matrix
	int numVex;
	//
	BufferedReader br;
	// khởi tạo một mảng boolean vị trí các đỉnh viếng thăm
	boolean[] visitedT;
	// khởi tạo một list chứa các đỉnh duyệt
	List<Integer> listTransvel;
	// khởi tạo một mảng chứa các đỉnh
	int[] path;

	// khoi tao matrix
	public Tree() {
		super();
	}

	/**
	 * ?????????????????????????????????????????????????????????????????????????
	 */
	public Tree(int[][] matrix) {
		super();
		this.matrix = matrix;
		this.numVex = matrix.length;
		path = new int[matrix.length];
		visitedT = new boolean[matrix.length];
		listTransvel = new ArrayList<Integer>();
	}

	// khoi tao matrix dang nhap vao dinh
	public Tree(int numVex) {
		this.numVex = numVex;
		this.matrix = new int[numVex][numVex];
		path = new int[numVex];
		visitedT = new boolean[numVex];
		listTransvel = new ArrayList<Integer>();
	}

	/**
	 * doc va in do thi
	 */
	// - Phương thức doc file
	public static File docFile() throws Exception {
		try {
			fc = new JFileChooser();
			fc.setCurrentDirectory(new File("C:\\Users\\thang\\Desktop\\files\\G"));// dat_vi_tri_mac_dinh_de_mo
			fc.setDialogTitle("chon file chua do thi.");
			fc.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
			fc.setAcceptAllFileFilterUsed(false);
			if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				String selOpen = fc.getSelectedFile().getAbsolutePath();// lay_duong_dan_file
				file = new File(selOpen);
			} else {
				System.out.println("No file selection");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}

	// doc matran tu file
	public int[][] readmatrix(File fileName) {
		String line;
		// gan cho matrix ban dau bang rong
		matrix = null;
		// so_dong
		int row = 0;
		// so_dinh_cua_do_thi
		int vex = 0;
		// đếm_số_dòng_đã_đọc_dòng_đầu_tiên_là_số_đỉnh
		int count = 0;
		try {
			br = new BufferedReader(new FileReader(fileName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					// số_đỉnh_của_đồ_thị
					if (count == 1) {
						vex = Integer.parseInt(line);
						matrix = new int[vex][vex];
					} else {// matrix
						String[] elements = line.split(" ");
						// lấy_từng_phần_tử_gán_vào_matrix
						for (int col = 0; col < vex; col++) {
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

	// in matrix
	public void printGraph(int[][] matrix) {
		// so hang,
		for (int i = 0; i < matrix.length; i++)
			System.out.printf("%3d", i);
		System.out.println();
		// in ra so cot
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i + " ");
			// in matrix
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + "  ");
			System.out.println();
		}
	}

	/**
	 * Thêm, xóa, tính số cạnh, tinh bậc của một đỉnh, tính tổng bậc của đồ thi.
	 */

	// them vao matrix mot canh
	public void addEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// xoa bo mot canh
	public void removeEdges(int src, int dest) {
		if (matrix.length == 0) {
			System.out.println("Đồ thị chưa được tạo");
		} else if (src >= 0 && dest >= 0 && src <= numVex && dest <= numVex) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// tinh bac cua mot dinh bat ky
	public int degreeVex(int vex) {
		int degreeVex = 0;
		if (matrix.length == 0) {
			System.out.println("Đồ thị chưa được tạo");
		} else if (vex > numVex + 1) {
			System.out.println("loi.. .  .   .   .");
		} else {
			for (int i = 0; i < matrix[vex].length; i++) {
				degreeVex += matrix[vex][i];
			}
		}
		return degreeVex;
	}

	// tinh tong bac cua do thi
	public int degreeGraph() {
		int degreeG = 0;
		if (matrix.length == 0) {
			System.out.println("matrix chưa được tạo");
		}
		for (int i = 0; i < matrix.length; i++) {
			degreeG += degreeVex(i);
		}
		return degreeG;
	}

	// tinh so canh cua do thi
	public int numEdges() {
		if (matrix.length == 0) {
			System.out.println("matrix chưa được tạo");
		}
		int temp = 0;
		temp = degreeGraph() / 2;
		return temp;
	}

	/**
	 * Kiem tra tinh lien thong
	 */
	// kiem tra lien thong
	// duyet_theo_chieu_sau, kiem tra lien thong
	public boolean isConnected() {
		int index = 0;
		visitedT = new boolean[matrix.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(index);
		while (!stack.empty()) {
			index = stack.pop();
			visitedT[index] = true;
			for (int j = 0; j < matrix.length; j++) {
				if (!visitedT[j] && matrix[index][j] > 0) {
					stack.push(j);
				}
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			if (!visitedT[j]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Duyet matrix
	 */

	// lam moi mang boolean
	public void reset() {
		// duyet mang
		for (int i = 0; i < numVex; i++) {
			// gan can phan tu trong mang bang false
			visitedT[i] = false;
		}
	}

	// theem vao 1 do thi vo huong
	public UndirectedGraph DFSmatrix(int vex) {
		UndirectedGraph graph = new UndirectedGraph(numVex);
		reset();
		visitedT[vex] = true;
		visit3(vex, graph);
		return graph;
	}

	public void visit3(int vex, UndirectedGraph graph) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[vex][i] > 0 && !visitedT[i]) {
				graph.addEdges(vex, i);
				visitedT[i] = true;
				visit3(i, graph);
			}
		}
	}

	public void inmatrix(int[] path) {
		for (int i = 0; i < path.length; i++) {
			System.out.printf("%3d", path[i]);
		}
		System.out.println();
	}

	// them vao cai do thi vo huong // tra ve mot do thi
	public UndirectedGraph BFSmatrix(int vex, UndirectedGraph graph) {
		// khỏi tạo một queue
		Queue<Integer> queue = new LinkedList<Integer>();
		// them vao hang doi
		queue.add(vex);
		// đánh dấu đỉnh nhập vào là đã duyệt
		visitedT[vex] = true;
		// kiểm tra coi queue có rỗng hay không
		while (!queue.isEmpty()) {
			// lay gia trị phan tu ra khoi hang doi
			vex = queue.remove();
			for (int i = 0; i < matrix.length; i++) {
				/*
				 * kiêm tra các đỉnh kề coi đã đc duyệt chưa? chưa thì thêm vào
				 * queue
				 */
				if (matrix[vex][i] > 0 && !visitedT[i]) {
					// tiep tuc them dinh vao hang doi
					queue.add(i);
					visitedT[i] = true;
					graph.addEdges(vex, i);
				}
			}
		}
		return graph;
	}

	/*
	 * Duyet cay theo preorder : root - left - right
	 */
	public List<Integer> preorder(int root) {
		visitedT[root] = true;
		// thêm đỉnh root vào trước
		listTransvel.add(root);
		// thêm các đỉnh lần lượt theo thứ tự trái - phải
		for (int i = 0; i < matrix.length; i++) {
			if (!visitedT[i] && matrix[root][i] > 0) {
				preorder(i);
			}
		}
		return listTransvel;
	}

	/*
	 * Duyet cay theo postorder : left - right - root
	 */
	public List<Integer> postorder(int root) {
		visitedT[root] = true;
		// thêm các đỉnh lần lượt theo thứ tự trái - phải
		for (int i = 0; i < matrix.length; i++) {
			if (!visitedT[i] && matrix[root][i] > 0) {
				postorder(i);
			}
		}
		// thêm đỉnh root vào
		listTransvel.add(root);
		return listTransvel;
	}

	/*
	 * Duyet cay theo inorder : left - root - right
	 */
	public List<Integer> inorder(int root) {
		visitedT[root] = true;
		// kiem tra xem dinh root co phai la lá hay khong
		if (degreeVex(root) == 1) {
			// them la vao
			listTransvel.add(root);
		} else {
			// lay nhanh ben trai cua cay de xet
			for (int i = 0; i < matrix.length; i++) {
				if (!visitedT[i] && matrix[root][i] > 0) {
					inorder(i);
					break;
				}
			}
			// them goc vao
			listTransvel.add(root);
			// lay nhanh ben phai cua cay de xet
			for (int i = 0; i < matrix.length; i++) {
				if (!visitedT[i] && matrix[root][i] > 0) {
					inorder(i);
				}
			}
		}
		return listTransvel;
	}

	public void printTransvel(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%3d", list.get(i));
		}
		System.out.println();
	}

	/**
	 * matrix trong so
	 * 
	 */

	// thử vọc
	List<Integer> edges = new ArrayList<Integer>();

	public Tree inDayTrongSo(Tree graph) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0) {
					graph.addEdgesNumber(i, j, matrix[i][j]);
				}
			}
		}
		return graph;
	}

	public List<Integer> inTrongSo() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0) {
					edges.add(matrix[i][j]);
				}
			}
		}
		return edges;
	}
	// ....

	// them vao matrix mot canh co trong so
	public void addEdgesNumber(int src, int dest, int trongSo) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = trongSo;
			matrix[dest][src] = trongSo;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// tinh tong trong so cua ma tran.
	public int degreeGraphNum() {
		int degreeG = 0;
		if (matrix.length == 0) {
			System.out.println("Matrix chưa được tạo");
		}
		for (int i = 0; i < matrix.length; i++) {
			degreeG += degreeVex(i);
		}
		return degreeG / 2;
	}

}
