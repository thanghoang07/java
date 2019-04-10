package ly_thuyet_do_thi_3_saving;

import java.io.File;

import javax.swing.UIManager;

public class tess1 {
	public static void main(String[] args) throws Exception {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//
		// do thi vo huong
		//
		System.out.println("=|=|=|===== Undireted Graph =|=|=|=");
		File file = GraphTheory.docFile();
		UndiretedGraph g1 = new UndiretedGraph();
		int[][] matrix = g1.readMatrix(file);
		System.out.print("------------------------" + "\nIn Matrix do thi: \n");
		g1.printGraph(matrix);
		/*System.out.println("tong so bac do thị: " + g1.degreeGraph()+ "canh: " + g1.numEdges());
		
		  System.out.println("Xoa canh : "); g1.removeEdges(0, 4);
		  g1.removeEdges(0, 3);
		  g1.removeEdges(1, 2);
		 System.out.print("------------------------" +
		  "\nIn Matrix do thi: \n"); g1.printGraph(matrix);
		 */
		System.out.println("Kiem tra lien thong");
		System.out.println(g1.isConnected() ? "=>lien thong" : "=>khong kien thong");
		System.out.println("lien thong: " + g1.isConnected1(0));
		System.out.println("so thanh phan lien thong: " + g1.countConnected());
	}
}
