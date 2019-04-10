package lab4_recursion;

import java.util.Scanner;

public class Bai2 
{
	static int n = 0;
	private static Scanner nhapVao;
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
	public static void main(String[] args) 
	{		
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		n = nhapVao.nextInt(); 
		
			
		System.out.println("Tong cac so le tu 1 den " 
				+ n + " la: " 
				+ tongLe(n));
	}
}
