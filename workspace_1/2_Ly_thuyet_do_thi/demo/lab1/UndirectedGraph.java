package lab1;

import java.io.*;
import java.util.Stack;

public class UndirectedGraph extends Graph {
	int numVer;
	int[][] matrix;

	public UndirectedGraph() {
		this.numVer = numVer;
		this.matrix = new int[numVer][numVer];
	}

	public UndirectedGraph(int numVex) {
		this.numVer = numVex;
		this.matrix = new int[numVex][numVex];
	}

	@Override
	public int[][] readMatrix(File fileName) {
		String line;
		// khoi tao ma tran ke
		int[][] matrix = null;
		// so dong
		int row = 0;
		// so dinh
		int vex = 0;
		// so canh
		int edge = 0;
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					String[] elements;
					if (count == 1) {
						elements = line.split(" ");
						vex = Integer.parseInt(elements[0]);
						edge = Integer.parseInt(elements[1]);
						matrix = new int[vex][edge];
					} else {
						elements = line.split(" ");
						for (int col = 0; col < edge; col++) {
							matrix[row][col] = Integer.parseInt(elements[col]);
						}
						row++;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return matrix;
	}

	@Override
	public void viewGraph(int[][] matrix) {
		int lab = 1;
		for (int i = 0; i < matrix.length; i++) {
			// System.out.println(lab);
			// lab++;
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%2d ", matrix[i][j]);
			}
			System.out.println();
		}

	}

	@Override
	public void addEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 1;
		} else
			System.out.println("Error!!!");

	}

	@Override
	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		}

	}

	@Override
	public int degreeVertices(int vex) {
		int degreeVex = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			degreeVex += matrix[vex][i];
		}
		return degreeVex;
	}

	@Override
	public int degreeGraph() {
		int sumDeg = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumDeg += degreeVertices(i);
		}
		return sumDeg;
	}

	@Override
	public int numEdge() {
		int tmp = 0;
		for (int i = 0; i < matrix.length; i++) {
			tmp += degreeVertices(i);
		}
		return tmp / 2;
	}

	@Override
	public boolean isConnected() {
		int i = 0;
		boolean[] visited = new boolean[matrix.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(i);
		while (!stack.empty()) {
			i = stack.pop();
			visited[i] = true;
			for (int j = 0; j < matrix.length; j++) {
				if (!visited[j] && matrix[i][j] > 0) {
					stack.push(j);
				}
			}
		}
		for (int j = 0; j < visited.length; j++) {
			if (!visited[j])
				return false;
		}
		return true;
	}
}
