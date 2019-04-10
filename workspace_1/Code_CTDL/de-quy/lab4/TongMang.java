package lab4;

import java.util.Random;
import java.util.Scanner;

public class TongMang
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
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		
		System.out.print("Mang da tao la: \n");
		int a[] = new int[n];
		a = taoMang(n);
		inMang(a);
		
		int m = a.length;
		System.out.println("\nTong cac phan tu trong mang la: "
				+ tongMang(a, m));
	}
}
