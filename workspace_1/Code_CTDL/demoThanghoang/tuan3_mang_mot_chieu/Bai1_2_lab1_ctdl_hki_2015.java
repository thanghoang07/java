package tuan3_mang_mot_chieu;

import java.util.Random;
import java.util.Scanner;

public class Bai1_2_lab1_ctdl_hki_2015 
{
	private static Scanner nhapVao;
	public static int[] taoMang(int n)
	{
		int[] mang1 = new int[n];
		Random abc = new Random();
		for (int i = 0; i < n; i++)
			mang1[i] = abc.nextInt(100);
		return mang1;		
	}
	static void inMang(int[] mang1)
	{
		for( int i = 0; i < mang1.length; i++)
			System.out.println("\t" + mang1[i]);
	}
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		int n = nhapVao.nextInt();
		
		int[] mang1 = new int[n];
		mang1 = taoMang(n);
		inMang(mang1);
		
		System.out.printf("tong: %d", tinhTong(mang1, n));
	}
	static int tinhTong(int mang1[], int n )
	{
		int tong = 0;
		for(int i = 0; i < n; i++)
			tong += mang1[i];
		return tong;
	} 
}
