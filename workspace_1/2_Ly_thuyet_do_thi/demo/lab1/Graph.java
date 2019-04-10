package lab1;

import java.io.File;

import javax.swing.JFileChooser;

public abstract class Graph {
	protected static File file;

	public abstract int[][] readMatrix(File fileName);

	// them 1 canh
	public abstract void addEdges(int src, int dest);

	// xoa 1 canh
	public abstract void removeEdges(int src, int dest);

	// tinh so bac cua dinh
	public abstract int degreeVertices(int vertices);

	// tinh tong so bac cua cac dinh cua do thi
	public abstract int degreeGraph();

	// tinh so canh cua do thi
	public abstract int numEdge();

	// kiem tra thinh lien thong cua do thi
	public abstract boolean isConnected();

	// in ma tran
	public abstract void viewGraph(int[][] adjMatrix);

	public static File docFile() {
		try {
			JFileChooser fc = new JFileChooser();
			fc.setCurrentDirectory(new File("E:\\đan\\Nam2\\lý thuyết ĐT\\Bài tập\\lab1"));// dat_vi_tri_mac_dinh_de_mo
			fc.setDialogTitle("chon file chua do thi");
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
