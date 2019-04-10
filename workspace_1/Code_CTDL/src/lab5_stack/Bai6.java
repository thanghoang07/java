package lab5_stack;

import java.util.Scanner;

public class Bai6
{
	private static Scanner nhapVao;
	public static int nhapHe;
	public static int nhapSo;

	public static void main(String args[])
	{
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao he can chuyen: ");
		nhapHe = nhapVao.nextInt();
		System.out.println("nhap vao so can chuyen: "); 
		nhapSo = nhapVao.nextInt();

		System.out.println("chuyen qua he " + nhapHe + " la:");
		DecimaltoBaseN.doiHe(nhapSo, nhapHe);
	}
}
