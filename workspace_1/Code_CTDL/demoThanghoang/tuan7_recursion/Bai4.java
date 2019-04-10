package tuan7_recursion;

import java.util.Scanner;

public class Bai4 
{
	static Scanner nhapVao;
	private static int n;
	
	public static void doiGio(int n)
	{
		if(n < 60)
		{			
			System.out.println(" giay " + n);
		}
		else if(n / 60 >= 1 && n / 60 < 60)
		{
			
			System.out.println(n % 60 + " phut ");
			doiGio(n % 60);
		}	
		else if (n / 3600 >= 1 && n / 3600 <= 12)
		{			
			System.out.println(n % 3600 + " gio ");
			doiGio(n % 3600);
		}
	}
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so giay can doi: ");
		n = nhapVao.nextInt();
		
		System.out.println("doi gio: ");
		doiGio(n);
	}
}
