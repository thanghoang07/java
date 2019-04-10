package tuan7_recursion;

import java.util.Scanner;

public class Bai4_1
{	
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
}
