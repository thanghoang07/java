package tuan7_recursion;

public class Bai3_1
{	
	public static void doiHe(int n, int m)
	{
		if(n < m)
		{
			System.out.print(n);
		}
		else
		{
			doiHe(n / m, m);
			doiHe(n % m, m);
		}
	}
}
