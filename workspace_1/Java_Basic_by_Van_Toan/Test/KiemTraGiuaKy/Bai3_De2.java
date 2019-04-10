package KiemTraGiuaKy;

import java.util.Random;
import java.util.Scanner;

public class Bai3_De2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = in.nextInt();

		int[][] maTran = new int[n][n];
		maTran = createArry(n);
		System.out.println("Ma tran la: ");
		printArray(maTran);

		if (tamGiacTren(maTran, n) == true)
			System.out.println("Ma tran tran la ma tran tam giac tran");
		else
			System.out.println("Ma tran tran khong phai ma tran tam giac tran");
	}

	public static boolean tamGiacTren(int[][] maTran, int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i > j) {
					if (maTran[i][j] == 0 && (maTran[i][i] != 0))
						return true;
				}
			}
		}
		return false;
	}

	public static int[][] createArry(int n) {
		int[][] maTran = new int[n][n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				maTran[i][j] = r.nextInt(10);
			}
		}
		return maTran;
	}

	public static void printArray(int[][] maTran) {
		for (int i = 0; i < maTran.length; i++) {
			for (int j = 0; j < maTran[i].length; j++) {
				System.out.print(maTran[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
