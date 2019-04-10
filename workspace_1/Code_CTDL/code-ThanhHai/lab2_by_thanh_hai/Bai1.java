package lab2_by_thanh_hai;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
	private static Scanner nhapVao;
	public static int[][] createMatrix(int m, int n) {
		Random rd = new Random();
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = rd.nextInt(91) + 10;
			}
		}
		return matrix;

	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap chi so hang: ");
		int m = nhapVao.nextInt();
		System.out.print("Nhap chi so cot: ");
		int n = nhapVao.nextInt();
		int[][] m1 = createMatrix(m, n);
		int[][] m2 = createMatrix(m, n);
		Matrix matrix = new Matrix();
		int[][] m3 = matrix.sum(m1, m2);
		int[][] m4 = matrix.multi(m1, m2);
		System.out.println("m1 + m2:");
		matrix.printResult(m1, m2, m3, '+');
		System.out.println("m1 * m2:");
		matrix.printResult(m1, m2, m4, '*');
	}
}
