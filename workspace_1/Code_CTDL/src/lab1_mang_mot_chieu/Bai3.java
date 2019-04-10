/* Viết chương trình đ�?c vào n số nguyên
 *  (giá trị của các phần tử random từ 0 tới n),
 *  dừng lại khi nhập 0.
 *   Sau đó đếm số lần xuất hiện của từng số nguyên
*/
package lab1_mang_mot_chieu;

import java.util.Scanner;

public class Bai3 {
	static int n;
	static int i;
	static int j;
	private static Scanner nhapVao;

	public static int[] taoMang(int n) {
		nhapVao = new Scanner(System.in);
		int[] mang = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + i + ": \t");
			mang[i] = nhapVao.nextInt();
			if (mang[i] == 0)
				break;
		}
		return mang;
	}

	public static void inMang(int[] mang) {
		System.out.print("mang dung lai khi gap so khong: \n");
		for (i = 0; i < mang.length; i++)
			if (mang[i] != 0) {
				System.out.print("|" + mang[i] + "|");
			} else
				System.out.print("");
	}

	public static void lietKe2(int[] mang, int n) {
		for (int i = 0; i < n; i++) {
			int dem = 0;
			for (int j = 0; j < n; j++) {
				if (mang[i] == mang[j])
					dem++;
			}
			if (mang[i] != 0)
				System.out.print("\n" + mang[i] + ": " + dem);
		}
	}

	public static void lietKe(int[] mang) {
		int dem = 0;
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] != 0) {
				dem = 0;
				for (int j = 0; j < mang.length; j++) {
					if (mang[i] == mang[j]) {
						if (i <= j) {
							dem++;
						} else {
							break;
						}
					}
				}
				if (dem != 0) {
					System.out.printf("\n%d xuat hien %d lan", mang[i], dem);
				}
			} else {
				System.out.print("");
			}
		}
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = nhapVao.nextInt();
		int[] mang = new int[n];
		mang = taoMang(n);
		inMang(mang);

		System.out.println();
		lietKe2(mang, n);
		System.out.println();
		lietKe(mang);
	}
}
