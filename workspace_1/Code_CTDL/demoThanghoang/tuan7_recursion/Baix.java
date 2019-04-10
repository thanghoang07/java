package tuan7_recursion;

import java.util.Scanner;

public class Baix 
{
	private static Scanner nhapVao;
	
	public static void main(String[] args)
	{
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = nhapVao.nextInt();
		
		System.out.println("in ra 1: ");
		
		for (int i = n; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++)
				System.out.print("["+i+"]");
			System.out.println();
		}
		for (int i = n; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++)
				System.out.print("["+i+"]");
			System.out.println();
		}
		
	}
}
