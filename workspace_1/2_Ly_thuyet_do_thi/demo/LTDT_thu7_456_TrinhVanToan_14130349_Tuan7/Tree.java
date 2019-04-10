package LTDT_thu7_456_TrinhVanToan_14130349_Tuan7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {

	// so dinh cua do thi
	int numVex;
	// khoi tao mang 2 chieu
	int[][] matrix = null;

	// dem so thanh phan lien thong
	int countConnect = 1;

	boolean[] visited;

	// khoi tao mang de luu tree
	//int[][] treeTmp;

	boolean[] visitedVexT;

	List<Integer> listTransvel;

	public Tree() {

	}

	public Tree(int[][] matrix) {
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.matrix = matrix;

	}

	
	public Tree(int numVex) {
		this.numVex = numVex;
		this.visited = new boolean[numVex];
		this.matrix = new int[numVex][numVex];
		visitedVexT = new boolean[numVex];
		listTransvel = new ArrayList<>();
	}

	public int[][] readFile(String pathName) {
		String line;
		// khoi tao ma tran ke
		matrix = null;
		// so dong
		int row = 0;
		// so dinh
		int vex = 0;
		// Ä‘áº¿m sá»‘ dÃ²ng trong file
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					// Ä‘ï¿½?c dÃ²ng Ä‘áº§u tiÃªn cá»§a file láº¥y dÆ°á»£c sá»‘
					// Ä‘á»‰nh cá»§a Ä‘á»“ thá»‹
					if (count == 1) {
						vex = Integer.parseInt(line);
						matrix = new int[vex][vex];
					} else {
						// nhá»¯ng dÃ²ng tiáº¿p theo ta sáº½ láº¥y Ä‘Æ°á»£c ma
						// tráº­n kï¿½? nÃªn
						// ta
						// cáº§n chia má»—i dÃ²ng thÃ nh nhiï¿½?u pháº§n tá»­
						// má»—i pháº§n tá»­ lÃ 
						// 1 giÃ¡ trá»‹ cá»§a ma tráº­n kï¿½?
						String[] elements = line.split(" ");
						// gan gia trá»‹ vÃ o trong ma tráº­n
						for (int col = 0; col < vex; col++) {
							matrix[row][col] = Integer.parseInt(elements[col]);
						}
						row++;
					}
				}
			} catch (Exception e) {
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return matrix;
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
	 * Them mot canh vao do thi Input : src : dinh nguon Output : dest - dinh
	 * dich
	 */

	public void addEdge(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 1;
		} else
			System.out.println("Khong ton tai dinh");
	}

	/*
	 * Xoa mot canh cua do thi Input : src : dinh nguon Output : dest - dinh
	 * dich
	 */

	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		}
	}

	/*
	 * Tinh bac cua dinh cho truoc Input : vex - dinh can tinh
	 */
	public int degreeVex(int vex) {
		int degreeVex = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			degreeVex += matrix[vex][i];
		}
		return degreeVex;
	}

	/*
	 * Tinh bac cua do thi Output : so bac cua do thi
	 */

	public int degreeGraph() {
		int sumDegree = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumDegree += degreeVex(i);
		}
		return sumDegree;
	}

	/*
	 * Tinh so canh cua do thi Output : so canh cua do thi da cho
	 */

	public int numEdge() {
		int edge = 0;
		for (int i = 0; i < matrix.length; i++) {
			edge += degreeVex(i);
		}
		return edge / 2;
	}

	/*
	 * Duyet theo chieu rong (BFS)
	 * @param : chon 1 dinh bat ky lam dinh xuat phat
	 * @return : ma tran ke chua tree
	 */
	public UndiretedGraph DFS(int vex) {
		UndiretedGraph graph = new UndiretedGraph(numVex);
		visitedVexT[vex] = true;
		visit(vex, graph);
		return graph;
	}

	public void visit(int v, UndiretedGraph graph) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[v][i] > 0 && !visitedVexT[i]) {
				visitedVexT[i] = true;
				//them canh v, i vao tree
				graph.addEdge(v, i);
				visit(i, graph);
			}
		}
	}

	/*
	 * Duyet theo chieu rong (BFS)
	 * @param : chon 1 dinh bat ky lam dinh xuat phat
	 * @param : Ma tran ke de luu tree
	 * @return : ma tran ke chua tree
	 */
	public UndiretedGraph BFS(int v, UndiretedGraph graph) {
		// khoi tao queue
		Queue<Integer> queue = new LinkedList<Integer>();
		// them dinh v vao queue
		queue.add(v);
		// danh dau dinh v la da duyet vao trong visited
		visitedVexT[v] = true;
		while (!queue.isEmpty()) {
			v = queue.remove();
			// kiem tra cac dinh ke voi v duoc duyet chua
			for (int i = 0; i < numVex; i++) {
				if (!visitedVexT[i] && matrix[v][i] > 0) {
					queue.add(i);
					// danh dau dinh ke voi dinh v la i la da duyet
					visitedVexT[i] = true;
					//them canh v, i vao tree
					graph.addEdge(v, i);
				}
			}
		}
		return graph;
	}

	/*
	 * Duyet cay theo preorder : root - left - right
	 * @param : 1 dinh goc cua cay da duoc xac dinh truoc
	 * @return : danh sach cac dinh da duyet
	 */
	public List<Integer> preorder(int root) {
		// minh cho 1 dinh lam root trong T
		visited[root] = true;
		listTransvel.add(root);
		for (int i = 0; i < matrix.length; i++) {
			if (!visited[i] && matrix[root][i] > 0) {
				preorder(i);
			}
		}
		return listTransvel;
	}

	/*
	 * Duyet cay theo postorder : left - right - root
	 * @param : 1 dinh goc cua cay da duoc xac dinh truoc
	 * @return : danh sach cac dinh da duyet
	 */
	public List<Integer> postorder(int root) {
		// minh cho 1 dinh lam root trong T
		visited[root] = true;
		for (int i = 0; i < matrix.length; i++) {
			if (!visited[i] && matrix[root][i] > 0) {
				postorder(i);
			}
		}
		listTransvel.add(root);
		return listTransvel;
	}
	
	/*
	 * Duyet cay theo inorder : left - root - right
	 * @param : 1 dinh goc cua cay da duoc xac dinh truoc
	 * @return : danh sach cac dinh da duyet
	 */
	public List<Integer> inorder(int root) {
		visited[root] = true;
		
		//kiem tra xem dinh root co phai la lá hay khong
		if (degreeVex(root) == 1) {
			//them la vao
			listTransvel.add(root);
		} else {
			//lay nhanh ben trai cua cay de xet
			for (int i = 0; i < matrix.length; i++) {
				if (!visited[i] && matrix[root][i] > 0) {
					inorder(i);
					break;
				}
			}
			//them goc vao
			listTransvel.add(root);
			//lay nhanh ben phai cua cay de xet
			for (int i = 0; i < matrix.length; i++) {
				if (!visited[i] && matrix[root][i] > 0) {
					inorder(i);
				}
			}
		}
		return listTransvel;
	}

	public void println(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

}
