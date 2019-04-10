package demo;

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

public class UndirectedGraph extends GraphTheory {
	// khởi tạo một matrix rỗng
	int[][] matrix = null;
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
	//
	int index;
	//
	Stack<Integer> stack = new Stack<Integer>();

	// khoi tao matrix
	public UndirectedGraph() {
		super();
	}

	/**
	 * ?????????????????????????????????????????????????????????????????????????
	 */
	public UndirectedGraph(int[][] matrix) {
		super();
		this.matrix = matrix;
		this.numVex = matrix.length;
		this.visited = new boolean[matrix.length];
		this.dinhKe = new LinkedList[numVex];
		for (int i = 0; i < numVex; ++i)
			dinhKe[i] = new LinkedList();
		this.path = new int[matrix.length];
	}

	// khoi tao matrix dang nhap vao dinh
	public UndirectedGraph(int numVex) {
		this.numVex = numVex;
		this.visited = new boolean[numVex];
		this.matrix = new int[numVex][numVex];
		this.dinhKe = new LinkedList[numVex];
		for (int i = 0; i < numVex; ++i)
			dinhKe[i] = new LinkedList();
		this.path = new int[numVex];
	}

	/**
	 * doc va in do thi
	 */
	// doc matran tu file
	@Override
	public int[][] readMatrix(File fileName) {
		String line;
		// gan cho matrix ban dau bang rong
		matrix = null;
		// so_dong
		int row = 0;
		// so_dinh_cua_do_thi
		int vex = 0;
		// đếm_số_dòng_đã_đọc_dòng_đầu_tiên_là_số_đỉnh
		int count = 0;
		try {
			br = new BufferedReader(new FileReader(fileName));
			try {
				while ((line = br.readLine()) != null) {
					count++;
					// số_đỉnh_của_đồ_thị
					if (count == 1) {
						vex = Integer.parseInt(line);
						// adj[vex] = new LinkedList();
						matrix = new int[vex][vex];
					} else {// matrix
						String[] elements = line.split(" ");
						// lấy_từng_phần_tử_gán_vào_matrix
						for (int col = 0; col < vex; col++) {
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
			System.out.print(i + "");
			// in matrix
			for (int j = 0; j < matrix.length; j++)
				System.out.printf("%3d", matrix[i][j]);
			System.out.println();
		}
	}

	/**
	 * Thêm, xóa, tính số cạnh, tinh bậc của một đỉnh, tính tổng bậc của đồ thi.
	 */
	// them vao matrix mot canh
	@Override
	public void addEdges(int src, int dest) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = 1;
			matrix[dest][src] = 1;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// them vao matrix mot canh co trong so
	public void addEdgesNumber(int src, int dest, int trongSo) {
		if (src >= 0 && dest >= 0) {
			matrix[src][dest] = trongSo;
			matrix[dest][src] = trongSo;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// xoa bo mot canh
	@Override
	public void removeEdges(int src, int dest) {
		if (matrix.length == 0) {
			System.out.println("Đồ thị chưa được tạo");
		} else if (src >= 0 && dest >= 0 && src <= numVex && dest <= numVex) {
			matrix[src][dest] = 0;
			matrix[dest][src] = 0;
		} else {
			System.out.println("loi.. .  .   .   .");
		}
	}

	// tinh bac cua mot dinh bat ky
	public int degreeVex(int vex) {
		int degreeVex = 0;
		if (matrix.length == 0) {
			System.out.println("Đồ thị chưa được tạo");
		} else if (vex > numVex + 1) {
			System.out.println("loi.. .  .   .   .");
		} else {
			for (int i = 0; i < matrix[vex].length; i++) {
				degreeVex += matrix[vex][i];
			}
		}
		return degreeVex;
	}

	// tinh tong bac cua do thi
	@Override
	public int degreeGraph() {
		int degreeG = 0;
		if (matrix.length == 0) {
			System.out.println("Matrix chưa được tạo");
		}
		for (int i = 0; i < matrix.length; i++) {
			degreeG += degreeVex(i);
		}
		return degreeG;
	}

	// tinh so canh cua do thi
	@Override
	public int numEdges() {
		if (matrix.length == 0) {
			System.out.println("Matrix chưa được tạo");
		}
		int temp = 0;
		temp = degreeGraph() / 2;
		return temp;
	}

	/**
	 * Kiem tra tinh lien thong
	 */
	// kiem tra lien thong
	// duyet_theo_chieu_sau, kiem tra lien thong
	@Override
	public boolean isConnected() {
		int index = 0;
		visited = new boolean[matrix.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(index);
		while (!stack.empty()) {
			index = stack.pop();
			visited[index] = true;
			for (int j = 0; j < matrix.length; j++) {
				if (!visited[j] && matrix[index][j] > 0) {
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

	// duyệt theo chiều sâu dùng Stack
	// duyet_theo_chieu_sau
	public void DFSUseStack(int vex) {
		// khởi tạo một stack
		Stack<Integer> stack = new Stack<>();
		// thêm đỉnh bắt đầu vào stack
		stack.push(vex);
		// đánh dầu điểm đó đã đc duyệt
		visited[vex] = true;
		// kiểm tra coi stack có rõng hay ko
		while (!stack.empty()) {
			// lấy đỉnh bắt đầu ra khỏi stack
			vex = stack.pop();
			/*
			 * visited[vex] = true; for (int j = 0; j < matrix.length; j++) { if
			 * (!visited[j] && matrix[vex][j] > 0) { stack.push(j); } }
			 */
			// System.out.print(vex + " ");
			for (int i : dinhKe(vex)) {
				/*
				 * kiêm tra các đỉnh kề coi đã đc duyệt chưa? chưa thì thêm vào
				 * stack
				 */
				if (!visited[i]) {
					stack.push(i);
					visited[i] = true;
				}
			}
		}
	}

	// duyệt theo chiều sâu
	public void DFS(int vex) {
		// đánh dấu điểm đó là đã đc duyệt
		visited[vex] = true;
		/*
		 * for (int i = 0; i < matrix.length; i++) { if (!visited[i] &&
		 * matrix[vex][i] > 0) { DFS(i); } }
		 */
		for (int i : dinhKe(vex)) {
			/*
			 * kiêm tra các đỉnh kề coi đã đc duyệt chưa? chưa thì gọi đệ quy
			 * lại
			 */
			if (!visited[i] && matrix[vex][i] > 0)
				DFS(i);
		}
	}

	// duyệt theo chiều rộng dùng Queue
	// duyet_theo_chieu_rong
	public void BFSUseQueue(int vex) {
		// khỏi tạo một queue
		Queue<Integer> queue = new LinkedList<Integer>();
		// them vao hang doi
		queue.add(vex);
		// đánh dấu đỉnh nhập vào là đã duyệt
		visited[vex] = true;
		// kiểm tra coi queue có rỗng hay không
		while (!queue.isEmpty()) {
			// lay gia trị phan tu ra khoi hang doi
			vex = queue.remove();
			/*
			 * int acx = vex; System.out.print(acx + "---"); // The BFS
			 * traversal of the graph
			 *
			 * for (int i = 0; i < matrix.length; i++) { if (!visited[i] &&
			 * matrix[vex][i] > 0) { queue.add(i); // tiep tuc them dinh vao
			 * hang doi visited[i] = true; } }
			 */
			for (int i : dinhKe(vex)) {
				/*
				 * kiêm tra các đỉnh kề coi đã đc duyệt chưa? chưa thì thêm vào
				 * queue
				 */
				if (!visited[i] && matrix[vex][i] > 0) {
					// tiep tuc them dinh vao hang doi
					queue.add(i);
					visited[i] = true;
					/*
					 * đánh dấu đỉnh kề với đỉnh nhập vào là đã duyệt
					 */
				}
			}
		}
	}

	// in duong di
	// lưu các đỉnh kề của một đỉnh
	public LinkedList<Integer> dinhKe(int vex) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[vex][i] > 0) {
				/*
				 * kiểm tra coi phần tử của hàng đó có lớn hơn 0 hay không
				 */
				// thêm đỉnh vào LinkedList
				dinhKe[vex].push(i);
			}
		}
		return dinhKe[vex];
	}

	public void pathDFS(int vex, int v1) {
		path[index] = vex;
		index++;
		visited[vex] = true;
		if (vex == v1) {
			for (int i = 0; i < index; i++) {
				System.out.print(path[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < numVex; i++) {
			if (!visited[i] && matrix[vex][i] > 0) {
				pathDFS(i, v1);
				visited[i] = true;
				index--;
			}
		}
	}

	public String pathBFS(int vex, int v1) {
		String path = "";
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(vex);
		visited[vex] = true;
		while (!queue.isEmpty()) {
			int temp = queue.remove();
			path += temp + " ";
			for (int i : dinhKe(temp)) {
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
			return "khong co duong di";
		else
			return path + v1;
	}

	/**
	 * tinh bac xem bac do co chan ko trong do thi vo huong lien thong
	 * 
	 */
	public boolean tinhBacChan(int vex) {
		// tao bien tam
		int bac = 0;
		// tinh bac cua dinh trong 1 hang ( 1 hang là 1 dinh chưa cac bac)
		for (int i = 0; i < matrix.length; i++) {
			bac += matrix[vex][i];
		}
		// tra ve true neu bac chan
		if (bac % 2 == 0) {
			return true;
		} // tra ve false neu bac le
		return false;
	}

	/**
	 * Euler đồ thị Euler
	 */
	// kiem tra euler dung dinh ly euler 1
	public boolean checkEuler() {
		int demLe = 0;
		int demChan = 0;
		// kiem tra coi do thi co lien thong hay ko??
		if (isConnected()) {
			// lien thong thi tinh cac bac cua tung dinh xem co bac chan hay ko
			for (int i = 0; i < matrix.length; i++) {
				/*
				 * neu khong ton tai cac dinh deu bac chan thi tra ve false tinh
				 * bac le
				 */
				if (!tinhBacChan(i)) {
					// dem bac le tang
					demLe++;
					// neu bac le la 2 thi co duong di
					if (demLe == 2) {
						// tra ve true
						System.out.println("Đồ thị euler có hai đỉnh bậc lẻ nên có đường đi");
						return true;
					}
					// nguoc lai tra ve false return false;
				}
				// tinh bac chan
				if (tinhBacChan(i)) {
					// dem bac chan tang
					demChan++;
					// neu bac chan bang so dinh thi co do thi euler
					if (demChan == numVex) {
						// tra ve true do thi euler co chu trinh va duong di
						return true;
					}
					// nguoc lai tra ve false return false;
				}
			}
		}
		/*
		 * nguoc lai neu do thi ko lien thong thi tra ve false "Do thi khong la
		 * do thi euler"
		 */
		return false;
	}

	// tìm hết các đỉnh bậc lẻ trong đồ thị
	public List<Integer> laySoDinhBacLe() {
		// tạo một danh sách chứa các đỉnh bậc lẽ
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < numVex; i++) {
			// tim dinh bac le:
			if (!tinhBacChan(i))
				list1.add(i);
		}
		return list1;
	}

	// lam moi mang boolean
	public void reset() {
		// duyet mang
		for (int i = 0; i < numVex; i++) {
			// gan can phan tu trong mang bang false
			visited[i] = false;
		}
	}

	// in duong di euler
	public void pathEulerDinhChan(int src) {
		if (!checkEuler()) {
			System.out.println("Đồ thị không có chu trình");
		} else {
			stack.push(src);
			while (numEdges() > 0) {
				for (int i = 0; i < matrix.length; i++) {
					if (matrix[src][i] > 0) {
						removeEdges(src, i);
						// đỉnh kề
						if (!(degreeVex(i) == 0)) {
							stack.add(i);
							src = i;
							break;
						}
						addEdges(src, i);
						// cầu
						if (degreeVex(src) == 1) {
							removeEdges(src, i);
							stack.add(i);
							src = i;
							break;
						}
					}
				}
			}
			inEuler(stack);
		}
	}

	// in đường đi từ đỉnh bậc lẻ
	public void pathEulerDinhLe(int soX) {
		if (laySoDinhBacLe() == null) {
			System.out.println("Đồ thị không có đỉnh bậc lẻ");
		} else {
			Stack<Integer> stack = new Stack<Integer>();
			if (!checkEuler()) {
				System.out.println("Đồ thị không có chu trình");
			} else {
				// lay dinh le trong list1
				if (soX > 1 || soX < 0) {
					System.out.println("Đồ thị chỉ có hai đỉnh bậc lẻ!!");
				} else {
					index = laySoDinhBacLe().get(soX);
					stack.push(index);
					while (numEdges() > 0) {
						for (int j = 0; j < matrix.length; j++) {
							if (matrix[index][j] > 0) {
								removeEdges(index, j);
								if (!(degreeVex(j) == 0)) {
									stack.add(j);
									index = j;
									break;
								}
								addEdges(index, j);
								if (degreeVex(index) == 1) {
									removeEdges(index, j);
									stack.add(j);
									index = j;
									break;
								}
							}
						}
					}
					inEuler(stack);
				}
			}
		}
	}

	// in đường đi Euler
	public void inEuler(Stack<Integer> stack) {
		Iterator<Integer> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.printf("%3d", itr.next());
		}
	}

	/**
	 * code demo của cô
	 * 
	 */
	public void cycleEuler(int src) {
		int[] path = new int[(degreeGraph() / 2) + 1];
		int[] tmp = new int[(degreeGraph() / 2) + 1];
		int indexTmp = 0;
		int indexPath = 0;
		int i;
		tmp[indexTmp] = src;
		if (checkEuler()) {
			do {
				int v = tmp[indexTmp];
				i = 0;
				while (i < numVex && matrix[v][i] == 0) {
					i++;
				}
				if (i < numVex) {
					indexTmp++;
					tmp[indexTmp] = i;
					removeEdges(v, i);
				} else {
					indexPath++;
					path[indexPath] = v;
					indexTmp--;
				}
			} while (indexTmp != 0);
			System.out.print(src + " ");
			for (int j = indexPath; j > 0; j--) {
				System.out.print(path[j] + " ");
			}
		}
	}

	// code demo của cô 2
	public void cycleEuler2(int src) {
		int[] path = new int[(degreeGraph() / 2) + 1];
		int[] tmp = new int[(degreeGraph() / 2) + 1];
		int indexTmp = 0;
		int indexPath = 0;
		int i;
		tmp[indexTmp] = src;
		if (checkEuler()) {
			do {
				int v = tmp[indexTmp];
				i = 0;
				while (i < numVex && matrix[v][i] == 0) {
					i++;
				}
				if (i < numVex) {
					indexTmp++;
					tmp[indexTmp] = i;
					visited[i] = false;
					removeEdges(v, i);
				} else {
					indexPath++;
					path[indexPath] = v;
					visited[v] = false;
					indexTmp--;
				}
			} while (indexTmp != 0);
			System.out.printf("%3d", src);
			for (int j = indexPath; j > 0; j--) {
				System.out.printf("%3d", path[j]);
			}
			System.out.println();
			return;
		}
	}

	int xuatPhat, soCanh = 0;

	// in nhiu duong
	// in từ đỉnh bất kỳ có thể chẵn hoặc lẻ
	public void allPathCycleEuler(int vex) throws Exception {
		xuatPhat = vex;
		soCanh = numEdges();
		path = new int[soCanh + 1];
		path[0] = xuatPhat;
		findNext(1);
	}

	// in từ đỉnh lẻ
	/*
	 * vì đồ thị chỉ có hai đỉnh bậc lẽ và đã được lưu trong list nên lấy giá
	 * trị từ list thì sẽ có được giá trị đỉnh lẻ cần tìm
	 */
	public void allPathEulerOdd(int soX) {
		if (soX <= 1 && soX >= 0) {
			System.out.println("Đồ thị chỉ có hai đỉnh bậc lẻ");
		} else {
			xuatPhat = laySoDinhBacLe().get(soX);
			soCanh = numEdges();
			path = new int[soCanh + 1];
			path[0] = xuatPhat;
			findNext(1);
		}
	}

	// tim nhung duong di co the di tu 1 dinh
	private void findNext(int vex) {
		if (vex > soCanh) {
			inDuongDiE(path);
			return;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[path[vex - 1]][i] > 0) {
					path[vex] = i;
					removeEdges(path[vex - 1], i);
					findNext(vex + 1);
					addEdges(path[vex - 1], i);
					path[vex] = 0;
				}
			}
		}
	}

	public void inDuongDiE(int[] path) {
		for (int i = 0; i < path.length; i++) {
			System.out.printf("%3d", path[i]);
		}
		System.out.println();
	}

	// in duong di 1 đường đi từ một đỉnh bất kỳ tới đỉnh khác
	public void path(int src, int dest) {
		path[indext] = src;
		indext++;
		visited[src] = true;
		if (src == dest) {
			inDuongDiE2(indext, path);
		}
		for (int i = 0; i < numVex; i++) {
			if (matrix[src][i] == 1 && visited[i] == false) {
				path(i, dest);
				visited[i] = true;
				indext--;
			}
		}
	}

	// in nhiều đường di từ một đỉnh bất kỳ tới đỉnh khác
	public void allPath(int src, int dest) {
		path[indext] = src;
		indext++;
		visited[src] = true;
		if (src == dest) {
			inDuongDiE2(indext, path);
		}
		for (int i = 0; i < numVex; i++) {
			if (matrix[src][i] == 1 && visited[i] == false) {
				allPath(i, dest);
				visited[i] = false;
				indext--;
			}
		}
	}

	public void inDuongDiE2(int indext, int[] path) {
		for (int i = 0; i < indext; i++) {
			System.out.printf("%3d", path[i]);
		}
		System.out.println();
		return;
	}

	/**
	 * Do thi luong phan
	 * 
	 */
	// kiem tra do thi luong phan
	public boolean checkBi(int vex) {
		// khoi tao mang chua dinh
		int[] color = new int[numVex];
		// duyet mang
		for (int i = 0; i < numVex; i++) {
			// dannh dau cac dinh la -1 (-1 la chua co mau)
			color[i] = -1;
		}
		// danh dau dinh truyen vao la 1(1 la mau thu hai)
		color[vex] = 1;
		// khoi tao mang Queue
		Queue<Integer> queue = new LinkedList<Integer>();
		// them dinh do vao Queue
		queue.add(vex);
		// danh dau dinh do la true
		visited[vex] = true;
		// vong lap while kiem tra coi Queue co rong ko??
		while (!queue.isEmpty()) {
			// tao bien u chua dinh lay ra
			int u = queue.poll();
			// duyet mang chua cac dinh ke chua co mau
			for (int i = 0; i < matrix.length; i++) {
				/*
				 * neu phan tu tai vi tri do lon hon khong va mau tai dinh do la
				 * -1
				 */
				if (matrix[u][i] > 0 && color[i] == -1) {
					// xet xem mau tai diem do co bang dinh dau tien ko, neu
					// trung
					color[i] = (color[u] == 0) ? 1 : 0;
					queue.add(i);
				}
				// neu trung mau voi dinh ke voi no thi tra ve false
				else if (matrix[u][i] == 1 && color[i] == color[u])
					return false;
			}
		}
		return true;
	}

	/**
	 * Kiem tra do thi luong phan ( -1 : chua co mau) (1: mau thu nhat) (0: mau
	 * thu hai)
	 */

	public boolean checkBiDFS(int v) {
		// khoi tao mang chua mau cua cac dinh
		int[] color = new int[numVex];
		// danh dau cac dinh trong mang la chua co mau
		for (int i = 0; i < numVex; i++) {
			color[i] = -1;
		}
		// khoi tao stack
		Stack<Integer> stack = new Stack<Integer>();
		// them dinh bat dau vao stack
		stack.push(v);
		// danh dau dinh bat dau da duoc to mau
		color[v] = 1;
		// vong lap while
		while (!stack.isEmpty()) {
			// tao bien moi chua gia tri dinh lay ra
			int u = stack.pop();
			// duyet cac dinh
			for (int i = 0; i < matrix.length; i++) {
				// neu vi tri tai diem do lon hon khong va mau tai do la -1 thi
				if (matrix[u][i] > 0 && color[i] == -1) {
					// gan mau cho cac dinh ke voi u
					color[i] = (color[u] == 0) ? 1 : 0;
					// them dinh do vao stack neu
					stack.push(i);
				}
				// neu trung mau voi dinh ke voi no thi tra ve false
				else if (matrix[u][i] == 1 && color[i] == color[u])
					return false;
			}
		}
		return true;
	}

	public boolean checkBipartite() {
		for (int i = 0; i < matrix.length; i++) {
			if (!checkBi(i)) {
				System.out.println("Do thi khong luong phan");
				return false;
			}
		}
		System.out.println("Do thi luong phan");
		return true;
	}

	public boolean checkBipartiteDFS() {
		for (int i = 0; i < matrix.length; i++) {
			if (!checkBiDFS(i)) {
				System.out.println("Do thi khong luong phan");
				return false;
			}
		}
		System.out.println("Do thi luong phan");
		return true;
	}

	public boolean equalty(int[] a, int sizeA, int[] b, int sizeB) {
		if (sizeA == sizeB) {
			for (int i = 0; i < sizeA; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	public boolean isEmpty(int[] a, int sizeA, int[] b, int sizeB) {
		for (int i = 0; i < sizeA; i++) {
			for (int j = 0; j < sizeB; j++) {
				if (a[i] == b[j])
					return false;
			}
		}
		return true;
	}

	public boolean isTowSideGraph() {
		// khoi tao mang x
		int[] mangChuaCacDinh = new int[numVex];
		// gan phan tu tai vi tri 0
		mangChuaCacDinh[0] = 0;
		// khoi tao mang y chua cac dinh ke voi x
		int[] mangChuaCacDinhKeVoiX = new int[numVex];
		// gan phan tu tai vi tri 0
		mangChuaCacDinhKeVoiX[0] = 0;
		// khoi tao mang t chua tap hop cac dinh ke trong x va y
		int[] tapHopCacDinhKeCuaXVaY = new int[numVex];
		// gan phan tu tai vi tri 0
		tapHopCacDinhKeCuaXVaY[0] = 0;
		// khoi tao kich thuoc
		int sizeX = 1;
		// khoi tao kich thuoc
		int sizeY;
		// khoi tao kich thuoc
		int sizeT;
		// vong lap while
		while (true) {
			sizeT = 0;
			sizeY = 0;
			for (int i = 0; i < numVex; i++) {
				/*
				 * Mac dinh cac gia tri la chua duoc su dung
				 */
				visited[i] = true;
			}
			// Tim tap Y: tap cac dinh ke voi X
			for (int i = 0; i < sizeX; i++) {
				for (int j = 0; j < numVex; j++) {
					if (matrix[mangChuaCacDinh[i]][j] == 1 && visited[j] == true) {
						mangChuaCacDinhKeVoiX[sizeY] = j;
						visited[j] = false;
						sizeY++;
					}
				}
			}
			/*
			 * xem xet dieu kien mang x va y giao nhau bang rong, neu khong rong
			 * thi khoi xet nua
			 */
			if (isEmpty(mangChuaCacDinh, sizeX, mangChuaCacDinhKeVoiX, sizeY) == false) {
				return false;
			}
			for (int i = 0; i < numVex; i++) {
				// gan lai mang dieu kien bang 0
				visited[i] = true;
			}
			// Tim tap T: tap cac dinh ke voi cac dinh trong Y
			for (int i = 0; i < sizeY; i++) {
				for (int j = 0; j < numVex; j++) {
					if (matrix[mangChuaCacDinhKeVoiX[i]][j] == 1 && visited[j] == true) {
						visited[j] = false;
						tapHopCacDinhKeCuaXVaY[sizeT] = j;
						sizeT++;
					}
				}
			}
			/*
			 * xem xet dieu kien mang y va t giao nhau bang rong, neu khong rong
			 * thi khoi xet nua
			 */
			if (isEmpty(mangChuaCacDinhKeVoiX, sizeY, tapHopCacDinhKeCuaXVaY, sizeT) == false) {
				System.out.println("Do thi khong luong phan");
				return false;
			}
			// xem mang x va t co giong nhau khong, neu bang nhau thi ket thuc
			if (equalty(mangChuaCacDinh, sizeX, tapHopCacDinhKeCuaXVaY, sizeT) == true) {
				System.out.print("Do thi la do thi luong phan:  ");
				System.out.print("\nX = ");
				// in ra cac dinh co trong mang x
				for (int i = 0; i < sizeX; i++) {
					System.out.print(mangChuaCacDinh[i] + " ");
				}
				System.out.print("\nY = ");
				// in ra cac dinh co trong mang y
				for (int i = 0; i < sizeY; i++) {
					System.out.print(mangChuaCacDinhKeVoiX[i] + " ");
				}
				// ket thuc vong lap
				return true;
			} else {
				// nguoc lai
				sizeX = 0;
				for (int i = 0; i < sizeT; i++) {
					mangChuaCacDinh[i] = tapHopCacDinhKeCuaXVaY[i];
					sizeX++;
				}
			}
		}
	}

	/**
	 * Hamilton - dung dinh ly dirac
	 * 
	 * @throws Exception
	 */
	public int checkHamilton() {
		if (isConnected()) {
			if (matrix.length >= 3) {
				for (int i = 0; i < matrix.length; i++) {
					if (!(degreeVex(i) >= numVex / 2)) {
						System.out.println("co duong di va ko co chu trinh");
						return 1; // khong co chu trinh
					}
				}
				System.out.println("co chu trinh");
				return 0; // co chu trinh
			} else {
				System.out.println("co duong di va ko co chu trinh ");
				return 1;
			}
		}
		System.out.println("ko lien thong");
		return -1; // khong lien thong
	}

	public boolean isHamilton() {
		int vex = 0;
		if (isConnected() && matrix.length >= 3) {
			for (int i = 0; i < matrix.length; i++) {
				if (degreeVex(i) >= numVex / 2) {
					vex++;
				}
			}
			if (vex == numVex) {
				System.out.println("co chu trinh Hamilton");
				return true;
			} else {
				System.out.println("khong co chu trinh nhung co duong di Hamilton");
				return true;
			}
		} else
			return false;
	}

	// in chu trinh - duong di
	public int[] cycleHamilton, oneCycle;

	// in chu trinh
	public void allCycleHamilton(int vex) {
		if (isHamilton()) {
			// lam moi lai mang visited
			reset();
			//
			visited[vex] = true;
			cycleHamilton = new int[numVex];
			cycleHamilton[0] = vex;
			findCycleHamilton(1);
		}
	}

	// Mot chu trinh Hamiltons
	public void oneCylesHamilTon(int vex) {
		if (isHamilton()) {
			reset();
			oneCycle = new int[numVex];
			oneCycle[0] = vex;
			visited[vex] = true;
			findOneCycleHamilton(1);
		} else
			return;
	}

	// tìm một chu trình
	public void findOneCycleHamilton(int vex) {
		for (int i = 0; i < matrix.length; i++) {
			if (!visited[i] && matrix[oneCycle[vex - 1]][i] > 0) {
				oneCycle[vex] = i;
				if (vex < numVex - 1) {
					visited[i] = true;
					findOneCycleHamilton(vex + 1);
					visited[i] = false;
				} else {
					if (matrix[oneCycle[i]][0] > 0)
						inHamilton(oneCycle);
				}
			}
		}
	}

	// tim toan bo chu trinh
	public void findCycleHamilton(int vex) {
		if (vex >= numVex) {
			inHamilton(cycleHamilton);
			return;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				if (!visited[i] && matrix[cycleHamilton[vex - 1]][i] > 0) {
					visited[i] = true;
					cycleHamilton[vex] = i;
					findCycleHamilton(vex + 1);
					visited[i] = false;
				}
			}
		}
	}

	// in ra
	public void inHamilton(int[] cycleHamilton) {
		for (int i = 0; i < cycleHamilton.length; i++) {
			System.out.printf("%3d", cycleHamilton[i]);
		}
		System.out.print(cycleHamilton[0]);
		System.out.println();
	}

	// in mot duong di
	// làm sao để tính thành phần liên thông của một đỉnh nhập vào

	public void pathHamilton(int vex) {
		oneCycle = new int[numVex];
		oneCycle[0] = vex;
		reset();
		visited[vex] = true;
		find(1);
		visited[0] = false;
	}

	public void find(int vex) {
		for (int i = 0; i < matrix.length; i++) {
			if (!visited[i] && matrix[oneCycle[vex - 1]][i] > 0) {
				oneCycle[vex] = i;
				if (vex < numVex - 1) {
					visited[i] = true;
					find(vex + 1);
					visited[i] = false;
				} else {
					if (matrix[oneCycle[i]][0] > 0) {
						System.out.println("---");
						inOneHamilton(oneCycle);
					}
				}
			}
		}
	}

	public void inOneHamilton(int[] cycleHamilton) {
		for (int i = 0; i < cycleHamilton.length; i++) {
			System.out.printf("%3d", cycleHamilton[i]);
		}
		System.out.println();
	}

	@Override
	public int countConnected() {
		// TODO Auto-generated method stub
		return 0;
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
