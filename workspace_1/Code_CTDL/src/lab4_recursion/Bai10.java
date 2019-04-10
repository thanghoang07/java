package lab4_recursion;

import java.util.Scanner;

public class Bai10
{
	static Scanner nhapVao;
	private static int n;

	public static void printStar1(int n, int max)
	{
		for (int i = 1; i <= n; i++)
			System.out.print("*");
		System.out.println();
		if (n < max)
			printStar1(n + 1, max);
		for (int i = 1; i <= n; i++)
			System.out.print("*");
		System.out.println();
	}
	public static void printStar2(int n, int max) 
	{
		for (int i = max + 1; i > n; i--)
			System.out.print("*");
		System.out.println();
		if (n < max)
			printStar2(n + 1, max);
		for (int i = max + 1; i > n; i--)
			System.out.print("*");
		System.out.println();
	}
	public static void main(String[] arg)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu n: ");
		n = nhapVao.nextInt();

		printStar1(1, n);
		System.out.println();
		printStar2(1, n);
	}
}
