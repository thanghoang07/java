package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DemoKruskal {
	// khởi tạo một matrix rỗng
	int[][] matrix = null;
	// kh�?i tạo số cạnh matrix
	int numVex;
	//
	List<Integer> vexNum;
	//
	public boolean[] visited;

	// khoi tao matrix
	public DemoKruskal() {
		super();
	}

	/**
	 * ?????????????????????????????????????????????????????????????????????????
	 */
	public DemoKruskal(int[][] matrix) {
		super();
		this.matrix = matrix;
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.vexNum = new ArrayList<Integer>();
	}

	// khoi tao matrix dang nhap vao dinh
	public DemoKruskal(int numVex) {
		this.numVex = numVex;
		this.matrix = new int[numVex][numVex];
		this.vexNum = new ArrayList<Integer>();
		this.visited = new boolean[numVex];
	}

	// in matrix
	public void printGraph(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++)
				System.out.printf("%3d", matrix[i][j]);
			System.out.println();
		}
	}

	// xoa bo mot canh
	public void removeEdges(int src, int dest) {
		if (matrix.length == 0) {
			System.out.println("�?ồ thị chưa được tạo");
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
			System.out.println("�?ồ thị chưa được tạo");
		} else if (vex > numVex + 1) {
			System.out.println("loi.. .  .   .   .");
		} else {
			for (int i = 0; i < matrix[vex].length; i++) {
				degreeVex += matrix[vex][i];
			}
		}
		return degreeVex;
	}

	// them vao matrix mot canh co trong so
	public void addEdgesNumber(int src, int dest, int trongSo) {
		if (src >= 0 && dest >= 0 && trongSo > 0) {
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

	// lien thong
	public boolean isConnected() {
		int index = 0;
		visited = new boolean[matrix.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(index);
		while (!stack.empty()) {
			index = stack.pop();
			visited[index] = true;
			for (int j = 0; j < matrix.length; j++) {
				if (!visited[j] && matrix[index][j] > 0) {
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

	// cách của cô
	public Kruskal algoKruskal(int[][] g) {
		int min;// bien tam trong so nho nhat
		int src = 0; // dinh bat dau
		int des = 0; // dinh ket thuc
		int numEdge2 = 0;// so canh do thi
		int total = 0; // trong so cua do thi
		// danh dau so cay
		int[] mark = new int[numVex];
		int t = 0;
		int temp;
		Kruskal kru = new Kruskal(numVex);
		while (numEdge2 < (numVex - 1)) {
			min = Integer.MAX_VALUE;
			for (int i = 0; i < numVex; i++) {
				for (int j = 0; j < numVex; j++) {
					if (matrix[i][j] < min && matrix[i][j] > 0 && !(mark[i] != 0 && mark[i] == mark[j])) {
						min = matrix[i][j];
						src = i;
						des = j;
					}
				}
			}
			if (des != src) { // kiem tra co tao chu trihh
				// kiem tra lien thong 2
				numEdge2++;
				if (mark[src] == 0 && mark[des] == 0) {
					t++;
					mark[src] = mark[des] = t;
					kru.addEdgesNumber(src, des, min);
				} else if (mark[src] == 0 && mark[des] != 0) {
					mark[src] = mark[des];
					kru.addEdgesNumber(src, des, min);
				} else if (mark[src] != 0 && mark[des] == 0) {
					mark[des] = mark[src];
					kru.addEdgesNumber(src, des, min);
				} else if (mark[src] != mark[des] && mark[des] != 0) {
					temp = mark[src];
					for (int i = 0; i < mark.length; i++) {
						if (temp == mark[i]) {
							mark[i] = mark[des];
							kru.addEdgesNumber(src, des, min);
						}
					}
				}
				System.out.printf("Edges found: %d -> %d Min: %d\n", src, des, min);
				total += min;
			}
			matrix[src][des] = 0;
			matrix[des][src] = 0;
		}
		System.out.printf("Tong trong nho so cua tree: %d\n", total);
		if (numEdge2 < numVex - 1) {
			System.out.println("loi . . . .");
		} else {
			System.out.println("In ma tran co trong so nho nhat");
			kru.printGraph(kru.matrix);
		}
		return kru;
	}

	// tạo lop moi
	public Kruskal algoPRIM(int[][] g, int vex) {
		int min;// bien tam trong so nho nhat
		int src = 0; // dinh bat dau
		int des = 0; // dinh ket thuc
		int numEdge2 = 0;// so canh do thi
		int total = 0; // trong so cua do thi
		Kruskal pri = new Kruskal(numVex);
		vexNum.add(vex);
		while (numEdge2 < (numVex - 1)) {
			/*
			 * duyet tu dinh nhap vao va tim xem đỉnh k�? với đỉnh nhập vào đó
			 * nếu đỉnh đó có tr�?ng số nh�? hơn thì add vào list và kiểm tra coi
			 * đỉnh đó có tạo chu trình hay không.
			 * 
			 * Trả v�? một danh sách các đỉnh và đồ thị tr�?ng số nh�? nhất
			 */
			min = minTrongSo(vex);

			if (des != src) { // kiem tra co tao chu trihh
				numEdge2++;
				System.out.printf("Edges found: %d -> %d Min: %d\n", src, des, minTrongSo(src));
				pri.addEdgesNumber(src, des, matrix[src][des]);

			}
			matrix[src][des] = 0;
			matrix[des][src] = 0;
		}
		return pri;
	}

	// phương thức tìm tr�?ng số nh�? nhất của một đỉnh bất kỳ
	public int minTrongSo(int vex) {
		int min = matrix[vex][0];
		if (min == 0) {
			for (int i = 0; i < matrix[vex].length; i++) {
				if (matrix[vex][i] != 0 && matrix[vex][i] < min) {
					min = matrix[vex][i];
				}
			}
		}
		for (int i = 0; i < matrix[vex].length; i++) {
			if (matrix[vex][i] < min && matrix[vex][i] != 0) {
				min = matrix[vex][i];
			}
		}
		return min;
	}
}
