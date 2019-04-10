package vandap;

import java.util.Scanner;

import LTDT_thu7_456_TrinhVanToan_14130349_Tuan7.UndiretedGraph;

public class UnGraph {
	private int numVex;
	private int[][] matrix;
	private boolean[] visited;
	int[][] newMatrix;

	public UnGraph(int numVex) {
		this.numVex = numVex;
		this.matrix = new int[numVex][numVex];
		this.visited = new boolean[numVex];
		this.newMatrix = new int[numVex][numVex];
	}

	public void DFS(int v) {
		System.out.print(v + " ");
		visited[v] = true;
		for (int i = 0; i < numVex; i++) {
			if (newMatrix[v][i] != 0 && !visited[i]) {
				visited[i] = true;
				DFS(i);
			}
		}

	}

	public void viewGraph(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			System.out.printf("%3d", i);
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + "  ");
			System.out.println();
		}
	}

	public void addEdge(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 1;
		} else
			System.out.println("Khong ton tai dinh");
	}

	public void DFSTree() {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Nhap vao mot dinh bat ki:");
		//int anyVex = sc.nextInt();
		visited[0] = true;
		System.out.println("Duong di:");
		visit(0, newMatrix);
	}

	public void visit(int v, int[][] a) {
		System.out.print(v + " ");
		for (int i = 0; i < numVex; i++) {
			if (matrix[v][i] > 0 && !visited[i]) {
				visited[i] = true;
				newMatrix[v][i] = 1;
				newMatrix[i][v] = 1;
				visit(i, newMatrix);
			}
		}
	}

	public static void main(String[] args) {
		UnGraph g = new UnGraph(9);
		g.addEdge(0, 1);
		g.addEdge(0, 5);
		g.addEdge(1, 2);
		g.addEdge(1, 5);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 6);
		g.addEdge(5, 6);
		g.addEdge(6, 7);
		g.addEdge(6, 8);
		System.out.println("do thi ban dau");
		g.viewGraph(g.matrix);
		System.out.println("ma tran cay bao trum theo dfs");
		
		g.DFSTree();
		System.out.println();
		g.viewGraph(g.newMatrix);
		
	}
}
