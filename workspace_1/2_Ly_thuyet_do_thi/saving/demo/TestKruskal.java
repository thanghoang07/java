package demo;

public class TestKruskal {
	public static void main(String[] args) {
		// Kruskal ku = new Kruskal(9);
		//
		// ku.addEdgesNumber(0, 1, 8);
		// ku.addEdgesNumber(0, 5, 3);
		// ku.addEdgesNumber(1, 5, 7);
		// ku.addEdgesNumber(1, 2, 9);
		// ku.addEdgesNumber(1, 4, 12);
		// ku.addEdgesNumber(2, 4, 18);
		// ku.addEdgesNumber(2, 3, 4);
		// ku.addEdgesNumber(3, 4, 6);
		// ku.addEdgesNumber(4, 6, 5);
		// ku.addEdgesNumber(6, 5, 10);
		// ku.addEdgesNumber(6, 8, 1);
		// ku.addEdgesNumber(6, 7, 11);
		// //
		// System.out.println("In ra tree co trong so");
		// //
		// ku.printGraph(ku.matrix);
		// //
		// ku.algoKruskal(ku.matrix);

		Kruskal ku2 = new Kruskal(9);
		ku2.addNewEdge(new Edges(0, 1, 8));
		ku2.addNewEdge(new Edges(0, 5, 3));
		ku2.addNewEdge(new Edges(1, 5, 7));
		ku2.addNewEdge(new Edges(1, 2, 9));
		ku2.addNewEdge(new Edges(1, 4, 12));
		ku2.addNewEdge(new Edges(2, 4, 18));
		ku2.addNewEdge(new Edges(2, 3, 4));
		ku2.addNewEdge(new Edges(3, 4, 6));
		ku2.addNewEdge(new Edges(4, 6, 5));
		ku2.addNewEdge(new Edges(6, 5, 10));
		ku2.addNewEdge(new Edges(6, 8, 1));
		ku2.addNewEdge(new Edges(6, 7, 11));
		System.out.println("In ra tree co trong so");
		//
		ku2.printGraph(ku2.matrix);
		//
		ku2.algoKruskal2();
	}
}
