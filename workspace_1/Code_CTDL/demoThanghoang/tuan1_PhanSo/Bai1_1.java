/*
 * nhap voa tu so va mau so cua phan so
 * */
package tuan1_PhanSo;

import java.util.Scanner;

public class Bai1_1
{
	private static Scanner input;

	public static void main(String[] args)
	{
		Long numerator, denominator;
		String numerator2, denominator2;
		//numerator: tu so va denominator: mau so
		
		input = new Scanner(System.in);
		System.out.print("\nNhap vao phan so");
		//nhap vao phan so
		//tu so
		System.out.print("\nNhap vao tu so cua phan so: ");
		numerator = input.nextLong();
		//mau so
		System.out.print("\nNhap vao mau so cua phan so(mau so phai khac khong ): ");
		denominator = input.nextLong();
		//chuyen sang String
		numerator2 = numerator.toString();
		denominator2 = denominator.toString();
		if(numerator2.equals(denominator2))
		{
			
		}
			
	}

}
