package ly_thuyet_do_thi_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Prim {
	// khởi tạo một matrix rỗng
	int[][] matrix = null;
	// Khởi tọa một ms tric rông chứa cây bao trùm nhỏ nhất( cây có trọng sô)
	int[][] MST = null;
	// khỏi tạo số cạnh matrix
	int numVex;
	//
	List<Edges> listEdges = new ArrayList<>();
	//
	public boolean[] visited;
	//
	int[] path;
	int[] dis;

	// khoi tao matrix
	public Prim() {
		super();
	}

	/**
	 * ?????????????????????????????????????????????????????????????????????????
	 */
	public Prim(int[][] matrix) {
		super();
		this.matrix = matrix;
		this.MST = matrix;
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.path = new int[matrix.length];
		this.dis = new int[matrix.length];
	}

	// khoi tao matrix dang nhap vao dinh
	public Prim(int numVex) {
		this.numVex = numVex;
		this.matrix = new int[numVex][numVex];
		this.MST = new int[numVex][numVex];
		this.visited = new boolean[numVex];
		this.path = new int[numVex];
		this.dis = new int[numVex];
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

	// kiem tra lien thong 2 dinh
	public boolean hasCycle(int src, int des) {
		for (int i = 0; i < numVex; i++) {
			visited[i] = false;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(src);
		visited[src] = true;
		while (!queue.isEmpty()) {
			src = queue.remove();
			for (int i = 0; i < numVex; i++) {
				if (!visited[i] && matrix[src][i] > 0) {
					queue.add(i);
					visited[i] = true;
					if (des == i) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public int getMatrixValue(int src, int des) {
		return matrix[src][des];
	}

	public int minDisTance(int[] dis, boolean[] vis) {
		int min = Integer.MAX_VALUE;
		int min_index = 1;
		for (int i = 0; i < numVex; i++) {
			if (!vis[i] && dis[i] < min) {
				min_index = i;
				min = dis[i];
			}
		}
		return min_index;
	}

	public Prim algoPrim(int[][] tree, int vex) {
		int total = 0;
		int numEdges = 0;
		Prim pri = new Prim(numVex);
		for (int i = 0; i < numVex; i++) {
			path[i] = i;
			visited[i] = false;
			dis[i] = Integer.MAX_VALUE;
		}
		dis[vex] = 0;
		while (numEdges < (numVex - 1)) {
			for (int i = 0; i < numVex; i++) {
				int k = minDisTance(dis, visited);
				visited[k] = true;
				for (int j = 0; j < visited.length; j++) {
					int p = this.getMatrixValue(k, j);
					if (!visited[j] && tree[k][j] != 0 && p < dis[j]) {
						path[j] = k;
						dis[j] = tree[k][j];
					}
				}
			}
			for (int g = 0; g < numVex; g++) {
				if (hasCycle(path[g], g)) {
					pri.addEdgesNumber(path[g], g, tree[path[g]][g]);
					System.out.printf("Edges found: %d -> %d Min: %d\n", path[g], g, tree[path[g]][g]);
					total += tree[path[g]][g];
					numEdges++;
				}
			}
		}
		System.out.printf("So canh: %d\nTong trong nho so cua tree: %d\n", numEdges, total);
		if (numEdges < numVex - 1) {
			System.out.println("loi . . . .");
		} else {
			System.out.println("In ma tran co trong so nho nhat");
			pri.printGraph(pri.matrix);
		}
		return pri;
	}

	public Prim algoPrim2(int[][] tree, int vex) {
		Prim pri = new Prim(numVex);
		int min, u = 0, v = 0, total = 0, numEdges = 0;
		for (int i = 0; i < numVex; i++) {
			visited[i] = false;
		}
		// gan dinh nhap vao la da tham
		visited[vex] = true;
		// duyet
		while (numEdges < (numVex - 1)) {
			min = Integer.MAX_VALUE;
			for (int i = 0; i < numVex; i++) {
				if (visited[i] == true) {
					for (int j = 0; j < numVex; j++) {
						if (tree[i][j] > 0 && visited[j] == false) {
							if (min > tree[i][j]) {
								min = tree[i][j];
								u = i;
								v = j;
							}
						}
					}
				}
			}
			numEdges++;
			visited[v] = true;
			total += min;
			pri.addEdgesNumber(u, v, min);
			System.out.printf("Edge found: %d -> %d  Min: %d\n", u, v, min);
		}
		System.out.println("total: " + total);
		pri.printGraph(pri.matrix);
		return pri;
	}
}
