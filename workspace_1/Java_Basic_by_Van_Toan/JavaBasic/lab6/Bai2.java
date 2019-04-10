package lab6;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap vao 1 chuoi: ");
		String s = in.nextLine();

		// cau a: Doi chuoi s ra chu in.
		System.out.printf("a. Doi chuoi ra chu in la: %s\n", chuIn(s));

		// cau b: Doi ki tu dau cua moi tu trong chuoi s thanh chu in, cac ki tu
		// con lai thanh chu thuong.
		System.out.printf("b. Ki tu dau moi tu viet in va nhung ki tu con lai viet thuong: %s", vietIn(s));

		// cau c:Xoa cac khoang trong thua trong chuoi
		System.out.println("\nc. Xoa khoang trong thua trong chuoi la: ");
		System.out.printf("- Xoa khoang trong truc va sau:%s", xoaTruocSau(s));
		System.out.printf("\n- Xoa khoang trong truoc va sau , va xoa khoang trong o giua :%s", xoaGiua(s));

	}

	public static String chuIn(String s) {
		return s.toUpperCase();
	}

	public static String vietIn(String s) {
		// xoa cac khoang trang du thua, tranh loi
		s = xoaGiua(s);
		// chuyen tat ca thanh chu thuong
		s = s.toLowerCase();
		// chia chuoi thanh mang
		String[] arr = s.split(" ");
		s = "";
		for (int i = 0; i < arr.length; i++) {
			// tra ve chuoi trong do charAt(0) viet in ki tu dau, substring de
			// cong cai ki tu trong chuoi bat dau tu 1 den cuoi
			s += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
			if (i < arr.length - 1)
				s += " ";
		}
		return s;
	}

	public static String xoaTruocSau(String s) {
		return s.trim();

	}

	public static String xoaGiua(String s) {
		while (s.indexOf("  ") != -1)
			s = s.replaceAll("  ", " ");
		return s.trim();
	}
}
