package demo;

public class TestKu {
	public static void main(String[] args) {
		// Krusral k = new Krusral(9);
		// k.addEdge(0, 1, 8);
		// k.addEdge(0, 5, 3);
		// k.addEdge(1, 2, 9);
		// k.addEdge(1, 5, 7);
		// k.addEdge(1, 4, 12);
		// k.addEdge(2, 3, 4);
		// k.addEdge(2, 4, 18);
		// k.addEdge(3, 4, 6);
		// k.addEdge(4, 6, 5);
		// k.addEdge(5, 6, 10);
		// k.addEdge(6, 8, 1);
		// k.addEdge(6, 7, 11);
		//
		// k.viewGraph(k.matrixWeight);
		// k.aloKrusal(k.matrixWeight);

		// Krusral k1 = new Krusral(5);
		// k1.addEdge(0, 1, 2);
		// k1.addEdge(0, 3, 6);
		// k1.addEdge(1, 2, 3);
		// k1.addEdge(1, 3, 8);
		// k1.addEdge(1, 4, 5);
		// k1.addEdge(2, 4, 7);
		// k1.addEdge(3, 4, 9);
		//
		// k1.viewGraph(k1.matrixWeight);
		// k1.aloKrusal(k1.matrixWeight);

		Krusral k2 = new Krusral(9);
		k2.addNewEdge(new Edge(0, 1, 8));
		k2.addNewEdge(new Edge(0, 5, 3));
		k2.addNewEdge(new Edge(1, 2, 9));
		k2.addNewEdge(new Edge(1, 5, 7));
		k2.addNewEdge(new Edge(1, 4, 12));
		k2.addNewEdge(new Edge(2, 3, 4));
		k2.addNewEdge(new Edge(2, 4, 18));
		k2.addNewEdge(new Edge(3, 4, 6));
		k2.addNewEdge(new Edge(4, 6, 5));
		k2.addNewEdge(new Edge(5, 6, 10));
		k2.addNewEdge(new Edge(6, 8, 1));
		k2.addNewEdge(new Edge(6, 7, 11));

		k2.viewGraph(k2.matrixWeight);
		k2.krusral();

	}
}
