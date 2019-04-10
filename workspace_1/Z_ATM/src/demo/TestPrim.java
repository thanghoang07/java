package demo;

public class TestPrim {
	public static void main(String[] args) {
		Prim pri = new Prim(9);
		pri.addEdge(0, 1, 8);
		pri.addEdge(0, 5, 3);
		pri.addEdge(1, 5, 7);
		pri.addEdge(1, 2, 9);
		pri.addEdge(1, 4, 12);
		pri.addEdge(2, 4, 18);
		pri.addEdge(2, 3, 4);
		pri.addEdge(3, 4, 6);
		pri.addEdge(4, 6, 5);
		pri.addEdge(6, 5, 10);
		pri.addEdge(6, 8, 1);
		pri.addEdge(6, 7, 11);
		//
		System.out.println("In ra tree co trong so");
		//
		pri.viewGraph(pri.matrixWeight);
		//
		pri.prim(pri.matrixWeight, 1);
	}
}
