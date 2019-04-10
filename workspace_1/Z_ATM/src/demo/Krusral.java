package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Krusral {
	int numVex;
	// khoi tao mang 2 chieu
	int[][] matrixWeight = null;

	// khoi tao mang cac canh
	List<Edge> listEdge = new ArrayList<>();

	// dem so thanh phan lien thong
	int countConnect = 1;

	boolean[] visited;

	public Krusral(int numVex) {
		this.numVex = numVex;
		this.visited = new boolean[numVex];
		this.matrixWeight = new int[numVex][numVex];
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

	/*
	 * Them mot canh co trong so vao do thi
	 * 
	 * @param src dinh nguon
	 * 
	 * @param dest dinh dich
	 * 
	 * @param weight trong so
	 */
	public void addEdge(int src, int dest, int weight) {
		if (src >= 0 && dest >= 0 && weight > 0) {
			matrixWeight[src][dest] = weight;
			matrixWeight[dest][src] = weight;
		} else
			System.out.println("Khong ton tai dinh");
	}

	public void addNewEdge(Edge e) {
		if (e.getU() >= 0 && e.getV() >= 0 && e.getWeight() > 0) {
			matrixWeight[e.getU()][e.getV()] = e.getWeight();
			matrixWeight[e.getV()][e.getU()] = e.getWeight();
			listEdge.add(e);
		} else
			System.out.println("Khong ton tai dinh");
	}

	public void removeEdges(int src, int dest, int weight) {
		if (src >= 0 && dest >= 0 && weight > 0) {
			matrixWeight[src][dest] = 0;
			matrixWeight[dest][src] = 0;
		}
	}

	/*
	 * Kiem tra tinh lien thong cua do thi
	 */
	public boolean checkConnected() {
		for (int i = 0; i < matrixWeight.length; i++) {
			DFS(i);
			for (int j = 0; j < visited.length; j++) {
				if (!visited[j])
					return false;

			}
		}
		return true;
	}

	public void DFS(int v) {
		visited[v] = true;
		// kiem tra cac dinh ke voi v duoc duyet chua. neu chua thi de quy lai
		// dinh i
		for (int i = 0; i < matrixWeight.length; i++) {
			if (!visited[i] && matrixWeight[v][i] > 0)
				DFS(i);
		}
	}

	public Krusral aloKrusal(int[][] a) {
		visited = new boolean[numVex];
		Krusral k = new Krusral(a.length);
		// dem so dinh da duyet
		int countEdges = 0;
		// luu tru gia tri trong so nho nhat
		int min = 0;
		// dinh bat dau
		int first = 0;
		// dinh ket thuc
		int end = 0;
		// dem tong trong so cua cay
		int totalWeight = 0;
		// danh dau so cay
		int[] mark = new int[numVex];
		int t = 0;
		int temp;
		while (countEdges < numVex - 1) {
			min = Integer.MAX_VALUE;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if (a[i][j] > 0 && a[i][j] < min && !(mark[i] != 0 && mark[i] == mark[j])) {
						min = a[i][j];
						first = i;
						end = j;
						// System.out.println("F :" + first);
						// System.out.println("E :" + end);
					}
				}

			}
			System.out.println(" F " + first);
			System.out.println("E :" + end);
			if (mark[first] == 0 && mark[end] == 0) {
				t++;
				mark[first] = mark[end] = t;
				k.addEdge(first, end, min);
			} else if (mark[first] == 0 && mark[end] != 0) {
				mark[first] = mark[end];
				k.addEdge(first, end, min);
			} else if (mark[first] != 0 && mark[end] == 0) {
				mark[end] = mark[first];
				k.addEdge(first, end, min);
			} else if (mark[first] != mark[end] && mark[end] != 0) {
				temp = mark[first];
				for (int i = 0; i < mark.length; i++) {
					if (temp == mark[i]) {
						mark[i] = mark[end];
						k.addEdge(first, end, min);
					}
				}
			} else
				System.out.println("Co chu trinh");
			countEdges++;
			a[first][end] = 0;
			a[end][first] = 0;
		}
		if (k.numVex < a.length - 1) {
			System.out.println("Ä�á»“ thá»‹ khÃ´ng cÃ³ cÃ¢y bao trÃ¹m nhá»� nháº¥t");
		}
		k.viewGraph(k.matrixWeight);
		return k;

	}

	public Krusral krusral() {
		Collections.sort(listEdge);
		Krusral k = new Krusral(numVex);

		// luu tru gia tri trong so nho nhat
		int min = 0;
		// dinh bat dau
		int first = 0;
		// dinh ket thuc
		int end = 0;
		// dem tong trong so cua cay
		int totalWeight = 0;
		// danh dau so cay
		int[] mark = new int[numVex];
		int t = 0;
		int temp;

		for (int i = 0; i < listEdge.size(); i++) {
			min = listEdge.get(i).getWeight();
			first = listEdge.get(i).getU();
			end = listEdge.get(i).getV();
			System.out.println(" F " + first);
			System.out.println("E :" + end);
			if (mark[first] == 0 && mark[end] == 0) {
				t++;
				mark[first] = mark[end] = t;
				k.addEdge(first, end, min);
			} else if (mark[first] == 0 && mark[end] != 0) {
				mark[first] = mark[end];
				k.addEdge(first, end, min);
			} else if (mark[first] != 0 && mark[end] == 0) {
				mark[end] = mark[first];
				k.addEdge(first, end, min);
			} else if (mark[first] != mark[end] && mark[end] != 0) {
				temp = mark[first];
				for (int j = 0; j < mark.length; j++) {
					if (temp == mark[j]) {
						mark[j] = mark[end];
						k.addEdge(first, end, min);
					}
				}
			} else
				System.out.println("Co chu trinh");

			removeEdges(first, end, min);
		}
		k.viewGraph(k.matrixWeight);
		return k;
	}
}
