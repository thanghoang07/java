package tuan7_recursion;

import java.util.Scanner;

public class Baixxx
{
	private static Scanner nhapVao;

	public static void main(String arg[])
	{
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = nhapVao.nextInt();

		System.out.println();
		for (int i = 0; i < n * 2 - 1; i++)
		{
			if (i < n)
			{
				for (int j = 0; j <= i; j++)
					System.out.print("*");
			} 
			else 
			{
				for (int j = n - 1; j > i - n; j--)
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		for (int i = 0; i < n * 2 - 1; i++)
		{
			if (i > n)
			{
				for (int j = n - 1; j <= i - n; j++)
					System.out.print("*");				
			} 
			else 
			{
				for (int j = 0; j > i; j--)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
