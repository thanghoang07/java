package demo;

public class TestPrim {
	public static void main(String[] args) {
		Prim pri = new Prim(9);
		pri.addEdgesNumber(0, 1, 8);
		pri.addEdgesNumber(0, 5, 3);
		pri.addEdgesNumber(1, 5, 7);
		pri.addEdgesNumber(1, 2, 9);
		pri.addEdgesNumber(1, 4, 12);
		pri.addEdgesNumber(2, 4, 18);
		pri.addEdgesNumber(2, 3, 4);
		pri.addEdgesNumber(3, 4, 6);
		pri.addEdgesNumber(4, 6, 5);
		pri.addEdgesNumber(6, 5, 10);
		pri.addEdgesNumber(6, 8, 1);
		pri.addEdgesNumber(6, 7, 11);
		//
		System.out.println("In ra tree co trong so");
		//
		pri.printGraph(pri.matrix);
		//
		for (int j = 0; j < pri.matrix.length; j++) {
			pri.algoPrim2(pri.matrix, j);
		}
		// pri.algoPrim(pri.matrix, 3);
		// pri.algoPrim(pri.matrix, 4);
	}
}
