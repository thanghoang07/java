package tuan7_recursion;

import java.util.Scanner;

public class Baixxxx 
{
	private static Scanner nhapVao;

	public static void main(String[] args)
	{
		System.out.println("nhap vao so n: ");
		nhapVao = new Scanner(System.in);
		int n = nhapVao.nextInt();
		int i, j;
		for (i = 0; i <= n; i++)
		{
			System.out.println();
			for (j = 1; j <= n - i; j++)
			{
				System.out.print("[]");
			}
			
			/*for (j = 0; j < 2 * i; j++)
			{
				if (j > 0)
					System.out.print(" ");
			}
			for (j = n - i; j > 0; j--)
			{
				if (j < 5)
					System.out.print("*");
			}*/
			
		}
		for ( i = n; i > 1; i--) 
		{
			for ( j = 1; j <= i; j++)
				System.out.print("[]");
			System.out.println();
		}
	}
}
