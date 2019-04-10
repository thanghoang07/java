package tuan4_mang_mot_chieu_mang_hai_chieu;

import java.util.Random;
import java.util.Scanner;

public class Bai1_1_1_lab2_ctdl_hkI_2015 
{
	static int n;
	static final int MAX = 5;
	static Scanner nhapVao;
	static int[][] taoMangHaiChieu1(int n)
	{
		int[][] maTran = new int[n][n];
		Random abc = new Random();
		for (int i = 0; i < maTran.length; i++)
			for (int j = 0; j < maTran[i].length; j++)
				maTran[i][j] = abc.nextInt(MAX);
		return maTran;
	}
	static void inMang1(int[][] mang1)
	{
		for (int i = 0; i < mang1.length; i++)
		{
			for (int j = 0; j < mang1[i].length; j++)
			{
				System.out.printf("%4d", mang1[i][j] );
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao gia tri n: ");
		n = nhapVao.nextInt();

		int[][] maTranA = new int[n][n];
		maTranA = taoMangHaiChieu1(n);
		System.out.println("Mang hai chieu thu nhat la: ");
		inMang1(maTranA);

		int[][] maTranB = new int[n][n];
		maTranB = taoMangHaiChieu1(n);
		System.out.println("Mang hai chieu thu hai la: ");
		inMang1(maTranB);

	}
}
