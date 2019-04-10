package demo;

import java.util.Arrays;

public class FloydWarshall {
	public static void main(String[] args) {
		int[][] weights = { { 1, 3, -2 }, { 2, 1, 4 },
				{ 2, 3, 3 } /*, { 3, 4, 2 }, { 4, 2, -1 }*/  };
		int numVertices = 3;
		printGraph(weights);
	//	System.out.println("++++++");
		floydWarshall(weights, numVertices);
	}

	public static void printGraph(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
	}

	static void floydWarshall(int[][] weights, int numVertices) {

		int[][] dist = new int[numVertices][numVertices];
		for (int[] row : dist)
			Arrays.fill(row, Integer.MAX_VALUE);

		for (int[] w : weights)
			dist[w[0] - 1][w[1] - 1] = w[2];

		int[][] next = new int[numVertices][numVertices];
		for (int i = 0; i < next.length; i++) {
			for (int j = 0; j < next.length; j++)
				if (i != j)
					next[i][j] = j + 1;
		}

		for (int k = 0; k < numVertices; k++)
			for (int i = 0; i < numVertices; i++)
				for (int j = 0; j < numVertices; j++)
					if (dist[i][k] + dist[k][j] < dist[i][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
						next[i][j] = next[i][k];
					}
	//	printGraph(dist);
		printResult(dist, next);
	}

	static void printResult(int[][] dist, int[][] next) {
		System.out.println("pair     dist    path");
		for (int i = 0; i < next.length; i++) {
			for (int j = 0; j < next.length; j++) {
				if (i != j) {
					int u = i + 1;
					int v = j + 1;
					String path = String.format("%d -> %d    %2d     %s", u, v, dist[i][j], u);
					do {
						u = next[u - 1][v - 1];
						path += " -> " + u;
					} while (u != v);
					System.out.println(path);
				}
			}
		}
	}

}
