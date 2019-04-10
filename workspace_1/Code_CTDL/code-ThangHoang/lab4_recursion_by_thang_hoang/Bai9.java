package lab4_recursion_by_thang_hoang;

import java.util.Random;
import java.util.Scanner;

public class Bai9 
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
	/*public static int max(int mang[], int Dau, int Cuoi)
	{
		If mảng chỉ có 1 phần tử
 Return phần tử đó
 Else
 Tách mảng làm hai phần bằng nhau
 Tìm giá trị lớn nhất trong hai phần này
 Return giá trị lớn hơn
		int max1 = 0;
		if(Dau == Cuoi)
			return mang[Dau];
		else
		{
			max1 = max(mang, Dau + 1, Cuoi);
			if(mang[Dau] >= max1)
				return mang[Dau];
			else
				return max1;
		}
	}*/
	public static int min(int[] mang,int cuoi)
	{
		if(cuoi == 0)
			return mang[0];
		else
		{
			if(mang[cuoi - 1] < min(mang, cuoi -1))
			{
				return mang[cuoi - 1];
			}
			else
				return min(mang, cuoi -1);
		}
	}
	public static int max(int[] mang1, int dau)
	{
		if(dau == 0)
			return mang1[0];
		else
		{
			if(mang1[dau - 1] > max(mang1, dau -1))
			{
				return mang1[dau - 1];
			}
			else
				return max(mang1, dau -1);
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

		System.out.println("\nGia tri nho nhat trong mang la: "
				+ min(a, n));
		System.out.println("Gia tri lon nhat trong mang la: "
				+ max(a, n));
	}
}
