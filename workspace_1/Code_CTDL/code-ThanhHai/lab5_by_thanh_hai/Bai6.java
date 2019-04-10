package lab5_by_thanh_hai;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		System.out.print("-Nhap so nguyen (n) can chuyen doi he co so: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Conversion.SoNhiPhan(n);
		Conversion.BatPhan(n);
	}
}
