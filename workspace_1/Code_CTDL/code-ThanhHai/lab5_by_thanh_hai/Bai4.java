package lab5_by_thanh_hai;

import java.util.Scanner;

public class Bai4 {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.println("-Nhap bieu thuc dang hau to(postfix): ");
		String str = nhapVao.next();
		System.out.println("-Bieu thuc nhap vao la: " + str);
		int result = ToPostfix.postFix(str);
		System.out.println("=> Ket qua: result = " + result);
	}
}
