package khac0;

import java.util.Scanner;

public class SoNguyenTo {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao mot so: ");
		int so = nhapVao.nextInt();
		System.out.println(soNguyenTo1(so));
		System.out.println("=====================");
		if (soNguyenTo2(so, (int) Math.sqrt(so)) == true)
			System.out.println("la so nguyen to");
		else
			System.out.println("khong la so nguyen to");
	}

	public static boolean soNguyenTo1(int so) {
		double muN = 0;// ta co (2 ^ n) - 1 = so nguyen to voi n la so nguyen
						// to!!!
		muN = (double) ((double) (Math.log(so - 1)) / (Math.log(2)));
		// kiem tra coi n co phai la so nguyen to ko??
		if (muN % 1 == 0 && muN % muN == 0) {
			System.out.println(muN);
			return true;
		}
		System.out.println(muN);
		return false;
	}

	public static boolean soNguyenTo2(int n, int d) {
		if (d == 1)
			return true;
		if (n < 2 || n % d == 0)
			return false;
		else
			return soNguyenTo2(n, d - 1);
	}
}
