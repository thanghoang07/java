package lab4;

import java.util.Scanner;

public class DaoNguocMotSo 
{
	static Scanner nhapVao;
	private static int n;
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
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		
		System.out.println("dao nguoc so "+ n +" la: ");
		daoNguoc(n);
		
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
	}
	public static void main(String[] args) {
		int n = 123;
		
		System.out.print("in so nguoc: ");
		inSoNguoc(n);
	}*/
}
