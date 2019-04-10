package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Kruskal {
	// khởi tạo một matrix rỗng
	int[][] matrix = null;
	// khỏi tạo số cạnh matrix
	int numVex;
	//
	List<Edges> listEdges = new ArrayList<>();
	//
	public boolean[] visited;

	// khoi tao matrix
	public Kruskal() {
		super();
	}

	/**
	 * ?????????????????????????????????????????????????????????????????????????
	 */
	public Kruskal(int[][] matrix) {
		super();
		this.matrix = matrix;
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
	}

	// khoi tao matrix dang nhap vao dinh
	public Kruskal(int numVex) {
		this.numVex = numVex;
		this.matrix = new int[numVex][numVex];
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

	public void addNewEdge(Edges e) {
		if (e.getSrc() >= 0 && e.getDes() >= 0 && e.getTrongSo() > 0) {
			matrix[e.getSrc()][e.getDes()] = e.getTrongSo();
			matrix[e.getDes()][e.getSrc()] = e.getTrongSo();
			listEdges.add(e);
		} else
			System.out.println("loi.. . . . .");
	}

	// cách của cô

	public Kruskal algoKruskal(int[][] g) {
		int min;// bien tam trong so nho nhat
		int src = 0; // dinh bat dau
		int des = 0; // dinh ket thuc
		int total = 0; // trong so cua do thi
		int numEdge2 = 0;// so canh do thi

		Kruskal kru = new Kruskal(numVex);
		while (numEdge2 < (numVex - 1)) {
			min = Integer.MAX_VALUE;
			for (int i = 0; i < numVex; i++) {
				for (int j = 0; j < numVex; j++) {
					if (matrix[i][j] < min && matrix[i][j] > 0) {
						min = matrix[i][j];
						src = i;
						des = j;
					}
				}
			}
			if (des != src) { // kiem tra co tao chu trihh
				// kiem tra lien thong 2
				if (!kru.hasCycle(src, des)) {
					numEdge2++;
					System.out.printf("Edges found: %d -> %d Min: %d\n", src, des, min);
					kru.addEdgesNumber(src, des, min);
					total += min;
				}
			}
			matrix[src][des] = 0;
			matrix[des][src] = 0;
		}
		System.out.printf("So canh: %d\nTong trong nho so cua tree: %d\n", numEdge2, total);
		if (numEdge2 < numVex - 1) {
			System.out.println("loi . . . .");
		} else {
			System.out.println("In ma tran co trong so nho nhat");
			kru.printGraph(kru.matrix);
		}
		return kru;
	}

	// kiem tra lien thong 2 dinh
	public boolean hasCycle(int u, int v) {
		for (int i = 0; i < numVex; i++) {
			visited[i] = false;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(u);
		visited[u] = true;
		while (!queue.isEmpty()) {
			u = queue.remove();
			for (int i = 0; i < numVex; i++) {
				if (!visited[i] && matrix[u][i] > 0) {
					queue.add(i);
					visited[i] = true;
					if (v == i) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public Kruskal algoKruskal2() {
		int minTrongSo;// bien tam trong so nho nhat
		int src = 0; // dinh bat dau
		int des = 0; // dinh ket thuc
		int numEdge = 0;// so canh do thi
		int total = 0; // trong so cua do thi
		Kruskal kru = new Kruskal(numVex);

		Collections.sort(listEdges, new EdegComparator());

		for (int i = 0; i < numVex; i++) {
			for (int j = 0; j < numVex; j++) {
				if (matrix[i][j] > 0) {
					minTrongSo = matrix[i][j];
					src = i;
					des = j;
					listEdges.add(new Edges(i, j, minTrongSo));
				}
			}
		}
		while (numEdge < (numVex - 1)) {
			for (int i = 0; i < listEdges.size(); i++) {
				Edges edge = listEdges.get(i);
				if (!kru.hasCycle(edge.getSrc(), edge.getDes())) {
					kru.addEdgesNumber(edge.getSrc(), edge.getDes(), edge.getTrongSo());
					System.out.printf("Edges found: %d -> %d Min: %d\n", edge.getSrc(), edge.getDes(),
							edge.getTrongSo());
					total += edge.getTrongSo();
					numEdge++;
				}
			}
			matrix[src][des] = 0;
			matrix[des][src] = 0;
		}
		System.out.printf("So canh: %d\nTong trong nho so cua tree: %d\n", numEdge, total);
		if (numEdge < numVex - 1) {
			System.out.println("loi . . . .");
		} else {
			System.out.println("In ma tran co trong so nho nhat");
			kru.printGraph(kru.matrix);
		}
		return kru;
	}
	
	public class EdegComparator implements Comparator<Edges>{

		@Override
		public int compare(Edges edge1, Edges edge2) {
			if(edge1.getTrongSo() < edge2.getTrongSo()){
				return -1;
			}
			if(edge1.getTrongSo() > edge2.getTrongSo()){
				return 1;
			}
			return 0;
		}
		
	}
}