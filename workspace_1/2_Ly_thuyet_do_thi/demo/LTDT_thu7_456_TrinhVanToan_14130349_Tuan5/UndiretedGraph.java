package LTDT_thu7_456_TrinhVanToan_14130349_Tuan5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
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

	int index = 0;

	int[] path;

	int soCanh = 0;

	int[] pathHamilton;

	// Array of lists for Adjacency List Representation
	private LinkedList<Integer>[] adj;

	/*
	 * HÃ m khá»Ÿi táº¡o dá»“ thá»‹ dáº¡ng ma tráº­n
	 */

	public UndiretedGraph() {

	}

	public UndiretedGraph(int[][] matrix) {
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.matrix = matrix;
		this.adj = new LinkedList[matrix.length];
		for (int i = 0; i < matrix.length; ++i)
			adj[i] = new LinkedList();
		this.path = new int[numVex];

	}

	/*
	 * HÃ m khá»Ÿi táº¡o dá»“ thá»‹ dáº¡ng ma tráº­n Input : so dinh cua do thi
	 * - numVex
	 */
	public UndiretedGraph(int numVex) {
		this.numVex = numVex;
		this.visited = new boolean[numVex];
		this.matrix = new int[numVex][numVex];
		this.adj = new LinkedList[numVex];
		for (int i = 0; i < numVex; ++i)
			adj[i] = new LinkedList();
		this.path = new int[numVex];
		this.pathHamilton = new int[numVex];
	}

	/*
	 * ï¿½?ï¿½?c do thi tu file Input : pathName - duong dan noi chua file can
	 * doc Output : mang 2 chiu
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
		// dáº¿m sá»‘ dÃ²ng trong file
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					// dï¿½?c dÃ²ng dáº§u tien cua file lay dÆ°á»£c sá»‘
					// dinh cua dá»“ thá»‹
					if (count == 1) {
						vex = Integer.parseInt(line);
						matrix = new int[vex][vex];
					} else {
						// nhá»¯ng dÃ²ng tiáº¿p theo ta sáº½ lay dÆ°á»£c ma
						// tráº­n kï¿½? nen
						// ta
						// cáº§n chia má»—i dÃ²ng thÃ nh nhiï¿½?u pháº§n tá»­
						// má»—i pháº§n tá»­ lÃ 
						// 1 gia trá»‹ cua ma tráº­n kï¿½?
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

	/*
	 * In do thi input : nháº­p vÃ o 1 ma tráº­n
	 */
	@Override
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
	 * Them má»™t cáº¡nh vÃ o dá»“ thá»‹ Input : - src : dinh nguá»“n hay sá»‘
	 * hÃ ng trong matrix - dest : dinh dÃ­ch hay sá»‘ cá»™t trong matrix
	 */
	@Override
	public void addEdge(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 1;
			// them vao danh sach dinh ke cua 1 dinh
			// adj[src].add(dest);
		} else
			System.out.println("Khong tá»“n táº¡i dinh");
	}

	/*
	 * Xoa má»™t cáº¡nh cua dá»“ thá»‹ Input : - src : dinh nguá»“n hay sá»‘
	 * hÃ ng trong matrix - dest : dinh dÃ­ch hay sá»‘ cá»™t trong matrix
	 */
	@Override
	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		}
	}

	/*
	 * TÃ­nh báº­c cua má»™t dinh cho trÆ°á»›c Input : vex - dinh cáº§n tÃ­nh
	 */
	public int degreeVex(int vex) {
		int degreeVex = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			degreeVex += matrix[vex][i];
		}
		return degreeVex;
	}

	/*
	 * TÃ­nh báº­c cua dá»“ thá»‹ Output : sá»‘ báº­c cáº§n tÃ­nh
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
	 * TÃ­nh sá»‘ cáº¡nh cua dá»“ thá»‹ Output : sá»‘ cáº¡nh cáº§n tÃ­nh
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
	 * Kiá»ƒm tra tÃ­nh lien thong output : true - dá»“ thá»‹ lien thong false -
	 * dá»“ thá»‹ khong lien thong
	 */
	@Override
	public boolean checkConnected() {
		for (int i = 0; i < matrix.length; i++) {
			DFS(i);
			for (int j = 0; j < visited.length; j++) {
				if (!visited[j]) {
					return false;
				}
			}
		}
		return true;
	}

	// duyá»‡t theo chiá»�u sÃ¢u sá»­ dá»¥ng dá»‡ quy dá»ƒ duyá»‡t
	@Override
	public void DFS(int v) {
		visited[v] = true;
		// kiem tra cac dinh ke voi v duoc duyet chua. neu chua thi de quy lai
		// dinh i
		for (int i : adjacent(v)) {
			if (!visited[i])
				DFS(i);
		}
	}

	// duyá»‡t theo chiá»�u rá»™ng khong sá»­ dá»¥ng dá»‡ quy
	@Override
	public void nonrecursiveDFS(int v) {
		// khoi tao stack
		Stack<Integer> stack = new Stack<Integer>();
		// them dinh v vao stack
		stack.push(v);
		// danh dau dinh v la da duyet vao trong visited
		while (!stack.empty()) {
			// lay 1 dinh ra khoi stack
			v = stack.pop();
			visited[v] = true;
			// kiem tra cac dinh ke voi v duoc duyet chua. neu chua thi them vao
			// stack
			for (int i : adjacent(v)) {
				if (!visited[i]) {
					stack.push(i);
				}
			}

		}
	}

	// duyet theo chieu rong
	@Override
	public void BFS(int v) {
		// khoi tao queue
		Queue<Integer> queue = new LinkedList<Integer>();
		// them dinh v vao queue
		queue.add(v);
		// danh dau dinh v la da duyet vao trong visited
		visited[v] = true;
		while (!queue.isEmpty()) {
			v = queue.remove();
			// kiem tra cac dinh ke voi v duoc duyet chua
			for (int i : adjacent(v)) {
				if (!visited[i]) {
					queue.add(i);
					// danh dau dinh ke voi dinh v la i la da duyet
					visited[i] = true;
				}
			}
		}
	}

	/*
	 * In ra duong di tu dinh v den dinh v1 theo duyet theo chieu sau Input :
	 * dinh bat dau va dinh can den Output : duong di tu 1 dinh den 1 dinh cho
	 * truoc
	 */
	@Override
	public void pathDFS(int v, int v1) {
		path[index] = v;
		index++;
		visited[v] = true;
		if (v == v1) {
			for (int i = 0; i < index; i++) {
				System.out.print(path[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < numVex; i++) {
			if (!visited[i] && matrix[v][i] > 0) {
				pathDFS(i, v1);
				// xet tat ca cac dinh ke hien tai thanh false dáº» xem nhu chua
				// di wa.sau khi de quy xong thi
				// phuong thuc xe di nguoc tu duoi , va con nhung dinh cua cua
				// dinh o tren se duoc tim duong tiep
				visited[i] = true;
				index--;
			}
		}
	}

	/*
	 * dem so thanh phan lien thong dua vao duyet theo chieu sau output : tra ve
	 * so thanh phan lien thong
	 */
	@Override
	public int countConnect() {
		for (int i = 0; i < matrix.length; i++) {
			if (visited[i] == false) {
				DFS(i);
				countConnect++;

			}
		}
		return countConnect;
	}

	/*
	 * liet ke cac dinh ke voi dinh v input : dinh v output : danh sach cac dinh
	 * ke voi dinh v
	 */
	public LinkedList<Integer> adjacent(int u) {
		for (int i = 0; i < matrix.length; i++) {
			if (!visited[i] && matrix[u][i] > 0) {
				adj[u].add(i);
			}
		}
		return adj[u];
	}

	/*
	 * Kiá»ƒm tra dá»“ thá»‹ co chu trinh Euler hay khong Dá»±a vÃ o dá»‹nh lÃ½
	 * Euler 1 : Do thi vo hÆ°á»›ng lien thong , má»�i dinh dá»�u co báº­c
	 * cháºµn
	 */
	@Override
	public boolean checkCycleEuler() {
		if (!checkConnected()) {
			// System.out.println("Do thi khong co chu trinh Euler");
			return false;
		}
		for (int i = 0; i < matrix.length; i++) {
			if (degreeVex(i) % 2 == 1) {
				// System.out.println("Do thi khong co chu trinh
				// Euler");
				return false;
			}
		}
		// System.out.println("Do thi co chu trinh Euler");
		return true;

	}

	/*
	 * Kiá»ƒm tra dá»“ thá»‹ co duong di Euler hay khong Dá»±a vÃ o dá»‹nh lÃ½
	 * Euler 2 : Do thi vo hÆ°á»›ng lien thong , co duong di Euler vÃ  khong co
	 * chu trinh Euler <=> co dÃºng 2 dinh báº­c láº»
	 */
	@Override
	public boolean checkPathEuler() {
		if (!checkConnected()) {
			// System.out.println("Do thi khong co duong di Euler");
			return false;
		}
		// dem so dinh bac le
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (degreeVex(i) % 2 == 1) {
				count++;
			}
		}
		if (count == 2) {
			// System.out.println("Do thi co duong di Euler");
			return true;
		}

		System.out.println("Do thi khong co duong di Euler");
		return false;

	}

	// ?
	/*
	 * Kiem tra do thi luong phan -1 : chua co mau 1: mau thu nhat 0: mau thu
	 * hai
	 */
	public boolean checkBi(int v) {
		int[] color = new int[numVex];
		for (int i = 0; i < numVex; i++) {
			color[i] = -1;
		}
		// danh dau mau cho diem da di wa
		color[v] = 1;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		while (!queue.isEmpty()) {
			// lay ra dinh dau trong queue de duyet
			int u = queue.poll();
			// tim tat ca cac dinh ke chua co mau
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[u][i] > 0 && color[i] == -1) {
					// gan mau cho cac dinh ke voi u
					color[i] = 1 - color[u];
					queue.add(i);
				}
				// neu trung mau voi dinh ke voi no thi tra ve false
				else if (matrix[u][i] == 1 && color[i] == color[u])
					return false;
			}
		}
		return true;
	}

	public boolean checkBiDFS(int v) {
		int[] color = new int[numVex];
		for (int i = 0; i < numVex; i++) {
			color[i] = -1;
		}
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(v);
		color[v] = 1;
		while (!stack.isEmpty()) {
			int u = stack.pop();
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[u][i] > 0 && color[i] == -1) {
					color[i] = (color[u] == 0) ? 1 : 0;
					stack.push(i);
				} else if (matrix[u][i] == 1 && color[i] == color[u])
					return false;
			}
		}
		return true;
	}

	public boolean checkBipartite() {
		for (int i = 0; i < matrix.length; i++) {
			if (!checkBiDFS(i)) {
				System.out.println("Do thi khong lÆ°á»¡ng phÃ¢n");
				return false;
			}
		}
		System.out.println("Do thi lÆ°á»¡ng phÃ¢n");
		return true;
	}

	/*
	 * Tim chu trinh Euler dua vao thuat toan Fleury Má»—i khi di qua má»™t
	 * cáº¡nh nÃ o do thi xoa no di, sau do xoa dinh co láº­p (náº¿u co). Khong
	 * bao giá»� di qua cáº§u tru khi khong cÃ²n cach di nÃ o khac.
	 */
	public void cycleEuler(int vex) {
		if (!checkCycleEuler()) {
			return;
		}
		Stack<Integer> path = new Stack<Integer>();
		path.add(vex);
		while (numEdge() > 0) {
			for (int i = 0; i < matrix.length; i++) {
				// tim ra nhung dinh ke voi vex
				if (matrix[vex][i] > 0) {
					removeEdges(vex, i);
					// kiem tra khong co duong di tu dinh v den dinh i
					if (!(degreeVex(i) == 0)) {
						path.add(i);
						vex = i;
						break;
					}
					addEdge(vex, i);
					// neu duong di tu vex den i la cau, khong con duong nao di
					if (degreeVex(vex) == 1) {
						removeEdges(vex, i);
						path.add(i);
						vex = i;
						break;
					}

				}
			}
		}
		// duyet de in ra chu trinh euler
		Iterator itr = path.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	/*
	 * Tim va in ra duong di euler input : 1 dinh xuat phat bat ky
	 */
	public void pathEuler(int vex) {
		if (!checkPathEuler()) {
			return;
		}
		// tim kiem va gan dinh le lam diem xuat phat
		for (int i = 0; i < matrix.length; i++) {
			if (degreeVex(i) % 2 == 1) {
				vex = i;
				break;
			}
		}
		Stack<Integer> path = new Stack<Integer>();
		path.add(vex);
		while (numEdge() > 0) {
			for (int i = 0; i < matrix.length; i++) {
				// tim ra nhung dinh ke voi vex
				if (matrix[vex][i] > 0) {
					removeEdges(vex, i);
					// kiem tra khong co duong di tu dinh v den dinh i
					if (!(degreeVex(i) == 0)) {
						path.add(i);
						vex = i;
						break;
					}
					addEdge(vex, i);
					// neu duong di tu vex den i la cau, khong con duong nao di
					if (degreeVex(vex) == 1) {
						removeEdges(vex, i);
						path.add(i);
						vex = i;
						break;
					}

				}
			}
		}
		// duyet de in ra duong di euler
		Iterator itr = path.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

	// phuong tim chu trinh euler cua co
	// public void cycleEuler(int vex){
	// int[] tmp = new int[numEdge() + 1];
	// int[] finalPath = new int[numEdge() + 1];
	//
	// int indexStack = 0;
	// int indexPath = 0;
	//
	// tmp[indexStack] = vex;
	// int i;
	//
	// if(checkCycleEuler()){
	//
	// do {
	// int v = tmp[indexStack];
	// i = 0;
	// while(i < numVex && matrix[v][i] == 0){
	// i++;
	// }
	// System.out.print(i + " ");
	// if(i < numVex) {
	// indexStack++;
	// tmp[indexStack] = i;
	// removeEdges(v, i);
	// }else {
	// indexPath++;
	// finalPath[indexPath] = v;
	// indexStack--;
	// }
	// }while(indexStack != 0);
	//
	// System.out.println(" co chu trinh euler");
	//
	// System.out.print(vex + "\t");
	// for (int j = indexPath; j > 0 ; j--) {
	// System.out.print(finalPath[j] + "\t");
	//
	// }
	// System.out.println();
	// }
	// }

	/*
	 * In ra nhiu chu trinh / duong di euler Input : 1 dinh cho xuat phat
	 */
	public void multiPathCycleEuler(int vex) {
		// luu tru so canh cua do thi luc ban dau
		soCanh = numEdge();
		// luu cac dinh da di
		path = new int[soCanh + 1];
		if (checkCycleEuler()) {
			path[0] = vex;
			// tim nhung dinh tiep theo bat dau tu vi tri thu 1 trong path
			findNext(1);
		} else if (checkPathEuler()) {
			for (int i = 0; i < matrix.length; i++) {
				if (degreeVex(i) % 2 == 1) {
					path[0] = i;
					break;
				}
			}
			findNext(1);
		}
	}

	// tim nhung duong di co the di tu 1 dinh
	private void findNext(int indexNext) {
		// base case : neu vi tri tiep theo trong mang path > soCanh
		// cua do thi thi se in ra duong di
		if (indexNext > soCanh) {
			for (int i = 0; i < path.length; i++) {
				System.out.print(path[i] + " ");
			}
			System.out.println();
			return;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[path[indexNext - 1]][i] > 0) {
					// gan dinh tiep theo se di qua
					path[indexNext] = i;
					// xoa canh
					removeEdges(path[indexNext - 1], i);
					// de quy de tim duong di tiep theo
					findNext(indexNext + 1);
					// phai them lai canh thi luc sau de quy toi
					// nhung dinh ke tiep theo moi con duong de di
					addEdge(path[indexNext - 1], i);
				}
			}
		}

	}

	// dua theo Ä�á»‹nh lÃ½ (Dirac)
	public boolean checkHamilton() {
		int count = 0;
		if (checkConnected()) {
			for (int i = 0; i < matrix.length; i++) {
				if (degreeVex(i) >= (matrix.length / 2)) {
					count++;
				}
			}
			if (count == matrix.length) {
				System.out.println("Do thi co chu trinh Hamilton");
				return true;
			} else
				System.out.println("Do thi khong co chu trinh Hamilton, nhung co duong di hamilton");
			return true;
		} else
			return false;
	}

	/*
	 * Phuong thuc in ra tat ca chu trinh / duong di hamilton
	 */
	public void allCycleHamilton(int vex) {
		if (checkHamilton()) {
			reset();
			visited[vex] = true;
			pathHamilton[0] = vex;
			if (!(expand(1))) {
				System.out.printf("Khong co duong di xuat phat tu dinh %d\nNen in ra duong di cua tat ca cac dinh\n",
						vex);
				for (int i = 0; i < matrix.length; i++) {
					pathHamilton[0] = i;
					visited[i] = true;
					expand(1);
					visited[i] = false;
				}

			}
		}
	}

	private boolean expand(int next) {
		boolean tmp = false;
		if (next >= numVex) {
			for (int i = 0; i < pathHamilton.length; i++) {
				System.out.print(pathHamilton[i] + " ");
			}
			if (matrix[pathHamilton[numVex - 1]][pathHamilton[0]] > 0) {
				System.out.print(pathHamilton[0]);
			}
			System.out.println();
			return true;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				if (!(visited[i]) && (matrix[pathHamilton[next - 1]][i] > 0)) {
					visited[i] = true;
					pathHamilton[next] = i;
					tmp = expand(next + 1);
					visited[i] = false;
				}
			}
		}
		return tmp;
	}

	private void reset() {
		for (int i = 0; i < matrix.length; i++) {
			visited[i] = false;
		}
	}

	// in ra 1 chu trinh / duong di Hamilton
	public void oneCycleHamilton(int vex) {
		if (checkHamilton()) {
			reset();
			visited[vex] = true;
			pathHamilton[0] = vex;
			if (!(expand1(1))) {
				System.out.printf("Khong co duong di xuat phat tu dinh %d\nNen in ra duong di cua tat ca cac dinh\n",
						vex);
				for (int i = 0; i < matrix.length; i++) {
					pathHamilton[0] = i;
					visited[i] = true;
					expand1(1);
					visited[i] = false;
				}

			}
		}
	}

	private boolean expand1(int next) {
		boolean tmp = false;
		if (next >= numVex) {
			for (int i = 0; i < pathHamilton.length; i++) {
				System.out.print(pathHamilton[i] + " ");
			}
			if (matrix[pathHamilton[numVex - 1]][pathHamilton[0]] > 0) {
				System.out.print(pathHamilton[0]);
			}
			System.out.println();
			return true;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				if (!(visited[i]) && (matrix[pathHamilton[next - 1]][i] > 0)) {
					visited[i] = true;
					pathHamilton[next] = i;
					tmp = expand1(next + 1);
					visited[i] = true;
				}
			}
		}
		return tmp;
	}
}
