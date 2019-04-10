package tuan7_recursion;

import java.util.Scanner;

public class Bai2 
{
	public static int tongLe(int n)
	{
		if(n <= 2)
			return 1;
		else 
		{
			if(n % 2 != 0)
				return n + tongLe(n - 2);
			else
				return n + tongLe(n - 3);
		}		
	}
}
