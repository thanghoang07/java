/*Bài 2: Viết chương trình nhập vào số nguyên n:  
1. Viết phương thức để trả v�? một mảng gồm n số nguyên. Ví dụ: 1 2 3 4 5 
2. Viết phương thức để hiển thị mảng theo theo thứ tự ngược lại: 5 4 3 2 1 
*/
package lab1_mang_mot_chieu;

import java.util.Random;
import java.util.Scanner;

public class Bai2
{
	static Scanner nhapVao;
	static int mang1[];
	static int n = 0;
	static int i;
	static int j;
	
	static int[] taoMang(int n)
	{
		int[] mang1 = new int[n];
		Random abc = new Random();
		for (int i = 0; i < n; i++)
			mang1[i] = abc.nextInt(100);
		return mang1;
	}
	static void inMang(int[] mang1)
	{
		for (int i = 0; i < n; i++)
			System.out.print(mang1[i] + "\t");
	}
	static void daoMang(int[] mang2)
	{
		for (int j = n-1 ; j >= 0 ; j--)
			System.out.print(mang2[j] + "\t");
	}
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		
		System.out.print("1.Mang so nguyen da tao la: \n");
		int[] mang1 = new int[n];
		mang1 = taoMang(n);
		inMang(mang1);
				
		System.out.print("\n2.Mang sau khi dao la: \n"); 
	    int[] mang2 = mang1.clone();
		daoMang(mang2);
		
	}
}
