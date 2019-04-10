package tuan7_recursion;

import java.util.Random;
import java.util.Scanner;

public class Bai8
{
	static Scanner nhapVao;
	static int mang1[];
	static int n = 0;
	static int i;
	static final int MAX = 10;
	
	static int[] taoMang(int n)
	{
		int[] mang1 = new int[n];
		Random abc = new Random();  
	    for( i = 0; i < n; i++)  
	    	mang1[i] = abc.nextInt(MAX);
		return mang1;
	}
	static void  inMang(int[] mang1)
	{
		for (int x : mang1) 
			System.out.print(x + "|");
	}
	public static int tongMang(int a[], int m)
	{
		if(m == 1)
			return a[0];
		else
		{
			return a[m - 1] + tongMang(a, m - 1);
		}
	}
}
