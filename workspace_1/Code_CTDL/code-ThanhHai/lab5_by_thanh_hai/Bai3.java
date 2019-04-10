package lab5_by_thanh_hai;

import java.util.Scanner;

public class Bai3 {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap dau ngoac: ");
		String s = nhapVao.next();
		System.out.println("-Dau ngoac nhap vao la: ");
		System.out.println(s);
		//ToBracket toBracket = new ToBracket();
		if (ToBracket.isBalanced(s))
			System.out.print("\n=> Dau ngoac nhap vao dung thu tu");
		else
			System.out.print("\n=> Dau ngoac nhap vao sai thu tu");
	}
}
