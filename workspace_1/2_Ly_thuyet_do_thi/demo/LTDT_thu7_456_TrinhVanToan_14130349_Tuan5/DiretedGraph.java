package LTDT_thu7_456_TrinhVanToan_14130349_Tuan5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class DiretedGraph extends Gragh {
	//so dinh cua 1 do thi
	int numVex;
	
	// khoi tao mang 2 chieu de bieu dien do thi
	int[][] matrix;

	boolean[] visited;
	
	int index = 0;
	
	int[] path;
	
	int soCanh = 0;

	//danh sach de luu tru cac dinh ke cua 1 dinh
	private LinkedList<Integer>[] adj;

	public DiretedGraph() {
	}
	
	public DiretedGraph(int[][] matrix) {
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.matrix = matrix;
		this.adj = new LinkedList[matrix.length];
		for (int i=0; i< matrix.length; ++i)
			adj[i] = new LinkedList();
		this.path = new int[numVex];
	}
	
	public DiretedGraph(int numVex) {
		this.numVex = numVex;
		this.visited = new boolean[numVex];
		this.matrix = new int[numVex][numVex];
		this.adj = new LinkedList[numVex];
		for (int i=0; i< numVex; ++i)
			adj[i] = new LinkedList();
		this.path = new int[numVex];
	}

	/*
	 * �?�?c do thi tu file Input : pathName - duong dan noi chua file can doc
	 * Output : mang 2 chiu
	 */
	@Override
	public int[][] readFile(String pathName) {
		String line;
		// khoi tao ma tran ke
		int[][] matrix = null;
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
					// đ�?c dòng đầu tiên của file lấy dược số đỉnh của đồ thị
					if (count == 1) {
						vex = Integer.parseInt(line);
						matrix = new int[vex][vex];
					} else {
						// những dòng tiếp theo ta sẽ lấy được ma trận k�? nên ta
						// cần chia mỗi dòng thành nhi�?u phần tử mỗi phần tử là
						// 1 giá trị của ma trận k�?
						String[] elements = line.split(" ");
						//gan gia trị vào trong ma trận
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
	 * In do thi 
	 * input : nhập vào 1 ma trận
	 */
	@Override
	public void viewGraph(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			System.out.printf("%3d" , i);
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < matrix.length; j++)
				System.out.print(matrix[i][j] + "  ");
			System.out.println();
		}

	}

	/*
	 * Thêm một cung vào đồ thị
	 * Input : 
	 * - src : đỉnh nguồn hay số hàng trong matrix
	 * - dest : đỉnh đích hay số cột trong matrix
	 */
	@Override
	public void addEdge(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
		}

	}

	/*
	 * Xóa một cung của đồ thị
	 * Input : 
	 * - src : đỉnh nguồn hay số hàng trong matrix
	 * - dest : đỉnh đích hay số cột trong matrix
	 */
	@Override
	public void removeEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 0;
		}

	}

	// tinh nua bac trong của 1 dinh duyet theo cot
	public int degDin(int vex) {
		int din = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			din += matrix[i][vex];
		}
		return din;
	}

	// tinh nua bac ngoai của 1 dinh duyet theo cot
	public int degDout(int vex) {
		int dout = 0;
		for (int i = 0; i < matrix[vex].length; i++) {
			dout += matrix[vex][i];
		}
		return dout;
	}

	/*
	 * Tính bậc của đồ thị
	 * Output : số bậc cần tính
	 */
	@Override
	public int degreeGraph() {
		int sumDegree = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumDegree += degDout(i);
		}
		return sumDegree;
	}

	/*
	 * Tính số cung của đồ thị
	 * Output : số cung cần tính
	 */
	@Override
	public int numEdge() {
		int edge = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				edge += matrix[i][j];
			}
		}
		return edge;
	}

	/*
	 * Kiểm tra tính liên thông yếu của đồ thị
	 * Tính liên thông của đồ thị có hướng chia làm liên thông yếu và liên thông mạnh
	 * output : true - đồ thị liên thông yếu
	 * 			false - đồ thị không liên thông yếu
	 */
	@Override
	public boolean checkConnected() {
		int[][] temp = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				temp[i][j] += matrix[i][j];
				temp[j][i] += matrix[i][j];
			}
		}
		UndiretedGraph u = new UndiretedGraph(temp.length);
		u.matrix = temp;
		return u.checkConnected();
	}
	
	/*
	 * Kiểm tra tính liên thông mạnh của đồ thị bằng cách duyệt đồ thị theo chi�?u sâu
	 * output : true - đồ thị liên thông mạnh
	 * 			false - đồ thị không liên thông mạnh
	 */
	public boolean checkStronglyConnect() throws Exception {
		if (matrix.length == 0) {
			throw new Exception("Matrix chưa khởi tạo");
		}
		for (int i = 0; i < matrix.length; i++) {
			if (!visitedDFS(i)) {
				System.out.println("Đồ thị không liên thông mạnh");
				return false;
			}
		}
		DiretedGraph d = reverse();
		if(d.checkConnected()){
			System.out.println("Đồ thị liên thông mạnh");
			return true;
		
		}else{
			System.out.println("Đồ thị không liên thông mạnh");
			return false;
		}
		
	}
	
	
	public boolean visitedDFS(int u) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(u);
		visited[u] = true;
		while (!stack.empty()) {
			u = stack.pop();
			for (int i : adjacent(u)) {
				if (!visited[i]) {
					visited[i] = true;
					stack.push(i);
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

	/*
	 * �?ếm số thành phần liên thông
	 * Output : số thành phần liên thông
	 */
	@Override
	public int countConnect() {
		int countConnect = 1;
		for (int i = 0; i < matrix.length; i++) {
			if (visited[i] == false) {
				countConnect++;
				DFS(i);
				
			}
		}
		return countConnect;
	}

	
	//duyệt theo chi�?u sâu sử dụng đệ quy để duyệt
	public void DFS(int v) {
		visited[v] = true;
		//kiem tra cac dinh ke voi v duoc duyet chua. neu chua thi de quy lai dinh i
		for (int i : adjacent(v)) {
			if (!visited[i])
				DFS(i);
		}
	}
	
	//duyệt theo chi�?u rộng không sử dụng đệ quy
	public void nonrecursiveDFS(int v) {
		//khoi tao stack
		Stack<Integer> stack = new Stack<Integer>();
		//them dinh v vao stack
		stack.push(v);
		//danh dau dinh v la da duyet vao trong visited
		visited[v] = true;
		while (!stack.empty()) {
			//lay 1 dinh ra khoi stack
			v = stack.pop();
			//kiem tra cac dinh ke voi v duoc duyet chua. neu chua thi them vao stack
			for (int i : adjacent(v)) {
				if (!visited[i]) {
					stack.push(i);					
				}
			}

		}
	}
	
	//duyet theo chieu rong
	public void BFS(int v){
		//khoi tao queue
		Queue<Integer> queue = new LinkedList<Integer>();
		//them dinh v vao queue
		queue.add(v);
		//danh dau dinh v la da duyet vao trong visited
		visited[v] = true;
		while (!queue.isEmpty()) {
			v = queue.remove();
			//kiem tra cac dinh ke voi v duoc duyet chua
			for (int i : adjacent(v)) {
				if (!visited[i]) {
					queue.add(i);
					//danh dau dinh ke voi dinh v la i la da duyet
					visited[i] = true;
				}
			}
		}
	}
	
	
	/*
	 * In ra duong di tu 1 dinh den 1 dinh cho truoc
	 */
	public void pathDFS(int v,int v1) {
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
				//neu gan bang true thi se in ra 1 duong, gan bang false se in ra tat ca cac duong tu v den v1
				visited[i] = true;
				index--;
			}
		}
		
	}

	/*
	 * Chuyển ma trận thành ma trận chuyển vị để kiểm tra đồ thị liên thông mạnh
	 */
	public DiretedGraph reverse() {
		DiretedGraph d = new DiretedGraph(numVex);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] > 0) {
					d.addEdge(j, i);
				}
			}

		}
		return d;
	}
	
	/*
	 * liet ke cac dinh ke voi dinh v
	 * input : dinh v 
	 * output : danh sach cac dinh ke voi dinh v
	 */
	public LinkedList<Integer> adjacent(int v) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[v][i] > 0) {
				adj[v].add(i);
			}
		}
		return adj[v];
	}

	@Override
	public boolean checkCycleEuler() {
		if (!checkConnected()) {
//			System.out.println("Đồ thị không có chu trình Euler");
			return false;
		}
		for (int i = 0; i < matrix.length; i++) {
			if (degDin(i) != degDout(i)) {
//				System.out.println("Đồ thị không có chu trình Euler");
				return false;
			}
		}
//		System.out.println("Đồ thị có chu trình Euler");
		return true;
	}
	
	/*
	 * Kiem tra do thi co chu trinh euler
	 * Dua vao dinh ly euler 4
	 * Do thi co huong, lien thong, va co dung 2 dinh thoa 
	 * + nua bac ngoai = nua bac trong + 1
	 * + nua bac trong = nua bac ngoai + 1
	 * 
	 */
	@Override
	public boolean checkPathEuler() {
		if (!checkConnected()) {
//			System.out.println("Đồ thị không có đường đi Euler");
			return false;
		}
		// dem so dinh thoa dieu kiem o tren. Neu co dung 2 dinh thoa thi do thi co chu trinh euler
		int count1 = 0, count2 = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (degDin(i) == degDout(i) + 1) {
				count1++;
				continue;
			}
			if (degDin(i) + 1 == degDout(i)) {
				count2++;
				continue;
			}
		}
		if (count1 == 1 && count2 == 1) {
//			System.out.println("Đồ thị có đường đi Euler");
			return true;
		}
