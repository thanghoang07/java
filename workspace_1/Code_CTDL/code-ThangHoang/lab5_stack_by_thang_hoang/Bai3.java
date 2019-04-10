package lab5_stack_by_thang_hoang;

import java.util.Scanner;

public class Bai3 
{
	private static Scanner nhapVao;

	public static void main(String[] args)
	{
		System.out.println("nhap vao dau de kiem tra: ");
		nhapVao = new Scanner(System.in);
		String nhap = nhapVao.nextLine();
		System.out.println("ket qua: " + KiemDau.isBalanced(nhap));
	}
}
