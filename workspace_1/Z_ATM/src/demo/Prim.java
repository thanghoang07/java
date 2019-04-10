package demo;

public class Prim {
	int numVex;
	// khoi tao mang 2 chieu
	int[][] matrixWeight = null;

	boolean[] visited;

	public Prim(int numVex) {
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

	public Prim alsoPrim(int[][] a, int vex) {
		Prim p = new Prim(numVex);
		visited = new boolean[numVex];
		int countEdges = 0;

		int[] dist = new int[numVex];
		int[] weight = new int[numVex];
		dist[vex] = 0;

		for (int i = 0; i < weight.length; i++) {
			weight[i] = Integer.MAX_VALUE;
		}

		while (countEdges < numVex - 1) {
			int next = minVex(dist, visited);
			visited[next] = true;

			for (int i = 0; i < numVex; i++) {
				if (!visited[i] && a[next][i] != 0 && a[next][i] < weight[i]) {
					weight[i] = a[next][i];
					dist[i] = next;
					System.out.println("F : " + dist[i]);
					System.out.println("E : " + i);
					p.addEdge(dist[i], i, weight[i]);
				}
			}
			countEdges++;
		}
		System.out.println();
		p.viewGraph(p.matrixWeight);
		return p;
	}

	public int minVex(int[] t, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		int u = 0;
		for (int i = 0; i < t.length; i++) {
			if (!visited[i] && t[i] < min) {
				min = t[i];
				u = i;
			}
		}
		return u;
	}

	public Prim prim(int[][] a, int v) {
		visited = new boolean[numVex];
		Prim k = new Prim(a.length);
		// dem so dinh da duyet
		int countEdges = 0;
		// luu tru gia tri trong so nho nhat
		int min = 0;
		// dinh bat dau
		int first = v;
		// dinh ket thuc
		int end = 0;
		visited[first] = true;
		boolean yesOrNo;
		while (countEdges < numVex - 1) {
			min = Integer.MAX_VALUE;
			yesOrNo = false;
			for (int i = 0; i < a.length; i++) {
				if (a[first][i] > 0 && a[first][i] < min && !visited[i]) {
					min = a[first][i];
					end = i;
					yesOrNo = true;
				}
			}
			if (first != end) {
				System.out.printf("Edges found: %d -> %d Min: %d\n", first, end, min);
				k.addEdge(first, end, min);
				visited[end] = true;
				first = end;
				countEdges++;
			}
			if (countEdges < numVex && !yesOrNo) {
				for (int i = 0; i < visited.length; i++) {
					if (!visited[i]) {
						visited[i] = true;
						first = i;
						min = Integer.MAX_VALUE;
						for (int j = 0; j < a.length; j++) {
							if (a[j][first] > 0 && a[j][first] < min) {
								min = a[j][first];
								end = j;
							}
						}
						System.out.printf("Edges found: %d -> %d Min: %d\n", first, end, min);
						k.addEdge(first, end, min);
						countEdges++;
						break;
					}
				}
			}
		}
		k.viewGraph(k.matrixWeight);
		return k;
	}
}
