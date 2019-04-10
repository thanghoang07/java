package lab4_recursion_by_thang_hoang;

import java.util.Scanner;

public class Bai1 
{
	private static Scanner nhapVao;
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
	public static void main(String[] args) 
	{
		nhapVao = new Scanner(System.in);
		System.out.println("Nhap vao mot chuoi ky tu: ");
		String demo = nhapVao.nextLine();
		int n = demo.length();		
		
		System.out.println("chuoi bt : " + demo
				+ "\ndo dai: " + n);
		System.out.println("chuoi dao: " 
				+ daoChuoi(demo, n)
				+ "\ndo dai: " + n);
	}
}
