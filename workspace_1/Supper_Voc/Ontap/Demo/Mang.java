package Demo;

import java.util.*;

public class Mang {
	public static int mang1[];
	public static int i;
	public static final int MAX = 10;
	private static Scanner nhapVao;

	public static int[] taoMang(int n) {
		int[] mang1 = new int[n];
		Random abc = new Random();
		for (i = 0; i < n; i++)
			mang1[i] = abc.nextInt(MAX);
		return mang1;
	}

	public static void inMang(int[] mang1) {
		for (int x : mang1)
			System.out.print(x + "|");
	}

	public static int count(int[] mang1, int k) {
		int count = 0;
		for (int i = 0; i < mang1.length; i++) {
			if (mang1[i] == k)
				count++;
		}
		return count;
	}

	public static int giaTriNhoNhat(int mang1[], int n) {
		int min = mang1[0];
		for (int i = 0; i < n; i++)
			if (mang1[i] < min)
				min = mang1[i];
		return min;
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		int n = nhapVao.nextInt();

		System.out.print("1.Mang da tao la: \n");
		int[] mang = new int[n];
		mang = taoMang(n);
		inMang(mang);

		System.out.print("\nNhap vao so m: ");
		int m = nhapVao.nextInt();
		System.out.printf("So lan xuat hien f(%d) = %d", m, count(mang, m));
		System.out.printf("\nGia tri nho nhat cua mang: %s", giaTriNhoNhat(mang, n));
		System.out.printf("\nSo lan xuat hien f(%s) = %s", giaTriNhoNhat(mang, n), count(mang, giaTriNhoNhat(mang, n)));
	}
}
