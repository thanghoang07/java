package lab5;

import java.util.Scanner;

public class Bai7 {

	public static void printArray(int[][] arrInts) {
		for (int i = 0; i < arrInts.length; i++) {
			for (int j = 0; j < arrInts[i].length; j++) {
				System.out.print(arrInts[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void inTamGiac(int[][] arrInts) {
		for (int i = 0; i < arrInts.length; i++) {
			// moi hang la 1 mang 1 chieu. cu moi hang lai tang them 1 do dai
			arrInts[i] = new int[i + 1];
			// gan = 1 cho gia tri dau va cuoi cua 1 hang
			arrInts[i][0] = 1;
			arrInts[i][i] = 1;
			// tinh gia tri o giua
			for (int j = 1; j < i; j++) {
				arrInts[i][j] = arrInts[i - 1][j - 1] + arrInts[i - 1][j];
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = in.nextInt();
		int arrInts[][] = new int[n][];
		inTamGiac(arrInts);
		printArray(arrInts);
	}
}
