package ly_thuyet_do_thi_4_saving;

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
	public static void viewGraph(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%2d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static File docFile() {
		try {
			JFileChooser fc = new JFileChooser();
			fc.setCurrentDirectory(new File("E:\\Ä‘an\\Nam2\\lÃ½ thuyáº¿t Ä�T\\BÃ i táº­p\\lab1"));// dat_vi_tri_mac_dinh_de_mo
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
