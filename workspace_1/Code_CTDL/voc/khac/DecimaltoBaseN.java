package khac;

import java.util.Scanner;

//Chuyển số từ cơ số 10 sang cơ số bất kì
public class DecimaltoBaseN {
	private static Scanner nhapVao;

	public static String convert(int num, int base) {
		String string = new String();
		while (num > 0) {
			string = "0123456789ABCDEFGHIJKLMNOPQRSTVW".charAt(num % base) + string;
			num = num / base;
		}
		return string;
	}

	public static void main(String args[]) {
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao he can chuyen: ");
		int nhapHe = nhapVao.nextInt();
		System.out.println("nhap vao so can chuyen: ");
		int nhapSo = nhapVao.nextInt();
		System.out.println(convert(nhapSo, nhapHe)); 
		
	}
}