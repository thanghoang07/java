package thi;

public class Test {
	public static void main(String[] args) {
		Dijkstra di = new Dijkstra(7);
		di.addEdgesNumber(0, 1, 8);
		di.addEdgesNumber(1, 3, 1);
		di.addEdgesNumber(1, 2, 4);
		di.addEdgesNumber(2, 5, 3);
		di.addEdgesNumber(3, 4, 5);
		di.addEdgesNumber(4, 5, 6);
		di.addEdgesNumber(4, 6, 3);
		di.addEdgesNumber(5, 6, 2);
		
		System.out.println("in ra ma tran do thi");
		di.printGraph(di.matrix);
		System.out.println();
		di.algoDijkstra(6);
		System.out.println();
		
		
	}
}
