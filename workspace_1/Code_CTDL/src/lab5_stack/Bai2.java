package lab5_stack;

import java.io.IOException;
import java.util.Scanner;

public class Bai2
{
	private static Scanner nhapVao;

	public static void main(String[] args) throws IOException
	{
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao mot chuoi: ");
		String nhap = nhapVao.nextLine();
		System.out.println("chuoi: " + nhap);
		System.out.println("dao: " + DaoChuoi.daoChuoi(nhap));
	}
}
