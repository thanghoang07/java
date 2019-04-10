package KiemTraGiuaKy;

import java.util.Scanner;

public class Bai2 {
	public static int[] createArray(int n) {
		Scanner in = new Scanner(System.in);
		int[] arrInts = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arrInts[i] = in.nextInt();
		}
		return arrInts;
	}

	public static void printArray(int[] arrInts) {
		System.out.println("Mang sau khi nhap vao la");
		for (int i = 0; i < arrInts.length; i++) {
			System.out.printf("%4d", i);
		}
	}

	public static int demX(int[] arrInts, int x) {
		int dem = 0;
		for (int i = 0; i < arrInts.length; i++) {
			if (arrInts[i] == x)
				dem++;
		}
		return dem;

	}

	public static void viTriX(int[] arrInts, int x) {
		for (int i = 0; i < arrInts.length; i++) {
			if (arrInts[i] == x)
				System.out.printf("%d ", i);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao n ");
		int n = in.nextInt();
		System.out.println("Nhap vao so x ");
		int x = in.nextInt();

		int[] arrInts = new int[n];
		arrInts = createArray(n);
		printArray(arrInts);

		// cau a
		System.out.printf("\n%d xuat hien %d lan ", x, demX(arrInts, x));
		// cau b
		System.out.println("X xuat hien ");
		viTriX(arrInts, x);
	}
}
