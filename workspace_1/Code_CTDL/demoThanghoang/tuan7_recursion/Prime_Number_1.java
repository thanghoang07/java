package tuan7_recursion;

import java.io.*;
import java.util.Scanner;

public class Prime_Number_1 
{
	private static Scanner nhapVao;

	public static void main(String[] args) throws IOException
	{
		int num, i = 1, j, k;
		
		System.out.print("Nhap vao mot so can kiem tra: ");
		nhapVao = new Scanner(System.in);
		num = nhapVao.nextInt();
		
		while (i <= num)
		{
			k = 0;
			if (num % i == 0) 
			{
				j = 1;
				while (j <= i)
				{
					if (i % j == 0)
						k++;
					j++;
				}
				if (k == 2)
					System.out.println(i + " la so NT" /*" is a prime factor"*/);
			}
			i++;
		}
	}
}
