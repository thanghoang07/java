package lab1;

import java.io.File;

import javax.swing.UIManager;

public class BaiTapTuan1 {
	public static void main(String[] args) {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n---------DO THI CO HUONG---------");
		File file1 = Graph.docFile();
		DirectedGraph diGraph = new DirectedGraph();
		int[][] matrix1 = diGraph.readMatrix(file1);
		diGraph.viewGraph(matrix1);
		diGraph.addEdges(1, 2);
		System.out
				.println("so bac cua dinh 3 la: " + diGraph.degreeVertices(2));
		System.out.println("Nua bac ngoai cua dinh 3 la" + diGraph.deg_out(2));
		System.out.println("Nua bac trong cua dinh 3 la: " + diGraph.deg_in(2));
		System.out.println("tong bac cua dinh la: " + diGraph.degreeGraph());
		System.out.println("So canh cua do thi la: " + diGraph.numEdge());
		if (diGraph.isConnected())
			System.out.println("Do thi da cho la do thi lien thong!");
		else
			System.out.println("Do thi da cho la do thi khong lien thong!");

		// System.out.println("---------DO THI VO HUONG---------");
		// File file2 = Graph.docFile();
		// UndirectedGraph unGraph = new UndirectedGraph();
		// int[][] matrix2 = unGraph.readMatrix(file2);
		// unGraph.viewGraph(matrix2);
		//
		// unGraph.addEdges(3, 2);
		// System.out
		// .println("so bac cua dinh 3 la: " + unGraph.degreeVertices(2));
		// System.out.println("tong so bac cac dinh cua dinh la: "
		// + unGraph.degreeGraph());
		// System.out.println("So canh cua do thi la: " + unGraph.numEdge());
		// if (unGraph.isConnected())
		// System.out.println("Do thi da cho la do thi lien thong!");
		// else
		// System.out.println("Do thi da cho la do thi khong lien thong!");
	}
}
