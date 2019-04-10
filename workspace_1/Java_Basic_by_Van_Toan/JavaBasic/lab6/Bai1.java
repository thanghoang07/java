package lab6;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao 1 chuoi: ");
		String s = in.nextLine();

		// cau a: dem so tu trong chuoi
		System.out.println("a. So tu co trong chuoi la : " + demChuoi(s));

		// cau b: in cac tu trong chuoi , moi tu 1 dong
		System.out.print("b. Cac tu trong chuoi la : ");
		inTu(s);

		// cau c: Dao nguoc thá»© tá»± cac tu trong chuoi
		System.out.print("c. Chuoi sau khi dao nguoc la : ");
		daoChuoi(s);
	}

	public static int demChuoi(String s) {
		return s.length();
	}

	public static void inTu(String s) {
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}

	public static void daoChuoi(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char dauTien = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = dauTien;
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + "");
		}

	}
}
