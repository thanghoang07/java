package ly_thuyet_do_thi_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DirectedGraph extends GraphTheory {
	// khởi tạo một matrix rỗng
	public int[][] matrix = null;
	// khỏi tạo số cạnh matrix
	int numVex;
	//
	private BufferedReader br;
	// khởi tạo một mảng boolean vị trí các đỉnh viếng thăm
	public boolean[] visited;
	// khởi tạo một giá trị cho thành phần liên thông
	int countConnected = 1;
	// Array of lists for Adjacency List Representation
	private LinkedList<Integer>[] dinhKe;
	// khoi tao mang chua duogn di
	public int[] path;
	// dem so phan tu hien co trong mang
	public int indext;

	// khởi tạo matrix có hướng
	public DirectedGraph() {

	}

	// khởi tạo matrix có hướng
	public DirectedGraph(int[][] matrix) {
		this.matrix = matrix;
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.dinhKe = new LinkedList[numVex];
		for (int i = 0; i < numVex; ++i)
			dinhKe[i] = new LinkedList();
		this.path = new int[matrix.length];
	}

	// khoi tao matrix dang nhap vao dinh
	public DirectedGraph(int numVex) {
		this.numVex = numVex;
		this.visited = new boolean[numVex];
		this.matrix = new int[numVex][numVex];
		this.dinhKe = new LinkedList[numVex];
		for (int i = 0; i < numVex; ++i)
			dinhKe[i] = new LinkedList();
		this.path = new int[numVex];

	}

	// doc matran tu file
	@Override
	public int[][] readMatrix(File fileName) {
		String line;
		matrix = null; // gan cho matrix ban dau bang rong
		int row = 0; // so_dong
		int vex = 0; // so_dinh_cua_do_thi
		int count = 0;// đếm_số_dòng_đã_đọc_dòng_đầu_tiên_là_số_đỉnh
		try {
			br = new BufferedReader(new FileReader(fileName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					if (count == 1) {// số_đỉnh_của_đồ_thị
						vex = Integer.parseInt(line);
						matrix = new int[vex][vex];
					} else {// matrix
						String[] elements = line.split(" ");
						for (int col = 0; col < vex; col++) {// lấy_từng_phần_tử_gán_vào_matrix
							matrix[row][col] = Integer.parseInt(elements[col]);
						}
						row++;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return matrix;
	}

	// in matrix
	@Override
	public void printGraph(int[][] matrix) {
		// so hang,
		for (int i = 0; i < matrix.length; i++)
			System.out.printf("%3d", i);
		System.out.println();
		// in ra so cot
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i + " ");
			// in matrix
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + "  ");
			System.out.println();
		}
	}

	// them vao matrix co hướng mot canh
	@Override
	public void addEdges(int src, int dest) {
		if (matrix.length == 0) {
			System.out.println("Matrix chưa được tạo");
		}
		if (src >= matrix.length && dest >= matrix.length) {
			System.out.println("Vị trí vượt quá giới hạn");
		}
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}
	
	@Override
	public void addEdgesNumber(int src, int dest, int trongSo) {
		if (matrix.length == 0) {
			System.out.println("Matrix chưa được tạo");
		}
		if (src >= matrix.length && dest >= matrix.length) {
			System.out.println("Vị trí vượt quá giới hạn");
		}
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = trongSo;
			matrix[dest][src] = 0;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
		
	}

	// xoa bo mot canh trong matrix có hướng
	@Override
	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// bậc_vào_cuả_đỉnh_duyệt_theo_chiều_dọc_của_matrix_kề
	public int din(int vex) {
		int din = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			din += matrix[i][vex];
		}
		return din;
	}

	// bậc_ra_của_đỉnh_duyệt_theo_chiều_ngang_của_matrix_kề
	public int dout(int vex) {
		int dout = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			dout += matrix[vex][i];
		}
		return dout;
	}

	// tinh tong bac cua matrix
	@Override
	public int degreeGraph() {
		if (matrix.length == 0) {
			System.out.println("Matrix chưa được tạo");
		}
		int degreeG = 0;
		for (int i = 0; i < matrix.length; i++) {
			degreeG += dout(i);
		}
		return degreeG;
	}

	// tinh so canh cua matrix
	@Override
	public int numEdges() {
		int edge = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				edge += matrix[i][j];
			}
		}
		return edge;
	}

	@Override
	public void DFSUseStack(int vex) {
		Stack<Integer> stack = new Stack<>();
		stack.push(vex);
		visited[vex] = true;
		while (!stack.empty()) {
			vex = stack.pop();
			visited[vex] = true;
			for (int j = 0; j < matrix.length; j++) {
				if (!visited[j] && matrix[vex][j] > 0) {
					stack.push(j);
				}
			}
		}
	}

	@Override
	public void DFS(int vex) {
		visited[vex] = true;
		for (int i = 0; i < matrix.length; i++) {
			if (!visited[i] && matrix[vex][i] > 0) {
				DFS(i);
			}
		}
	}

	@Override
	public void BFSUseQueue(int vex) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(vex);// them vao hang doi
		visited[vex] = true;
		while (!queue.isEmpty()) {
			vex = queue.remove(); // lay gia trị pah tu ra khoi hang doi
			int acx = vex;
			// System.out.print(acx + "---"); //The BFS traversal of the graph
			for (int i = 0; i < matrix.length; i++) {
				if (!visited[i] && matrix[vex][i] > 0) {
					queue.add(i); // tiep tuc them dinh vao hang doi
					visited[i] = true;
				}
			}
		}
	}

	@Override
	public int countConnectedDFSUseStack() {
		for (int i = 0; i < matrix.length; i++) {
			if (visited[i] == false) {
				countConnected++;
				DFSUseStack(i);
			}
		}
		return countConnected;
	}

	@Override
	public int countConnectedDFS() {
		for (int i = 0; i < matrix.length; i++) {
			if (visited[i] == false) {
				countConnected++;
				DFS(i);
			}
		}
		return countConnected;
	}

	@Override
	public int countConnectedBFSUseQueue() {
		for (int i = 0; i < matrix.length; i++) {
			if (visited[i] == false) {
				countConnected++;
				BFSUseQueue(i);
			}
		}
		return countConnected;
	}

	/**
	 * kiem tr lien thong
	 */
	// kiểm tra tính liên thông của matrix
	@Override
	public boolean isConnected() {
		int i = 0;
		visited = new boolean[matrix.length];
		Stack<Integer> stack = new Stack<>();
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
		for (int j = 0; j < matrix.length; j++) {
			if (!visited[j]) {
				return false;
			}
		}
		return true;
	}

	// kiểm tra liên thông mạnh, yếu
	// mạnh
	public boolean isStrongConnected() {
		// duyet mang
		for (int j = 0; j < matrix.length; j++) {
			// duyet mang
			for (int i = 0; i < matrix[0].length; i++) {
				/*
				 * kiem tra coi giua hai diem co ton tai duong di tu diem nay
				 * toi diem kia va nguoc lai, va voi moi dinh cua do thi
				 */
				// khong thi tra ve false
				if (!checkConnect(j, i))
					return false;
			}
		}
		// co thi tra ve true
		return true;
	}

	// yếu
	public boolean isWeakConnected() {
		// neu do thi khong lien thong manh true
		if (!isStrongConnected()) {
			return true;
		} else {
			// nguoc lai tra ve false
			return false;
		}
	}

	// kiểm tra liên thông giữa hai điểm
	public boolean checkConnect(int a, int b) {
		// khoi tao bien boolean ban dau la false
		boolean connect = false;
		// neu phan tu tai vi tri do lon hon ko thi tra ve true
		if (matrix[a][b] > 0)
			return true;
		// nguoc lai
		else {
			try {
				// khoi tao stack
				Stack<Integer> stack = new Stack<Integer>();
				// duyet mang
				for (int i = 0; i < matrix.length; i++) {
					// neu phan tu tai vi tri do lon hon khon va hai diem do
					// khac nhau
					if (matrix[a][i] > 0 && i != a)
						// them dinh do vao stack
						stack.add(i);
				}
				// vong lap while kiem tra coi stack co rong ko
				while (stack.size() != 0) {
					// de quy lai checkConnect
					connect = checkConnect(stack.pop(), b);
					// neu connect bang true thi tra ve true
					if (connect == true)
						return true;
				}
			} catch (StackOverflowError e) {
				return false;
			}
		}
		// tra ve bien boolean connect
		return connect;
	}

	// lam moi mang boolean
	public void reset() {
		// duyet mang
		for (int i = 0; i < numVex; i++) {
			// gan can phan tu trong mang bang false
			visited[i] = false;
		}
	}

	// in duong di 1 duong
	public void path(int src, int dest) {
		path[indext] = src;
		indext++;
		visited[src] = true;
		if (src == dest) {
			for (int i = 0; i < indext; i++) {
				System.out.print(path[i] + "|");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < numVex; i++) {
			if (matrix[src][i] == 1 && visited[i] == false) {
				path(i, dest);
				visited[i] = false;
				indext--;
			}
		}
	}

	/**
	 * Chu trinh euler
	 *
	 */

	public boolean checkEuler() {
		for (int i = 0; i < dinhKe.length; i++) {
			if (isWeakConnected() && !checkDinhCoLap(i) && kiemTraDKConLaiDL4(i)) {
				System.out.println("Do thi euler co duong di euler");
				return true;
			}
			if (isWeakConnected()) {
				System.out.println("Do thi euler co duong di");
				return true;
			}
			if (isStrongConnected()) {
				System.out.println("Do thi lien thong manh");
				return false;
			}
		}
		System.out.println("Do thi khong phai la do thi euler");
		return false;
	}

	public boolean checkDinhCoLap(int vex) {
		for (int i = 0; i < matrix[vex].length; i++) {
			if (din(i) == 0 && dout(i) == 0) {
				System.out.println("do thi co dinh co lap");
				return true;
			}
		}
		System.out.println("do thi khong co dinh co lap");
		return false;
	}

	public boolean kiemTraDKConLaiDL4(int vex) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (din(i) == dout(i) + 1) {
				count1++;
				continue;
			}
			if (dout(i) == din(i) + 1) {
				count2++;
				continue;
			}
		}
		if (count1 == 1 && count2 == 1) {
			System.out.println("count1: " + count1);
			System.out.println("count2: " + count2);
			System.out.println("Thoa dl 4");
			return true;
		}
		System.out.println("count1: " + count1);
		System.out.println("count2: " + count2);
		System.out.println("khong thoa dl 4");
		return false;
	}

	// kiem tra chu trinh
	public boolean checkCycleEuler() {
//		if (!isWeakConnected()) {
//			System.out.println("Do thi khong co chu trinh Euler");
//			return false;
//		}
		for (int i = 0; i < matrix.length; i++) {
			if (din(i) != dout(i)) {
				//System.out.println("Do thi khong co chu trinh Euler");
				return false;
			}
		}
		//System.out.println("Do thi khong co chu trinh Euler");
		return true;
	}

	// kiem tra co duong di hay khong
	public boolean checkPathEuler() {
		if (!isWeakConnected()) {
			System.out.println("Do thi khong co duong di Euler");
			return false;
		}
		// dem so dinh thoa dieu kiem o tren. Neu co dung 2 dinh thoa thi do thi
		// co chu trinh euler
		int count1 = 0, count2 = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (din(i) == dout(i) + 1) {
				count1++;
				continue;
			}
			if (din(i) + 1 == dout(i)) {
				count2++;
				continue;
			}
		}
		if (count1 == 1 && count2 == 1) {
			System.out.println("Do thi co duong di Euler");
			return true;
		}
		System.out.println("Do thi khong co duong di Euler");
		return false;
	}

	public void cycleEuler(int vex) {
		int[] tmp = new int[numEdges() + 1];
		int[] finalPath = new int[numEdges() + 1];

		int indexStack = 0;
		int indexPath = 0;

		tmp[indexStack] = vex;
		int i;

		if (checkCycleEuler()) {

			do {
				int v = tmp[indexStack];
				i = 0;
				while (i < numVex && matrix[v][i] == 0) {
					i++;
				}
				if (i < numVex) {
					indexStack++;
					tmp[indexStack] = i;
					removeEdges(v, i);
				} else {
					indexPath++;
					finalPath[indexPath] = v;
					indexStack--;
				}
			} while (indexStack != 0);

			System.out.print(vex + " ");
			for (int j = indexPath; j > 0; j--) {
				System.out.print(finalPath[j] + " ");

			}
			System.out.println();
		}
	}

	public void pathEuler(int vex) {
		int[] tmp = new int[numEdges() + 1];
		int[] finalPath = new int[numEdges() + 1];

		int indexStack = 0;
		int indexPath = 0;

		// tim va gan dinh thoa dieu kien co tong nua bac ngoai va nua bac ngoai
		// la so le
		// thoa dieu kien : nua bac ngoai = nua bac trong + 1;
		// de lam diem xuat phat
		for (int j = 0; j < matrix.length; j++) {
			if ((din(j) + dout(j)) % 2 == 1) {
				if (dout(j) == din(j) + 1) {
					vex = j;
					break;
				}
			}
		}
		tmp[indexStack] = vex;
		int i;

		if (checkPathEuler()) {
			do {
				int v = tmp[indexStack];
				i = 0;
				while (i < numVex && matrix[v][i] == 0) {
					i++;
				}
				if (i < numVex) {
					indexStack++;
					tmp[indexStack] = i;
					removeEdges(v, i);
				} else {
					indexPath++;
					finalPath[indexPath] = v;
					indexStack--;
				}
			} while (indexStack != 0);
			System.out.print(vex + " ");
			for (int j = indexPath; j > 0; j--) {
				System.out.print(finalPath[j] + " ");
			}
			System.out.println();
		}
	}

	// tim nhung duong di co the di tu 1 dinh
	private void findNext(int indexNext) {
		// base case : neu vi tri tiep theo trong mang path > soCanh
		// cua do thi thi se in ra duong di
		if (indexNext > numVex) {
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
					addEdges(path[indexNext - 1], i);
				}
			}
		}
	}

	/*
	 * In ra nhiu chu trinh / duong di euler Input : 1 dinh cho xuat phat
	 */
	public void multiPathCycleEuler(int vex) {
		// luu tru so canh cua do thi luc ban dau
		numVex = numEdges();
		// luu cac dinh da di
		path = new int[numVex + 1];
		if (checkCycleEuler()) {
			path[0] = vex;
			// tim nhung dinh tiep theo bat dau tu vi tri thu 1 trong path
			findNext(1);
		} else if (checkPathEuler()) {
			for (int i = 0; i < matrix.length; i++) {
				if ((din(i) + dout(i)) % 2 == 1) {
					if (dout(i) == din(i) + 1) {
						path[0] = i;
						break;
					}
				}
			}
			findNext(1);
		}
	}

	
	
	public void algoDijkstra(int src) {
		int min = 0, d = 0, numEdges = 0;
		int[] dist = new int[numVex];
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
				if (!visited[j] && matrix[min][j] != 0 && dist[min] != Integer.MAX_VALUE && dist[j] > d) {
					dist[j] = d;
					pred[j] = min;
					numEdges++;
				}
			}
		}
		System.out.printf("Dinh bat dau: %3d\n", src);
		System.out.printf("%3s : %3s : %3s\n", "Den dinh", "Do dai", "Duong di");
		for (int j = 0; j < pred.length; j++) {
			System.out.printf("%3d : %3d : ", j, dist[j]);
			inDuongDiD(pred, src, j);
			System.out.println();
		}
	}

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
}
