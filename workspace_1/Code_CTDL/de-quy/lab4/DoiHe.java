package lab4;

import java.util.Scanner;

public class DoiHe
{
	static int n = 0;
	static int m;
	private static Scanner nhapVao;	
	
	public static void doiHe(int n, int m)
	{
		if(m < 16)
		{
			if(n < m )
				System.out.print(n);		
			else
			{
				doiHe(n / m, m);
				doiHe(n % m, m);
			}
		}
		else if ( m == 16)
		{
			if(n < 10)
				System.out.println(n);
			else
			{
				int chuSo = n % 16;
				
				if(chuSo == 10)
					System.out.print("A");
				else if(chuSo == 11)
					System.out.print("B");
				else if(chuSo == 12)
					System.out.print("C");
				else if(chuSo == 13)
					System.out.print("D");
				else if(chuSo == 14)
					System.out.print("E");
				else if(chuSo == 15)
					System.out.print("F");
				else
					System.out.print(chuSo);
				doiHe(n / m, m);
			}
		}
		else
			System.out.println("0-0-0-0-0-0-0-0");
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
}
