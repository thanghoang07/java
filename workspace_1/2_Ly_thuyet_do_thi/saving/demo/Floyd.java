package demo;

import java.util.ArrayList;
import java.util.List;

public class Floyd {
	// khởi tạo một matrix rỗng
	public int[][] matrix = null;
	// khỏi tạo số cạnh matrix
	int numVex;
	//
	public boolean[] visited;
	//
	public int[][] dist; // mang chua khoan cach ngan nhat tu i den j
	public int[][] pred; // mang chua gia tri phan tu ngay sau i
	//
	public int[] distance;
	public int[] path;

	// khoi tao matrix
	public Floyd() {
		super();
	}

	/**
	 * ?????????????????????????????????????????????????????????????????????????
	 */
	public Floyd(int[][] matrix) {
		super();
		this.matrix = matrix;
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.pred = new int[matrix.length][matrix.length];
		this.dist = new int[matrix.length][matrix.length];
		this.distance = new int[matrix.length];
		this.path = new int[matrix.length];
	}

	// khoi tao matrix dang nhap vao dinh
	public Floyd(int numVex) {
		this.numVex = numVex;
		this.matrix = new int[numVex][numVex];
		this.visited = new boolean[numVex];
		this.pred = new int[numVex][numVex];
		this.dist = new int[numVex][numVex];
		this.distance = new int[numVex];
		this.path = new int[numVex];
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
	public void addEdgesNumberDirected(int src, int dest, int trongSo) {
		if (src >= 0 && dest >= 0 && trongSo > 0) {
			matrix[src][dest] = trongSo;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	public void addEdgesNumberUndirected(int src, int dest, int trongSo) {
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

	public void algoFloyd() {
		for (int i = 0; i < numVex; i++) {
			for (int j = 0; j < numVex; j++) {
				dist[i][j] = matrix[i][j];
			}
		}
		for (int k = 0; k < numVex; k++) {
			for (int i = 0; i < numVex; i++) {
				for (int j = 0; j < numVex; j++) {
					if (dist[i][j] == 0 || (dist[i][k] + dist[k][j]) < dist[i][j]) {
						if (dist[i][k] > 0 && dist[k][j] > 0) {
							dist[i][j] = dist[i][k] + dist[k][j];
						}
					} else {
						dist[i][j] = dist[i][j];
					}
				}
			}
			System.out.printf("k = %3d\n", k);
			printGraph(dist);
		}
	}

	public void algoFloyd(int src, int des) {
		for (int i = 0; i < numVex; i++) {
			for (int j = 0; j < numVex; j++) {
				dist[i][j] = matrix[i][j];
				if (dist[i][j] > 0) {
					pred[i][j] = j;
				}
			}
		}
		for (int k = 0; k < numVex; k++) {
			for (int i = 0; i < numVex; i++) {
				for (int j = 0; j < numVex; j++) {
					if (dist[i][j] == 0 || (dist[i][k] + dist[k][j]) < dist[i][j]) {
						if (dist[i][k] > 0 && dist[k][j] > 0) {
							dist[i][j] = dist[i][k] + dist[k][j];
							pred[i][j] = pred[i][k];
						}
					} else {
						dist[i][j] = dist[i][j];
						pred[i][j] = pred[i][j];
					}
				}
			}
		}
		List<Integer> path = new ArrayList<>();
		path.add(src);
		while (src != des) {
			src = pred[src][des];
			path.add(src);
		}
		for (int i = 0; i < path.size() - 1; i++) {
			System.out.print(path.get(i) + " -> ");
		}
		System.out.println(path.get(path.size() - 1));
	}

	// bellman
	public void algoBellmanFord(int s) {
		// tao bien
		boolean stop;
		// mang luu tru cac dinh da di
		int[] path = new int[numVex];
		// mang luu khong cach ngnan nhat tu dinh s den 1 dinh khac
		int[] l = new int[numVex];

		for (int i = 0; i < numVex; i++) {
			path[i] = -1;
			if (i == s)
				l[i] = 0;
			else
				l[i] = Integer.MAX_VALUE;
		}
		stop = false;
		int k = 0;
		while (!stop) {
			stop = true;
			k++;
			for (int i = 0; i < numVex; i++) {
				for (int j = 0; j < numVex; j++) {
					if (matrix[i][j] != 0 && matrix[i][j] != Integer.MAX_VALUE) {
						if (l[j] > l[i] + matrix[i][j]) {
							l[j] = l[i] + matrix[i][j];
							path[j] = i;
							stop = false;
							System.out.println("do dai" + l[j]);
						}
						// }
					}
				}
			}
			if (k > numVex) {
				if (stop == false) {
					System.out.println("Do thi co chu trinh am");
					stop = true;
				}
			}
		}
		print(s, path, l);
	}

	public void printPath(int[] path, int j) {
		if (path[j] == -1)
			return;
		printPath(path, path[j]);
		System.out.printf("%3d", j);
	}

	public void print(int src, int[] pred, int[] l) {
		System.out.printf("Dinh bat dau: %3d\n", src);
		System.out.printf("%3s : %3s : %3s\n", "Den dinh", "Do dai", "Duong di");
		for (int j = 0; j < pred.length; j++) {
			System.out.printf("%3d : %3d : ", j, l[j]);
			printPath(pred, j);
			System.out.println();
		}
	}

	public void bellmanFord(int source) {
		int[] w = new int[numVex];
		int[] truoc = new int[numVex];
		boolean stop = false;
		int k = 0;
		for (int i = 0; i < numVex; i++) {
			w[i] = Integer.MAX_VALUE;
			truoc[i] = -1;
		}
		w[source] = 0;
		while (!stop) {
			stop = true;
			k++;
			for (int i = 0; i < numVex; i++) {
				for (int j = 0; j < numVex; j++) {
					if (matrix[i][j] != 0) {
						if (w[j] > w[i] + matrix[i][j]) {
							w[j] = w[i] + matrix[i][j];
							truoc[j] = i;
							stop = false;
							System.out.println("do dai" + w[j]);
						}
					}
				}
			}
			if (k > numVex) {
				if (stop == false) {
					System.out.println("Do thi co trong so am");
					stop = true;
				}
			}
		}
		System.out.println("Xuat phat tu dinh " + source + "\n");
		for (int i = 0; i < numVex; i++) {
			int j = i;
			System.out.print("Dinh  " + j + " | Trong So " + w[j] + "|" + " Duong di :" + j);
			while (truoc[j] >= 0) {
				System.out.print("->" + truoc[j]);
				j = truoc[j];
			}
			System.out.println();
		}	
	}
}
