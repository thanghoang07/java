package lab5_stack_by_thang_hoang;

import java.util.Scanner;

public class Bai4 
{
	public static void main(String[] args) 
	{
		System.out.println("nhap vao mot day postfix can tinh: ");
		Scanner nhapVao = new Scanner(System.in);
		String nhap = nhapVao.nextLine();
		nhapVao.close();
		System.out.println("day postfix la: " + nhap);
		System.out.println("ket qua: " + PostFix.evaluate(nhap));
	}
}
