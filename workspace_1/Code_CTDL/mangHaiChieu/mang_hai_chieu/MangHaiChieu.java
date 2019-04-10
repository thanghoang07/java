package mang_hai_chieu;

import java.util.Random;

public class MangHaiChieu 
{
	public static void taoNgauNhien(int matran[][], int sodong, int socot)
	{
		Random abc = new Random();
		for (int i = 0; i < sodong; i++) 
		{
			for (int j = 0; j < socot; j++) 
			{
				matran[i][j] = abc.nextInt(10);
			}
		}
	}
	public static void nhapMatran(int[][] matran, int sodong, int socot)
	{
		for (int i = 0; i < sodong; i++) {
			for (int j = 0; j < socot; j++) {
				System.out.println();
			}
		}
	}
}
