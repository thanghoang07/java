package ly_thuyet_do_thi_4_saving;

import java.io.File;

import javax.swing.UIManager;

public class BaiTapTuan1 {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		File file = Graph.docFile();
		UndirectedGraph g1 = new UndirectedGraph();
		int[][] matrix = g1.readMatrix(file);
		System.out.println();
		Graph.viewGraph(matrix);
		/*System.out.println((g1.isConnected()) ? "Do thi da cho la do thi lien thong!"
				: "Do thi da cho la do thi khong lien thong!");
*/
	}
}
