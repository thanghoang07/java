/* Viết chương trình đ�?c vào n số nguyên
 *  (giá trị của các phần tử random từ 0 tới n),
 *  dừng lại khi nhập 0.
 *   Sau đó đếm số lần xuất hiện của từng số nguyên
*/
package lab1_mang_mot_chieu_by_thang_hoang;

import java.util.Scanner;

public class Bai3 
{
	static int n;
	static int i;
	static int j;
	private static Scanner nhapVao;
	
	public static int[] taoMang(int n)
	{
		nhapVao = new Scanner(System.in);
		int[] mang1 = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.print("Nhap phan tu thu " + i + ": \t");
			mang1[i] = nhapVao.nextInt();
			if (mang1[i] == 0)
				break;
		}
		return mang1;
	}
	public static void inMang(int[] mang1)
	{
		System.out.print("mang dung lai khi gap so khong: \n");
		for (i = 0; i < mang1.length; i++)
			System.out.print(mang1[i] + "\t");
	}
	public static void lietKe2(int[] mang1, int n)
	{
		for (int i = 0; i < n; i++)
		{
			int dem = 0;
			for (int j = 0; j < n; j++)
			{
				if (mang1[i] == mang1[j])
					dem++;
			}
			if (mang1[i] != 0)
				System.out.print("\n" + mang1[i] + ": " + dem);
		}
	}
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");
		int n = nhapVao.nextInt();
		int[] mang1 = new int[n];
		mang1 = taoMang(n);
		inMang(mang1);

		System.out.println();
		lietKe2(mang1, n);
	}
}
