package lab4;

import java.util.Random;

public class Bai9 {
	public final static int MAX = 100;

	public static int[][] creatMatrix(int soHang) {
		int[][] matrix = new int[soHang][soHang];
		Random ra = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ra.nextInt(MAX);
			}
		}
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

	public static void sumHang(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
			System.out.printf("\ndong thu %d tong la %d", i, sum);
		}
	}

	public static void sumHang2(int[][] matrix) {
		int max = 0;
		int index = 0;
		for (int k = 0; k < matrix[0].length; k++) {
			max += matrix[0][k];
		}
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				if (sum > max) {
					max = sum;
					index = i;
				}
			}
		}
		System.out.printf("\ndong %d tong %d la lon nhat", index, max);
	}

	public static void main(String[] args) {
		int soHang = 10000;
		int[][] matrix = creatMatrix(soHang);
		//print(matrix);
		System.out.println();
		sumHang(matrix);
		sumHang2(matrix);
	}
}
