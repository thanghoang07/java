package ly_thuyet_do_thi_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Dijkstra {
	// khởi tạo một matrix rỗng
	public int[][] matrix = null;
	// khỏi tạo số cạnh matrix
	public int numVex;
	// khởi tạo một mảng boolean vị trí các đỉnh viếng thăm
	public boolean[] visited;
	// khoi tao mang chua duogn di
	public int[] path;
	public int[] distances;
	//
	String way = "";

	Queue<Integer> queue;
	// PriorityQueue<Node> priorityQueue;
	Set<Integer> settled;

	public Dijkstra(int[][] matrix) {
		super();
		this.matrix = matrix;
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.path = new int[matrix.length];
		this.distances = new int[matrix.length];
		settled = new HashSet<Integer>();
		queue = new LinkedList<Integer>();
	}

	public Dijkstra(int numVex) {
		super();
		this.matrix = new int[numVex][numVex];
		this.numVex = numVex;
		this.visited = new boolean[numVex];
		this.path = new int[numVex];
		this.distances = new int[numVex];
		settled = new HashSet<Integer>();
		queue = new LinkedList<Integer>();
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

	// them vao matrix mot canh co trong so
	public void addEdgesNumberDirected(int src, int dest, int trongSo) {
		if (src >= 0 && dest >= 0 && trongSo > 0) {
			matrix[src][dest] = trongSo;
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

	public void algoDijkstra(int src) {
		int min = 0, d = 0, numEdges = 0;
		// mang luu trong so cua cac dinh
		int[] dist = new int[numVex];
		// mang luu duong di
		int[] pred = new int[numVex];
		for (int i = 0; i < numVex; i++) {
			dist[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		dist[src] = 0;
		while (numEdges < (numVex - 1)) {
			min = minDisTance(dist, visited);
			visited[min] = true;
			for (int j = 0; j < numVex; j++) {
				d = dist[min] + matrix[min][j];
				if (!visited[j] && matrix[min][j] != 0 && dist[min] != Integer.MAX_VALUE) {
					if (dist[j] > d) {
						dist[j] = d;
						pred[j] = min;
						numEdges++;
					}
				}
			}
		}
		print(src, pred, dist);
	}

	//
	public void algoDijkstraQueue(int src) {
		// mang luu trong so cua cac dinh
		int[] dist = new int[numVex];
		// mang luu duong di
		int[] pred = new int[numVex];
		// khoi tao gia tri
		for (int i = 0; i < numVex; i++) {
			dist[i] = Integer.MAX_VALUE;
			pred[src] = -1;
		}
		dist[src] = 0;
		queue.add(src);
		while (!queue.isEmpty()) {
			int u = getMiniumWeight(dist);
			settled.add(u);
			for (int i = 0; i < numVex; i++) {
				if (!settled.contains(i)) {
					if (matrix[u][i] > 0) {
						if (dist[i] > dist[u] + matrix[u][i]) {
							dist[i] = dist[u] + matrix[u][i];
							pred[i] = u;
						}
						queue.add(i);
					}
				}
			}
		}
		print(src, pred, dist);
	}

	// co dinh bat dau va dinh ket thuc
	public void algoDijkstra(int src, int dest) {
		// mang luu trong so cua cac dinh
		int[] dist = new int[numVex];
		// mang luu duong di
		int[] pred = new int[numVex];
		//
		int min = 0, numEdges = 0, d = 0;
		//
		for (int i = 0; i < numVex; i++) {
			dist[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		dist[src] = 0;
		while (numEdges < numVex - 1) {
			min = minDisTance(dist, visited);
			//
			if (min == dest) {
				break;
			} else {
				visited[min] = true;
				for (int i = 0; i < numVex; i++) {
					d = dist[min] + matrix[min][i];
					if (!visited[i] && matrix[min][i] != 0 && dist[min] != Integer.MAX_VALUE) {
						if (dist[i] > d) {
							dist[i] = d;
							pred[i] = min;
							numEdges++;
						}
					}
				}
			}
		}
		print(src, dest, pred, dist);
	}

	public void algoDijkstraQueue(int src, int dest) {
		// mang luu trong so cua cac dinh
		int[] dist = new int[numVex];
		// mang luu duong di
		int[] pred = new int[numVex];
		// khoi tao gia tri
		for (int i = 0; i < numVex; i++) {
			dist[i] = Integer.MAX_VALUE;
			pred[src] = -1;
		}
		dist[src] = 0;
		queue.add(src);
		while (!queue.isEmpty()) {
			// lay dinh ra
			int u = getMiniumWeight(dist);
			// so sanh voi dinh cuoi
			if (u == dest) {
				break;
			} else {
				//
				settled.add(u);
				for (int i = 0; i < numVex; i++) {
					if (!settled.contains(i)) {
						if (matrix[u][i] > 0) {
							if (dist[i] > dist[u] + matrix[u][i]) {
								dist[i] = dist[u] + matrix[u][i];
								pred[i] = u;
							}
							queue.add(i);
						}
					}
				}
			}
		}
		print(src, dest, pred, dist);
	}

	public void print(int src, int[] pred, int[] dist) {
		System.out.printf("Dinh bat dau: %3d\n", src);
		System.out.printf("%3s : %3s : %3s\n", "Den dinh", "Do dai", "Duong di");
		for (int j = 0; j < pred.length; j++) {
			if (dist[j] >= Integer.MAX_VALUE) {
				System.out.printf("%3d : %3s : %3s ", j, "--", "khong co duong di");
				System.out.println();
			} else {
				System.out.printf("%3d : %3d : ", j, dist[j]);
				inDuongDiD(pred, src, j);
				System.out.println();
			}
		}
	}

	// binh thuong
	public void inDuongDiD(int[] path, int src, int des) {
		List<Integer> list = new ArrayList<>();
		int x = des;
		while (x != src) {
			list.add(0, x);
			x = path[x];
		}
		list.add(0, src);
		System.out.print(list);

	}

	private int minDisTance(int[] dist, boolean[] visited) {
		int x = Integer.MAX_VALUE;
		int y = -1;
		for (int i = 0; i < numVex; i++) {
			if (!visited[i] && dist[i] < x) {
				y = i;
				x = dist[i];
			}
		}
		return y;
	}

	public void print(int src, int dest, int[] pred, int[] dist) {
		System.out.printf("Dinh bat dau: %3d\n", src);
		if (dist[dest] >= Integer.MAX_VALUE) {
			System.out.printf("Den dinh: %3d Duong di: %3s", dest, "khong co duong di");
		} else {
			System.out.printf("Den dinh: %3d Do dai: %3d Duong di: ", dest, dist[dest]);
			printPath(pred, src, dest);
		}
	}

	// dung queue
	public void printPath(int[] pred, int src, int dest) {
		if (src == dest)
			System.out.print(src + " ");
		else {
			printPath(pred, src, pred[dest]);
			System.out.print(dest + " ");
		}
	}

	public int getMiniumWeight(int[] dist) {
		int node = 0;
		Iterator<Integer> itr = queue.iterator();
		node = itr.next();
		int min = dist[node];
		for (int i = 0; i < numVex; i++) {
			if (queue.contains(i)) {
				if (dist[i] < min) {
					min = dist[i];
					node = i;
				}
			}
		}
		queue.remove(node);
		return node;
	}
}
