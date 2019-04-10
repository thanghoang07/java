package lab4_recursion_by_thang_hoang;

import java.util.Scanner;

public class Bai5
{
	private static Scanner nhapVao;
	private static Bai5 test;
	
	public boolean kiemTraSoNT(int a)
	{
		int i = 2;
		if(a < 2)
		{
			return false;
		}
		else 
		{
			/*for (i = 2; i <= Math.sqrt(a); i++)
			{
				if(a % i == 0)
					return false;
			}*/
			if(a % i == 0 && i <= Math.sqrt(a))
			{
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		test = new Bai5();
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot so: ");
		int n = nhapVao.nextInt();
		
		
		if (test.kiemTraSoNT(n))
		{
			System.out.println("so " + n + " la so NT");	
		}
		else
		{
			System.out.println("so " + n + " ko la so NT");
		}
	}
}
