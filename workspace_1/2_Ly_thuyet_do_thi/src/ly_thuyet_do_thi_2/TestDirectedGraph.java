package ly_thuyet_do_thi_2;

import java.io.File;

import javax.swing.DebugGraphics;
import javax.swing.UIManager;

public class TestDirectedGraph {
	public static void main(String[] args) throws Exception {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=|=|=|===== Direted Graph =====|=|=|=");

//		File file = GraphTheory.docFile();
//		DirectedGraph g = new DirectedGraph();
//		int[][] matrix = g.readMatrix(file);
//		DirectedGraph g1 = new DirectedGraph(g.matrix);
//		g1.printGraph(g1.matrix);
//		// g1.checkEuler();
//		// g1.pathEuler(0);
//		System.out.println("----");
//	g1.cycleEuler(0);
//		//g1.multiPathCycleEuler(0);
//		System.out.println();

		 DirectedGraph g2 = new DirectedGraph(4);
		 g2.addEdges(0, 1);
		 g2.addEdges(1, 2);
		 g2.addEdges(2, 3);
		 g2.addEdges(3, 0);
		 g2.printGraph(g2.matrix);
		 System.out.println("----");
		 g2.cycleEuler(0);

		/*
		 * // G2
		 * System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		 * DirectedGraph g2 = new DirectedGraph(6); g2.addEdges(0, 1);
		 * g2.addEdges(1, 2); g2.addEdges(2, 4); g2.addEdges(4, 5);
		 * g2.addEdges(4, 3); g2.addEdges(3, 1); g2.printGraph(g2.matrix);
		 * System.out.println("So canh cua do thi 2: " + g2.numEdges());
		 * System.out.println(g2.isConnected() ? "=> lien thong" :
		 * "=> khong lien thong"); // G3
		 * System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		 * DirectedGraph g3 = new DirectedGraph(6); g3.addEdges(0, 1);
		 * g3.addEdges(1, 2); g3.addEdges(1, 3); g3.addEdges(3, 4);
		 * g3.addEdges(3, 5); g3.addEdges(5, 2); g3.addEdges(4, 5);
		 * g3.printGraph(g3.matrix); System.out.println(g3.isConnected() ?
		 * "=> lien thong" : "=> khong lien thong");
		 * System.out.println(g3.isStrongConnected() ? "=> lien thong manh" :
		 * "=> khong lien thong manh"); System.out.println(g3.isWeakConnected()
		 * ? "=> lien thong yeu" : "=> khong lien thong yeu");
		 * System.out.println(
		 * "Dem so thanh phan lien thong dung DFS khong dung Stack: " +
		 * g3.countConnectedDFS()); System.out.println(
		 * "Dem so thanh phan lien thong dung DFS dung Stack: " +
		 * g3.countConnectedDFSUseStack()); System.out.println(
		 * "Dem so thanh phan lien thong dung BFS dung Queue: " +
		 * g3.countConnectedBFSUseQueue()); System.out.println(
		 * "In duong di tu 1 dinh toi dinh bat ky"); g3.reset(); g3.path(0, 5);
		 */
		// G4
		// System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		/*
		 * DirectedGraph g4 = new DirectedGraph(6); g4.addEdges(0, 3);
		 * g4.addEdges(0, 4); g4.addEdges(1, 5); g4.addEdges(3, 1);
		 * g4.addEdges(4, 2); g4.addEdges(4, 5); g4.printGraph(g4.matrix);
		 */

		/*
		 * DirectedGraph g1 = new DirectedGraph(5); g1.addEdges(2, 0);
		 * g1.addEdges(3, 2); g1.addEdges(3, 4); g1.addEdges(0, 3);
		 * g1.addEdges(1, 0); g1.addEdges(4, 1);
		 */

		/*
		 * DirectedGraph g1 = new DirectedGraph(5); g1.addEdges(0, 3);
		 * g1.addEdges(1, 0); g1.addEdges(1, 3); g1.addEdges(1, 4);
		 * g1.addEdges(2, 1); g1.addEdges(3, 1); g1.addEdges(3, 4);
		 * g1.addEdges(4, 1); g1.addEdges(4, 2);
		 */

		// DirectedGraph g1 = new DirectedGraph(7);
		// g1.addEdges(0, 1);
		// g1.addEdges(0, 6);
		// g1.addEdges(1, 2);
		// g1.addEdges(1, 5);
		// g1.addEdges(2, 5);
		// g1.addEdges(3, 2);
		// g1.addEdges(4, 2);
		// g1.addEdges(4, 3);
		// g1.addEdges(4, 5);
		// g1.addEdges(5, 6);
		//
		// g1.printGraph(g1.matrix);
		// // System.out.println(g1.isStrongConnected() ? "=> lien thong manh" :
		// // "=> khong lien thong manh");
		// System.out.println(g1.isWeakConnected() ? "=> lien thong yeu" : "=>
		// khong lien thong yeu");
		// System.out.println("=-=-=-=-=-=-=-=");
		// System.out.println(g1.checkEuler());
		// g1.reset();
		// g1.pathEuler1(0);
		// System.out.println("===---===---===");
	}
}
