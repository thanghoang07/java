package lab4_recursion_by_thang_hoang;

import java.util.Scanner;

public class Bai4
{
	static Scanner nhapVao;
	private static int n;
	
	public static String doiGio(int n)
	{
		if(n == 0)
		{
			return 0 + " gio " + 0 + " phut " + 0 + " giay";
		}
		else
		{
			if(n < 60)
			{			
				return n + " giay";
			}
			else if(n < 3600 && n >= 60)
			{
				return 0 + " gio " 
						+ n / 60 + " phut " 
						+ doiGio(n % 60);
			}	
			else
			{	
				return (n / 3600) + " gio "	
						+ (n % 3600) / 60 + " phut " 
						+ doiGio((n % 3600) % 60);		
			}	
		}
	}	
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so giay can doi: ");
		n = nhapVao.nextInt();
		
		System.out.println(doiGio(n));		
	}
}
