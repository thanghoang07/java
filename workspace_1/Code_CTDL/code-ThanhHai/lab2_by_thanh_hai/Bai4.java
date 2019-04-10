package lab2_by_thanh_hai;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {
	private static Scanner nhapVao;

	public static Integer[][] createMatrix(int m1, int m2) {
		Random rd = new Random();
		Integer[][] matrix = new Integer[m1][m2];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = rd.nextInt(2) + 10;
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap chi so hang:");
		int m = nhapVao.nextInt();
		System.out.print("-Nhap chi so cot:");
		int n = nhapVao.nextInt();
		Integer[][] m1 = createMatrix(m, n);
		Integer[][] m2 = createMatrix(m, n);
		//
		IntegerMatrix integerMatrix = new IntegerMatrix();
		System.out.println("\nTong 2 so nguyen m1 + m2 la:");
		GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');

		System.out.println("\nTich 2 so nguyen m1 * m2 la:");
		GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
		// so thap phan
		Rational[][] r1 = new Rational[m][n];
		Rational[][] r2 = new Rational[m][n];
		for (int i = 0; i < r1.length; i++)
			for (int j = 0; j < r1[0].length; j++) {
				r1[i][j] = new Rational(i + 1, j + 5);
				r2[i][j] = new Rational(i + 1, j + 6);
			}

		RationalMatrix rationalMatrix = new RationalMatrix();
		System.out.println("Tong 2 so thap phan p1 + p2 la:");
		GenericMatrix.printResult(r1, r2, rationalMatrix.addMatrix(r1, r2), '+');
		System.out.println("\nTich 2 so thap phan p1 * p2 la:");
		GenericMatrix.printResult(r1, r2, rationalMatrix.multiplyMatrix(r1, r2), '*');
	}
}
