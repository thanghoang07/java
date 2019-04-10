package baiNop2;

import java.util.Random;

public class Bai608 {
	public final static int MAX = 2;

	public static int[][] creatMatrix(int soHang, int soCot) {
		int[][] matrix = new int[soHang][soCot];
		Random ra = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
		}
		matrix[0][0] = 1;
		return matrix;
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int soHang = 3;
		int soCot = 3;
		int[][] matrix = creatMatrix(soHang, soCot);
		print(matrix);

	}
}
