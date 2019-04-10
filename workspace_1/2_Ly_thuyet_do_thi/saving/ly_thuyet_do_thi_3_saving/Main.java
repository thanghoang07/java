package ly_thuyet_do_thi_3_saving;

public class Main {
	static int[][] P;
	static final int N = 6;

	public static void main(String[] args) {
		int[][] M = { { 0, 7, 0, 2, 0, 0 }, { 0, 0, 4, 0, 1, 0 }, { 0, 0, 0, 0, 0, 3 }, { 0, 4, 0, 0, 0, 0 },
				{ 2, 0, 2, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 } };
		P = new int[N][N];
		System.out.println("Matrix to find the shortest path of.");
		printMatrix(M);
		System.out.println("Shortest Path Matrix.");
		printMatrix(FloydAlgo(M));
		System.out.println("Path Matrix");
		printMatrix(P);
	}

	public static int[][] FloydAlgo(int[][] M) {
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					// to keep track.;
					if (M[i][k] + M[k][j] < M[i][j]) {
						M[i][j] = M[i][k] + M[k][j];
						P[i][j] = k;
					}
					// or not to keep track.
					// M[i][j] = min(M[i][j], M[i][k] + M[k][j]);
				}
			}
		}
		return M;
	}

	// public static int min(int i, int j) {
	// if (i > j) {
	// return j;
	// }
	// return i;
	// }

	public static void printMatrix(int[][] Matrix) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.printf("%3d", Matrix[i][j]);
			System.out.println();
		}
	}
}
