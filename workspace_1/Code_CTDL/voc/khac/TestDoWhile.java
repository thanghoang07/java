package khac;

import java.util.Random;
import java.util.Scanner;

public class TestDoWhile {
	static int i;
	static final int MAX = 10;

	static int[] taoMang(int n) {
		int[] mang1 = new int[n];
		Random abc = new Random();
		for (i = 0; i < n; i++)
			mang1[i] = abc.nextInt(MAX);
		return mang1;
	}
	static void  inMang(int[] mang1)
	{
		/*for( i = 0; i < n; i++)  
	      System.out.print(mang1[i] + "\t");  */
		for (int x : mang1) 
			System.out.print("|" + x + "|");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("nhap vao phan tu mang: ");
		int n = input.nextInt();
		int sum = 0;
		
		System.out.print("1.Mang da tao la: \n");
		int[] mang = new int[n];
		mang = taoMang(n);
		inMang(mang);
		do {
			for( i = 0; i < n; i++)
				sum += mang[i];
		} while (i == 0);

		System.out.println("\nThe sum is " + sum);
	}
}
