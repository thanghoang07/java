package tuan7_recursion;

import java.util.Scanner;

public class Bai3
{	
	public static void doiHe(int n)
	{
		/*if(n > 0)
		{
			if(n % 2 < 10)
				return n % 2;
			else
				return n / 2 + doiHe((n - n / 2) / 2 );
			doiHe(n / 2);
			System.out.print(n % 2 );
		}	*/
		/*if(n == 0)
			return;
		doiHe(n / 2);
		System.out.print(n % 2 );*/
		if(n < 2)
		{
			System.out.print(n);
			return;
		}
		else
		{
			doiHe(n / 2);
			doiHe(n % 2);
		}
	}
}
