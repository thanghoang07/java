package ly_thuyet_do_thi_2;

import java.io.File;

import javax.swing.UIManager;

public class TestUndirectedGraph {
	public static void main(String[] args) throws Exception {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=|=|=|===== Undireted Graph =====|=|=|=");
		
		File file =  GraphTheory.docFile();
		UndirectedGraph g = new UndirectedGraph();
		int[][] matrix = g.readMatrix(file);
		UndirectedGraph g1 = new UndirectedGraph(g.matrix);
		

		// g1.addEdges(2, 3);
		// g1.addEdges(2, 6);
		// g1.addEdges(3, 4);
		// g1.addEdges(3, 0);
		// g1.addEdges(4, 0);
		// g1.addEdges(5, 4);
		// g1.addEdges(1, 4);
		// g1.addEdges(1, 0);
		// g1.addEdges(1, 5);
		// g1.addEdges(0, 6);

		// g1.addEdges(0, 1);
		// g1.addEdges(0, 2);
		// g1.addEdges(1, 4);
		// g1.addEdges(2, 3);
		// g1.addEdges(3, 4);
		// g1.addEdges(0, 1);
		// g1.addEdges(0, 4);
		// g1.addEdges(1, 4);
		// g1.addEdges(1, 2);
		// g1.addEdges(2, 3);
		// g1.addEdges(3, 4);
		// g1.addEdges(0, 1);
		// g1.addEdges(1, 2);
		// g1.addEdges(1, 3);
		// g1.addEdges(2, 3);
		// g1.addEdges(0, 5);
		// g1.addEdges(0, 4);
		// g1.addEdges(4, 5);
		// g1.pathHamilton(0);
		// g1.pathHamilton(1);
		// g1.pathHamilton(2);
		// g1.pathHamilton(3);
		// g1.pathHamilton(4);
		// g1.pathHamilton(5);
		for (int i = 0; i < g1.matrix.length; i++) {
			System.out.printf("duong di tu dinh %d\n", i);
			g1.pathHamilton(i);
		}
		// System.out.println("In duong di tu 1 dinh toi dinh bat ky");
		// System.out.println(g1.laySoDinhBacLe());
		// g1.pathHamilton(0);
		// g1.addEdges(0, 1);
		// g1.addEdges(0, 4);
		// g1.addEdges(1, 4);
		// g1.addEdges(4, 2);
		// g1.addEdges(2, 3);
		// g1.addEdges(3, 4);
		// g1.printGraph(g1.matrix);
		// g1.reset();
		// g1.allCycleHamilton(2);
		// g1.removeEdges(10, 10);
		// for (int i = 0; i < g1.matrix.length; i++) {
		// System.out.printf("in mot chu trinh tu dinh %d\n", i + 1);
		// g1.oneCylesHamilTon(i);
		// }

		//
		// g1.removeEdges(0, 1);
		// System.out.println("Xoa canh tu 0 den 1!!");
		// g1.printGraph(g1.matrix);
		// g1.isTowSideGraph();
		// System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		// g1.reset();
		// g1.checkBipartite();
		/*
		 * // G2
		 * System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		 * UndirectedGraph g2 = new UndirectedGraph(4); g2.addEdges(0, 1);
		 * g2.addEdges(0, 2); g2.addEdges(1, 2); g2.addEdges(2, 3);
		 * g2.printGraph(g2.matrix); System.out.println("So canh cua do thi 2: "
		 * + g2.numEdges()); System.out.println(g2.isConnected() ?
		 * "=> lien thong" : "=>khong lien thong"); // G3
		 * System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		 * UndirectedGraph g3 = new UndirectedGraph(9); g3.addEdges(0, 1);
		 * g3.addEdges(0, 3); g3.addEdges(0, 5); g3.addEdges(0, 6);
		 * g3.addEdges(1, 3); g3.addEdges(2, 3); g3.addEdges(3, 4);
		 * g3.addEdges(4, 7); g3.addEdges(5, 6); g3.addEdges(6, 2);
		 * g3.addEdges(7, 8); g3.addEdges(8, 3); g3.addEdges(6, 3);
		 * g3.printGraph(g3.matrix); System.out.println(g3.isConnected() ?
		 * "=> lien thong" : "=>khong lien thong"); System.out.println(
		 * "Dem so thanh phan lien thong dung DFS khong dung Stack: " +
		 * g3.countConnectedDFS()); System.out.println(
		 * "Dem so thanh phan lien thong dung DFS dung Stack: " +
		 * g3.countConnectedDFSUseStack()); g3.reset(); g3.pathDFS(0, 3);
		 * System.out.println(
		 * "Dem so thanh phan lien thong dung BFS dung Queue: " +
		 * g3.countConnectedBFSUseQueue()); g3.reset(); g3.pathBFS(0, 3);
		 * System.out.println("In duong di tu 1 dinh toi dinh bat ky");
		 * g3.reset(); g3.path(0, 8); // G4
		 * System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		 * UndirectedGraph g4 = new UndirectedGraph(7); g4.addEdges(0, 1);
		 * g4.addEdges(0, 2); g4.addEdges(0, 6); g4.addEdges(1, 2);
		 * g4.addEdges(1, 3); g4.addEdges(1, 4); g4.addEdges(3, 6);
		 * g4.addEdges(3, 4); g4.addEdges(6, 5); g4.addEdges(2, 3);
		 * g4.printGraph(g4.matrix); g4.isConnected();
		 * System.out.println(g4.checkEuler() ? "=>Co Euler" :
		 * "=>Khong co Euler"); System.out.println(
		 * "In duong di tu 1 dinh toi dinh bat ky"); g4.reset(); g4.pathEuler(0,
		 * 6);
		 */
	}
}