//		System.out.println("Đồ thị không có đường đi Euler");
		return false;
	}

	@Override
	public boolean checkBipartite() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*
	 * Tim chu trinh euler
	 * input : dinh xuat phat
	 */
	public void cycleEuler(int vex){
		int[] tmp = new int[numEdge() + 1];
		int[] finalPath = new int[numEdge() + 1];
		
		int indexStack = 0;
		int indexPath = 0;
		
		tmp[indexStack] = vex;
		int i;
		
		if(checkCycleEuler()){
			
			do {
				int v = tmp[indexStack];
				i = 0;
				while(i < numVex && matrix[v][i] == 0){
					i++;
				}
				if(i < numVex) {
					indexStack++;
					tmp[indexStack] = i;
					removeEdges(v, i);
				}else {
					indexPath++;
					finalPath[indexPath] = v;
					indexStack--;
				}
			}while(indexStack != 0);
			
			System.out.print(vex + " ");
			for (int j = indexPath; j > 0 ; j--) {
				System.out.print(finalPath[j] + " ");
				
			}
			System.out.println();
		}
	}
	
	/*
	 * Tim va in ra duong di euler
	 * input : 1 dinh xuat phat bat ky
	 */
	public void pathEuler(int vex){
		int[] tmp = new int[numEdge() + 1];
		int[] finalPath = new int[numEdge() + 1];
		
		int indexStack = 0;
		int indexPath = 0;
		
		// tim va gan dinh thoa dieu kien co tong nua bac ngoai va nua bac ngoai la so le
		// thoa dieu kien : nua bac ngoai = nua bac trong + 1;
		// de lam diem xuat phat
		for (int j = 0; j < matrix.length; j++) {
			if ((degDin(j) + degDout(j)) % 2 == 1) {
				if (degDout(j) == degDin(j) + 1) {
					vex = j;
					break;
				}
			}
		}
		tmp[indexStack] = vex;
		int i;
		
		if(checkPathEuler()){
			
			do {
				int v = tmp[indexStack];
				i = 0;
				while(i < numVex && matrix[v][i] == 0){
					i++;
				}
				if(i < numVex) {
					indexStack++;
					tmp[indexStack] = i;
					removeEdges(v, i);
				}else {
					indexPath++;
					finalPath[indexPath] = v;
					indexStack--;
				}
			}while(indexStack != 0);
			
			System.out.print(vex + " ");
			for (int j = indexPath; j > 0 ; j--) {
				System.out.print(finalPath[j] + " ");
				
			}
			System.out.println();
		}
	}
	
	/*
	 * In ra nhiu chu trinh / duong di euler
	 * Input : 1 dinh cho xuat phat
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
				if ((degDin(i) + degDout(i)) % 2 == 1) {
					if (degDout(i) == degDin(i) + 1) {
						path[0] = i;
						break;
					}
				}
			}
			findNext(1);
		}
	}
	//tim nhung duong di co the di tu 1 dinh
	private void findNext(int indexNext) {
		//base case : neu vi tri tiep theo trong mang path > soCanh 
		//cua do thi thi se in ra duong di
		if (indexNext > soCanh) {
			for (int i = 0; i < path.length; i++) {
				System.out.print(path[i] + " ");
			}
			System.out.println();
			return;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[path[indexNext - 1]][i] > 0) {
					//gan dinh tiep theo se di qua
					path[indexNext] = i;
					//xoa canh
					removeEdges(path[indexNext - 1], i);
					//de quy de tim duong di tiep theo
					findNext(indexNext + 1);
					//phai them lai canh thi luc sau de quy toi 
					//nhung dinh ke tiep theo moi con duong de di
					addEdge(path[indexNext - 1], i);
				}
			}
		}

	}

}
