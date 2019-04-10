package tuan7_recursion;

import java.util.Scanner;

public class Bai5
{
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
}
