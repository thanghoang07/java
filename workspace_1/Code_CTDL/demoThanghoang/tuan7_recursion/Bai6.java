package tuan7_recursion;

public class Bai6
{
	public static int tongChuSo(int n)
	{
		if(n == 0)
			return 0;
		else
		{
			return n % 10 + tongChuSo(n / 10);
		}
	}
}
