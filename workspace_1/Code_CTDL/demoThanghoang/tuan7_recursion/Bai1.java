package tuan7_recursion;

public class Bai1 
{
	public static String daoChuoi(String str,int n)
	{
		if(n == 1)
			return str.charAt(n - 1) + " ";//base cases
		else
		{
			return str.charAt(n - 1) 
					+ daoChuoi(str, n - 1); //general case
		}
	}
}
