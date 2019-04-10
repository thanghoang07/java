package tuan3_mang_mot_chieu;

import java.util.Scanner;

public class Bai3_1_lab1_ctdl_hki_2015 
{
	static int n;
	static int i;
	static int j;
	private static Scanner vao;
	private static Scanner nhapVao;
	
	
	public static int[] taoMang(int n)
	{
			vao = new Scanner(System.in);
			int[] mang1 = new int[n];
			for (int i = 0; i < n; i++)
			{
				System.out.print("Nhap phan tu thu " + i + ": \t");
				mang1[i] = vao.nextInt();
				if (mang1[i] == 0)
					break;
			}
			return mang1;
	}
	public static void inMang(int[] mang1)
	{
		System.out.print("mang dung lai khi gap so khong: \n");
		for (i = 0; i < mang1.length; i++)
		{
			System.out.print(mang1[i] + "\t");
		}
	}
	/*static void inMang1(Integer[] mang1)
	{
		System.out.print("\nMang dung lai khi thay so 0: \n");
		for (i = 0; i < n; i++)
		{
			if(mang1[i] == 0)
			{
				for ( j = 0; j < i; j++) 
					System.out.print(mang1[j] + "\t");
			}
		}
	}*/
/*	static int lietke(Integer[] mang1,int n)
	{
	    int dem = 0;
	    for( i = 0 ; i < n ; i++)
	    {
	        dem = 0;
	        for( j  = 0 ; j < n ; j++)
	        {    
	            if(mang1[i] == mang1[j])
	            {
	                 if(i <= j)
	                     dem ++ ;
	                 else
	                     break;
	            }
	        }
	        if(dem != 0)
	        {
	             System.out.print( "\n" + mang1[i] + ": " + dem);
	        }
	    }
	    return dem;
	}*/
	public static void lietKe2(int[] mang1, int n)
	{
		for (int i = 0; i < n; i++)
		{
			int dem = 0;
			for (int j = 0; j < n; j++)
			{
				if (mang1[i] == mang1[j])
				{
					dem++;
				}
			}
			if (mang1[i] != 0)
			{
				System.out.print("\n" + mang1[i] + ": " + dem);
			}
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
		/*System.out.println(lietke(mang1, n));*/
		System.out.println();
		lietKe2(mang1, n);
	}
}
