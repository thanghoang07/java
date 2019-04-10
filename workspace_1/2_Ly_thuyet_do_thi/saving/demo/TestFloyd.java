package demo;

public class TestFloyd {
	public static void main(String[] args) {
		// Floyd fl = new Floyd(4);
		// fl.addEdgesNumberUndirected(0, 1, 5);
		// fl.addEdgesNumberUndirected(1, 2, 3);
		// fl.addEdgesNumberUndirected(2, 3, 1);
		// fl.addEdgesNumberUndirected(0, 3, 10);
		//
		// Floyd fl = new Floyd(3);
		// fl.addEdgesNumber(0, 1, 4);
		// fl.addEdgesNumber(0, 2, 5);
		// fl.addEdgesNumber(1, 0, 2);
		// fl.addEdgesNumber(2, 1, 3);
		//

		// Floyd fl = new Floyd(6);
		// fl.addEdgesNumber(0, 1, 7);
		// fl.addEdgesNumber(0, 3, 2);
		// fl.addEdgesNumber(1, 2, 4);
		// fl.addEdgesNumber(1, 4, 1);
		// fl.addEdgesNumber(2, 5, 3);
		// fl.addEdgesNumber(3, 1, 4);
		// fl.addEdgesNumber(4, 0, 2);
		// fl.addEdgesNumber(4, 2, 2);
		// fl.addEdgesNumber(5, 1, 1);

		// Floyd fl = new Floyd(4);
		// fl.addEdgesNumber(0, 1, 7);
		// fl.addEdgesNumber(0, 2, 5);
		// fl.addEdgesNumber(1, 3, 6);
		// fl.addEdgesNumber(1, 2, 7);
		// fl.addEdgesNumber(3, 2, 11);
		// fl.addEdgesNumber(3, 0, 4);
		// fl.addEdgesNumber(3, 1, 1);
		//
		Floyd fl = new Floyd(6);
		fl.addEdgesNumberDirected(0, 1, 3);
		fl.addEdgesNumberDirected(0, 3, 5);
		fl.addEdgesNumberDirected(0, 2, 2);
		fl.addEdgesNumberDirected(2, 3, 2);
		fl.addEdgesNumberDirected(3, 1, 1);
		fl.addEdgesNumberDirected(3, 4, 3);
		fl.addEdgesNumberDirected(1, 4, 4);
		fl.addEdgesNumberDirected(4, 5, 2);
		fl.addEdgesNumberDirected(2, 5, 1);
		//
		// Floyd fl = new Floyd(3);
		// fl.addEdgesNumber(0, 1, 4);
		// fl.addEdgesNumber(0, 2, 5);
		// fl.addEdgesNumber(1, 0, 2);
		// fl.addEdgesNumber(2, 1, 3);
		//
		// Floyd fl = new Floyd(4);
		// fl.addEdgesNumberDirected(0, 2, 5);
		// fl.addEdgesNumberDirected(1, 2, 7);
		// fl.addEdgesNumberDirected(1, 3, 6);
		// fl.addEdgesNumberDirected(0, 1, 7);
		// fl.addEdgesNumberDirected(3, 1, 1);
		// fl.addEdgesNumberDirected(3, 0, 4);
		// fl.addEdgesNumberDirected(3, 2, 11);

		fl.printGraph(fl.matrix);
		// fl.algoFloyd(3, 2);
		// fl.algoFloyd();
		for (int i = 0; i < fl.matrix.length; i++) {
			fl.bellmanFord(i);
		}
	}
}
