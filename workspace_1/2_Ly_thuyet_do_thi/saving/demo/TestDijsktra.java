package demo;

public class TestDijsktra {
	public static void main(String[] args) {
		// Dijkstra di = new Dijkstra(7);
		// di.addEdgesNumber(0, 1, 8);
		// di.addEdgesNumber(1, 2, 4);
		// di.addEdgesNumber(1, 3, 1);
		// di.addEdgesNumber(2, 5, 3);
		// di.addEdgesNumber(3, 4, 5);
		// di.addEdgesNumber(4, 5, 6);
		// di.addEdgesNumber(4, 6, 3);
		// di.addEdgesNumber(5, 6, 2);
		//
		// Dijkstra di = new Dijkstra(5);
		// di.addEdgesNumberDirected(0, 1, 10);
		// di.addEdgesNumberDirected(1, 4, 6);
		// di.addEdgesNumberDirected(2, 0, 7);
		// di.addEdgesNumberDirected(2, 1, 20);
		// di.addEdgesNumberDirected(2, 3, 9);
		// di.addEdgesNumberDirected(3, 1, 9);
		// di.addEdgesNumberDirected(3, 4, 4);
		// di.addEdgesNumberDirected(4, 1, 5);
		//
		// Dijkstra di = new Dijkstra(6);
		// di.addEdgesNumberDirected(0, 1, 7);
		// di.addEdgesNumberDirected(0, 3, 2);
		// di.addEdgesNumberDirected(1, 2, 4);
		// di.addEdgesNumberDirected(1, 4, 1);
		// di.addEdgesNumberDirected(2, 5, 3);
		// di.addEdgesNumberDirected(3, 1, 4);
		// di.addEdgesNumberDirected(4, 0, 2);
		// di.addEdgesNumberDirected(4, 2, 2);
		// di.addEdgesNumberDirected(5, 1, 1);
		Dijkstra di = new Dijkstra(8);
		di.addEdgesNumber(0, 1, 2);
		di.addEdgesNumber(0, 5, 1);
		di.addEdgesNumber(1, 2, 2);
		di.addEdgesNumber(1, 3, 2);
		di.addEdgesNumber(1, 4, 4);
		di.addEdgesNumber(2, 7, 1);
		di.addEdgesNumber(3, 4, 4);
		di.addEdgesNumber(3, 5, 3);
		di.addEdgesNumber(4, 2, 3);
		di.addEdgesNumber(4, 6, 1);
		di.addEdgesNumber(5, 6, 7);
		di.addEdgesNumber(6, 7, 6);
		di.printGraph(di.matrix);
		System.out.println("\nDijkstra");
		// di.dijkstra_algorithm(6);
		// di.inDuong(6);
		// di.print(di.doDijkstra(di.matrix, 6));
		// for (int i = 0; i < di.numVex; i++) {
		//
		// }
		di.algoDijkstraQueue(4, 0);
	}
}
