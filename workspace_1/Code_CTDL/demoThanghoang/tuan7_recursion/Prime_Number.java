package tuan7_recursion;

import java.util.*;

public class Prime_Number
{
	static int tam = 0;
	private static Scanner nhapVao;

	public static void main(String args[])
	{
		int soN, layCanHai = 0;
		
		nhapVao = new Scanner(System.in);
		Prime_Number test = new Prime_Number();
		System.out.print("Nhap vao mot so can kiem tra: ");
		soN = nhapVao.nextInt();

		layCanHai = (int) (Math.sqrt(soN));
		
		if (test.kiemTraSoNT(soN, layCanHai))
		{
			System.out.println("So " + soN + " la so NT");
		} 
		else 
		{
			System.out.println("So " + soN + " ko la so NT");
		}
	}
	
	public boolean kiemTraSoNT(int soN, int layCanHai)
	{
		if (soN < 2)
		{
			return false;
		} 
		else
		{			
			if (2 <= Math.sqrt(soN) && soN % Math.sqrt(soN) != 0 || soN == 2 ) 
				return true;
		}
		return false;
	}
}
