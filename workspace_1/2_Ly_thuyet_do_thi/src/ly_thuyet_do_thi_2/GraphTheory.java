package ly_thuyet_do_thi_2;

import java.io.File;
import javax.swing.JFileChooser;

public abstract class GraphTheory {
	protected static File file;
	public static JFileChooser fc;

	// - Phương thức truyen ma trận kề
	public abstract int[][] readMatrix(File fileName);

	// - Phương thức in ma trận kề
	public abstract void printGraph(int[][] matrix);

	// - Phuong thuc them một cạnh ma trận kề
	public abstract void addEdges(int src, int dest);

	// - Phuong thc xoa bo mot canh ma trận kề
	public abstract void removeEdges(int src, int dest);

	// - Phuong thuc tinh tong bac cua do thi ma trận kề
	public abstract int degreeGraph();

	// - Phuong thuc tinh so canh cua do thi ma trận kề
	public abstract int numEdges();

	// - Phuong thuc kiem tra tinh lien thong ma trận kề
	public abstract boolean isConnected();

	// - Phuong thuc dem thanh phan lien thong ma trận kề dùng DFS(Stack)
	public abstract int countConnectedDFSUseStack();

	// - Phuong thuc dem thanh phan lien thong ma trận kề dùng DFS
	public abstract int countConnectedDFS();

	// - Phuong thuc dem thanh phan lien thong ma trận kề dùng BFS(Queue)
	public abstract int countConnectedBFSUseQueue();

	// - Phương thức duyệt theo chiều sâu dùng Stack
	public abstract void DFSUseStack(int vex);

	// - Phương thức duyệt theo chiều sâu
	public abstract void DFS(int vex);

	// - Phương thức duyệt theo chiều rộng dùng Queue
	public abstract void BFSUseQueue(int vex);
	
	//
	public abstract void addEdgesNumber(int src, int dest, int trongSo);

	// - Phương thức doc file
	public static File docFile() throws Exception {
		try {
			fc = new JFileChooser();
			fc.setCurrentDirectory(new File("C:\\Users\\thang\\Desktop\\files\\G"));// dat_vi_tri_mac_dinh_de_mo
			fc.setDialogTitle("chon file chua do thi.");
			fc.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
			fc.setAcceptAllFileFilterUsed(false);
			if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				String selOpen = fc.getSelectedFile().getAbsolutePath();// lay_duong_dan_file
				file = new File(selOpen);
			} else {
				System.out.println("No file selection");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}

}
