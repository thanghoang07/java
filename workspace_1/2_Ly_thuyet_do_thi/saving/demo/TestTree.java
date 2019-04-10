package demo;

import java.io.File;

import javax.swing.UIManager;

public class TestTree {
	public static void main(String[] args) throws Exception {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=|=|=|===== Tree Graph =====|=|=|=");

		// File file = Tree.docFile();
		Tree tree = new Tree();
		// int[][] matrixT = tree.readMatrix(file);
		// tree.printGraph(matrixT);
		// tree.printTransvel(tree.inTrongSo());
		// System.out.println("Duyet cay theo BFS");
		// g1.printGraph(tre.DFSTree(0).matrix);
		// tree.printGraph(tre.inDayTrongSo(tre).tree);

		Tree tre = new Tree(5);
		UndirectedGraph g1 = new UndirectedGraph(tre.numVex);
		tre.addEdgesNumber(0, 1, 2);
		tre.addEdgesNumber(0, 3, 6);
		tre.addEdgesNumber(1, 3, 8);
		tre.addEdgesNumber(1, 4, 5);
		tre.addEdgesNumber(1, 2, 3);
		tre.addEdgesNumber(2, 4, 7);
		tre.addEdgesNumber(3, 4, 9);

		System.out.println("In ra tree co trong so");
		g1.printGraph(tre.matrix);
		System.out.printf("Tong trong so cua tree: %d\n", tre.degreeGraphNum());
//		tree.printTransvel(tree.inDayTrongSo2());
	}
}
