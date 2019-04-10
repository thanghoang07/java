package ly_thuyet_do_thi_2;

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

		File file = Tree.docFile();
		Tree tree = new Tree();
		int[][] matrixT = tree.readMatrix(file);
		tree.printGraph(matrixT);
		tree.printTransvel(tree.inTrongSo());

		// Tree tre = new Tree(9);
		// UndirectedGraph g1 = new UndirectedGraph(tre.numVex);
		// tre.addEdges(0, 1);
		// tre.addEdges(0, 5);
		// tre.addEdges(1, 2);
		// tre.addEdges(1, 4);
		// tre.addEdges(1, 5);
		// tre.addEdges(2, 3);
		// tre.addEdges(2, 4);
		// tre.addEdges(3, 4);
		// tre.addEdges(4, 6);
		// tre.addEdges(5, 6);
		// tre.addEdges(6, 7);
		// tre.addEdges(6, 8);
		// System.out.println("In ra matrix tree");
		// g1.printGraph(tre.matrix);
		// System.out.println("Duyet cay theo BFS");
		// g1.printGraph(tre.BFSTree(0, g1).matrix);
		// //
		// System.out.println("Duyet cay theo DFS");
		// Tree tre2 = new Tree(9);
		// UndirectedGraph g2 = new UndirectedGraph(tre2.numVex);
		// tre2.addEdges(0, 1);
		// tre2.addEdges(0, 5);
		// tre2.addEdges(1, 2);
		// tre2.addEdges(1, 4);
		// tre2.addEdges(1, 5);
		// tre2.addEdges(2, 3);
		// tre2.addEdges(2, 4);
		// tre2.addEdges(3, 4);
		// tre2.addEdges(4, 6);
		// tre2.addEdges(5, 6);
		// tre2.addEdges(6, 7);
		// tre2.addEdges(6, 8);
		// g2.printGraph(tre2.DFSTree(1).matrix);
		// //
		// System.out.println("Duyet cay theo preorder: goc - trai - phai");
		// Tree tre3 = new Tree(16);
		// tre3.addEdges(0, 1);
		// tre3.addEdges(0, 2);
		// tre3.addEdges(1, 3);
		// tre3.addEdges(1, 4);
		// tre3.addEdges(2, 6);
		// tre3.addEdges(2, 5);
		// tre3.addEdges(2, 7);
		// tre3.addEdges(4, 8);
		// tre3.addEdges(4, 9);
		// tre3.addEdges(7, 10);
		// tre3.addEdges(7, 11);
		// tre3.addEdges(9, 12);
		// tre3.addEdges(9, 13);
		// tre3.addEdges(9, 14);
		// tre3.addEdges(11, 15);
		// tre3.reset();
		// tre3.printTransvel(tre3.preorder(0));
		// //
		// System.out.println("Duyet cay theo postorder: trai - phai - goc");
		// Tree tre4 = new Tree(9);
		// tre4.addEdges(0, 1);
		// tre4.addEdges(0, 5);
		// tre4.addEdges(1, 2);
		// tre4.addEdges(1, 4);
		// tre4.addEdges(1, 5);
		// tre4.addEdges(2, 3);
		// tre4.addEdges(2, 4);
		// tre4.addEdges(3, 4);
		// tre4.addEdges(4, 6);
		// tre4.addEdges(5, 6);
		// tre4.addEdges(6, 7);
		// tre4.addEdges(6, 8);
		// tre4.reset();
		// tre4.printTransvel(tre4.postorder(0));
		// //
		// System.out.println("Duyet cay theo inorder: trai - goc - phai");
		// Tree tre5 = new Tree(10);
		// tre5.addEdges(0, 1);
		// tre5.addEdges(0, 2);
		// tre5.addEdges(1, 3);
		// tre5.addEdges(1, 4);
		// tre5.addEdges(2, 5);
		// tre5.addEdges(4, 6);
		// tre5.addEdges(4, 7);
		// tre5.addEdges(5, 8);
		// tre5.addEdges(7, 9);
		// tre5.reset();
		// tre5.printTransvel(tre5.inorder(0));
	}
}
