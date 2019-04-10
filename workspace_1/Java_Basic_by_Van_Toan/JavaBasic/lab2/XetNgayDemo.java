package lab2;

import java.util.Scanner;

public class XetNgayDemo {
	public static boolean kiemTraNhuan(int nam) {
		if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0)
			return true;
		else
			return false;
	}

	public static boolean kiemTraNgay(int ngay, int thang, int nam) {
		int ktNgay = ngay;
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			ngay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			ngay = 30;
			break;
		case 2:
			if (kiemTraNhuan(nam))
				ngay = 29;
			else
				ngay = 28;
		}
		if (ktNgay <= ngay && ngay > 0 && thang > 0 && thang <= 12 && nam > 0)
			return true;
		else
			return false;
	}	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int lan = 0; lan < 100; lan++) {
			System.out.println("Nhập d: ");
			int d = in.nextInt();
			System.out.println("Nhập m: ");
			int m = in.nextInt();
			System.out.println("Nhập y: ");
			int y = in.nextInt();
			if (kiemTraNgay(d, m, y)) {
				//Nếu nhập đúng
				System.out.println("Ngày nhập vào đúng!");
				// Ktra ngày 29 tháng 2 năm nhuận lên một tháng
				if (d == 29 && m == 2
						&& (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)) {
					System.out.println("Ngày kế tiếp là: " + 1 + "-" + (m + 1)
							+ "-" + y);
					// Ktra ngày 28 tháng 2 năm thường lên một tháng
				} else if (d == 28 && m == 2) {
					System.out.println("Ngày kế tiếp là: " + 1 + "-" + (m + 1)
							+ "-" + y);
					//Ktra ngày 31 của các tháng 31 ngày trừ tháng 12 => lên một tháng
				} else if (d == 31
						&& (m == 1 || m == 3 || m == 5 || m == 7 || m == 10 || m == 8)) {
					System.out.println("Ngày kế tiếp là: " + 1 + "-" + (m + 1)
							+ "-" + y);
					//Ktra ngày 31 tháng 12 sẽ lên một năm
				} else if (d == 31 && m == 12) {
					System.out.println("Ngày kế tiếp là: " + 1 + "-" + 1 + "-"
							+ (y + 1));
					//Ktra ngày 30 của các tháng 30 ngày => lên một tháng
				} else if (d == 30 && (m == 4 || m == 6 || m == 9 || m == 11)) {
					System.out.println("Ngày kế tiếp là: " + 1 + "-" + (m + 1)
							+ "-" + y);
					//Ktra các ngày còn lại chỉ lên một ngày
				}else {
					System.out.println("Ngày kế tiếp là: " + (d+1) + "-" + m
							+ "-" + y);
				}
				//Nếu nhập sai
			} else {
				System.out.println("Ngày nhập vào sai!");
				System.out.println("Nhập lại!");
			}
		}
	}
}

