package van_Toan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UndiretedGraph extends Gragh {
	// so dinh cua do thi
	int numVex;
	// khoi tao mang 2 chieu
	int[][] matrix = null;

	// dem so thanh phan lien thong
	int countConnect = 1;
	
	boolean[] visited;
	
	
	// Array of lists for Adjacency List Representation
	private LinkedList<Integer>[] adj;
	
	/*
	 * Hàm khởi tạo đồ thị dạng ma trận
	 */
	public UndiretedGraph() {
	}

	/*
	 * Hàm khởi tạo đồ thị dạng ma trận Input : so dinh cua do thi - numVex
	 */
	public UndiretedGraph(int numVex) {
		this.numVex = numVex;
		this.visited = new boolean[numVex];
		this.matrix = new int[numVex][numVex];
		this.adj = new LinkedList[numVex];
		for (int i=0; i< numVex; ++i)
			adj[i] = new LinkedList();
	}

	/*
	 * Đọc do thi tu file Input : pathName - duong dan noi chua file can doc
	 * Output : mang 2 chiu
	 */
	@Override
	public int[][] readFile(String pathName) {
		String line;
		// khoi tao ma tran ke
		matrix = null;
		// so dong
		int row = 0;
		// so dinh
		int vex = 0;
		// đếm số dòng trong file
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					// đọc dòng đầu tiên của file lấy dược số đỉnh của đồ thị
					if (count == 1) {
						vex = Integer.parseInt(line);
						matrix = new int[vex][vex];
					} else {
						// những dòng tiếp theo ta sẽ lấy được ma trận kề nên ta
						// cần chia mỗi dòng thành nhiều phần tử mỗi phần tử là
						// 1 giá trị của ma trận kề
						String[] elements = line.split(" ");
						// gan gia trị vào trong ma trận
						for (int col = 0; col < vex; col++) {
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

	/*
	 * In do thi input : nhập vào 1 ma trận
	 */
	@Override
	public void viewGraph(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%2d ", matrix[i][j]);
			}
			System.out.println();
		}

	}

	/*
	 * Thêm một cạnh vào đồ thị Input : - src : đỉnh nguồn hay số hàng trong
	 * matrix - dest : đỉnh đích hay số cột trong matrix
	 */
	@Override
	public void addEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 1;
			adj[src].add(dest);
		} else
			System.out.println("Không tồn tại đỉnh");
	}

	/*
	 * Xóa một cạnh của đồ thị Input : - src : đỉnh nguồn hay số hàng trong
	 * matrix - dest : đỉnh đích hay số cột trong matrix
	 */
	@Override
	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		}

	}

	/*
	 * Tính bậc của một đỉnh cho trước Input : vex - đỉnh cần tính
	 */
	public int degreeVex(int vex) {
		int degreeVex = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			degreeVex += matrix[vex][i];
		}
		return degreeVex;
	}

	/*
	 * Tính bậc của đồ thị Output : số bậc cần tính
	 */
	@Override
	public int degreeGraph() {
		int sumDegree = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumDegree += degreeVex(i);
		}
		return sumDegree;
	}

	/*
	 * Tính số cạnh của đồ thị Output : số cạnh cần tính
	 */
	@Override
	public int numEdge() {
		int edge = 0;
		for (int i = 0; i < matrix.length; i++) {
			edge += degreeVex(i);
		}
		return edge / 2;
	}

	/*
	 * Kiểm tra tính liên thông output : true - đồ thị liên thông false - đồ thị
	 * không liên thông
	 */
	@Override
	public boolean isConnected() {
		int i = 0;
		visited = new boolean[matrix.length];
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
			if (!visited[j]) {
				return false;
			}
		}
		return true;
	}
	
	public void DFS(int v) {
		visited[v] = true;
//		System.out.print(v + " ");
		for (int i : adjacent(v)) {
			if (!visited[i])
				DFS(i);
		}
	}
	
	public void nonrecursiveDFS(int v) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(v);
		visited[v] = true;
		while (!stack.empty()) {
			v = stack.pop();
			System.out.print(v + " ");
			for (int i : adjacent(v)) {
				if (!visited[i]) {
					stack.push(i);
					visited[i] = true;
					
				}
			}

		}
	}
	
	public void BFS(int v){
//		visited = new boolean[matrix.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = true;
		while (!queue.isEmpty()) {
			v = queue.remove();
			for (int i = 0; i < matrix.length; i++) {
				if (!visited[i] && matrix[v][i] > 0) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	
	
	public String pathDFS(int v,int v1) {
		String temp = "";
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(v);
		while (!stack.empty()) {
			v = stack.pop();
			temp += v + " ";
			visited[v] = true;
			for (int i : adjacent(v)) {
				if (!visited[i]) {
					if (i == v1) {
						visited[i] = true;
						stack.clear();
						break;
					}else{
					stack.push(i);
					}
				}
			}
		}
		if (!visited[v1])
			return "Không có đường đi từ " + v + " đến " + v1;
		else
			return temp + v1;
	}
	
	public String pathBFS(int v, int v1){
		String path = "";
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v] = true;
		while (!queue.isEmpty()) {
			int temp = queue.remove();
			path += temp + " ";
			for (int i : adjacent(temp)) {
				if (!visited[i]) {
					if (i == v1) {
						visited[i] = true;
						queue.clear();
						break;
					} else {
						queue.add(i);
						visited[i] = true;
					}
				}
			}
		}
		if (!visited[v1])
			return "Không có đường đi từ " + v + " đến " + v1;
		else
			return path + v1;
	}
	
	public boolean checkConnected() {
		for (int i = 0; i < matrix.length; i++) {
			BFS(i);
			for (int j = 0; j < visited.length; j++) {
				if (!visited[j])
					return false;
			}
		}
		return true;
	}
	
	@Override
	public int countConnect() {
//		int count = 1;
		for (int i = 0; i < matrix.length; i++) {
			if (visited[i] == false) {
				countConnect++;
				BFS(i);
				
			}
		}
		return countConnect;
	}
		
	/**
     * Returns the vertices adjacent to vertex v
     *
     * @param  v the vertex
     * @return the vertices adjacent to vertex <tt>v</tt>, as an iterable
     * @throws IndexOutOfBoundsException unless 0 <= v < V
     */
	public LinkedList<Integer> adjacent(int u) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[u][i] > 0) {
				adj[u].add(i);
			}
		}
		return adj[u];
	}
	
	

}
