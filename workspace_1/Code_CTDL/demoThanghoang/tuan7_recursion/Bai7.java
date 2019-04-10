package tuan7_recursion;

import java.util.Scanner;

public class Bai7 
{
	public static void daoNguoc(int n)
	{
		if( n < 10)
			System.out.print(n);
		else
		{
			System.out.print(n % 10);
			daoNguoc(n / 10);
		}
	}
	/*public static void inSoNguoc(int n)
	{
		if(n <= 9)
		{
			System.out.print(n);
			return ;
		}
		else
		{
			int m = n / 10;
			inSoNguoc(n / 10);			
		}
	}*/
}
