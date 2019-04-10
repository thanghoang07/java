package KiemTraGiuaKy;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
	public static int[][] createArray(int n) {
		int[][] maTran = new int[n][n];
		Random r = new Random();
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				maTran[row][column] = r.nextInt(10);
			}
		}
		return maTran;
	}

	public static void printArry(int[][] maTran) {
		for (int row = 0; row < maTran.length; row++) {
			for (int column = 0; column < maTran[row].length; column++) {
				System.out.printf("%4d", maTran[row][column]);
			}
			System.out.println();
		}

	}

	public static boolean kiemTraDoiXung(int[][] maTran, int n) {
		for (int row = 1; row < n; row++) {
			for (int column = 0; column < n; column++) {
				if (maTran[column][row] != maTran[row][column])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao n : ");
		int n = in.nextInt();
		int[][] maTran = new int[n][n];
		maTran = createArray(n);
		printArry(maTran);
		
		//cau a
		if(kiemTraDoiXung(maTran, n)== true	)
			System.out.println("Ma tran doi xung");
		else
			System.out.println("Ma tran khong doi xung");
	}
}
