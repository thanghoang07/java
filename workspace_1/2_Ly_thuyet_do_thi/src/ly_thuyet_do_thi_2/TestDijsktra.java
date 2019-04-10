package ly_thuyet_do_thi_2;

public class TestDijsktra {
	public static void main(String[] args) {
		UndirectedGraph di1 = new UndirectedGraph(7);
		di1.addEdgesNumber(0, 1, 8);
		di1.addEdgesNumber(1, 2, 4);
		di1.addEdgesNumber(1, 3, 1);
		di1.addEdgesNumber(2, 5, 3);
		di1.addEdgesNumber(3, 4, 5);
		di1.addEdgesNumber(4, 5, 6);
		di1.addEdgesNumber(4, 6, 3);
		di1.addEdgesNumber(5, 6, 2);
		
		di1.algoDijkstra3(0, 6);
		
//		DirectedGraph di2 = new DirectedGraph(6);
//		di2.addEdgesNumber(0, 3, 2);
//		di2.addEdgesNumber(0, 1, 7);
//		di2.addEdgesNumber(1, 2, 4);
//		di2.addEdgesNumber(1, 4, 1);
//		di2.addEdgesNumber(2, 5, 3);
//		di2.addEdgesNumber(3, 1, 4);
//		di2.addEdgesNumber(4, 0, 2);
//		di2.addEdgesNumber(4, 2, 2);
//		di2.addEdgesNumber(5, 1, 1);
//		
//		di2.algoDijkstra(1);
	}
}
