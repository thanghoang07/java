package lab2_by_thanh_hai;

/*import java.util.Random;*/
import java.util.Scanner;

public class TestRationalMatrix {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap chi so hang:");
		int m = nhapVao.nextInt();
		System.out.print("-Nhap chi so cot:");
		int n = nhapVao.nextInt();
		Rational[][] r1 = new Rational[m][n];
		Rational[][] r2 = new Rational[m][n];
		for (int i = 0; i < r1.length; i++)
			for (int j = 0; j < r1[0].length; j++) {
				r1[i][j] = new Rational(i + 1, j + 5);
				r2[i][j] = new Rational(i + 1, j + 6);
			}

		RationalMatrix rationalMatrix = new RationalMatrix();
		System.out.println("m1 + m2 la:");
		GenericMatrix.printResult(r1, r2, rationalMatrix.addMatrix(r1, r2), '+');
		System.out.println("\nm1 * m2 la:");
		GenericMatrix.printResult(r1, r2, rationalMatrix.multiplyMatrix(r1, r2), '*');
	}
}
