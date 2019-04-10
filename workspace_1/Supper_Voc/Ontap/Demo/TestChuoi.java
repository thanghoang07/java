package Demo;

import java.util.Scanner;

public class TestChuoi {
	public static void main(String[] args) {
		Scanner nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao mot chuoi ky tu: ");
		String chuoi = nhapVao.nextLine();
		int n = chuoi.length();
		System.out.printf("chuoi: %s", chuoi);
		System.out.print("\ndao chuoi: ");
		Chuoi.daoChuoi(chuoi);
		System.out.print("\ncac tu trong chuoi: ");
		Chuoi.inTuTrongChuoi(chuoi);
		System.out.printf("\ndao chuoi: %s", Chuoi.daoChuoiDeQuy(chuoi, n));

	}
}
