package lab4_recursion_by_thang_hoang;

import java.util.Scanner;

public class Bai3
{
	static int n = 0;
	static int m;
	private static Scanner nhapVao;	
	
	public static void doiHe(int n, int m)
	{
		if(m < 16)
		{
			if(n < m )
			{
				System.out.print(n);
			}
			else
			{
				doiHe(n / m, m);
				doiHe(n % m, m);
			}
		}
		else
		{
			System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-");
		}
	}
	public static void main(String[] args) 
	{		
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao he m can chuyen: ");
		m = nhapVao.nextInt();
		System.out.print("Nhap vao so n can chuyen: ");
		n = nhapVao.nextInt();				
		
		
		System.out.println("Chuyen qua he " + m + " la: " );
		doiHe(n, m);
	}
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
}
